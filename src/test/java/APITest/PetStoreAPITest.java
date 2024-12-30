package APITest;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetStoreAPITest {

    @Test
    public void AddANewPetToTheStore(){

        Response response=given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "  \"id\": 1,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 1,\n" +
                        "    \"name\": \"doggie\"\n" +
                        "  },\n" +
                        "  \"name\": \"tommy\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"jpg\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 1,\n" +
                        "      \"name\": \"tommy\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")
                .when()
                .post("https://petstore.swagger.io/v2/pet");

        response.prettyPrint();
    }

    @Test
    public void UpdateAnExicitingPet(){

        Response response=given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "  \"id\": 2,\n" +
                        "  \"category\": {\n" +
                        "    \"id\": 1,\n" +
                        "    \"name\": \"doggie\"\n" +
                        "  },\n" +
                        "  \"name\": \"tommy\",\n" +
                        "  \"photoUrls\": [\n" +
                        "    \"jpg\"\n" +
                        "  ],\n" +
                        "  \"tags\": [\n" +
                        "    {\n" +
                        "      \"id\": 1,\n" +
                        "      \"name\": \"tommy\"\n" +
                        "    }\n" +
                        "  ],\n" +
                        "  \"status\": \"available\"\n" +
                        "}")
                .when()
                .put("https://petstore.swagger.io/v2/pet");

        response.prettyPrint();
    }

    @Test
    public void FindPetsByStatus(){

        Response response=given()
                .header("Postman-Token\n","<calculated when request is sent>")
                .when()
                .get("https://petstore.swagger.io/v2/pet/findByStatus?status=available");

        response.prettyPrint();
    }

    @Test
    public void FindPetById(){

        Response response=given()
                .header("Content-Type","application/json")
                .when()
                .get("https://petstore.swagger.io/v2/pet/1");

        response.prettyPrint();
    }

    @Test
    public void UpdateThePetByFormsData(){

        Response response=given()
                .header("Content-Type","application/json")
                .when()
                .post("https://petstore.swagger.io/v2/pet/1");

        response.then()
                .statusCode(200);
    }

    @Test
    public void DeleteById(){

        Response response=given()
                .header("Content-Type","application/json")
                .when()
                .delete("https://petstore.swagger.io/v2/pet/2");

        response.prettyPrint();
    }

    @Test
    public void PlaceAnOrderForAPet(){

        Response response=given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "  \"id\": 3,\n" +
                        "  \"petId\": 13,\n" +
                        "  \"quantity\": 10,\n" +
                        "  \"shipDate\": \"2024-12-27T11:42:23.265Z\",\n" +
                        "  \"status\": \"placed\",\n" +
                        "  \"complete\": false\n" +
                        "}")
                .when()
                .post("https://petstore.swagger.io/v2/store/order");

        response.prettyPrint();
    }

    @Test
    public void FindPurchaseOrderById(){

        Response response=given()
                .header("Content-Type","application/json")
                .when()
                .get("https://petstore.swagger.io/v2/store/order/3");

        response.prettyPrint();
    }

    @Test
    public void ReturnsPetInventoryByStatus(){

        Response response=given()
                .header("Content-Type","application/json")
                .when()
                .get("https://petstore.swagger.io/v2/store/inventory");

        response.prettyPrint();
    }

    @Test
    public void DeletePurchareOrderById(){

        Response response=given()
                .header("Content-Type","application/json")
                .when()
                .get("https://petstore.swagger.io/v2/store/order/2");

        response.prettyPrint();
    }

    @Test
    public void CreateUser(){

        Response response=given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "  \"id\": 1,\n" +
                        "  \"username\": \"chandru\",\n" +
                        "  \"firstName\": \"chandramohan\",\n" +
                        "  \"lastName\": \"halemani\",\n" +
                        "  \"email\": \"chandru@gmail.com\",\n" +
                        "  \"password\": \"123\",\n" +
                        "  \"phone\": \"890\",\n" +
                        "  \"userStatus\": 1\n" +
                        "}")
                .when()
                .post("https://petstore.swagger.io/v2/user");

        response.prettyPrint();
    }

    @Test
    public void getByUserName(){

        Response response=given()
                .header("Content-Type","application/json")
                .when()
                .get("https://petstore.swagger.io/v2/user/chandru");

        response.prettyPrint();
    }

    @Test
    public void EditByUsername(){

        Response response=given()
                .header("Content-Type","application/json")
                .body("{\n" +
                        "    \"id\": 3,\n" +
                        "    \"username\": \"venkii\",\n" +
                        "    \"firstName\": \"venkatesh\",\n" +
                        "    \"lastName\": \"manvi\",\n" +
                        "    \"email\": \"venky@gmail.com\",\n" +
                        "    \"password\": \"123\",\n" +
                        "    \"phone\": \"890\",\n" +
                        "    \"userStatus\": 3\n" +
                        "  }")
                .when()
                .put("https://petstore.swagger.io/v2/user/venky");

        response.prettyPrint();
    }

    @Test
    public void DeleteByUser(){

        Response response=given()
                .header("Content-Type","application/json")
                .when()
                .delete("https://petstore.swagger.io/v2/user/chandru");

        response.prettyPrint();
    }
}
