package com.example.ideaplunge.basegrit.ui.Users;


import com.example.ideaplunge.basegrit.ui.base.MvpView;

public interface UsersView extends MvpView {

  void showData(String data);

  void showError(String error);
}
