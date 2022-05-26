<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	<p>Cotação #ID ${cotacao.id}</p>
	
	<p><a href="listar/formulario">Adicionar novo</a></p>		
	
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Data</th>
				<th>Status</th>
			</tr>
		</thead>
		<tbody>	
				<tr>
					<td>${cotacao.id}</td>
					<td>${cotacao.data}</td>
					<td>${cotacao.status}</td>
					<td><a href="posts/${cotacao.id}">Editar</a></td>
					<td><a href="posts/${cotacao.id}/delete">Apagar</a></td>
				</tr>
		</tbody>
	</table>
</body>
</html>