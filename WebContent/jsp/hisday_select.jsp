<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<%
  String path=request.getContextPath();
  String basePath=request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%= basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hisday_select</title>
</head>
<body>
<form action="<%= request.getContextPath()%>/look.action" method="post">
     请假查询<p />
     leaveId:${sessionScope.hisday.leaveId}<p />	
     employeeId:${sessionScope.employee.employeeId}<p />  
     employeeName:${sessionScope.employee.employeeName}<p />
     startTime:${sessionScope.hisday.startTime}<p />
     endTime:${sessionScope.hisday.endTime}<p />
     status:${sessionScope.hisday.status}<p />
     leaveReasson:${sessionScope.hisday.leaveReason}<p />
     assessName:${sessionScope.hisday.assessName}<p />
      <a href="up.action">update</a>&nbsp;&nbsp;
 </form>
</body>
</html>