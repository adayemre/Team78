package utilities;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static utilities.Authentication.generateToken;

import io.restassured.specification.RequestSpecification;
import pojos.*;

import static Hooks.Hooks.spec;
import static io.restassured.RestAssured.given;

public class ApiUtils {
  
  
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

    public static Response getRequest(String token,String endpoint ){
        Response response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().get(endpoint);
        return  response;
    }

    public static Response postRequestTestItem(String token, String endpoint, CTestItem cTestItem){
        Response response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).body(cTestItem).when().post(endpoint);
        return  response;
    }

    public static Response postRequestPatient(String token, String endpoint, US015_Create_Edit_Patient_Pojo pojoObject){
        Response response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).body(pojoObject).when().post(endpoint);
        return  response;
    }

    public static Response putRequest(String token, String endpoint, Registrant registrant){
        Response response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).contentType(ContentType.JSON).body(registrant).when().put(endpoint);
        return  response;
    }


    public static Response putRequestTestItem(String token, String endpoint, CTestItem cTestItem){
        Response response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).contentType(ContentType.JSON).body(cTestItem).when().put(endpoint);
        return  response;
    }


    public static Response deleteRequest(String token, String endpoint){
        Response response = given().headers(
                "Authorization",
                "Bearer " + token,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).when().delete(endpoint);
        return  response;
    }



}
