<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="org.json.simple.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Store</title>
</head>
<body>
	<h3>Items</h3>
	<select name="item_name">
		<%
			JSONArray itemArray = (JSONArray) request.getAttribute("items");
			for (Object obj : itemArray) {
				JSONObject item = (JSONObject) obj;
				out.println("<option value=\"" + item.get("item_name") + "\">" + item.get("item_name") + "</option>");
			}
		%>
	</select>
	<h3>Contacts</h3>
	<select>
		<%
			JSONArray contactArray = (JSONArray) request.getAttribute("items");
			for (Object obj : contactArray) {
				JSONObject item = (JSONObject) obj;
				out.println(
						"<option value=\"" + item.get("contact_name") + "\">" + item.get("contact_name") + "</option>");
			}
		%>
	</select>
</body>
</html>