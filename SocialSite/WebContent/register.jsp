<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="Servlet2">
First Name&nbsp;&nbsp;<input type="text" name="firstname" placeholder="first name" pattern="([A-Z]*[a-z]*)*" title="name should contain only alphabet"  required><br><br>

Last Name&nbsp;&nbsp;<input type="text" name="lastname" placeholder="last name" pattern="([A-Z]*[a-z]*)*" title="name should contain only alphabet"><br><br>
Address&nbsp;&nbsp;<textarea  name="address" placeholder="address"  pattern="([A-Z]*[a-z]*[:.,]*)" rows="5"  cols="40"  required ></textarea> <br><br>
gender &nbsp;&nbsp;<input type="radio" value="male" name="gender" checked="checked">male<input type="radio" value="female" name="gender"> female<input type="radio" value="others" name="gender">others<br><br>
usename&nbsp;&nbsp;<input type="text" name="username" placeholder="username" required><font color="red">username should be atleast 6 character long</font><br><br>
password&nbsp;&nbsp;<input type="password" name="password" placeholder="password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 6 or more characters"> <font color="red"> *password must contain a lowercase letter,a uppercase letter ,and a digit</font><br><br>
confirm password&nbsp;&nbsp;<input type="password" name="confirmpassword" placeholder="confirm password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 6 or more characters"><br><br>
forget question&nbsp;&nbsp;<select name="qno">
 <option value="1">your first pet name</option>
  <option value="2">your favourite teacher</option>
  <option value="3"> your first gf name</option>
  <option value="4">your favourite song</option>
   </select><br><br>
  
answer&nbsp;&nbsp;<input type="text" name="qa" placeholder="answer" required><br><br> 
 
 
<input type="submit" value="register">


</form>

</body>
</html>