<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<script type="text/javascript"
	src=<c:url value="resource/javascript/bootstrap.js"/>></script>
<script type="text/javascript"
	src=<c:url value="resource/javascript/form-validator/jquery.form-validator.min.js"/>></script>
<link rel="stylesheet" href=<c:url value="resource/css/bootstrap.css"/>>
<title>Welcome</title>
</head>
<body>
	<jsp:include page="/WEB-INF/views/${page}.jsp" />
	<div id="wrap">
		<center>
			<div class="container">
				<p>I'm the welcome page</p>
				<img src="resource/img/business_expense.jpg"/>

				<c:if test="${error == true}">
					<div class="form-group">
						<label class="alert alert-danger" role="alert">Username or
							Password Invalid!</label>
					</div>
				</c:if>
			</div>
		</center>
	</div>
</body>
<jsp:include page="/WEB-INF/views/footer.jsp" />
</html>