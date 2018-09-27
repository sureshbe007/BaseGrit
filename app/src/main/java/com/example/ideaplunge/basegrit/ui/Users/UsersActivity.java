package com.example.ideaplunge.basegrit.ui.Users;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.ideaplunge.basegrit.data.network.model.UserList;
import com.example.ideaplunge.basegrit.ui.base.BaseActivity;
import com.example.ideaplunge.basegrit.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UsersActivity extends BaseActivity implements UsersView {

@BindView(R.id.recycler_users_list)
  RecyclerView ViewUserRecycler;

private UserlistAdapter userlistAdapter;
private ArrayList<UserList> userListArrayList;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_estore);
    ButterKnife.bind(this);
    userListArrayList=new ArrayList<>();

    UserList userList = new UserList();
    userList.setName("SURESH");
    userList.setAge("25");
    userList.setEmail("suresh@gmail.com");
    userListArrayList.add(userList);

       // RecyclerView
    LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
    ViewUserRecycler.setLayoutManager(linearLayoutManager);
    userlistAdapter= new UserlistAdapter(UsersActivity.this,userListArrayList);
    ViewUserRecycler.setAdapter(userlistAdapter);


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
