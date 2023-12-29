/**
 * 
 */
package com.gl.dps;

/**
 * 
 */

public class HrDepartment extends SuperDepartment{

	@Override
	public String departmentName() {

		return "Hr Department";
	}

	@Override
	public String getTodaysWork() {

		return "Fill today's timesheet and mark your attendance";
	}

	@Override
	public String getWorkDeadline() {

		return "Complete by EOD ";
	}

	@Override
	public String doActivity()
	{
		return "team Lunch";
	}
	
}
