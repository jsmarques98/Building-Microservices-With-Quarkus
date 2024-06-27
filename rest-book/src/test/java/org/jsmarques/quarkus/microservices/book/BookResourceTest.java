package org.jsmarques.quarkus.microservices.book;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.Matchers.not;

@QuarkusTest
class BookResourceTest {
    @Test
    void shouldCreateABook() {
        given()
                .formParam("title", "Understanding Quarkus")
                .formParam("author", "Joao Marques")
                .formParam("year", 2024)
                .formParam("genre", "IT")
        .when()
                .post("/api/books")
        .then()
                .statusCode(201)
                .body("isbn_13", startsWith("13-"))
                .body("title", is("Understanding Quarkus"))
                .body("author", is("Joao Marques"))
                .body("year_of_publication", is(2024))
                .body("genre", is("IT"))
                .body("creation_date", startsWith("20"));
    }

}