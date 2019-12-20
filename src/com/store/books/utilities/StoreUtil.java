package com.store.books.utilities;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class StoreUtil {

	public static JSONArray getItems() throws Exception {

		String url = "https://books.zoho.com/api/v3/items?organization_id=703983545";

		HttpURLConnection httpClient =
			(HttpURLConnection) new URL(url).openConnection();

		httpClient.setRequestMethod("GET");

		httpClient.setRequestProperty("Content-Type", "application/json");
		httpClient.setRequestProperty("Authorization", "Zoho-oauthtoken 1000.8e88e311cc8b51206cc3463ff338b219.df294d787b2603284bc890f17b5361c0");

		int responseCode = httpClient.getResponseCode();
		//System.out.println("Response Code : " + responseCode);
		StringBuilder response = new StringBuilder();
		try (BufferedReader in = new BufferedReader(
			new InputStreamReader(httpClient.getInputStream()))) {
			String line;
			while ((line = in.readLine()) != null)
			{
				response.append(line);
			}
		}
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(response.toString());
		//System.out.println(json.get("items"));
		return (JSONArray) json.get("items");
	}

	public static JSONArray getContacts() throws Exception {

		String url = "https://books.zoho.com/api/v3/contacts?organization_id=703983545";

		HttpURLConnection httpClient =
			(HttpURLConnection) new URL(url).openConnection();

		httpClient.setRequestMethod("GET");

		httpClient.setRequestProperty("Content-Type", "application/json");
		httpClient.setRequestProperty("Authorization", "Zoho-oauthtoken 1000.8e88e311cc8b51206cc3463ff338b219.df294d787b2603284bc890f17b5361c0");

		int responseCode = httpClient.getResponseCode();
		//System.out.println("Response Code : " + responseCode);
		StringBuilder response = new StringBuilder();
		try (BufferedReader in = new BufferedReader(
			new InputStreamReader(httpClient.getInputStream()))) {
			String line;
			while ((line = in.readLine()) != null)
			{
				response.append(line);
			}
		}
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(response.toString());
		//System.out.println(json.get("items"));
		return (JSONArray) json.get("contacts");
	}
}
