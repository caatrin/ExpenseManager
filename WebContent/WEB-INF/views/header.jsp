<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<script type="text/javascript" src=<c:url value="resource/javascript/bootstrap.js"/>></script>
<link rel="stylesheet" href=<c:url value="resource/css/bootstrap.css"/>>
</head>
<body>

	<div class="navbar navbar-inverse">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target=".navbar-inverse-collapse">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="/ExpenseManager">Expense Manager</a>
		</div>
		<div class="navbar-collapse collapse navbar-inverse-collapse">
			<ul class="nav navbar-nav">
				<li><a href="/ExpenseManager/income">Income</a></li>
				<li><a href="/ExpenseManager/expense">Expenses</a></li>
				<li><a href="/ExpenseManager/balance">Balance</a></li>
			</ul>

		</div>
	</div>

</body>
</html>