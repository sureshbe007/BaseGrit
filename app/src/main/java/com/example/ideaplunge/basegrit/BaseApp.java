package com.example.ideaplunge.basegrit;

import android.app.Application;

public class BaseApp extends Application {

  public static BaseApp AppInstance;

  @Override
  public void onCreate() {
    super.onCreate();
    AppInstance=this;
  }

  public static BaseApp getAppInstance ()
  {

    return AppInstance;
  }
}
