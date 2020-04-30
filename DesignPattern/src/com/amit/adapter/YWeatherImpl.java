package com.amit.adapter;

public class YWeatherImpl implements YWeather {

	@Override
	public int WeatherDetails(String city) {
			int temp=0;
			if("Delhi".equalsIgnoreCase(city))
				 temp = 40;
			else if("Pune".equalsIgnoreCase(city))
				temp = 30;
			return temp;
	}

}
