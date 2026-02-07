package RestAssured;
import static io.restassured.RestAssured.given;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetPetByID {
    String ROOT_URI = "https://petstore.swagger.io/v2/pet";
    // Send GET Request
    @Test(dataProvider = "petIdProvider")
    public void  simple_get_test(String id) {
        Response response = 
            given().contentType(ContentType.JSON) // Set headers
            .when().get(ROOT_URI + "/" +id); // Send GET request
    
        // Print response
        String responseBody = response.getBody().prettyPrint();
        System.out.println("Response Body is =>  " + responseBody);
        System.out.println("Status Code  is=> " +response.getStatusCode());
    }

    @DataProvider
    public Object[][] petIdProvider() {
        // Setting parameters to pass to test case
        Object[][] testData = new Object[][] { { "2758" }, { "8588" } };
        return testData;
}
}


