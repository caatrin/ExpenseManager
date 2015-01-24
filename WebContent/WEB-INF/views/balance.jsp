<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Balance</title>
</head>
<body>
<jsp:include page="/WEB-INF/views/header.jsp"/>
<div class="container">
<div class="table-responsive">
			<table class="table">
				<tbody>
					<tr>
						<th>Total Income</th>
						<th>Total Expenses</th>
						<th>Balance</th>
					</tr>
						<tr>
							<td>${sumIncome}</td>
							<td>${sumExpense}</td>
							<td>${balance}</td>
						</tr>
				</tbody>
			</table>
		</div>
</div>

</body>
</html>