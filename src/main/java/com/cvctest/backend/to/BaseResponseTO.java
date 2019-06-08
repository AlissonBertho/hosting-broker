/*
 *
 * This file is a confidential property of CVC Test. No part of this
 * file may be reproduced or copied.
 *
 */
package com.cvctest.backend.to;

import java.io.Serializable;

/**
 * @author Alisson
 *
 */
public class BaseResponseTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1337856887082204243L;

	public static final int SUCCESS = 200;

	public static final int ERROR = 400;

	public static final String MSG_SUCCESS = "Successfully completed request!";

	public static final String MSG_ERROR = "An error has occurred!";

	private Integer code;

	private String message;

	public BaseResponseTO(Integer code, String message) {
		this.code = code;
		this.message = message;
	}
	
	public BaseResponseTO(Integer code) {
		
		if (SUCCESS == code) {
			this.success();
		} else {
			this.error();
		}

	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	private void success(){
		setCode(SUCCESS);
		setMessage(MSG_SUCCESS);
	}
	
	private void error(){
		setCode(ERROR);
		setMessage(MSG_ERROR);
	}
}
