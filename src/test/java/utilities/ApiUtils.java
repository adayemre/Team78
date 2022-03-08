package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

public class ApiUtils {

    //For authoraztion

    public static Response getRequest(String token, String endpoint){


      Response  response = given().headers(
                "Authorization",
                "Bearer " + generateToken(),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(ConfigurationReader.getProperty("appointments_endpoint"));

      return response;
    }


}
