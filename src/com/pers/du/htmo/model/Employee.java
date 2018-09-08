package com.pers.du.htmo.model;


/**
 * @ClassName:Employee 
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018年3月14日 下午9:39:39
 * @Modified By:
 */
public class Employee implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//员工id
	private int employeeId;
	//密码
	private String passWord;
	//职位Id
	//private int positionId;
	//员工名
	private String employeeName;
	//性别
	private Byte sex;
	//年龄
	private int age;
	//部门id
	//private int departmentalId;
	//职位名
   	//private String positionName;
	//电话
	private String phone;
	//邮箱
	private String e_mail;
	//创建Position类的对象
	private Position position;
	//创建Departmental类的对象
	private Departmental departmental;

	public int getEmployeeId() {
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getPassWord() {
		return passWord;
	}
	
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
//	public int getPositionId() {
//		return positionId;
//	}
//	
//	public void setPositionId(int positionId) {
//		this.positionId = positionId;
//	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public Byte getSex() {
		return sex;
	}
	
	public void setSex(Byte sex) {
		this.sex = sex;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
//	public int getDepartmentalId() {
//		return departmentalId;
//	}
//	
//	public void setDepartmentalId(int departmentalId) {
//		this.departmentalId = departmentalId;
//	}
//	
//	public String getPositionName() {
//		return positionName;
//	}
//	
//	public void setPositionName(String positionName) {
//		this.positionName = positionName;
//	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getE_mail() {
		return e_mail;
	}
	
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}
	
	public Position getPosition(){
		return position;
	}
	
	public void setPosition(Position position){
		this.position = position;
	}
	
	public Departmental getDepartmental(){
		return departmental;
	}
	
	public void setDepartmental(Departmental departmental){
		this.departmental = departmental;
	}
	public Employee(){}
	
	public Employee(int employeeId , String passWord 
			, String employeeName , Byte sex , int age 
			, String phone , String e_mail , Position position
			, Departmental departmental){
		
		this.employeeId = employeeId;
		this.passWord = passWord;
//		this.positionId = positionId;
		this.employeeName = employeeName;
		this.sex = sex;
		this.age = age;
//		this.departmentalId = departmentalId;
		this.phone = phone;
		this.e_mail = e_mail;
		this.position = position;
		this.departmental = departmental;
	}
}
