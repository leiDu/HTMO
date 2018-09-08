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
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>reimburse</title>

<script type="text/javascript" src="${pageContext.request.contextPath}/js/My97DatePicker/WdatePicker.js">
</script>
</head>
<body>
   <div>
   <form action="<%=request.getContextPath()%>/increament.action">
             报销模块<p/>
      
        <s:textfield name="reimburse.employeeId" label="employeeId" size="30" maxlength="30"/><p/>
        <s:textfield name="reimburse.employeeName" label="employeeName" size="30" maxlength="30"/><p/>
        <s:textfield name="reimburse.fillTime" label="fillTime" size="30" maxlength="30" onClick="WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})"/><p/>
        <s:textfield name="reimburse.allAmount" label="allAmount" size="30" maxlength="30"/><p/>
        <s:textfield name="reimburse.status" value="outAssess" label="status" size="30" maxlength="30" readonly="true"/><p/>
        <s:textarea name="reimburse.reimReason" label="reimReason" cols="30px" rows="3" /><p/>
        <s:textfield name="reimburse.assessName" label="assessName" size="30" maxlength="30" readonly="true"/><p />
      &nbsp;&nbsp;&nbsp;&nbsp;<input type="submit" value="input" />&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="submit" value="update" />&nbsp;&nbsp;
      <input type="submit" value="look" />
    </form>
   </div>
</body>
</html>