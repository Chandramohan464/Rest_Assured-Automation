package APITest;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestJson {

    @Test
    public void DisplayingPost() {

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("http://localhost:3000/posts");

        response.prettyPrint();
    }

    @Test
    public void AddingPost() {

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("http://localhost:3000/posts");

        response.prettyPrint();
    }

    @Test
    public void EditPost() {

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("http://localhost:3000/posts/4");

        response.prettyPrint();
    }

    @Test
    public void DeletePost() {

        Response response = given()
                .header("Connection", "keep-alive")
                .when()
                .get("http://localhost:3000/posts/4");

        response.prettyPrint();
    }

    @Test
    public void DisplayComment() {

        Response response = given()
                .header("Connection", "keep-alive")
                .when()
                .get("http://localhost:3000/comments");

        response.prettyPrint();
    }

    @Test
    public void AddComment() {

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("http://localhost:3000/comments");

        response.prettyPrint();
    }

    @Test
    public void EditComment() {

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("http://localhost:3000/posts/3");

        response.prettyPrint();
    }

    @Test
    public void DeleteComment() {

        Response response = given()
                .header("Connection", "keep-alive")
                .when()
                .get("http://localhost:3000/comments/3");

        response.prettyPrint();
    }

    @Test
    public void DisplayProfile() {

        Response response = given()
                .header("Connection", "keep-alive")
                .when()
                .get("http://localhost:3000/profile");

        response.prettyPrint();
    }

    @Test
    public void AddProfile() {

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("http://localhost:3000/profile");

        response.prettyPrint();
    }

    @Test
    public void EditProfile() {

        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("http://localhost:3000/profile");

        response.prettyPrint();
    }

}