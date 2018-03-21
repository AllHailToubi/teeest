<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<spring:url value="/resources/css/bootstrap.min.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" type="text/css" />

<title>Home</title>
</head>
<body>

<input type="button" onclick="location.href='produits';" value="Consulter Produits"/>
<input type="button" onclick="location.href='commandes';" value="Consulter Commandes "/> 
<input type="button" onclick="location.href='';" value="Home page"/> 
</body>
</html>