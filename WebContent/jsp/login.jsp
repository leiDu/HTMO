
	<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<%
  String path = request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <base href="<%= basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
<link href="/css/css.css" rel="stylesheet" type="text/css"/>
<script type="text/javascript">
  function checkId(){
         var id = document.getElementsByTagName("input")[0].value;
         if(id == ""){
                document.getElementById("checki").innerHTML="员工ID不能为空";
             }
	  }

  function checkPwd(){
         var pwd = document.getElementsByTagName("input")[1].value;
         if(pwd == ""){
                document.getElementById("checkp").innerHTML="密码不能为空";
             }
	  }
</script>
</head>
<body>
<form action="<%= request.getContextPath()%>/login.action" onsubmit="return checkForm()" method="post">
    EmploeeID<br />
    <input type="text" name="employee.employeeId" size="30" maxlength="30" onblur="checkId()"/><font><span id ="checki">*</span></font><br />
    PassWord<br />
    <input type="password" name="employee.passWord" size="30" maxlength="30" onblur="checkPwd()"/><font><span id ="checkp">*</span></font><br /><br />
    <input type="submit" value="login" />
    <input type="reset" value="cannel" />
 </form> 
</body>
</html>