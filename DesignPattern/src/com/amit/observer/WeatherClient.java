package com.amit.observer;

public class WeatherClient implements Observer {

	@Override
	public void update(int temp) {
		System.out.println("Tempratue has been changed .Now Tempratue is :"+temp);
		
	}

}
