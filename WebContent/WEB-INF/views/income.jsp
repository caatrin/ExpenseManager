<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Income</title>
</head>
<body>
	<jsp:include page="/WEB-INF/views/header.jsp" />



	<div class="modal fade" id="myModal" hidden="true" tabindex="-1"
		role="dialog">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
					<h4 class="modal-title">Add Income</h4>
				</div>
				<div class="modal-body">
					<form action="/ExpenseManager/income" method="post">
						<div class="form-group">
							<label for="amount">Amount</label> <input name="amount"
								type="text" class="form-control" id="amount"
								placeholder="Enter amount">
						</div>
						<div class="form-group">
							<label for="tag">Tag</label> <input type="text" name="tag"
								class="form-control" id="tag" placeholder="Enter tag">
						</div>
						<div class="form-group">
							<label for="transactionDate">Transaction Date</label> <input
								type="date" class="form-control" id="transactionDate"
								name="transactionDate" placeholder="Enter transaction date">
						</div>
						<div class="modal-footer">
							<button type="button" class="btn btn-default"
								data-dismiss="modal">Close</button>
							<input type="submit" value="Save" class="btn btn-primary">
						</div>
					</form>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->


	<div class="container">
		<button type="button" class="btn btn-primary" id="addIncome"
			data-toggle="modal" data-target="#myModal">Add Income</button>

		<p><ul class="list-group-income">
			<c:forEach items="${listOfIncomes}" var="income">
				<li class="list-group-item">${income.amount}</li>
			</c:forEach>
		</ul></p>
	</div>
</body>
</html>