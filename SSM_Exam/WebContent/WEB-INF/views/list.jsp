<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 导入标准标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>信息详情页面</title>
<!-- 导入jQuery的js库文件 -->
<script type="text/javascript" src="${pageContext.request.contextPath }/StaticResources/js/jquery-1.9.1.js"></script>
<script type="text/javascript">
	$(function(){
		$(".delete").click(function(){
			// 获取超链接的url传递给表单
			var href = $(this).attr("href");
			
			$("#form1").attr("action",href).submit();		
				
			// 取消超链接默认的行为
			return false;
		});
	});
</script>
</head>
<body>
	<h3 align="center">信息详情页面</h3>
	
	<form id="form1" action="" method="post">
		<input type="hidden" name="_method" value="DELETE" />
	</form>
	
	<table border="0" cellpadding="15" cellspacing="0" align="center">
		<tr>
			<th>EmpId</th>
			<th>EmpName</th>
			<th>EmpAge</th>
			<th>EmpEmail</th>
			<th>EmpGender</th>
			<th>Edit</th>
			<th>Delete</th>
		</tr>
		
		<c:forEach items="${requestScope.employees }" var="emp">
			<tr align="center">
				<td>${emp.empId }</td>
				<td>${emp.empName }</td>
				<td>${emp.empAge }</td>
				<td>${emp.empEmail }</td>
				<td>${emp.empGender }</td>
				<td>
					<a href="edit/${emp.empId }">Edit</a>	
				</td>
				<td>
					<a class="delete" href="delete/${emp.empId }">Delete</a>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="7" align="center">
				<a href="input">Add Employee Info</a>
			</td>
		</tr>
	</table>
</body>
</html>