<%@ page pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>Location de Voiture - Connexion à l'application</title>
<link type="text/css" rel="stylesheet" href="<c:url value="/CSS/bootstrap.min.css"/>"/>

</head>
<body class="bg-light">
	<div class="container">
		<div class="py-5 text-center">
			<h2>Connection</h2>
		</div>
		
		<form method="post" action="j_security_check" class="needs-validation">
			<div class="row">
				<div class="col-6 mb-3">
					<label for="login">Login</label> <input type="text"
						class="form-control" id="login" name="j_username" placeholder=""
						value="" required="">
				</div>
				<div class="col-6 mb-3">
					<label for="password">Password</label> <input type="password"
						class="form-control" id="password" name="j_password"
						placeholder="" value="" required="">
				</div>
			</div>
			<hr class="mb-3">
			<button class="btn btn-primary btn-lg btn-block" type="submit">Se connecter</button>
		</form>
	</div>

	<script src="<c:url value="/JS/jquery-3.5.1.min.js"/>"></script>
	<script src="<c:url value="/JS/bootstrap.bundle.min.js"/>"></script>
</body>
</html>