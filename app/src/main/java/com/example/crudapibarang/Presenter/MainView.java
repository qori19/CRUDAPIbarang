package com.example.crudapibarang.Presenter;

import com.example.crudapibarang.Model.GetModel.GetResponse;

public interface MainView {
    void getSucces(GetResponse list);
    void setToast(String message);
    void onError(String errorMessage);
    void onFailure(String failureMessage);
}
