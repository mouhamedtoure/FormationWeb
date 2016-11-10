<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inscription</title>
</head>
<body>



	Votre heure de première connexion: ${heure}

	<p>
		<strong>Inscription via un formulaire</strong>
	</p>


	<ul>
		<c:forEach var="erreurs01" items="${erreurs0}">
			<li>${erreurs01}</li>
		</c:forEach>
	</ul>


	<form action="" method="POST">
		<c:if test="${not empty listePays}">
			<select name="pays">
				<c:forEach items="${listePays}" var="pays">
					<option value="${pays}">${pays}</option>
				</c:forEach>
			</select>
		</c:if>
	</form>


	<span class="resultat">${resultat}</span>
	<br />
	<form action="SaisieInscription" method="POST">
		<label for="nom">Nom</label> <input type="text" value="${param.nom}"
			name="nom" /> <span class="erreur">${erreurs['nom']}</span><br /> <br />
		<label for="nom">Prénom</label> <input type="text"
			value="${param.prenom}" name="prenom" /> <span class="erreur">${erreurs['prenom']}</span><br />
		<br /> <label for="Age">Âge</label> <input type="text"
			value="${param.age}" name="age" /> <span class="erreur">${erreurs['age']}</span><br />
		<br /> <br /> <input type="submit" value="Valider" name="action" />
		<br /> <br /> <input type="submit" value="Deconnexion" name="action" />
	</form>
</body>
</html>