package impl;

import intf.IObserver;

public class TvDisplay implements IObserver {

	private WeatherStation station;
	
	public TvDisplay(WeatherStation station){
		this.station = station;
	}
	
	@Override
	public void update() {
		station.getTemprature();
	}

}
