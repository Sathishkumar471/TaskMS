package com.example.taskms;




import com.example.taskms.base.Constants;
import com.example.taskms.module.model.ResponseModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GetListAPI {


    @GET(Constants.REPOSITORY)
    Call<ResponseModel> getList(@Query("page") int page, @Query("per_page") int count, @Query("q") String name);

}
