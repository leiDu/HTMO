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
<base href="<%= basePath%>"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>newUp</title>
</head>
<body>
  <form action="<%= request.getContextPath()%>/upPaIn.action"><!--错误异常： newUp.action -->
    <s:textfield name="reimburse.reimburseId" label="reimburseId" size="30" maxlength="30" readonly="true"/><p />
    <s:textfield name="reimburse.employeeId" label="employeeId" size="30" maxlength="30" readonly="true"/><p />
    <s:textfield name="reimburse.employeeName" label="employeeName" size="30" maxlength="30" readonly="true"/><p />
    <s:textfield name="reimburse.fillTime" label="fillTime" size="30" maxlength="30" readonly="true"/><p />
    <s:textfield name="reimburse.allAmount" label="allAmount" size="30" maxlength="30" readonly="true"/><p />
    <s:textfield name="reimburse.status" label="status" size="30" maxlength="30"/><p />
    <s:textfield name="reimburse.reimReason" label="reimReason" size="30" maxlength="30" readonly="true"/><p />
    <s:textfield name="reimburse.assessName" label="assessName" size="30" maxlength="30"/><p />
    <s:submit value	="update" align="left"/>
  </form>
</body>
</html>



<!-- 错误异常，java.lang.NoSuchMethodException:，newUp.action相当于跳转到中转站页面，无法进行数据的操作 -->