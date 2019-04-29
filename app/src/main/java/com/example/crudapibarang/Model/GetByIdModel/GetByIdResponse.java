package com.example.crudapibarang.Model.GetByIdModel;

import com.google.gson.annotations.SerializedName;

public class GetByIdResponse{

	@SerializedName("data")
	private Data data;

	@SerializedName("errors")
	private Object errors;

	public void setData(Data data){
		this.data = data;
	}

	public Data getData(){
		return data;
	}

	public void setErrors(Object errors){
		this.errors = errors;
	}

	public Object getErrors(){
		return errors;
	}

	@Override
 	public String toString(){
		return 
			"GetByIdResponse{" + 
			"data = '" + data + '\'' + 
			",errors = '" + errors + '\'' + 
			"}";
		}
}