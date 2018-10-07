<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 导入SpringMVC的表单标签 -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加信息页面</title>
</head>
<body>
	<h3 align="center">操作信息页面</h3>
	
	<!-- form标签默认的modelAttribute属性默认的javabbBean的名字是command属性名 -->	
	<form:form action="${pageContext.request.contextPath }/UI/input" method="post" modelAttribute="employee">
		<table align="center" cellpadding="5" cellspacing="0">
			<c:if test="${empId != null}">
				<form:hidden path="empId"/>
				<input type="hidden" name="_method" value="PUT" />
			</c:if>
			
			<tr>
				<td>EmpName</td>
				<td>
					<form:input path="empName"/>
				</td>		
			</tr>
			<tr>
				<td>EmpAge</td>
				<td>
					<form:input path="empAge"/>
				</td>		
			</tr>
			<tr>
				<td>EmpEmail</td>
				<td>
					<form:input path="empEmail"/>
				</td>		
			</tr>
			<tr>
				<td>EmpGender</td>
				<td>
					<%
						Map<String,String> map = new HashMap();
						map.put("男","男");
						map.put("女", "女");
						
						request.setAttribute("genders", map);
					%>
					<form:radiobuttons items="${requestScope.genders }" path="empGender"/>
				</td>		
			</tr>
			<tr align="center">
				<td colspan="2">
					<input type="submit" value="Add Employee"/>
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>
