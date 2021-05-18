package com.xm.jy.job_51.result;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

/**
 * 统一返回类型封装
 * @param <T>
 */
@Data
public class Result<T> {
	// 0成功，1失败
	private String status;
	@JSONField(ordinal = 1)
	private String code;
	@JSONField(ordinal = 2)
	private String message;
	@JSONField(ordinal = 3)
	private T result;

	private Integer totalCount;

	private Result(String status, String code, String message, T result) {
		this.status = status;
		this.code = code;
		this.message = message;
		this.result = result;
	}

	private Result(String status, String code, String message) {
		this.status = status;
		this.code = code;
		this.message = message;
	}

	public Result(String status, String code, Integer totalCount, T result) {
		this.status = status;
		this.code = code;
		this.result = result;
		this.totalCount = totalCount;
	}

	public static <T> Result<T> success(String message, T result){
		return new Result<>("0","0000",message,result);
	}

	public static <T> Result<T> success(String message,Integer totalCount,T result){
		return new Result<>("0","0000",totalCount,result);
	}

	public static <T> Result<T> fail(String message,T result){
		return new Result<>("1","1111",message,result);
	}

	public static <T> Result<T> fail(){
		return new Result<>("1","1111","失败");
	}

}
