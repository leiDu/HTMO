package com.pers.du.htmo.model;

/**
 * @ClassName:Departmental 
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018��3��14�� ����9:48:06
 * @Modified By:
 */

public class Departmental implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//����Id
	private int departmentalId;
	//������
	private String departmentalNama;
	
	public int getDepartmentalId() {
		return departmentalId;
	}
	
	public void setDepartmentalId(int departmentalId) {
		this.departmentalId = departmentalId;
	}
	
	public String getDepartmentalNama() {
		return departmentalNama;
	}
	
	public void setDepartmentalNama(String departmentalNama) {
		this.departmentalNama = departmentalNama;
	}
	
	public Departmental(){}
	
	public Departmental(int departmentalId , String departmentalName){
		
		this.departmentalId = departmentalId;
		this.departmentalNama = departmentalName;
	}
}
