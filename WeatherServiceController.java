package com.example.demo1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherServiceController {
	
	@GetMapping("weather/{city}")
	public String getWeatherInfo(@PathVariable String city) {
		
		System.out.println("city temp"+city);
		return city+"-"+Math.random()*10;
	}

	
}
