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
	
	  <form:label path="nome">Nome do Cliente:</form:label><br>
	  <form:input type="text" path="nome"/><br>
	  
	  <form:label path="documento">CPF/CNPJ:</form:label><br>
	  <form:input type="text" path="documento"/><br>
	  
	  <form:label path="email">E-mail:</form:label><br>
	  <form:input type="text" path="email"/><br>
	  
	  <form:label path="telefone">Telefone:</form:label><br>
	  <form:input type="text" path="telefone"/><br>
	  
	  <form:label path="operacao">Operação:</form:label><br>
	  <form:input type="text" path="operacao" placeholder="Urbana"/><br>
	  
	  <form:label path="aplicacao">Aplicação:</form:label><br>
	  <form:input type="text" path="aplicacao" placeholder = "Basculante"/><br>
	  
	  <form:label path="eixo">Configuração do Eixo:</form:label><br>
	  <form:input type="text" path="eixo" placeholder = "B6-X4"/><br>
	 
	 <form:label path="chassi">Tipo de Chassi:</form:label><br>
	  <form:input type="text" path="chassi" placeholder = "Cavalo"/><br>
	  
	  <form:label path="serie">Série da Cabine:</form:label><br>
	  <form:input type="text" path="serie" placeholder = "P"/><br>
	  
	  <form:label path="pesoMax">Peso Máximo da Carga:</form:label><br>
	  <form:input type="text" path="pesoMax" placeholder = "3.5 T"/><br>
	  
	  <form:label path="altura">Altura da Cabine:</form:label><br>
	  <form:input type="text" path="altura" placeholder = "Leito com Teto Alto"/><br>
	  
	  <form:label path="kmAnual">Média KM anual:</form:label><br>
	  <form:input type="text" path="kmAnual" placeholder = "35 KM"/><br>
	  
	  <input type="submit" name="salvar" value="Salvar"/>
	</form:form>
</body>
</html>