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
<base href="<%= basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>reimburse_select</title>
</head>
<body>
 <form action="<%= request.getContextPath()%>/find.action"> 
     报销查询<p />
     reimburseId:${sessionScope.reimburse.reimburseId}<p />
     employeeId:${sessionScope.employee.employeeId}<p />
     employeeName:${sessionScope.employee.employeeName}<p />
     fillTime:${sessionScope.reimburse.fillTime}<p />
     allAmount:${sessionScope.reimburse.allAmount}<p />
     status:${sessionScope.reimburse.status}<p />
     reimReason:${sessionScope.reimburse.reimReason}<p />
     assessName:${sessionScope.reimburse.assessName}<p />
      <a href="upDte.action">update</a>&nbsp;&nbsp;
   </form> 
</body>
</html>
