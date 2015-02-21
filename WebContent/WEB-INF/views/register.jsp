<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script src="//code.jquery.com/jquery-1.11.2.min.js"></script>
<script type="text/javascript"
	src=<c:url value="resource/javascript/bootstrap.js"/>></script>
<script type="text/javascript"
	src=<c:url value="resource/javascript/form-validator/jquery.form-validator.min.js"/>></script>
<link rel="stylesheet" href=<c:url value="resource/css/bootstrap.css"/>>
<title>Register</title>
</head>
<body>

    <jsp:include page="/WEB-INF/views/headerPre.jsp" />

	<div class="container">
	    <h1>Register</h1><br>
		<form action="register" method="post">
			<div class="form-group">
				<label for="firstName">First Name</label> <input type="text"
					class="form-control" name="firstName" placeholder="Enter first name" data-validation="required">
			</div>
			<div class="form-group">
				<label for="Last Name">Last Name</label> <input type="text"
					class="form-control" name="lastName" placeholder="Enter last name" data-validation="required">
			</div>
			<div class="form-group">
				<label for="emailAddress">Email address</label> <input type="email"
					class="form-control" name="email" placeholder="Enter email" data-validation="required">
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					class="form-control" name="password" placeholder="Enter password" data-validation="required">
			</div>
			<div class="form-group">
				<label for="password">Retype Password</label> <input type="password"
					class="form-control" name="retypePassword" placeholder="Enter password" data-validation="required">
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

</body>
<script> $.validate(); </script>
</html>