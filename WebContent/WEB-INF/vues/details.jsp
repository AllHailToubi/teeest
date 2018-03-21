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

<title>Produits</title>
</head>
<body>
<div class="container">
  <h2>Commandes</h2>           
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>PRODUITS</th>
        <th>QUANTITE</th>
        <th>DESCRIPTION</th>
      </tr>
    </thead>
    <tbody>
    <c:if test="${not empty llc}">
    <c:forEach items="${llc}" var="alist"> 
      <tr>
        <td> <c:out value="${alist.getP().getDescription()}" /></td>
        <td> <c:out value="${alist.quantite}" /></td>
        <td> <c:out value="${alist.description}" /></td>
      </tr>
          </c:forEach> 
</c:if>
    </tbody>
  </table>
</div>
</body>
</html>