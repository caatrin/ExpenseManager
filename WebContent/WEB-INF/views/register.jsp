<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>

    <jsp:include page="/WEB-INF/views/headerPre.jsp" />

	<div class="container">
	    <h1>Register</h1><br>
		<form>
			<div class="form-group">
				<label for="firstName">First Name</label> <input type="text"
					class="form-control" id="firstName" placeholder="Enter first name">
			</div>
			<div class="form-group">
				<label for="Last Name">Last Name</label> <input type="text"
					class="form-control" id="lastName" placeholder="Enter last name">
			</div>
			<div class="form-group">
				<label for="emailAddress">Email address</label> <input type="email"
					class="form-control" id="emailAddress" placeholder="Enter email">
			</div>
			<div class="form-group">
				<label for="password">Password</label> <input type="password"
					class="form-control" id="password" placeholder="Enter password">
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>

</body>
</html>