<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.time.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Affichage de la date</title>
</head>
<body>



<!--   Exemple de scriptlet code java inclus dans une page � ne pas faire -->

<%
LocalDate date= LocalDate.now();
out.println("la date du jour est: " +date); 
%>



</body>
</html>