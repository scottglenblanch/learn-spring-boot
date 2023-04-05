package com.example.myapp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ApiController {
    
    @GetMapping("/")
    public String homeRoute() {
        String html =  "<h1>The site is working!</h1>";

        html += "<ul>";
        html += "<li><a href='/hello-world'>Hello World</a></li>";
        html += "<li><a href='/weather'>Weather</a></li>";
        html += "</ul>";

        return html;
    }

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "hello world!";
    }

    @GetMapping("/weather")
    public @ResponseBody WeatherPojo getWeather() {
        RestTemplate restTemplate = new RestTemplate();

        String url = "https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m";

        ResponseEntity<WeatherPojo> response = restTemplate.getForEntity(url, WeatherPojo.class);

        return response.getBody();
    }

}
