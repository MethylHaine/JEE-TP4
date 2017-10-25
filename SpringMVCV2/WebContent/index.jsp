<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ include file="/WEB-INF/jsp/include.jsp"%>
<html>
<head>
<title>Example :: Spring Application</title>
</head>
<body>
	<h1>Example - Spring Application</h1>
	<p>This is my test.</p>
	<ul>
		<li><a
			href="https://docs.spring.io/spring/docs/4.3.3.RELEASE/spring-framework-reference/html/index.html">
				Documentation SpringMVC</a></li>
		<li><a
			href="https://docs.spring.io/spring/docs/4.3.3.RELEASE/javadoc-api/index.html">
				JavaDoc SpringMVC</a></li>
	</ul>

	<%-- rediriger le contrôleur hello --%>
	<c:redirect url="/hello.htm" />
</body>
</html>