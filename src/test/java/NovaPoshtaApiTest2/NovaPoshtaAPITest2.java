package NovaPoshtaApiTest2;
import org.junit.jupiter.api.Test;


import java.util.List;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class NovaPoshtaAPITest2 extends BaseTestApiNovaPoshta {


    @Test
    public void testSuccessField() {
        given()
                .spec(requestSpecification)
                .body(requestBody)
                .when()
                .post(baseUrl)
                .then()
                .spec(responseSpecification)
                .assertThat()
                .body("success", equalTo(true));
    }
    @Test
    public void testDataField() {
        given()
                .spec(requestSpecification)
                .body(requestBody)
                .when()
                .post(baseUrl)
                .then()
                .spec(responseSpecification)
                .assertThat()
                .body("data", notNullValue())
                .body("data", instanceOf(List.class));
    }
    @Test
    public void testDataArrayData() {
        given()
                .spec(requestSpecification)
                .body(requestBody)
                .when()
                .post(baseUrl)
                .then()
                .spec(responseSpecification)
                .assertThat()
                .body("data.size()", equalTo(1));
    }
    @Test
    public void testRefField() {
        given()
                .spec(requestSpecification)
                .body(requestBody).when()
                .post(baseUrl)
                .then()
                .spec(responseSpecification)
                .assertThat()
                .body("data[0].Ref", equalTo("e718a680-4b33-11e4-ab6d-005056801329"));
    }
    @Test
    void setDescriptionRuTextTest() {
        String settlementDescriptionRu = "Киев";
        given()
                .spec(requestSpecification)
                .body(requestBody)
                .when().post(baseUrl)
                .then().assertThat()
                .spec(responseSpecification)
                .body("data[0].DescriptionRu", equalTo(settlementDescriptionRu));
    }
    @Test
    void setlementTypeTest() {
        String settlementType = "563ced10-f210-11e3-8c4a-0050568002cf";
        given()
                .spec(requestSpecification)
                .body(requestBody)
                .when().post(baseUrl)
                .then().assertThat()
                .spec(responseSpecification)
                .body("data[0].SettlementType", equalTo(settlementType));
    }
    @Test
    void settlementTypeDescriptionTest() {
        String settlementTypeDescription = "місто";
        given()
                .spec(requestSpecification)
                .body(requestBody)
                .when().post(baseUrl)
                .then().assertThat()
                .spec(responseSpecification)
                .body("data[0].SettlementTypeDescription", equalTo(settlementTypeDescription));
    }
}
