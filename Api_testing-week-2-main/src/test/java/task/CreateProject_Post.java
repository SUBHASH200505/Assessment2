package task;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class CreateProject_Post {

    @Test
    public void Create() {

        given()
        .contentType(ContentType.JSON)
            .body("{ \"createdBy\": \"Subhash\", \"projectName\": \hello\", \"status\": \"Created\", \"teamSize\": 1}")

        .when()
            .post("http://49.249.28.218:8091/addProject")

        .then()
            .statusCode(201)
            .log().all();
    }

}
