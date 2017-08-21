<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Server Info</title>

<link rel="stylesheet" href="resources/stylesheet.css">
</head>
<body>

<h2>Server info</h2>
<div><a href="/MySpringWebsite/home">Home</a></div>
<table align="center">
	<tr>
		<th title="The date on the server.">Date</th>
		<th title="Current time and time zone on the server.">Time</th>
		<th title="Free ram on the server in bytes.">FreeRam</th>
		<th title="Free disk space on the server in bytes.">DiskSpace</th>

	</tr>
	<tr>
		<td>${serverDate}</td>
		<td>${serverTime}</td>
		<td>${serverRAM}</td>
		<td>${serverDiskSize}</td>
	</tr>	
	
</table>
</body>
</html>