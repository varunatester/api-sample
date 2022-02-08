package tests;

import io.restassured.response.Response;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;


public class LoginTests {
    @Test
    public void loginAndAddReviewToProduct() {
        Response response = given()
                .request()
                .with()
                .queryParam("format", "json")
                .when()
                .body("\"email\":\"abc@gmail.com\",\"password\":\"password\"")
                .post("https://juice-shop.herokuapp.com/rest/user/login");
        assertEquals(response.getStatusCode(), 200);
    }
}
