<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  poem and field in the distance 
  <body>
     <s:form action="bike/bike_addBike" method="post">
    <p>BIKEID:<s:textfield name="bike.bikeid" label="bikeid"></s:textfield>
    <p>BIKETYPE: <s:textfield name="bike.biketype" label="biketype"></s:textfield>
    <p>BIKERATE:  <s:textfield name="bike.speed" label="speed"></s:textfield>
    <p>BIKEBRAND:<s:textfield name="bike.bikebrand" label="bikebrand"></s:textfield>

    <s:submit value="submit"></s:submit>
    </s:form>
    <br>
  </body>
</html>
