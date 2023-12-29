/**
 * 
 */
package com.gl.dps;

/**
 * 
 */
public class AdminDepartment extends SuperDepartment{

	@Override
	public String departmentName() {

		return "Admin Department ";
	}

	@Override
	public String getTodaysWork() {

		return "Complete your documents submission";
	}

	@Override
	public String getWorkDeadline() {

		return "Complete by EOD";
	}
	

	/*
	 * 
	 * 
	@Override
	public String isTodayAHoliday() {
		// TODO Auto-generated method stub
		return super.isTodayAHoliday();
	}
	 * 
	 */

	
	
}
