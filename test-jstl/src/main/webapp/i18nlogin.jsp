<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<c:set var="theLocale"
value="${not empty param.theLocale ? param.theLocale : pageContext.request.locale}"
scope="session" />


<fmt:setLocale value="${theLocale}"/>

<fmt:setBundle basename="i18n.resources.mylabels"/>

<html>

<body>
<hr>
<a href="i18n-login.jsp?theLocale=en_US">English (US)</a>
|
<a href="i18n-login.jsp?theLocale=es_ES">Spanish (ES)</a>
|
<a href="i18n-login.jsp?theLocale=de_DE">German (DE)</a>
|
<a href="i18n-login.jsp?theLocale=ma_MA">Marathi (MA)</a>

<hr>

<h3><fmt:message key ="label.welcome"></fmt:message></h3>

<form action="StudentServlet" method="GET">
 
   <fmt:message key="label.user" /><br>
   <input type="email" name="firstName"/>
   
   <br/><br/>
   
   <fmt:message key="label.pass" /><br>
   <input type="password" name="lastName"/>
   
   <br/><br/>
   
   <input type="submit" value="<fmt:message key="label.login" />"/>
   
</form>
<hr>

Selected locale: ${theLocale}
</body>
</html>