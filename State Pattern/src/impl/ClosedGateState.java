package impl;

import intf.GateState;
import mainentity.Gate;

public class ClosedGateState implements GateState {

	private Gate gate;
	
	public ClosedGateState(Gate gate){
		this.gate = gate;
	}
	
	@Override
	public void enter() {
		//do nothing
	}

	@Override
	public void payOk() {
		this.gate.changeState(new OpenGateState(this.gate));
	}

	@Override
	public void payFailed() {
		//do nothing
	}

}
