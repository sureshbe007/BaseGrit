package com.example.ideaplunge.basegrit.ui.base;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ideaplunge.basegrit.R;
import com.example.ideaplunge.basegrit.ui.base.MvpView;


public abstract class BaseActivity extends AppCompatActivity implements MvpView {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_estore);
  }

  @Override
  public void showLoading() {

  }

  @Override
  public void hideLoading() {

  }
}
