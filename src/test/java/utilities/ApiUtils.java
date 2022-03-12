package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;
public class ApiUtils {
    /*
         Response response =  given().headers("Authorization","Bearer "+generateToken(),
                "Content-Type",ContentType.JSON,"Accept",ContentType.JSON).
                         when().get(ConfigurationReader.getProperty("registrant_endpoint"));
     */
    public static Response getRequest(String token, String endpoint) {
        Response response = given().headers("Authorization","Bearer "+token,
                        "Content-Type", ContentType.JSON,"Accept",ContentType.JSON).
                when().get(ConfigurationReader.getProperty(endpoint));
        return response;
    }
}
