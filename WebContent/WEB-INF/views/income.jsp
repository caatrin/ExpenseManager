<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<script type="text/javascript"
	src=<c:url value="resource/javascript/bootstrap.js"/>></script>
<script type="text/javascript"
	src=<c:url value="resource/javascript/form-validator/jquery.form-validator.min.js"/>></script>
<script type="text/javascript" src=<c:url value="resource/javascript/expenseManager.js"/>></script>	
<link rel="stylesheet" href=<c:url value="resource/css/bootstrap.css"/>>
<title>Income</title>
</head>
<body>
	<jsp:include page="/WEB-INF/views/header.jsp" />
	<jsp:include page="/WEB-INF/views/transactionsModal.jsp"/>

	<div class="container">
		<button type="button" class="btn btn-primary" id="addIncome"
			data-toggle="modal" data-target="#myModal">Add Income</button>
		<div class="table-responsive">
			<table class="table">
				<tbody>
					<tr>
						<th>Tag</th>
						<th>Amount</th>
						<th>Transaction Date</th>
						<th>Options</th>
					</tr>
					<c:forEach items="${listOfIncomes}" var="income">
						<tr>
							<td value="">${income.tag}</td>
							<td>${income.amount}</td>
							<td>${income.transactionDate}</td>
							<td><a href="<spring:url value="/deleteIncome?id=${income.transactionId}" />">Delete</a>
							    <a href="" data-amount="${income.amount}" id="editTrans" data-tag="${income.tag}" 
							     data-transactiondate="${income.transactionDate}" data-transactionid="${income.transactionId}" 
							     data-toggle="modal" data-target="#myModal">Edit</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
<script> $.validate(); </script>
</html>