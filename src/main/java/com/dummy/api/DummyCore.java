/**
 * 
 */
package com.dummy.api;

import java.util.HashMap;

/**
 * @author arydewo
 *
 */
public class DummyCore {
	public static HashMap<String,Object> getEmployeeData(String firstName,String lastName,double basicSalary,double allowance){
		HashMap<String,Object> hmResp = new HashMap<String,Object>();
		String fullName = firstName + " " + lastName;
		double grossMonthly = basicSalary + allowance;
		double grossAnnual = grossMonthly * 13;
		HashMap<String,Object> hmData = new HashMap<String,Object>();
		
		hmData.put("fullName", fullName);
		hmData.put("basicSalary",basicSalary);
		hmData.put("allowance",allowance);
		hmData.put("grossMonthly",grossMonthly);
		hmData.put("grossAnnual",grossAnnual);
		
		hmResp.put("code", 200);
		hmResp.put("desc", "OK");
		hmResp.put("data", hmData);
		return hmResp;
	}

}
