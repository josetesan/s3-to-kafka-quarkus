package com.josetesan.poc.quarkus;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class UploadResourceTest {

    @Test
    public void testGetEndpoint() {
        given()
          .when().get("/test")
          .then()
             .statusCode(200)
             .body(is("GET test"));
    }

    @Test
    public void testPutEndpoint() {
        given()
            .when().put("/test")
            .then()
            .statusCode(200)
            .body(is("PUT test"));
    }


}