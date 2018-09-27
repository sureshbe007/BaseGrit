package com.example.ideaplunge.basegrit.di.module;



import android.app.Application;
import android.content.Context;


import com.example.ideaplunge.basegrit.di.annotation.ApplicationContext;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {


  protected final Application mApplication;

  public ApplicationModule(Application application) {
    mApplication = application;
  }

  @Provides
  Application provideApplication() {
    return mApplication;
  }

  @Provides
  @ApplicationContext
  Context provideContext() {
    return mApplication;
  }
}
