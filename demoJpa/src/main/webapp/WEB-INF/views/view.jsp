<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Student</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/font-awesome.min.css" />
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/all.min.css" />


</head>
<body>
	<h2>tên sv: ${student.name}</h2>
	<p>địa chỉ: ${student.address}</p>
</body>
</html>