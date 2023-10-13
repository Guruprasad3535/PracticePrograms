package Vouchpay;



import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CheckoutPage {
	
   public static void main(String[] args) {
	
	// Set base URI
       RestAssured.baseURI = "https://sim.iamvouched.com/v1/escrow/generate_collect_link";

    // Create a JSON object with request payload
       // Create a JSON object with the provided payload
       
       JSONObject payer = new JSONObject();
       payer.put("user_ref", "guru123");
       payer.put("company_name", "guru-company");
       payer.put("user_name", "guruprasad");
       payer.put("user_mobile_number", "8970486528");
       
       JSONObject collect = new JSONObject();
       collect.put("collect_ref", "Collect12319");
       collect.put("collect_modes", new String[]{"UPI","VIRTUAL_ACCOUNT","NET_BANKING","CREDIT_CARD","DEBIT_CARD"});
       collect.put("amount", 300);
       collect.put("transaction_note", "checkout");
       collect.put("payer", payer);
       collect.put("virtual_account_no", "ESCROWALFIN2001");
       collect.put("ifsc", "ICIC0000104");
       
       JSONArray collectsArray = new JSONArray();
       collectsArray.add(collect);
       
       JSONObject requestPayload = new JSONObject();
       requestPayload.put("escrow_id", "guru2001");
       requestPayload.put("redirect_url", "https://www.iamvouched.com/");
       requestPayload.put("collects", collectsArray);
       requestPayload.put("timestamp", "{{IST_Timestamp}}");
       requestPayload.put("signature", "{{signature}}");

       // Send POST request with the JSON payload and capture the response
       Response response = RestAssured.given()
               .contentType(ContentType.JSON)
               .body(requestPayload.toJSONString())
               .post("/post");

       // Print the response status code
       int statusCode = response.getStatusCode();
       System.out.println("Status Code: " + statusCode);

       // Print the response body
       String responseBody = response.getBody().asString();
       System.out.println("Response Body: " + responseBody);
   }

}
