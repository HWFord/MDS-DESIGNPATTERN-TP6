package com.tactfactory.designpatternniveau1.observer.tp1;

public class BinaryConcreteObserver extends Observer {

	public BinaryConcreteObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {

		System.out.println("As a binary String:" + Integer.toBinaryString(subject.getState()));

	}
}
