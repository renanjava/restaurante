<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html = lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65"
	crossorigin="anonymous">

<title>Restaurante</title>
<style type="text/css">

form{
position: absolute;
top: 40%;
left: 35%;

}


h2{
position: absolute;
top: 30%;
left: 42%;
color: olive;
}

</style>

</head>
<body>
	<h2>Restaurante Juliana</h2>
	
	<form action="ServletLogin" method="post" class="row g-3">
		<input type="hidden" value="<%=request.getParameter("url")%>"
			name="url">

		<div class="col-md-6">
			<label class="form-label"> Login </label> 
			<input class="form-control" name="campoUsuario" type="text">
		</div>
		<div class="col-md-6">
			<label class="form-label"> Senha</label> 
			<input class="form-control" name="campoSenha" type="password">
		</div>
    		<input type="submit" value="Acessar" class="btn btn-primary">
	</form>
	<h4>${msg}</h4>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
		crossorigin="anonymous"></script>
</body>
</html>