/**
 * 
 */
package com.dummy.util;

import org.springframework.http.HttpStatus;

/**
 * @author arydewo
 *
 */
public class HttpResponseCode {
	public static HttpStatus getHttpResonseCode(int respCode){
		HttpStatus httpRespCode=HttpStatus.OK;
		if(respCode==400) {
			httpRespCode=HttpStatus.BAD_REQUEST;
		} else if(respCode==404) {
			httpRespCode=HttpStatus.NOT_FOUND;
		} else if(respCode==500){
			httpRespCode=HttpStatus.INTERNAL_SERVER_ERROR;
		}
		return httpRespCode;
	}

}
