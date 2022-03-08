package utilities;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.HashMap;
import java.util.Map;

import static Hooks.Hooks.spec;
import static io.restassured.RestAssured.given;

public class Authentication {

//    public static void main(String[] args) {
//        generateToken();
//    }  nasıl çalıştıgını göstermek için main method oluşturdu

    public static String generateToken(){

        //Set the base url
        //api/authenticate
//        spec = new RequestSpecBuilder().setBaseUri(ConfigurationReader.getProperty("base_url")).build(); sildik çünkü hooks ta var
        spec.pathParams("first","api","second", "authenticate");

        /*
        {
  "password": "string",
  "rememberMe": true,=> developer hata yapmış string value olarak almış boolean yerine
  "username": "string"
}
         */
        //set the expected data
        Map<String,Object> expectedData = new HashMap<>();
        expectedData.put("username", "admintugba");
        expectedData.put("password","123Tugba");
        expectedData.put("rememberMe","true");

        //Send the Post request and get the data
        Response response = given().spec(spec).contentType(ContentType.JSON).body(expectedData).when().post("/{first}/{second}");
//       response.prettyPrint();//pretty print token ı aşağıdakı gibi yazdırıyo
       /*
{
    "id_token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbnR1Z2JhIiwiYXV0aCI6IlJPTEVfQURNSU4iLCJleHAiOjE2NDkyOTE4ODZ9.
    _3ZWKt4ywk-oD35bSd_mr4-6kSBDSs7TIwYyA3hXrGCLJyU6kHggzcBag63itRurZN4akEU2r7oBDE-c2-txZQ"
}*/
        JsonPath json = response.jsonPath();
        System.out.println();


        return json.getString("id_token"); //direkt token ı yazdırıyor
    }



}
