package com.tactfactory.designpatternniveau1.observer.tp1;

public class HexConcreteObserver extends Observer {

	public HexConcreteObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {

		System.out.println("As a hex String:" + Integer.toHexString(subject.getState()).toUpperCase());

	}

}
