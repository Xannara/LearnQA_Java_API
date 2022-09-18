import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class GetJsonHomework {

    @Test
    public void testGetJsonHomework() {
        JsonPath response = RestAssured
                .given()
                .get("https://playground.learnqa.ru/api/get_json_homework")
                .jsonPath();
        ArrayList<String> messages = response.get("messages");
        System.out.println(messages);

        String secondMessage = response.get("messages.message[1]");
        System.out.println("\n Текст второго сообщения: " + secondMessage);
    }
}
