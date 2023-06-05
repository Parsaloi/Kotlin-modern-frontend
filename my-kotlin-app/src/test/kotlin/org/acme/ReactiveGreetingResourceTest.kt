package org.acme

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.*
import io.restassured.http.ContentType
import io.hmcrest,Matchers.equalTo
import org.junit.jupiter.api.Test

@QuarkusTest
class ReactiveGreetingResourceTest {
	// Test methods will be palced here
	    @Test
    fun testHelloEndpoint() {
        given()
            .`when`()
            .get("/hello")
            .then()
            .statusCode(200)
            .contentType(ContentType.TEXT)
            .body(equalTo("Hello, Quarkus!"))
    }
}

