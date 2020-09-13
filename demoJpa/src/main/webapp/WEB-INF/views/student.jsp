<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Student</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/font-awesome.min.css" />
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/all.min.css" />
<%-- href="${pageContext.request.contextPath}/css/bootstrap.min.css" /> --%>

</head>
<body>
	<div class="container">
		<a href="/addStudent" class="btn btn-primary">
			<i class="fas fa-plus"></i>Them Sinh Vien
		</a>
		<h2>danh sách sinh viên</h2>
		<table class="table table-bodered">
			<thead>
				<tr>
					<th>Mã sinh viên</th>
					<th>tên sinh viên</th>
					<th>địa chỉ</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="student" items="${student}">
					<tr>
						<td>${student.id}</td>
						<td>${student.name}</td>
						<td>${student.address}</td>
						<td><a href="/edit/studentId?id=${student.id}"><i class="fas fa-edit" aria-hidde="true"></i></a> 
							<a href="/delete/studentId?id=${student.id}"><i class="fas fa-trash-alt" aria-hidde="true"></i></a>
							<a href="/view/id=${student.id}"><i class="fa fa-eye" aria-hidde="true"></i></a>
							</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>