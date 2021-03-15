package com.tactfactory.designpatternniveau1.observer.tp1;

public class OctalConcreteObserver extends Observer {

	public OctalConcreteObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {

		System.out.println("As an octal String:" + Integer.toOctalString(subject.getState()));

	}

}
