<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML >
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>添加食物 </title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <body>
     <s:form action="bike/bike_editBike">
     <s:hidden name="bike.bikeid"></s:hidden>
     <s:textfield name="bike.biketype" label="单车名称"></s:textfield>
          <s:hidden name="bike.speed"></s:hidden>
        <s:textfield name="bike.bikebrand" label="品牌"></s:textfield>
        <s:submit value="提交"></s:submit>
      </s:form> 
    <br>
  </body>
</html>
