package RestAssured;
import static io.restassured.RestAssured.given;
import org.testng.annotations.Test;
import java.io.File;
import static org.hamcrest.Matchers.equalTo;
import java.io.IOException;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class INPUTfromJSON {
// Set base URL
final static String ROOT_URI = "https://petstore.swagger.io/v2/pet";

@Test
public void addNewPet() throws IOException {
    // Import JSON file
    File file = new File("src/test/resources/input.json");

    

    Response response = given()
        .contentType(ContentType.JSON) // Set headers
        .body(file) // Pass request body from file
        .when().post(ROOT_URI); // Send POST request

    // Print response
    String body = response.getBody().asPrettyString();
    System.out.println(body);


    // Assertion
    response.then().body("id", equalTo(27584));
    response.then().body("name", equalTo("Ria"));
}


}


