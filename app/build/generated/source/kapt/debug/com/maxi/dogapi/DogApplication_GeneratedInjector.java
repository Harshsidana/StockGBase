package com.maxi.dogapi;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = DogApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface DogApplication_GeneratedInjector {
  void injectDogApplication(DogApplication dogApplication);
}
