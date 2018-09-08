package com.pers.du.htmo.model;

/**
 * @ClassName:Departmental 
 * @Description: TODO
 * @Auther:Lei Du
 * @Version:
 * @Date:Create in 2018年3月14日 下午9:48:06
 * @Modified By:
 */

public class Departmental implements java.io.Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//部门Id
	private int departmentalId;
	//部门名
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
