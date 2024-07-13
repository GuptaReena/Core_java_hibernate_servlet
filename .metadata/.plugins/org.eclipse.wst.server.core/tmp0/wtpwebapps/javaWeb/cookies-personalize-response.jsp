<html>

<head>

<title>Confirmation</title>

</head>

		<%
		
			//read form data
			String favLang= request.getParameter("favoriteLanguage");
		
		//create the cookie
		
		Cookie theCookie = new Cookie("myApp.favoriteLanguage" , favLang);
		
		// send the life span ... total number of seconds
		
		theCookie.setMaxAge(60*60*24*365); //<-- for one year
		
		//send cookie to browser
		
		response.addCookie(theCookie);
		
		%>
		
		<body>
		
		Thanks! We set your favorite language to: ${param.favoriteLanguage}
		
		<br><br>
		
		<a href="cookies-homepage.jsp">Return to Homepage</a>
		
		</body>

</html>