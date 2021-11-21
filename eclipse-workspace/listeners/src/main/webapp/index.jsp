<%@page import="com.jdc.shop.model.Product"%>
<%@page import="com.jdc.shop.model.ProductModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listener Demo</title>
</head>
<body>

	<h1>Product List</h1>
	<%
	ProductModel model = (ProductModel) application.getAttribute("products");
	%>
	<table style="width: 60%">
		<tr>
			<td>ID</td>
			<td>Category</td>
			<td>Name</td>
			<td>Price</td>
			<td>Add</td>
			
		</tr>

		<%
		for (int i = 0; i < model.getList().size(); i++) {
			Product p = model.getList().get(i);
		%>

		<tr>
			<td><%=p.getId()%></td>
			<td><%=p.getCategory()%></td>
			<td><%=p.getName()%></td>
			<td><%=p.getPrice()%></td>
			<td>
				<a href="cart-add?product=<%=p.getId() %>">Add To Cart</a>
			</td>
		</tr>

		<%
		}
		%>

	</table>

</body>
</html>