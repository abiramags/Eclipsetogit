package apibegins;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class UnirestHttpexample {


	public void getmethodexample() throws IOException, UnirestException
	{
		HttpResponse<JsonNode> jsonresponse = Unirest.get("https://reqres.in/api/users?page=2").asJson();

		System.out.println("status code is "+ jsonresponse.getStatus());
		System.out.println("status message is "+ jsonresponse.getStatusText());
		System.out.println("response body is " + jsonresponse.getBody());
	}
	
	public void postmethodexample() throws IOException, UnirestException
	{
		HttpResponse<JsonNode> jsonresponse = Unirest.post("https://reqres.in/api/users?page=3").body("{\r\n"
				+ "			    \"data\": {\r\n"
				+ "			        \"id\": 14,\r\n"
				+ "			        \"email\": \"abi.saran@reqres.in\",\r\n"
				+ "			        \"first_name\": \"abi\",\r\n"
				+ "			        \"last_name\": \"saran\",\r\n"
				+ "			        \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\"\r\n"
				+ "			    },\r\n"
				+ "			    \"support\": {\r\n"
				+ "			        \"url\": \"https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral\",\r\n"
				+ "			        \"text\": \"Tired of writing endless social media content? Let Content Caddy generate it for you.\"\r\n"
				+ "			    }\r\n"
				+ "			}").asJson();

		System.out.println("status code is "+ jsonresponse.getStatus());
		System.out.println("status message is "+ jsonresponse.getStatusText());
		System.out.println("response body is " + jsonresponse.getBody());
	}
	
	public void putmethodexample() throws IOException, UnirestException
	{
		HttpResponse<JsonNode> jsonresponse = Unirest.put("https://reqres.in/api/users/2").body("{\r\n"
				+ "			    \"data\": {\r\n"
				+ "			        \"id\": 14,\r\n"
				+ "			        \"email\": \"abi.saran@reqres.in\",\r\n"
				+ "			        \"first_name\": \"abi\",\r\n"
				+ "			        \"last_name\": \"guru\",\r\n"
				+ "			        \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\"\r\n"
				+ "			    },\r\n"
				+ "			    \"support\": {\r\n"
				+ "			        \"url\": \"https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral\",\r\n"
				+ "			        \"text\": \"Tired of writing endless social media content? Let Content Caddy generate it for you.\"\r\n"
				+ "			    }\r\n"
				+ "			}").asJson();

		System.out.println("status code is "+ jsonresponse.getStatus());
		System.out.println("status message is "+ jsonresponse.getStatusText());
		System.out.println("response body is " + jsonresponse.getBody());
	}

	public void deletemethodexample() throws IOException, UnirestException
	{
		HttpResponse<JsonNode> jsonresponse = Unirest.delete("https://reqres.in/api/users/2").asJson();

		System.out.println("status code is "+ jsonresponse.getStatus());
		System.out.println("status message is "+ jsonresponse.getStatusText());
		System.out.println("response body is " + jsonresponse.getBody());
	}
public static void main(String[] args) throws IOException, UnirestException {
	
	UnirestHttpexample uni = new UnirestHttpexample();
	uni.getmethodexample();
	uni.postmethodexample();
	uni.putmethodexample();
	uni.deletemethodexample();
	}
}