<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.pictolab.beans.Activity" %>

<!DOCTYPE html>
<html lang="fr">
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/style.css"/>
<link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
<meta charset="UTF-8">
<title>Activités</title>
</head>
<body class="container">
	<nav>
			<a href="<%=request.getContextPath()%>/" class="picto-home home-link"><img src="<%= request.getContextPath()%>/pictogrammes/home.png" width="40" height="40" alt="Retour à l'accueil"></a>
			<a href="<%=request.getContextPath()%>/" class= "home-link">Retour à l'accueil</a>
	</nav>

	<div class="row">
	<% for(Activity activity : (List<Activity>)request.getAttribute("activities")) { %>	
	
	<div class="block col-12 col-sm-6 col-md-4 col-lg-4">
	
	<article>
	<h2><%=activity.getTitle()%></h2>
	<p><%=activity.getSummary()%></p>
	<button type="button" class="btn btn-light" data-toggle="modal" data-target="#exampleModal">
	Plus d'infos !
	</button>
	</article>

	<div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog" role="document">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel"><%=activity.getTitle()%></h5>
	        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
	          <span aria-hidden="true">&times;</span>
	        </button>
	      </div>
	      <div class="modal-body">
			<p><%=activity.getContent()%></p>	      
		  </div>
	      <div class="modal-footer">
	        <button type="button" class="btn btn-light" data-dismiss="modal">Close</button>
	      </div>
	    </div>
	  </div>
	</div>
	</div>
		
	<% } %>
	</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>