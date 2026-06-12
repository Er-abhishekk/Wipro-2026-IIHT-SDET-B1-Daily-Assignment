package Day28;


import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import com.aventstack.extentreports.ExtentReports;
import io.restassured.RestAssured;
public class BaseTest 
{
    public static ExtentReports extent;

    @BeforeSuite
    public void setup()
    {
        RestAssured.baseURI = "https://dummyjson.com";

        extent = ExtentManager.getReportObject();
    }

    @AfterSuite
    public void tearDown()
    {
        extent.flush();
    }
}
