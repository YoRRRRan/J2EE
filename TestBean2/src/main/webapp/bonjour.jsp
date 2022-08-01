<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="/TestBean2/Test">Lancer</a>
  		<p>Bonjour ${ auteur.prenom } ${ auteur.nom }</p>
  		<p>${ test }</p>
        <p>${ auteur.actif ? 'Vous êtes très actif !' : 'Vous êtes inactif !' }</p>
        
</body>
</html>