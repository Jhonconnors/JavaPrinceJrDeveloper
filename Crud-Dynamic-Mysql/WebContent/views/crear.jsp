<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<style>
			.save {background-color: #4EB9EC}
			.inicio{background-color: #8B56C3;
			width:110px; height:25px; 
			font-weight:  bolder;}
		</style>
	</head>
	<body>
		<div align="center">
		<h1>Crear Producto</h1>
		<form action="productos" method="post">
			<input type="hidden" name="opcion" value="guardar">
			<table border="1">
			<tr>
			    <td>Nombre:</td>
			    <td><input type="text" name="nombre" size="50"></td>
			   </tr>
			   <tr>
			    <td>Cantidad:</td>
			    <td><input type="text" name="cantidad" size="50"></td>
			   </tr>
			   <tr>
			    <td>Precio:</td>
			    <td><input type="text" name="precio" size="50"></td>
			   </tr>
			</table>
			<input type="submit" class="save" value="guardar">
		</form>
		<br>
		<a href="productos?opcion=inicio">
		 <input type="button" class="inicio" value="Volver a Inicio"></a>
		</div>
	</body>
</html>
