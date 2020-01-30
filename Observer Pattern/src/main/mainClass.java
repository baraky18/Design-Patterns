package main;

import impl.PhoneDisplay;
import impl.TvDisplay;
import impl.WeatherStation;

public class mainClass {

	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();
		PhoneDisplay phoneDisplay = new PhoneDisplay(weatherStation);
		TvDisplay tvDisplay = new TvDisplay(weatherStation);
		weatherStation.add(phoneDisplay);
		weatherStation.add(tvDisplay);
		//if temperature has changed, then
		weatherStation.notifyObservers();
	}

}
