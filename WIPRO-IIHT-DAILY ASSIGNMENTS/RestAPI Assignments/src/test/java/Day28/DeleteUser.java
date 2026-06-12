package Day28;

import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentTest;

public class DeleteUser extends BaseTest
{
    @Test
    public void deleteUser()
    {
        ExtentTest test = extent.createTest("DELETE User API");

        given()

        .when()
            .delete("/users/1")

        .then()
            .statusCode(200)
            .log().all();

        test.pass("DELETE API Passed");
    }
}
