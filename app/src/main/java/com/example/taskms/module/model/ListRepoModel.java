package com.example.taskms.module.model;

import android.util.Log;

import androidx.annotation.NonNull;

import com.example.taskms.ApiClient;
import com.example.taskms.GetListAPI;
import com.example.taskms.base.Globals;
import com.example.taskms.module.presenter.IRepoPresenter;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListRepoModel implements IRepoPresenter {


    @Override
    public void getRepoList(int page, OnCompletedListener listener) {
        if (Globals.checkNetworkConnection()) {
            Log.d("api","api");
            GetListAPI getListApi = ApiClient.getClient().create(GetListAPI.class);
            Call<ResponseModel> call = getListApi.getList(page, 20, "language:assembly");
            call.enqueue(new Callback<ResponseModel>() {
                @Override
                public void onResponse(@NonNull Call<ResponseModel> call, @NonNull Response<ResponseModel> response) {
                    Log.d("success","success");
                    if (response.isSuccessful() && response.body() != null && response.body().getItems() != null &&
                            response.body().getItems().size() > 0) {
                        listener.onCompleted(response.body().getItems());
                        Log.d("success1","success1");
                    } else {
                        Log.d("success2","success2");
                        listener.onFailure(new Throwable());
                    }
                }

                @Override
                public void onFailure(@NonNull Call<ResponseModel> call, @NonNull Throwable t) {
                    Log.d("failure","failure");
                    listener.onFailure(t);
                }
            });
        }
    }
}


