/**
 * 
 */
package main;

import com.gl.dps.AdminDepartment;
import com.gl.dps.DisplayDepartmentFunctionalities;
import com.gl.dps.HrDepartment;
import com.gl.dps.TechDepartment;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) 
	{
		
		AdminDepartment ad = new AdminDepartment();
		HrDepartment hd = new HrDepartment();
		TechDepartment td = new TechDepartment();

		DisplayDepartmentFunctionalities ddf = new DisplayDepartmentFunctionalities();
		
		System.out.println();
		ddf.displayFunctionalities(ad);
		ddf.displayFunctionalities(hd);
		ddf.displayFunctionalities(td);
	}

}
