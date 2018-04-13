<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<spring:url value="/resources/css/bootstrap.min.css" var="mainCss" />
<link href="${mainCss}" rel="stylesheet" type="text/css" />
<title>Ajouter Produit</title>
</head>
<body>
<form:form method="POST" action="addProduit" modelAttribute="produit">
             <table>
                <tr>
                    <td><form:label path="idproduit">Id</form:label></td>
                    <td><form:input path="idproduit"/></td>
                </tr>
                
                <tr>
                    <td><form:label path="description">Description</form:label></td>
                    <td><form:input path="description"/></td>
                </tr>
        
                <tr>
                    <td><form:label path="prix">Prix</form:label></td>
                    <td><form:input path="prix"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
</body>
</html>