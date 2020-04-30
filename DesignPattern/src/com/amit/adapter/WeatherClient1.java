package com.amit.adapter;

public class WeatherClient1 {
	XWeather xw;
	public WeatherClient1(XWeather xw) {
		this.xw = xw;
	}
	
	public int getWeather(String city) {
		return xw.weatherInfo(city);
	}

}
