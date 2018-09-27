package com.example.ideaplunge.basegrit.ui.Users;



import com.example.ideaplunge.basegrit.data.DataManager;
import com.example.ideaplunge.basegrit.data.listners.DataListener;
import com.example.ideaplunge.basegrit.ui.base.BasePresenter;

import javax.inject.Inject;

public class UsersPresenter<V extends UsersView> extends BasePresenter<V> implements UsersMvpPresenter<V> {



  private final DataManager mDataManager;

  @Inject
  public UsersPresenter(DataManager dataManager) {
    this.mDataManager = dataManager;
  }

  @Override
  public void getData() {

    getMvpView().showLoading();

    mDataManager.getData(new DataListener() {
      @Override
      public void onResponse(String data) {
        getMvpView().hideLoading();

        getMvpView().showData(data);
      }
      @Override
      public void onError(String error) {
        getMvpView().hideLoading();
        getMvpView().showData(error);
      }
    });
  }
}
