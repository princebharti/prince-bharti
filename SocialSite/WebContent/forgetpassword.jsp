<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="Servlet3">

username<input type="text" name="username"><br><br>
hint question<select name="qno">
 <option value="1">your first pet name</option>
  <option value="2">your favourite teacher</option>
  <option value="3"> your first gf name</option>
  <option value="4">your favourite song</option>
   </select><br><br>
   
 answer&nbsp;&nbsp;<input type="text" name="qa" placeholder="answer" required><br><br> 
  
  <input type="submit" >

</form>

</body>
</html>