<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>denied</title>
</head>
<body>
	<script type="text/javascript">
		alert('접근 권한이 없습니다.')
		location.href='${pageContext.request.contextPath}/'
	</script>
</body>
</html>