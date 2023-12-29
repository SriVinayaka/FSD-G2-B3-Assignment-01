package com.gl.dps;

public class TechDepartment extends SuperDepartment{

	@Override
	public String departmentName() {
		
		return "Tech Department ";
	}

	@Override
	public String getTodaysWork() {

		return "Complete coding of module 1";
	}

	@Override
	public String getWorkDeadline() {

		return "Complete by EOD";
	}
	
	@Override
	public String getTechStackInformation() {

		return "Core Java";
	}

	
}
