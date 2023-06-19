import org.json.JSONObject;
import org.junit.Test;

public class C03_JsonObjesiOlusturma {
    /*
    C3_JsonObjesiOlusturma
    Asagidaki JSON Objesini olusturup konsolda yazdirin.

        {
            "title":"Ahmet",
            "body":"Merhaba",
            "userId":1
        }
     */
    @Test
    public void jsonObje01(){
        JSONObject ilkJsonObje=new JSONObject();

        ilkJsonObje.put("title","Ahmet");
        ilkJsonObje.put("body","Merhaba");
        ilkJsonObje.put("userId",1);
        System.out.println("Ilk JSON Obje :"+ilkJsonObje);
    }

    @Test
    public void jsonObje02(){
        /*
        Asagidaki JSON Objesini olusturup konsolda yazdirin.
        {
            "firstname":"Jim",
            "additionalneeds":"Breakfast",
            "bookingdates":{
                            "checkin":"2018-01-01",
                            "checkout":"2019-01-01"
                            },
            "totalprice":111,
            "depositpaid":true,
            "lastname":"Brown"
        }
         */
        JSONObject bookingDates=new JSONObject();
        bookingDates.put("checkin","2018-01-01");
        bookingDates.put("checkout","2019-01-01");


        JSONObject outerObje=new JSONObject();
        outerObje.put("firstname","Jim");
        outerObje.put("additionalneeds","Breakfast");
        outerObje.put("totalprice",111);
        outerObje.put("depositpaid",true);
        outerObje.put("lastname","Brown" );
        outerObje.put("bookingdates",bookingDates);

        System.out.println("Booking Json Objesi :"+outerObje);
        /*
        Booking Json Objesi :
        {
        "firstname":"Jim",
        "additionalneeds":"Breakfast",
        "bookingdates":
                    {
                    "checkin":"2018-01-01",
                    "checkout":"2019-01-01"
                    },
         "totalprice":111,
         "depositpaid":true,
         "lastname":"Brown"
         }
         */

    }
}
