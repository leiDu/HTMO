<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<%
  String path=request.getContextPath();
  String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<base href="<%= basePath %>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>hisday</title>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/My97DatePicker/WdatePicker.js">
</script>
</head>
<body>
 <div>
   <div>
    <form action="<%=request.getContextPath()%>/add.action">
            请假模块<p/>
        <!-- emplyeeId:${sessionScope.employee.employeeId}<p /> -->
        <s:textfield name="hisday.employeeId" label="employeeId" size="30" maxlength="10"/><p/>	
        <!-- employeeName:${sessionScope.hisday.employeeName }<p /> -->
        <s:textfield name="hisday.employeeName" label="employeeName" size="30" maxlength="10"/><p/>
        <s:textfield name="hisday.startTime" label="startTime" size="30" maxlength="10" calss="da" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" readoonly="true"/><p/>
        <s:textfield name="hisday.endTime" label="endTime" size="30" maxlength="10" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})" readonly="true"/><p/>
        <s:textfield name="hisday.status" label="status" value="outAssess" size="30" maxlength="10" readonly="true"/><p/>
        <s:textarea name="hisday.leaveReason" label="leaveReason" cols="30px" rows="3"/><p/>
        <s:textfield name="hisday.assessName" label="assessName" size="30" maxlength="10" readonly="true"/><p />
           
      &nbsp;&nbsp;&nbsp;<input type="submit" value="add"/>
      </form> 
   </div>
 </div>
</body>
</html>





        <!--<s:set name="noAssess">
        <s:if test="%{session.employee.positionName!='员工'}">-->

  <!-- </s:if></s:set>-->