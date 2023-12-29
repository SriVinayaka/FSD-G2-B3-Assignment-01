/**
 * 
 */
package com.gl.dps;

/**
 * 
 * This is a Super Class for:
 * 01 Admin
 * 02 HR
 * 03 Tech
 * 
 */
public class SuperDepartment {
	
	public String departmentName()
	{
		return "Super Department";
	}
	
	public String getTodaysWork()
	{
		return "No Work as of Now";
	}

	public String getWorkDeadline()
	{
		return "Nil";
	}

	public String isTodayAHoliday()
	{
		return "Today is not a holiday";
	}

	public String getTechStackInformation() 
	{
		return null;
	}

	public String doActivity() 
	{
		return null;
	}
	
}
