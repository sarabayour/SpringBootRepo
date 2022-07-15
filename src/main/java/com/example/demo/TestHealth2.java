package com.example.demo;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class TestHealth2 implements HealthIndicator {

  @Override
  public Health health() {
    if(isHealthOK()){
      return Health.up().withDetail("Dummy Service" , "is running").build();
    }
    return Health.down().withDetail("Dummy Service" , "is down").build();

  }

  private boolean isHealthOK () {
    // logic here
    return true;
  }
}
