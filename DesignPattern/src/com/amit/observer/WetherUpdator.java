package com.amit.observer;

import java.util.ArrayList;
import java.util.List;

public class WetherUpdator implements Subject {

	List<Observer> list = new ArrayList<>(); 
	static int temp;
	@Override
	public void addObserver(Observer o) {
		 list.add(o);
		
	}

	@Override
	public void removeObserver(Observer o) {
		list.remove(o);
		
	}

	@Override
	public void notifyObserver() {
		for(Observer ob :list) {
			ob.update(temp);
		}
		
		
	}
	public void tempratueChange(int temp) {
		this.temp = temp;
		notifyObserver();
		
		
	}

}
