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
<base href="<%=basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>reimburse_upReimPa</title>
</head>
<body>
   <form action="<%= request.getContextPath()%>/find.action">
     <s:textfield name="reimburse.reimburseId" label="reimburseId"/>
      <s:submit name="submit" align="left"/>
  <table cellspacing="0">
    <thead>
     <tr>
     <th>reimburseId&nbsp;</th>
     <th>employeeId&nbsp;</th>
     <th>employeeName&nbsp;</th>
     <th>operation</th>
     <tr>
    </thead>
 
   <tbody>
     <s:iterator value="listReim" var="reimburse">
      <tr>
        <td><s:property value="#reimburse.reimburseId"/></td>
        <td><s:property value="#reimburse.employeeId"/></td>
        <td><s:property value="#reimburse.employeeName"/></td>
        <td><a href="<%=request.getContextPath()%>/deleReim.action?reimburseId=<s:property value="#reimburse.reimburseId"/>">Delete</a></td> 
      </tr>
     </s:iterator>
  </tbody>
 </table>
 </form>
</body>
</html>


















     <!--  <td><a href="<%=request.getContextPath()%>/deleReim.action?reimburseId=${reimburse.reimburseId}">delect</a></td> -->