<%@ page import="java.util.*" %>
<html>

<body>

<!-- Step 1: Create HTML form -->

<form action="todo-demo.jsp">
		Add new item: <input type="text" name="theItem"/>
		
		<input type="submit" value="Submit"/>

</form>

<!-- Step 2: Add new item to "To Do List" -->

	<%
		//get the TO DO items from the session
		
		List<String> items= (List<String>) session.getAttribute("myToDoList");
	
	//get the To Do items dosent exist, then create a new one
	
	if(items == null){
		items = new ArrayList<String>();
		session.setAttribute("myToDoList" , items);
		session.setMaxInactiveInterval(10);		
	}
	
	// see if there is form data to add
	
	String theItem = request.getParameter("theItem");
	if(theItem != null){
		
		items.add(theItem);
	}
	
	%>
	
	<!-- Step 3: Display all "To Do " items from session -->
	<hr>
	<br> To List Items:<br> <br/>
	
	<ol>
	<%
	
		for(String temp:items){
			out.println("<li>"+ temp +"</li>");
		}
	%>
	</ol>

</body>

</html>