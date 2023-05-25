package com.behavioral.ObserverDesignPattern;

public interface YoutubeChannel {
	public void subscribe(Subscriber subscriber);
	public void unsubscribe(Subscriber subscriber);
	public void notifyAllSubscribers(String videoTitle);
	public void uploadVideo(String videoTitle);
}
