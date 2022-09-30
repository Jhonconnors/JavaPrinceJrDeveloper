<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Menu de Opciones</title>
		<style>
			td, input {background-color: #4EB9EC}
			#tabla{font-weight:  bolder;}
		</style>
	</head>
<body>
	<div align="center">
		<h1>Menu Admin de Productos</h1>
		<table border="1" id="tabla">
		<tr>
			<td> <a href="productos?opcion=crear">
       		<input type="button" value="Crear un Producto"></a></td>
			
			<td> <a href="productos?opcion=listar">
			<input type="button" value="Listar Productos"></a></td>
		</tr>
		</table>
	</div>

</body>
</html>