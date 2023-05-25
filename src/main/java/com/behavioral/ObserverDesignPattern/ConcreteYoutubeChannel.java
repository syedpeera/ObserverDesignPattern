package com.behavioral.ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteYoutubeChannel implements YoutubeChannel{
	private List<Subscriber> subscribersList;
	private String latestVideoTitle;
	
	public ConcreteYoutubeChannel(){
		subscribersList = new ArrayList<>();
	}
	
	public void uploadVideo(String videoTitle) {
		this.latestVideoTitle=videoTitle;
		notifyAllSubscribers(videoTitle);
	}
	
	@Override
	public void subscribe(Subscriber subscriber) {
		subscribersList.add(subscriber);
	}

	@Override
	public void unsubscribe(Subscriber subscriber) {
		subscribersList.remove(subscriber);
	}

	@Override
	public void notifyAllSubscribers(String videoTitle) {
		for(Subscriber subscriber: subscribersList) {
			subscriber.update(videoTitle);
		}
	}

}
