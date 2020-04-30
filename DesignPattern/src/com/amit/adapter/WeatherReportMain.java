package com.amit.adapter;

public class WeatherReportMain {

	public static void main(String[] args) {
		
	    XWeather xw = (XWeather) new XWeatherImpl();
		WeatherClient1 wc1 = new WeatherClient1(xw);
		WeatherClient2 wc2 = new WeatherClient2(xw);
		System.out.println("Delhi current temparatue is : "+wc1.getWeather("Delhi"));
		
		System.out.println("Pune current temparatue is : "+wc2.getWeather("Pune"));
		
		//---------------------------------------------
		YWeather yw = new YWeatherImpl() ;
		XTOYWeatherAdapter xtoy = new XTOYWeatherAdapter(yw);
		
		WeatherClient1 wc12 = new WeatherClient1(xtoy);
		WeatherClient2 wc22 = new WeatherClient2(xtoy);
		
		
		System.out.println("Delhi current temparatue is : "+wc12.getWeather("Delhi"));
		
		System.out.println("Pune current temparatue is : "+wc22.getWeather("Pune"));
		
	}

}
