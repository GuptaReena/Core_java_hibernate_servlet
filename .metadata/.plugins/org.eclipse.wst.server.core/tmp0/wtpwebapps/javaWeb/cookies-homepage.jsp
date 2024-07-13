<html>

<body>
	
	<!-- read the favorite programming language cookie -->
		
		<%
			// the default ... if there are no cookies
			
			String favLang = "java";
		
		// get the cookies from the browser request
		
		Cookie[] theCookies = request.getCookies();
		
		
		// Find our favourite Language Cookie
		if(theCookies !=null){
			for(Cookie tempCookie : theCookies){
				if("myApp.favoriteLanguage".equals(tempCookie.getName())){
					
					favLang = tempCookie.getValue();
					break;
				}
			}
		}
			
		%>
		
		<!-- now show a personalized page ... use the "favLang" variable -->
		
		<!-- show new books for this lang -->
		
		<h4>New Books for <%= favLang %></h4>
		<ul>
			<li>Dear Stranger</li>
			<li>Who will cry when you Die</li>
		</ul>
		
		<h4>Latest News Reports for <%= favLang %></h4>
		<ul>
			<li>Complete LockDown in Mumbai. </li>
			<li>Peoples are doing protest against Government.</li>
		</ul>
		
		<h4>Hot Jobs for <%= favLang %></h4>
		<ul>
			<li>Be a Web Developer. </li>
			<li>Be a Android Developer.</li>
		</ul>
		
		<hr>
		<a href="cookies-personalize-form.html">Personalize this page.</a>
</body>

</html>