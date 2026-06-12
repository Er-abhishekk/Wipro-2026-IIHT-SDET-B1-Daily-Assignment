package Day28;


import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;
import io.restassured.http.ContentType;

public class PutApi extends BaseTest
{
    @Test
    public void updateUser()
    {
        ExtentTest test = extent.createTest("PUT User API");

        String requestBody = "{\n" +
                "  \"firstName\": \"Updated Kumar\",\n" +
                "  \"age\": 25\n" +
                "}";

        given()
            .contentType(ContentType.JSON)
            .body(requestBody)

        .when()
            .put("/users/1")

        .then()
            .statusCode(200)
            .log().all();

        test.pass("PUT API Passed");
    }
}
