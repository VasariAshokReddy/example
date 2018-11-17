package org.sathyatech;

public class Manager {

	
	private int empId;
	private String empName;
	private String proj;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getProj() {
		return proj;
	}
	public void setProj(String proj) {
		this.proj = proj;
	}
	@Override
	public String toString() {
		return "Manager [empId=" + empId + ", empName=" + empName + ", proj="
				+ proj + "]";
	}
	
	
	
}
