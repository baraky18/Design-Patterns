package impl;

import intf.GateState;
import mainentity.Gate;

public class OpenGateState implements GateState {

	private Gate gate;
	
	public OpenGateState(Gate gate){
		this.gate = gate;
	}
	
	@Override
	public void enter() {
		//let user in
		this.gate.changeState(new ClosedGateState(this.gate));
	}

	@Override
	public void payOk() {
		//let user in
		this.gate.changeState(new ClosedGateState(this.gate));
	}

	@Override
	public void payFailed() {
		this.gate.changeState(new ClosedGateState(this.gate));
	}

}
