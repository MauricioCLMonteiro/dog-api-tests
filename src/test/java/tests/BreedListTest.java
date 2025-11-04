package tests;

import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BreedListTest extends BaseTest {
    @Test
    public void deveListarTodasAsRacas() {
        given()
            .contentType(ContentType.JSON)
        .when()
            .get("/breeds/list/all")
        .then()
            .statusCode(200)
            .body("status", equalTo("success"))
            .body("message", notNullValue());
    }
}
