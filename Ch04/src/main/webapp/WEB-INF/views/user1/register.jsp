<%@ page contentType="text/html;charset=UTF-8" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>user1::register</title>
	</head>
<body>
	<h3>user1 ���</h3>
	
	<form action="/Ch04/user1/register" method="post">
		<table border="1">
			<tr>
				<td>�̸�</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>����</td>
				<td><input type="text" name="age"></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><input type="submit" value="���"></td>
			</tr>
		</table>
	
	</form>
</body>
</html>