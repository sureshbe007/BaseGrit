package com.example.ideaplunge.basegrit.data;



import com.example.ideaplunge.basegrit.data.listners.DataListener;
import com.example.ideaplunge.basegrit.data.network.UserApiHelper;
import com.example.ideaplunge.basegrit.data.pref.PreferencesHelper;

import javax.inject.Inject;
import javax.inject.Singleton;


@Singleton
public class DataManager {

  private final PreferencesHelper mPreferencesHelper;
  private final UserApiHelper estoreApiHelper;

  @Inject
  public DataManager(PreferencesHelper preferencesHelper, UserApiHelper estoreApiHelper) {
    this.mPreferencesHelper = preferencesHelper;
    this.estoreApiHelper = estoreApiHelper;
  }

  public void getData(final DataListener listener) {

    final String data = mPreferencesHelper.getData();

    if (data != null) {
      listener.onResponse(data);
      return;
    }

//    estoreApiHelper.getEstore(new StringRequestListener() {
//      @Override
//      public void onResponse(String response) {
//        mPreferencesHelper.putData(response);
//        listener.onResponse(response);
//      }
//
//      @Override
//      public void onError(ANError anError) {
//        listener.onError(anError.getErrorDetail());
//      }
//    });

  }


}
