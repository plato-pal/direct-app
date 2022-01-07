<html>
<body>
	<h1>Buy Insurance</h1>
	<div style="color:red">${errors}</div><br/>
	<form action="CreatePolicyServlet" method="post">
		Name:<input type="text" name="name" /><br />
		 <br /> Email:<input type="text" name="email" /><br />
		 <br/><label for="products">Insurance product:</label>
		  <select name="products" id="product">
			<option value="100">Home</option>
			<option value="200">Car</option>
			<option value="300">Health</option>
		  </select> <br />
		  <br/><input type="submit" />
	</form>
</body>
</html>
