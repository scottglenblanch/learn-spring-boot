package com.example.myapp;
import lombok.Data;

@Data
public class WeatherPojo { 

   private Integer elevation;
   private HourlyUnitsPojo hourly_units;
   private Double generationtime_ms;
   private String timezone_abbreviation;
   private String timezone;
   private Double latitude;
   private Integer utc_offset_seconds;
   private HourlyPojo hourly;
   private Double longitude;

}
