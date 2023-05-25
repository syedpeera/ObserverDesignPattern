package com.behavioral.ObserverDesignPattern;

public class ConcreteSubscriber implements Subscriber{
	private String subscriberName;
	
	public ConcreteSubscriber(String subscriberName) {
		this.subscriberName=subscriberName;
	}
	
	@Override
	public void update(String videoTitle) {
		System.out.println(subscriberName+" Received a notification, a new video has been uploaded "+videoTitle);
	}

}
