package com.amit.observer;

public class WeatherMain {

	public static void main(String[] args) {
		WetherUpdator wu = new WetherUpdator();
		WeatherClient wc = new WeatherClient();
		WeatherClient wc1 = new WeatherClient();
		wu.addObserver(wc);
		wu.addObserver(wc1);
		
		wu.tempratueChange(12);
		

	}

}
