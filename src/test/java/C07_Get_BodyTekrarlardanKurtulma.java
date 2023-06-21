import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class C07_Get_BodyTekrarlardanKurtulma {
    /*

        https://restful-booker.herokuapp.com/booking/10 url’ine bir GET request gonderdigimizde
        donen Response’un,
        status code’unun 200,
        ve content type’inin application-json,
        ve response body’sindeki
        "firstname“in, "Eric",
        ve "lastname“in, "Smith",
        ve "totalprice“in, 171,
        ve "depositpaid“in, false,
        ve "additionalneeds“in, "Breakfast"
        oldugunu test edin

     */

    @Test
    public void get01() {
        //1- Url hazirla

        String url = "https://restful-booker.herokuapp.com/booking/10";

        //2- Expected Data hazirla

        //3- Response'i kaydet

        Response response = given().when().get(url);

        response.prettyPrint();

        //4- Assertion
/*
        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("firstname", Matchers.equalTo("Eric"))
                .body("lastname", Matchers.equalTo("Smith"))
                .body("totalprice", Matchers.equalTo(171))
                .body("depositpaid", Matchers.equalTo(false));

 */

        response
                .then()
                .assertThat()
                .statusCode(200)
                .contentType("application/json; charset=utf-8")
                .body("firstname", equalTo("Eric"))
                .body("lastname", equalTo("Smith"))
                .body("totalprice", equalTo(171))
                .body("depositpaid", equalTo(false));
    }
}
