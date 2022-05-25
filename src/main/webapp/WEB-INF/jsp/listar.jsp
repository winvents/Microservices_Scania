<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	<p>Lista de Cotação - ${empresa}</p>
	
	<p><a href="listar/formulario">Adicionar nova Cotação</a></p>		
	
	<table>
		<thead>
			<tr>
				<th>Id</th>
				<th>Data</th>
				<th>Status</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="cotacao" items="${cotacoes}">
				<tr>
					<td>${cotacao.id}</td>
					<td>${cotacao.data}</td>
					<td>${cotacao.status}</td>
					<td><a href="listar/${cotacao.id}">Editar</a></td>
					<td><a href="listar/${cotacao.id}/delete">Apagar</a></td>
				</tr>
			</c:forEach>
		</tbody>
		
		
	</table>
</body>
</html>