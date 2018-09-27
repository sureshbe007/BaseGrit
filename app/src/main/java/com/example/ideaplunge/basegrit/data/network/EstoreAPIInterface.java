package com.example.ideaplunge.basegrit.data.network;



import com.example.ideaplunge.basegrit.data.network.model.UserList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EstoreAPIInterface {


  @GET("/api/unknown")

  Call<UserList> doGetEstoreList();

}
