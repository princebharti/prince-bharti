 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="register">



new password &nbsp;&nbsp;<input type="password" name="newpassword" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" required><br><br>
confirm password&nbsp;&nbsp;<input type="password" name="confirmpassword" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" required><br><br>
<input type="submit" value="resest">

</form>

<%
  String username=(String)request.getAttribute("user");
  HttpSession s=request.getSession();
  s.setAttribute("user_n",username);


%>


</body>
</html>