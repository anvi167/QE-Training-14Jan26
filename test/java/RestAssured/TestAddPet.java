package RestAssured;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class TestAddPet {
    String ROOT_URI = "https://petstore.swagger.io/v2/pet";
    
    	
@Test
public void AddNewPet() {
    // Write the request body
    String reqBody = """
    {
        "id": 2758, 
        "name": "Anvi", 
        "status": "alive"
    }""";
 
    Response response = 
        given().contentType(ContentType.JSON) // Set headers
        .body(reqBody).when().post(ROOT_URI); // Send POST request
 
    // Print response of POST request
    String body = response.getBody().asPrettyString();
    System.out.println(body);
}


}
