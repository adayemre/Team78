package pages;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class getPatientInfo {
    @Test
    public void test(){
        RequestSpecification spec=new RequestSpecBuilder().setBaseUri("https://medunna.com").build();
        spec.pathParam("first","patient");
        Response response=given().spec(spec).when().get("/{first}");
        response.prettyPrint();
        response.then().statusCode(200).statusLine("HTTP/1.1 200 OK").contentType(ContentType.JSON);
        System.out.println(response.headers());
    }
}
