package apibegins;
//package usingJavaNet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class httpurlconnectionexample {

	public void getmethodexample() throws IOException
	{
		URL url = new URL("https://reqres.in/api/users?page=2");
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("GET");
		con.connect();
		int statuscode = con.getResponseCode();
		System.out.println("status code is "+ statuscode);
		String statusmsg = con.getResponseMessage();
		System.out.println("status message is "+ statusmsg);
		
		InputStream inputstream = con.getInputStream();
		InputStreamReader reader = new InputStreamReader(inputstream);
		
		BufferedReader buff = new BufferedReader(reader);
		String Line;
		StringBuffer buffer = new StringBuffer();
		while((Line = buff.readLine())!=null) {
			buffer.append(Line);
		}
		System.out.println(buffer);
	}
	
	public void postmethodexample() throws IOException
	{
		URL url = new URL("https://reqres.in/api/users?page=3");
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("POST");
		con.setRequestProperty("Content_Type", "application/json");
		con.setDoOutput(true);
		
		String jsonBody = "{\r\n"
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
				+ "			}";
		byte[] inputJson = jsonBody.getBytes();
		
		OutputStream outputStream = con.getOutputStream();
		outputStream.write(inputJson);
		int statuscode = con.getResponseCode();
		System.out.println("status code is "+ statuscode);
		String statusmsg = con.getResponseMessage();
		System.out.println("status message is "+ statusmsg);
		
		InputStream inputstream = con.getInputStream();
		InputStreamReader reader = new InputStreamReader(inputstream);
		BufferedReader buff = new BufferedReader(reader);
		String Line;
		StringBuffer buffer = new StringBuffer();
		while((Line = buff.readLine())!=null) {
			buffer.append(Line);
		}
		System.out.println(buffer);
	}
	
	public void putmethodexample() throws IOException
	{
		URL url = new URL("https://reqres.in/api/users/2");
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("PUT");
		con.setRequestProperty("Content_Type", "application/json");
		con.setDoOutput(true);
		
		String jsonBody = "{\"data\":{\"id\":2,\"email\":\"janet.weaver@reqres.in\",\"first_name\":\"abi\",\"last_name\":\"saran\",\"avatar\":\"https://reqres.in/img/faces/2-image.jpg\"},\"support\":{\"url\":\"https://contentcaddy.io?utm_source=reqres&utm_medium=json&utm_campaign=referral\",\"text\":\"Tired of writing endless social media content? Let Content Caddy generate it for you.\"}}";
		byte[] inputJson = jsonBody.getBytes();
		
		OutputStream outputStream = con.getOutputStream();
		outputStream.write(inputJson);
		int statuscode = con.getResponseCode();
		System.out.println("status code is "+ statuscode);
		String statusmsg = con.getResponseMessage();
		System.out.println("status message is "+ statusmsg);
		
		InputStream inputstream = con.getInputStream();
		InputStreamReader reader = new InputStreamReader(inputstream);
		BufferedReader buff = new BufferedReader(reader);
		String Line;
		StringBuffer buffer = new StringBuffer();
		while((Line = buff.readLine())!=null) {
			buffer.append(Line);
		}
		System.out.println(buffer);
	}
	
	public void deletemethodexample() throws IOException
	{
		URL url = new URL("https://reqres.in/api/users/2");
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("DELETE");
		con.setRequestProperty("Content_Type", "application/json");
		con.setDoOutput(true);
	
		int statuscode = con.getResponseCode();
		System.out.println("status code is "+ statuscode);
		String statusmsg = con.getResponseMessage();
		System.out.println("status message is "+ statusmsg);
		
		InputStream inputstream = con.getInputStream();
		InputStreamReader reader = new InputStreamReader(inputstream);
		BufferedReader buff = new BufferedReader(reader);
		String Line;
		StringBuffer buffer = new StringBuffer();
		while((Line = buff.readLine())!=null) {
			buffer.append(Line);
		}
		System.out.println(buffer);
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		httpurlconnectionexample htp = new httpurlconnectionexample();
		/*htp.getmethodexample();
		htp.postmethodexample();
		htp.putmethodexample();*/
		htp.deletemethodexample();
	}

}
