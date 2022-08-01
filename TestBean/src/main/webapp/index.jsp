<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<title>Use Bean Example</title>
</head>
<body>
<div align="center">

<jsp:useBean id="date" class="java.util.Date"/>

<jsp:useBean id="person" class="beans.Bean">
	<jsp:setProperty name="person" property="firstName" value="Celia"/>
	<jsp:setProperty name="person" property="lastName" value="Gomez"/>
	<jsp:setProperty name="person" property="age" value="28"/>
</jsp:useBean>

<h2>Utilisation de bean en appelant java.util.Date</h2>
Aujourd'hui on est le <%=date%>
<h2>Accès aux JavaBeans Properties</h2>
<p><b>Prenom : </b>
<jsp:getProperty name="person" property="firstName"/>
</p>
<p><b>Nom : </b>
<jsp:getProperty name="person" property="lastName"/>
</p>
<p><b>Age :</b>
<jsp:getProperty name="person" property="age"/>
</p>
</div>
</body>
</html>