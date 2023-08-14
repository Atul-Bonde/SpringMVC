<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 align="center" >Student Registration form</h1>


<form action="/savestudent">

 <label for="fname" style="color:black"> <b>First Name</b></label>
<input type="text" name="fname" placeholder="Enter Your First Name" required ><br><br>

 <label for="lname" style="color:black"> <b>Last Name</b></label>
<input type="text" name="lname" placeholder="Enter Your Last Name" required ><br><br>

 <label for="address" style="color:black"> <b>Address</b></label>
<input type="text" name="address" placeholder="Enter Your Address" required ><br><br>

 <label for="marks" style="color:black"> <b>Marks</b></label>
<input type="text" name="marks" placeholder="Enter Your Marks" required ><br><br>

<button type="submit" style="color:black">Submit</button>

</form>



</body>
</html>