package com.pers.du.htmo.model;


/**
 * @ClassName:Employee 
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018��3��14�� ����9:39:39
 * @Modified By:
 */
public class Employee implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//Ա��id
	private int employeeId;
	//����
	private String passWord;
	//ְλId
	//private int positionId;
	//Ա����
	private String employeeName;
	//�Ա�
	private Byte sex;
	//����
	private int age;
	//����id
	//private int departmentalId;
	//ְλ��
   	//private String positionName;
	//�绰
	private String phone;
	//����
	private String e_mail;
	//����Position��Ķ���
	private Position position;
	//����Departmental��Ķ���
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
