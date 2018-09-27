package com.example.ideaplunge.basegrit.di.component;



import com.example.ideaplunge.basegrit.di.module.ActivityModule;

import dagger.Component;

@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
}
