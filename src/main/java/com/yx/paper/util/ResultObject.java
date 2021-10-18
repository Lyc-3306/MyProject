package com.yx.paper.util;

public class ResultObject<T> {
	/** 返回码. */
	private Integer resultCode;

	/** 返回信息. */
	private String resultMsg;

	/** 报文内容. */
	private T data;

	public Integer getResultCode() {
		return resultCode;
	}

	public void setResultCode(Integer resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
