package com.example.ideaplunge.basegrit.di.component;


import android.app.Application;
import android.content.Context;


import com.example.ideaplunge.basegrit.BaseApp;
import com.example.ideaplunge.basegrit.data.DataManager;
import com.example.ideaplunge.basegrit.di.annotation.ApplicationContext;
import com.example.ideaplunge.basegrit.di.module.ApplicationModule;

import dagger.Component;
import dagger.Module;

@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {



  void inject(BaseApp baseApp);

  @ApplicationContext
  Context context();

  Application application();
//  DataManager dataManager();
}


