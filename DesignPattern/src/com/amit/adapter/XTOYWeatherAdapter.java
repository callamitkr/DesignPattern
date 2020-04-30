package com.amit.adapter;

public class XTOYWeatherAdapter implements XWeather{
   
	YWeather yw;
	XTOYWeatherAdapter(YWeather yw ){
		this.yw=yw;
	} 
	
	@Override
	public int weatherInfo(String city) {

		return yw.WeatherDetails(city);
	}

}
