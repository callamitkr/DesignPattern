package com.amit.adapter;

public class XWeatherImpl implements XWeather {
	@Override
	public int weatherInfo(String city) {
		int temp=0;
		if("Delhi".equalsIgnoreCase(city))
			 temp = 40;
		else if("Pune".equalsIgnoreCase(city))
			temp = 30;
		return temp;
	}

}
