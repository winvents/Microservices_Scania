<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Nova Cotação</title>
</head>
<body>

	<c:if test="${addCotacaoSucess}">
		<h3>Cotação salva com sucesso! Id: ${cotacaoSalva.id} </h3>
	</c:if>	
	
	<c:url var="save_cotacao_url" value="/listar/salvar"/>
	<form:form action="${save_cotacao_url}" method="post" modelAttribute="cotacao">
	
	  <form:label path="id">Id: ${id}</form:label><br>
	  <form:input type="text" path="id" readonly="true"/><br>
	  
	  <form:label path="data">Data:</form:label><br>
	  <form:input type="text" path="data"/><br>
	  
	  <form:label path="status">Status:</form:label><br>
	  <form:input type="text" path="status"/><br>
	  
	  <input type="submit" name="salvar" value="Salvar"/>
	</form:form>
</body>
</html>