package com.example.myapp;


import java.util.List;

import lombok.Data;

@Data
public class HourlyPojo { 

   private List<Double> temperature_2m;
   private List<String> time;

}