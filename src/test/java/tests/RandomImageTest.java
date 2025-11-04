package tests;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class RandomImageTest extends BaseTest {
    @Test
    public void deveRetornarImagemAleatoria() {
        given()
            .contentType(ContentType.JSON)
        .when()
            .get("/breeds/image/random")
        .then()
            .statusCode(200)
            .body("status", equalTo("success"))
            .body("message", containsString("https://images.dog.ceo/breeds/"));
    }
}
