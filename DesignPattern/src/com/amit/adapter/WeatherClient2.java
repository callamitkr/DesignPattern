package com.amit.adapter;

public class WeatherClient2 {
	XWeather xw;
	public WeatherClient2(XWeather xw) {
		this.xw = xw;
	}
	
	public int getWeather(String city) {
		return xw.weatherInfo(city);
	}

}
