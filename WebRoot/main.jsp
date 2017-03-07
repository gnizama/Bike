<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML >
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>诗与远方的田野</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="<%=basePath%>CSS/main.css">
    <link rel="shortcut icon" href="<%=basePath%>images/logo.jpeg">
  </head>
  
 <body style="background-image : url(image/IMG20160810171230.jpg);background-repeat : no-repeat;
 background-size: 200% 200%;">
    <header>
       <div class="logo"><i class="fa fa-ul fa-cutlery">诗与远方的田野</i>
      
       </div>
       <div class="account">
         <c:choose>
	       <c:when test="${customer.name ==null}">
	         <a href="register.jsp">注册</a>
	         <a href="login.jsp">登录</a>
	       </c:when>
	       <c:otherwise>
	         <c:out value="${customer.name}"></c:out>, 欢迎您!
	       </c:otherwise>
	     </c:choose>
		    
       </div>
       
		    
    </header>
  
  
    <main>
       <s:form action="bike_queryBikes" method="post" >
       <input type="text" name="keywords" placeholder="请输入关键词" size="20">
       <s:submit value="查询"></s:submit>
       </s:form>
      
        
       <table  align="center">
            <tr>
              <th width="100" >单车ID</th>
              <th width="100">单车名称</th>
              <th width="100">单车品牌 </th>
              <th width="100">平路速度 </th>
                <th width="100">操作</th>
               <th width="100">操作</th>
            </tr>
            <s:iterator  value="bikelist">
            <tr>
              <td style="color: white;" width="100"><s:property value="bikeid"/></td>
              <td width="100" style="color: white;"><a href="bike/bike_showDetail?bike.bikeid=<s:property value='bikeid'/>" >
               <s:property value="biketype"/></a>
              </td>
               <td width="100" style="color: white;"><s:property value="bikebrand"/>
               </td>
               <td width="100" style="color: white;"><s:property value="speed"/>
               </td>
              <td style="color: white;"><a href="bike/bike_showEdit?bike.bikeid=<s:property value='bikeid'/>" >编辑</a></td>
              <td style="color: white;"><a href="bike/bike_deleteBike?bike.bikeid=<s:property value='bikeid'/>" >删除</a></td>
            </tr>
            </s:iterator>
    </table>
    <div style="height:150px;" font-size="50px">
    点击图片进入精彩户外骑行路线！
    </div>
    <div style="width:100%;">
  <div style="width:100%" align="center">
  <a href=" http://mp.weixin.qq.com/s/gtaighx7jwxH1rDJ32e5hQ"><img src="image/logo.jpg" width="30%" height="200"/></a>
  <a href=" http://mp.weixin.qq.com/mp/homepage?__biz=MzI3NDQ4NDgzNA==&hid=1&sn=b1a487d01994162a22b7934360aa0e31#wechat_redirect">
  <img src="image/logo.jpeg" width="28%" height="200" /></a>
  <a href="http://mp.weixin.qq.com/s/9FJY9-TC1dVpgudjxmQFfQ"> <img src="image/IMG20160810171230.jpg" width="31%" height="200"/></a>
  </div>
</div>
    <br>
    </main>
  </body>
</html>
