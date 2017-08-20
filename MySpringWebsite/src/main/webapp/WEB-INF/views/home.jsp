<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<link rel="stylesheet" href="resources/stylesheet.css">
</head>
<body>
<h2>
	Hello world!  
</h2>
<div><a href="/MySpringWebsite/serverInfo">Server Info</a></div>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
