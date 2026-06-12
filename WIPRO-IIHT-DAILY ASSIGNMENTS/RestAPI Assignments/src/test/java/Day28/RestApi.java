package Day28;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;

public class RestApi extends BaseTest
{
    @Test
    public void getUser()
    {
        ExtentTest test = extent.createTest("GET User API");

        given()

        .when()
            .get("/users/1")

        .then()
            .statusCode(200)
            .log().all();

        test.pass("GET API Passed");
    }
}