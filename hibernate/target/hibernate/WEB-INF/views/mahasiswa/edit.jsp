<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>

<%
request.setAttribute("contextname", request.getContextPath());
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>Welcome to Spring Tutorial</p>

	<form action="${contextName}/mhs" method="post">
		<input type="hidden" name="metode" value="edit"> 
		ID<input type="hidden" name="id" value="${mahasiswa.id}">
		<br> 
		NIM<input type="text" name="nim" value="${mahasiswa.nim}">
		<br>
		Nama<input type="text" name="nama" value="${mahasiswa.nama}">
		<br>
		Alamat<input type="text" name="alamat" value="${mahasiswa.alamat}">
		<br>
		<button type="submit">Simpan</button>
	</form>
	<ol>
	<c:forEach var="mhs" items="${mhslist}">
	<li>${mhs.nim}-${mhs.nama}-<a href="${contextName}/mhs/edit?id=${mhs.id}">Edit</a></li></c:forEach>
	</ol>
</body>
</html>