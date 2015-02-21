<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<jsp:include page="/WEB-INF/views/${page}.jsp" />
	<div id="wrap">
		<center><div class="container">I'm the welcome page
			<c:if test="${error == true}">
				<div class="form-group">
					<label class="alert alert-danger" role="alert">Username or
						Password Invalid!</label>
				</div>
			</c:if>
		</div></center>c
	</div>
</body>
<jsp:include page="/WEB-INF/views/footer.jsp" />
</html>