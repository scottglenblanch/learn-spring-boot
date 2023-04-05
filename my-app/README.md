# Weather App

This is a Spring Boot Application

## Run

- Use Java 17
- Run command in root of this app 
    - `./gradlew bootRun`
        - The page will run on localhost:8080

## REST Endpoints
  - `/`
    - String will say this is working
  - `/hello-world`
    - This endpoint returns a string 'hello world'
  - `/weather`
    -  This endpoint returns a weather object from https://api.open-meteo.com/v1/forecast?latitude=52.52&longitude=13.41&hourly=temperature_2m