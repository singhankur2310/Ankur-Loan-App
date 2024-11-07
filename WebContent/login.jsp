<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<body>
	<div align="center">
		<h1>JTC User Account</h1>
		<form:form action="verifyUser.jtc" method="post"
			modelAttribute="myuser">
			<table>
				<tr>
					<td>UserName</td>
					<!-- <td input type="text"><username/> </td> -->
					<td><form:form path="username" /></td>
					<td><input type="text" name="username"></td>
					<td><font color=red size=5> <form:errors
								path="username" /></font></td>
				</tr>

				<tr>
					<td>Password</td>
					<td><form:form path="password" /></td>
					<td><input type="text" name="password"></td>
					<td><font color=red size=5> <form:errors
								path="password" /></font></td>
				</tr>

				<tr>
					<td colspan="3"><input type="Submit" value="Account Login"></td>
				</tr>
			</table>
		</form:form>
	</div>
</body>
</html>