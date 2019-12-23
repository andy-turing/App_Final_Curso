package com.example.appfinal.root;


import com.example.appfinal.http.ApiModuleForInfo;
import com.example.appfinal.http.ApiModuleForName;
import com.example.appfinal.topmovies.TopMoviesActivity;
import com.example.appfinal.topmovies.TopMoviesModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class, ApiModuleForName.class, ApiModuleForInfo.class, TopMoviesModule.class})
public interface ApplicationComponent {

    void inject(TopMoviesActivity target);

}