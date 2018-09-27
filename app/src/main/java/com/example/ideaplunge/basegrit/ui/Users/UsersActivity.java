package com.example.ideaplunge.basegrit.ui.Users;

import android.os.Bundle;

import com.example.ideaplunge.basegrit.ui.base.BaseActivity;
import com.example.ideaplunge.basegrit.R;

public class UsersActivity extends BaseActivity implements UsersView {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_estore);


  }


  @Override
  protected void onDestroy() {
    super.onDestroy();
  }

  @Override
  public void showData(String data) {

  }

  @Override
  public void showError(String error) {

  }
}
