import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class LongRedirect {

    @Test
    public void testLongRedirect() {
        Response response = RestAssured
                .given()
                .relaxedHTTPSValidation()
                .redirects()
                .follow(false)
                .when()
                .get("https://playground.learnqa.ru/api/long_redirect")
                .andReturn();

        response.prettyPrint();
        String locationReader = response.getHeader("Location");
        System.out.println("Первый редирект: " + locationReader);
    }
}
