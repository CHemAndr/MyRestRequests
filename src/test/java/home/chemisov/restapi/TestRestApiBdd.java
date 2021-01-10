package home.chemisov.restapi;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;

public class TestRestApiBdd {
    @Test
    public void testGet() {

        Response respget =  given()
                .log().all()
                .when()
                .get("http://localhost:8080/ServletsExample-1.0-SNAPSHOT/Service1")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .response();
    }

    @Test
    public void testPost() {

        Response resppost =  given()
                .log().all()
                .when()
                .post("http://localhost:8080/ServletsExample-1.0-SNAPSHOT/Service1")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .response();
    }

    @Test
    public void testPut() {

        Response resppost =  given()
                .log().all()
                .when()
                .put("http://localhost:8080/ServletsExample-1.0-SNAPSHOT/Service1?par1=7")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .response();
    }

    @Test
    public void testDelete() {

        Response resppost =  given()
                .log().all()
                .when()
                .delete("http://localhost:8080/ServletsExample-1.0-SNAPSHOT/Service1")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .response();
    }

}
