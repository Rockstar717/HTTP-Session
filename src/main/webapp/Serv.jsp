<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>Insert title here</title>
<style>
div {
  width: 26%;
  border: 1px solid black;
  padding: 20px;
  margin: auto;
  font-size: 20px;
  background-color: lightgray;
}
</style>
</head>
<body>
	<div>
		<h3 style="text-align: center;"> Registration form</h3>
		<form action="Serv0" method="post">
		<table>
			<tr>
				<td>Firstname :</td>
				<td><input type="text" name="Firstname" placeholder="Enter here">
				</td>
			</tr>
			<tr>
				<td>Lastname :</td>
				<td><input type="text" name="Lastname" placeholder="Enter here">
				</td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><input type="text" name="Address" placeholder="Enter here">
				</td>
			</tr>
			<tr>
				<td>Pincode :</td>
				<td><input type="text" name="Pincode" placeholder="Enter here">
				</td>
			</tr>
			<tr>
				<td>City :</td>
				<td><input type="text" name="City" placeholder="Enter here">
				</td>
			</tr>
			<tr>
				<td>State :</td>
				<td><input type="text" name="State" placeholder="Enter here">
				</td>
			</tr>
			<tr>
				<td>Education :</td>
				<td><input type="text" name="Education" placeholder="Enter here">
				</td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="Email" name="Email" placeholder="Enter email"></td>
			</tr>
			<tr>
				<td>Useraname :</td>
				<td><input type="text" name="Username" placeholder="Enter username"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="password" name="Password" placeholder="Enter password"></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="number" name="Age"></td>
			</tr>
			<tr>
				<td>Mobile :</td>
				<td><input type="text" name="Mobile" placeholder="Enter here">
				</td>
			</tr>
			<tr>
				<td>Gender :</td> 
				<td>
				<input type="radio" name="Gender" value="Male">Male
				<input type="radio" name="Gender" value="Female">Female
				<input type="radio" name="Gender" value="Other">Other	
					</td></tr>
					<tr>
					 <td>Nationality :</td>
					 <td><select id ="country" name="Nationality">
						<option value="select">select</option>
						<option value="Indian">Indian</option>
						<option value="Japan">Japan</option>
						<option value="Russia">Russia</option>
						<option value="Malasia">Malasia</option>
				 </select></td></tr>
				<tr>
				<td>PassingYear :</td>
				<td><select name="PassingYear">
				        <option value="select">select</option>
						<option value="2019">2019</option>
						<option value="2020">2020</option>
						<option value="2021">2021</option>
						<option value="2022">2022</option>
						</select></td></tr>
						<tr>
						<td></td>
						<td><button style="">submit</button></td></tr>		
		</table>
		</form>
	</div>
</body>
</html>