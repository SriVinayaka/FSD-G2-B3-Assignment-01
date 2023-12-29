/**
 * 
 */
package com.gl.dps;

/**
 * 
 */
public class DisplayDepartmentFunctionalities 
{
	
	public void displayFunctionalities(SuperDepartment obj)
	{
		System.out.println();

		try
		{
			System.out.println("Welcome to " + obj.departmentName());
		}
		catch(Exception e001)
		{
			
		}
		
		try
		{
			String myActivity = obj.doActivity();
			if(myActivity != null)
			{
				System.out.println(myActivity);				
			}
		}
		catch(Exception e002)
		{
			
		}
		
		try
		{
			System.out.println(obj.getTodaysWork());
		}
		catch(Exception e003)
		{
			
		}
		
		
		try
		{
			System.out.println(obj.getWorkDeadline());
		}
		catch(Exception e004)
		{
			
		}
		
		try
		{
			String myStack = obj.getTechStackInformation();
			if(myStack != null)
			{
				System.out.println(myStack);				
			}
		}
		catch(Exception e005)
		{
			
		}
		
		try
		{
			System.out.println(obj.isTodayAHoliday());
		}
		catch(Exception e006)
		{
			
		}
		
		System.out.println();

	}


}
