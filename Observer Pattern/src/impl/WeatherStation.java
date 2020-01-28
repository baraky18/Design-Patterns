package impl;

import java.util.Collection;

import intf.IObservable;
import intf.IObserver;

public class WeatherStation implements IObservable {

	private Collection<IObserver> observers;
	
	private int temprature;
	
	@Override
	public void add(IObserver observer) {
		this.observers.add(observer);
	}

	@Override
	public void remove(IObserver observer) {
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(IObserver observer : this.observers){
			observer.update();
		}
	}

	public int getTemprature() {
		return temprature;
	}

}
