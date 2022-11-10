<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>사용자 정보</title>
<style>
  table {
    width: 100%;
    border: 1px solid #444444;
  }
  th, td {
    border: 1px solid #444444;
  }
</style>
</head>
<body>
<hr>
<table>
	<c:forEach var="data" items="${result}">
		<tr>
			<td>${data.name}</td>
			<td>${data.phone }</td>
			<td>${data.addr }</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>