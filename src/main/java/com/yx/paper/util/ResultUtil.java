package com.yx.paper.util;

public class ResultUtil {
	public static ResultObject success(Object object) {
		ResultObject result = new ResultObject();
		result.setResultCode(0);
		result.setResultMsg("success");
		result.setData(object);
		return result;
	}

	public static ResultObject success() {
		return success("OK");
	}

	public static ResultObject error(Integer code, String msg) {
		ResultObject result = new ResultObject();
		result.setResultCode(code);
		result.setResultMsg(msg);
		return result;
	}
}
