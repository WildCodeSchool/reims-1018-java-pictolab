<%@page import="java.util.List"%>
<%@page import="com.pictolab.beans.Tag"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="fr">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/style.css"/>
<title>Accueil</title>
</head>
<body class="container">
 <img class="logo" src="<%= request.getContextPath() %>/pictogrammes/logo_pictolab.png" alt="pictolab"/>
<h1 class="logo">Bienvenue</h1>
<hr>
<h5>Choississez votre thème</h5>

<div class="row">
<% for (Tag tag : (List<Tag>)request.getAttribute("tags")) {%>
    <div class="picto col-6 col-sm-4 col-md-3 col-lg-2">
		<a href="<%=request.getContextPath()%>/activites?tag=<%=tag.getId()%>"><img src="<%= request.getContextPath() %>/pictogrammes/<%=tag.getUrlName()%>.png" alt="<%=tag.getTitle()%>"/></a>
	</div>
<% } %>
</div>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>