package com.myslyv4uk.weather.impl;

import java.util.Random;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import com.myslyv4uk.weather.api.WeatherService;

@Component (name = "com.myslyv4uk.weather.WeatherServiceImpl")
public class WeatherServiceImpl implements WeatherService {

  @Override
  public int getCurrentTemperature() {
    return new Random().nextInt(40);
  }
  

  @Activate
  public synchronized void activate() {
    System.out.println("Service WeatherServiceImpl activated");
  }


  @Deactivate
  public synchronized void deactivate() {
    System.out.println("Service WeatherServiceImpl deactivated");
  }

}
