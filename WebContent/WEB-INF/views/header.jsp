<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
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
		<ul class="nav navbar-nav navbar-right">
			<li>
			    <a href="<spring:url value='/doLogout' />">Logout</a>
			</li>
		</ul>
	</div>
</div>
