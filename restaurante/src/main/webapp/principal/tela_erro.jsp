<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Houve um problema</title>
<style type="text/css">
h1{
	color: red;
}

</style>
</head>
<body>
	<table>
		<tr>
			<td><h1>Houve um problema, mensagem: ${msg}</h1></td>
		</tr>
		<tr>
			<td><input type="button" value="Voltar"
				onclick="history.go(-1);"></td>
		</tr>
	</table>
</body>
</html>