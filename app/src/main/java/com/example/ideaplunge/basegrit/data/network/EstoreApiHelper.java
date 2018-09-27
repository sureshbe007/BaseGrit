package com.example.ideaplunge.basegrit.data.network;




import com.example.ideaplunge.basegrit.data.network.model.UserResponse;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Singleton
public class EstoreApiHelper {


  private EstoreAPIInterface estoreAPIInterface;

  @Inject
  public EstoreApiHelper(EstoreAPIInterface estoreAPIInterface) {

    estoreAPIInterface = ApiClient.getClient().create(EstoreAPIInterface.class);
    getEstore();
  }


  public void getEstore() {

    Call<UserResponse> call = estoreAPIInterface.doGetEstoreList();

    call.enqueue(new Callback<UserResponse>() {
      @Override
      public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {


      }

      @Override
      public void onFailure(Call<UserResponse> call, Throwable t) {

      }
    });

  }
}
