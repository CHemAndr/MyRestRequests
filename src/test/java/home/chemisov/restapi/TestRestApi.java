package home.chemisov.restapi;



import io.restassured.response.Response;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestRestApi {


    @Test
    public void getTest(){
        //io.rest-assured virsion 3.3.0
        Response rget = get("http://localhost:8080/ServletsExample-1.0-SNAPSHOT/Service1");
        System.out.println("Response :" + rget.asString());
        System.out.println("Status Code :" + rget.getStatusCode());
        System.out.println("Does Reponse contains 'GETS1 KARTOSH'? :" + rget.asString().contains("GETS1 KARTOSH"));
        assertEquals(200, rget.getStatusCode());
    }

    @Test
    public void postTest() {
        Response rpost = post("http://localhost:8080/ServletsExample-1.0-SNAPSHOT/Service1");
        System.out.println("Response :" + rpost.asString());
        System.out.println("Status Code :" + rpost.getStatusCode());
        System.out.println("Does Reponse contains 'POST  S1 KARTOSH  null'? :" + rpost.asString().contains("POST  S1 KARTOSH  null"));
        assertEquals(200, rpost.getStatusCode());
    }

    @Test
    public void putTest() {
        Response rput = put("http://localhost:8080/ServletsExample-1.0-SNAPSHOT/Service1?par1=7");
        System.out.println("Response :" + rput.asString());
        System.out.println("Status Code :" + rput.getStatusCode());
        System.out.println("Does Reponse contains 'PUT S1 KARTOSH 7'? :" + rput.asString().contains("PUT S1 KARTOSH 7"));
        assertEquals(200, rput.getStatusCode());
    }

    @Test
    public void deleteTest() {
        Response rdelete = delete("http://localhost:8080/ServletsExample-1.0-SNAPSHOT/Service1?par1=7");
        System.out.println("Response :" + rdelete.asString());
        System.out.println("Status Code :" + rdelete.getStatusCode());
        System.out.println("Does Reponse contains 'DELETES1 KARTOSH'? :" + rdelete.asString().contains("DELETES1 KARTOSH"));
        assertEquals(200, rdelete.getStatusCode());
    }
}
