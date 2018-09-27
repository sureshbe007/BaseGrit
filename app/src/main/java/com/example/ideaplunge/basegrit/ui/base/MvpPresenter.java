package com.example.ideaplunge.basegrit.ui.base;

public interface MvpPresenter< V extends MvpView> {

  void attachView( V mvpView);

  void detachView();
}
