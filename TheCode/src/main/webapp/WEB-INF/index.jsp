<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Secret Code</title>
		<link rel="stylesheet" href="/CSS/stylesheet.css" />
	</head>
	<body class = "container">
		<form action="/try" method="post">
			<span><c:out value="${ WrongAnswer }" /></span>
			<h1>What is The Code?</h1>
			<input type="text" name="guess" placeholder="What is the code?" />
			<button>Try "The Code"</button>
	</form>
	</body>
</html>