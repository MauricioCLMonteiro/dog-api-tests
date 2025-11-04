package tests;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BreedImagesTest extends BaseTest {
    @Test
    public void deveRetornarImagensDaRaca() {
        given()
            .contentType(ContentType.JSON)
            .pathParam("breed", "hound")
        .when()
            .get("/breed/{breed}/images")
        .then()
            .statusCode(200)
            .body("status", equalTo("success"))
            .body("message", not(empty()))
            .body("message[0]", containsString("hound"));
    }
}
