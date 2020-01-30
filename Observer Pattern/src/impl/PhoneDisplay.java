package impl;

import intf.IObserver;

public class PhoneDisplay implements IObserver {

	private WeatherStation station;
	
	public PhoneDisplay(WeatherStation station){
		this.station = station;
	}
	
	@Override
	public void update() {
		station.getTemperature();
	}

}
