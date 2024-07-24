package com.gustavo.workshopmongo.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long timestamp;
	private Integer status;
	private String error;
	private String massage;
	private String path;
	
	public StandardError() {
	}

	public StandardError(Long id, Integer status, String error, String massage, String path) {
		super();
		this.timestamp = id;
		this.status = status;
		this.error = error;
		this.massage = massage;
		this.path = path;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public String getError() {
		return error;
	}

	public String getMassage() {
		return massage;
	}

	public String getPath() {
		return path;
	}

	public void setTimestamp(Long id) {
		this.timestamp = id;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public void setError(String error) {
		this.error = error;
	}

	public void setMassage(String massage) {
		this.massage = massage;
	}

	public void setPath(String path) {
		this.path = path;
	}
}
