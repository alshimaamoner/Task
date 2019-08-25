package com.example.task.Model;

import java.util.List;

import com.google.gson.annotations.SerializedName;


public class LoginResponse{

	@SerializedName("data")
	private Data data;

	@SerializedName("extra")
	private List<Object> extra;

	@SerializedName("message")
	private String message;

	@SerializedName("status")
	private int status;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setExtra(List<Object> extra){
		this.extra = extra;
	}

	public List<Object> getExtra(){
		return extra;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public int getStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"LoginResponse{" + 
			"data = '" + data + '\'' + 
			",extra = '" + extra + '\'' + 
			",message = '" + message + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}