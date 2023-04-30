package NovaPoshtaAPITest2;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeEach;

public class BaseTestApiNovaPoshta {

    protected final String apiKey = "e260674a56d4de0bb66a79a5baf7a74f";
    protected final String baseUrl = "https://api.novaposhta.ua/v2.0/json/";
    protected String requestBody = "{ \"apiKey\": \"" + apiKey + "\", "
            + "\"modelName\": \"Address\", "
            + "\"calledMethod\": \"getSettlements\", "
            + "\"methodProperties\": { "
            + "\"Page\": \"1\", "
            + "\"Warehouse\": \"1\", "
            + "\"FindByString\": \"Київ\", "
            + "\"Limit\": \"1\" }, "
            + "\"system\": \"DevCentre\" }";

    public RequestSpecification requestSpecification;
    public ResponseSpecification responseSpecification;

    @BeforeEach
    public void setSpecs() {
        requestSpecification = new RequestSpecBuilder()
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
        responseSpecification = new ResponseSpecBuilder()
                .log(LogDetail.ALL)
                .build();
    }
}
