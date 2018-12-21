<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/style.css"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact</title>
</head>
<body class="container">
	<nav>
		<a href="<%=request.getContextPath()%>/home" class="home-link"><img src="<%= request.getContextPath()%>/pictogrammes/home.png" width="40" height="40" alt="Retour à l'accueil"></a>
		<a href="<%=request.getContextPath()%>/home" class= "home-link">Retour à l'accueil</a>
	</nav>
	
	<h3>#Contacts</h3>
		
		<div class="row">
			<div class="coordonnees col-12 col-sm-6 col-md-6 col-lg-6">
				<h4>Saint-Ex, culture numérique</h4>
					<ul class="contactList">
						<li>Chaussée Bocquaine, </li>
						<li>Esplanade André Malraux</li>
						<li>51100 Reims</li>
						<li>T. 03.26.77.41.41</li>
						<li><a href="http://www.saintex-reims.com">saintex-reims.com</a></li>
					</ul>	
			</div>		
			<div class="coordonnees col-12 col-sm-6 col-md-6 col-lg-6">
				<h4>Wild Code School</h4>
					<ul class="contactList">
						<li>6, rue de St Brice</li>
						<li>51100 Reims</li>
						<li>T. 06.58.30.24.94</li>
						<li><a href="https://wildcodeschool.fr/">wildcodeschool.fr</a></li>
					</ul>	
			</div>
		</div>
		
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>