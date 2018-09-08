<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="../common/taglib.jsp"%>
<div class="top">
	<div class="global-width">
		<img src="images/logo.gif" class="logo" />
	</div>
</div>
<div class="status">
	<div class="global-width">
		 <!-- 取出employee对象里的positionName对象 -->
       <!-- <span class="usertype">【登陆角色:${sessionScope.employee.positionName}】</span>你好，${sessionScope.employee.employeeId},欢迎回来！&nbsp;&nbsp;&nbsp;
       <a href="outLogin.action" target="_self">OUT</a> -->
		
		
		
		
		<span class="usertype">【登录角色：${sessionScope.employee_position}】</span>${sessionScope.employee.name}你好！欢迎访问知本办公管理系统！
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="logout.action" target="_parent">退出</a> 
	</div>
</div>