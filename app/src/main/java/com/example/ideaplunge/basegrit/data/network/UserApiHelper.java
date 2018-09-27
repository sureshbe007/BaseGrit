package com.example.ideaplunge.basegrit.data.network;




import com.example.ideaplunge.basegrit.data.network.model.UserList;

import javax.inject.Inject;
import javax.inject.Singleton;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Singleton
public class UserApiHelper {


  private UserAPIInterface estoreAPIInterface;

  @Inject
  public UserApiHelper(UserAPIInterface estoreAPIInterface) {

    estoreAPIInterface = ApiClient.getClient().create(UserAPIInterface.class);
    getEstore();
  }


  public void getEstore() {

    Call<UserList> call = estoreAPIInterface.doGetEstoreList();

    call.enqueue(new Callback<UserList>() {
      @Override
      public void onResponse(Call<UserList> call, Response<UserList> response) {


      }

      @Override
      public void onFailure(Call<UserList> call, Throwable t) {

      }
    });

  }
}
