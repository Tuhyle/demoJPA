<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<title>Student</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/font-awesome.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/all.min.css" />


</head>
<body>
	<div class="container">
		<h2>Add Student</h2>
		<div class="panel-body">
			<form:form action="/saveStudent" cssClass="form-horizontal" method="post" modelAttribute="student">
				<div class="form-group">
					<label for="firstname" class="col-md-3 control-label">Name</label>
					<div class="col-md-9">
						<form:input path="name" Class="form-control" />
					</div>
				</div>
				<div class="form-group">
					<label for="lastname" class="col-md-3 control-label">Address</label>
					<div class="col-md-9">
						<form:input path="address" Class="form-control" />
					</div>
				</div>

				<div class="form-group">
					<!-- Button -->
					<div class="col-md-offset-3 col-md-9">
						<form:button Class="btn btn-primary">Submit</form:button>
					</div>
				</div>

			</form:form>
		</div>
	</div>
</body>
</html>