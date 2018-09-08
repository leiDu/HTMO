package com.pers.du.htmo.action;

import java.util.*;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.pers.du.htmo.service.EmployeeService;
import com.pers.du.htmo.model.Employee;
import com.pers.du.htmo.model.Position;


/**
 * @ClassName:EmployeeAction 
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018年3月9日 下午2:18:00
 * @Modified By:
 */

public class EmployeeAction implements Action{
	
	//定义两个对象
	private Employee employee ;
	private EmployeeService employeeService = new EmployeeService();
		  
	public Employee getEmployee() {
		System.out.println("getEmployee");
		return employee;
	}

	public void setEmployee(Employee employee) {
		System.out.println("setEmployee");
		this.employee = employee;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
    
	public String login() throws Exception {
		
		//System.out.println("======="+employee.getEmployeeId()+employee.getPassWord());
		
		try{
//			System.out.println("login");

			Employee e = employeeService.login(employee);
			//取得值栈
			ActionContext context = ActionContext.getContext();
			Map<String, Object> session = context.getSession();  
			//把登陆的信息放入session
			session.put("employee", e);
//			String positionName = e.getPositionName();
			Position positionName = e.getPosition();
			session.put("position", positionName);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return "SUCCESS";
	}
	
	public String outLogin() throws Exception{
		System.out.println("outLogin");
			ActionContext aContext =  ActionContext.getContext();
			Map<String, Object> mSession = aContext.getSession();
			//清楚session的数据
			mSession.clear();
			return "out";
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}



















//public class EmployeeAction implements RequestAware{
//	
//	private EmployeeId employeeId;
//	private String password;
//	private Map<String, Object> request;
//	
//	public EmployeeId getEmployeeId() {
//		return employeeId;
//	}
//	
//	public void setEmployeeId(EmployeeId employeeId) {
//		this.employeeId = employeeId;
//	}
//	
//	public String getPassword() {
//		return password;
//	}
//	
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
//	public String login() throws Exception{
//		
//		EmployeeService employeeService = new EmployeeService();
//		Employee employee = new Employee();
//		
//		employee.setEmployeeId(employeeId);
//		employee.setPassWord(password);
//		if(employeeService.login(employee)){
//			request.put("employeeId" , employee);
//			return "SUCCESS";
//		}else{
//			return "login";
//		}
//		
//	}
//
//	public void setRequest(Map<String, Object> request) {
//		this.request = request;
//	}
//	
//}




//	public String login() throws Exception{
//	
//	try{
//		Employee emp = employeeService.login(employee);
//		ActionContext context = ActionContext.getContext();
//		Map<String, Object> session = context.getSession();  
//		//把登陆的信息放入session
//		session.put("employee", emp);
//		String employeeName = emp.getPositionName();
//		session.put("position", employeeName);
//		
//	}catch(Exception e){
//		e.printStackTrace();
//	}
//	return "SUCCESS";
//  }
//}





	
//public class EmployeeAction implements Action{
//	
//	//员工号
//	private int employeeId;
//	//密码
//	private String password;
//	//员工名
//	private String employeeName;
//	//提示信息
//	private String messge;
//	
//	public int getEmployeeId() {
//		return employeeId;
//	}
//	
//	public void setEmployeeId(int employeeId) {
//		this.employeeId = employeeId;
//	}
//	
//	public String getPassword() {
//		return password;
//	}
//	
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
//	public String getEmployeeName(){
//		return employeeName;
//	}
//	
//	public void setEmployeeName(String employeeName) {
//		this.employeeName = employeeName;
//	}
//
//	public String getMessge() {
//		return messge;
//	}
//	
//	public void setMessge(String messge) {
//		this.messge = messge;
//	}
//	
//	@Override
//	public String execute() throws Exception{
//		
//		//实例化用户实表
//		Employee employee = new Employee();
//		employee.setEmployeeId(this.getEmployeeId());
//		employee.setPassword(this.getPassword());
//		employee.setEmployeeName(this.getEmployeeName());
//		
//		//声明业务逻辑对象
//		EmployeeService es = new EmployeeService();
//		
//		if(es.employeeLogin(employee)){
//			Map<String, Object> session = null;
//			session = ActionContext.getContext().getSession();  //获取session
//			if(session.containsKey("employeeName")){
//				session.remove("employeeName");
//			}			
//			session.put("employeeName",this.getEmployeeName());
//			this.setMessge("欢迎你" + this.getEmployeeName() + "!");
//			return "fail";
//		}else{
//		    return "success";
//		}
//	}
//}
//private String id;
//private String passWord;
//public String getId() {
//	return id;
//}
//
//public void setId(String id) {
//	this.id = id;
//}
//
//public String getPassWord() {
//	return passWord;
//}
//
//public void setPassWord(String passWord) {
//	this.passWord = passWord;
//}

//Employee employee = new Employee();
//employee.setId(this.getId());
//employee.setPassWord(this.getPassWord());




/*
* e.getPosition().get
*/