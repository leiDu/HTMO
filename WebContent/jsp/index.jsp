<%@page import="javax.websocket.Session"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "com.pers.du.htmo.action.EmployeeAction" %>
<%@page import = "com.pers.du.htmo.model.*" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
  String path="request.getContextPath";
  String basePath=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%= basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<!-- <link href="/css/index.css" rel="stylesheet" type="text/css"/> -->
</head>
<body>
  <div>
  
    <!-- login model -->
    <div>
       <!-- 取出employee对象里的positionName对象 -->
       <span>【登陆角色:${sessionScope.position.positionName}】</span>你好，${sessionScope.employee.employeeId},欢迎回来！&nbsp;&nbsp;&nbsp;
       <a href="outLogin.action" target="_self">OUT</a>
    </div><br />
    
    <!--request design-->
	   <div>
	   <!-- 报销 -->
	   	  <div>
	   	     报销模块
	   	    <ul>
	   	   <!-- <li><a href="find.action" target="_pasent">查看报销</a></li> --> 
	   	   <li><a href="info.action" target="_pasent">查看报销</a></li>
	   	  	<li><a href="toIncreament.action" target="_pasent">添加报销</a></li>
	   	  </ul>
	   	  </div>
	   	  
	   	  <!-- 请假 -->
	   	 <div>
	   	  请假模块
	   	     <ul>
	   	   <!-- <li><a href="look.action" target="_pasent">查看请假</a></li> -->
	   	    <li><a href="sele.action" target="_pasent">查看请假</a></li>
	   	  	<li><a href="toAdd.action" target="_pasent">添加请假</a></li>
	   	  </ul>
	   	 </div>
	   </div>
  </div>
</body>
</html>