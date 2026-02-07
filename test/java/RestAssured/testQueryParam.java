package RestAssured;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class testQueryParam {
    @Test
    public void GetIPDetails() {
        String IPURL = "http://ip-api.com/json";
    Response response = 
        given().contentType(ContentType.JSON) // Set headers
        // Add query parameter
        .when().queryParam("fields", "query,country,city,timezone")
        .get(IPURL + "/125.219.5.94"); // Send GET request
    // Print response
    System.out.println(response.getBody().asPrettyString());
    }
}

//http://ip-api.com/json/125.219.5.94?fields=query,country,city,timezone