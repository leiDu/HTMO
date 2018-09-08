<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<%
  String path=request.getContextPath();
  String basePath=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%= basePath%>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hisday_update</title>

</head>
<body>
 <form action="<%= request.getContextPath()%>/upPage.action">
     <s:textfield name="hisday.leaveId" label="leaveId" size="30" maxlength="30" readonly="true"/><p />
     <s:textfield name="hisday.employeeId" label="employeeId" size="30" maxlength="30" readonly="true"/><p />
     <s:textfield name="hisday.employeeName" label="employeeName" size="30" maxlength="30" readonly="true"/><p />
     <s:textfield name="hisday.startTime" label="startTime" size="30" maxlength="30" readonly="true"/><p />
     <s:textfield name="hisday.endTime" label="endTime" size="30" maxlength="30" readonly="true"/><p />
     <s:textfield name="hisday.status" label="status" size="30" maxlength="30" /><p />
     <s:textfield name="hisday.leaveReason" label="leaveReason" size="30" maxlength="30" readonly="true"/><p />
     <s:textfield name="hisday.assessName" label="assessName" size="30" maxlength="30" /><p />
    <!-- <s:textfield name="employee.employssName" label="assessName" size="30" maxlength="30" /><p />-->
     <s:submit value="update" align="left"/>
 </form>  
</body>
</html>