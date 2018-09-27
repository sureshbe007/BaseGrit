package com.example.ideaplunge.basegrit.ui.Users;


import com.example.ideaplunge.basegrit.ui.base.MvpPresenter;

public interface UsersMvpPresenter<V extends UsersView> extends MvpPresenter<V> {

  void getData();

}
