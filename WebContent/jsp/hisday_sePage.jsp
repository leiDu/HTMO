<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags"%>
<%
  String path=request.getContextPath();
  String basePath=request.getScheme() + "://" + request.getServerName() + "：" + request.getServletPath() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%= basePath%>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hisday_sePage</title>
</head>
<body>
 <form action="<%=request.getContextPath()%>/look.action">
  <s:textfield name="hisday.leaveId" label="leaveId"/><p />
    <s:submit name="select" align="left"/>
  <table cellspacing="0">
    <thead>
     <tr>
       <th>all&nbsp;</th>
       <th>leaveId&nbsp;</th>
       <th>employeeId&nbsp;</th>
       <th>employeeName&nbsp;</th>
       <th>status&nbsp;</th>
       <th>operation</th>
     </tr>
    </thead>
   <tbody>
    <s:iterator value="listHisd" var="hisday">
     <tr>
     <td><input type="checkbox" name="leaveId" value='<s:property value="#hisday.leaveId"/>'/></td>
      <td><s:property value="#hisday.leaveId"/></td>
      <td><s:property value="#hisday.employeeId"/></td>
      <td><s:property value="#hisday.employeeName"/></td>
      <td><s:property value="#hisday.status"/></td> 
      <td><a href="<%=request.getContextPath()%>/deHis.action?leaveId=<s:property value="#hisday.leaveId"/>">Delete</a></td>
       <td><a href="<%=request.getContextPath()%>/sta.action?status=<s:property value="#hisday.status"/>">Pass</a></td> 
      <!--<td><a href="<%=request.getContextPath()%>/sta.action?status=pass">Pass</a></td>  -->
     </tr>
    </s:iterator>
    
   <tbody> 
 </table> 
  </form>
</body>
</html>



<!-- 如何用权限的方法，把员工的状态和审核人的名字，员工在查看时不能被修改，只有部门经理才能进行修改???? -->

 <!--<s:set name="his" value="hisday.positionId" />
     <s:if test="#his == '部门经理'">
       <td><s:textfield name="hisday.status"/></td>
     </s:if> 
     <s:elseif test="#his == '员工'">
       <td><s:textfield name="hisday.status"/></td>
     </s:elseif>-->
     
<!-- 通过点击Pass，则修改它的状态为通过???? -->
