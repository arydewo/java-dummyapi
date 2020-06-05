/**
 * 
 */
package com.dummy.api;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dummy.util.HttpResponseCode;


/**
 * @author arydewo
 *
 */
@RestController
public class DummyController {
	
	@RequestMapping(value="/employee/data",produces = "application/json",method=RequestMethod.GET)
	public ResponseEntity<HashMap<String, Object>> getEmployeeData(@RequestParam(value="firstName")String firstName,
			@RequestParam(value="lastName")String lastName,
			@RequestParam(value="basicSalary")Double basicSalary,
			@RequestParam(value="allowance")Double allowance,
			@RequestHeader Map<String,String> headers){
		System.out.println("com.dummy.api.DummyController.getEmployeeData");
		ResponseEntity<HashMap<String, Object>>  responseEntity = null ;
		HashMap<String,Object> hmResp = new HashMap<String, Object>();
		final HttpHeaders httpHeaders= new HttpHeaders();
		hmResp = DummyCore.getEmployeeData(firstName, lastName, basicSalary, allowance);
		int iCode = Integer.parseInt(String.valueOf(hmResp.get("code")));
		
		responseEntity = new ResponseEntity<HashMap<String, Object>>(hmResp,httpHeaders,HttpResponseCode.getHttpResonseCode(iCode));
		return responseEntity;
	}
	
	@RequestMapping(value="/employee/info",produces = "application/json",method=RequestMethod.GET)
	public ResponseEntity<HashMap<String, Object>> getEmployeeInfo(
			@RequestHeader Map<String,String> headers){
		System.out.println("com.dummy.api.DummyController.getEmployeeInfo");

		ResponseEntity<HashMap<String, Object>>  responseEntity = null ;
		HashMap<String,Object> hmResp = new HashMap<String, Object>();
		HashMap<String,Object> hmData= new HashMap<String, Object>();
		final HttpHeaders httpHeaders= new HttpHeaders();
		hmData.put("fullName", "Achmad Soekarno");
		hmData.put("basicSalary", 3500000.0);
		hmData.put("allowance", 1500000.0);
		hmData.put("grossMonthly", 5000000.0);
		hmData.put("grossAnnual", 65000000.0);
		hmResp.put("code", 200);
		hmResp.put("desc", "OK");
		hmResp.put("data", hmData);
		int iCode = Integer.parseInt(String.valueOf(hmResp.get("code")));
		
		responseEntity = new ResponseEntity<HashMap<String, Object>>(hmResp,httpHeaders,HttpResponseCode.getHttpResonseCode(iCode));
		return responseEntity;
	}
	
}
