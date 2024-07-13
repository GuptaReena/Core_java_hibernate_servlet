<html>

<head>
<title>Registration Successful</title>

</head>

<body>

	Welcome ${param.firstVada } ${param.lastVada } to RST Forum
	<br>
	<br>

	<h2 style="color: green;">Your Application has been Submitted
		Successfully</h2>


	<ul>

		<%
		//to read multiple values from html

		String[] vada = request.getParameterValues("favoriteVada");

		for (String tempVada : vada) {

			out.println("<li>" + tempVada + "</li>");

		}
		%>

	</ul>

</body>

</html>