<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inscription</title>
</head>
<body>

<p><strong>Inscription via un formulaire</strong></p>
<span class="resultat">${resultat}</span><br/>
<form action="SaisieInscription" method="POST">
<label for="nom">Nom</label>
<input type="text" value="${param.nom}" name="nom" />
<span class="erreur">${erreurs['nom']}</span><br/>
<br/>
<label for="nom">Prénom</label>
<input type="text" value="${param.prenom}" name="prenom" />
<span class="erreur">${erreurs['prenom']}</span><br/>
<br/>
<label for="Age">Âge</label>
<input type="text" value="${param.age}" name="age" />
<span class="erreur">${erreurs['age']}</span><br/>
<br/>
<br/>
<input type="submit" value="Valider" name="valider" />
<br/>
</form>



</body>
</html>