package RestAssured;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import io.restassured.http.ContentType;
import io.restassured.response.Response;



public class PUTPetByID {
// Set Base URL
    String ROOT_URI = "https://petstore.swagger.io/v2/pet";

    @Test
    public void AddNewPet() {
    // Write the request body
    String reqBody = """
    {
    "id": 2758,
    "name": "Anvi",
    "status": "Dancing"
    }""";
    Response response =
    given().contentType(ContentType.JSON) // Set headers
    .body(reqBody).when().put(ROOT_URI); // Send PUT request

    // Print response of PUT request
    String body = response.getBody().asPrettyString();
    System.out.println(body);
    }



}