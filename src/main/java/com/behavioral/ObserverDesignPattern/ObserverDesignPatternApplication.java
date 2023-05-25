package com.behavioral.ObserverDesignPattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ObserverDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObserverDesignPatternApplication.class, args);
		ConcreteYoutubeChannel youtubeChannel1 = new ConcreteYoutubeChannel();
		
		Subscriber subscriber1 = new ConcreteSubscriber("Alice");
		Subscriber subscriber2 = new ConcreteSubscriber("Bob");
		Subscriber subscriber3 = new ConcreteSubscriber("Steve");
		Subscriber subscriber4 = new ConcreteSubscriber("Tom");
		Subscriber subscriber5 = new ConcreteSubscriber("John");
		
		youtubeChannel1.subscribe(subscriber1);
		youtubeChannel1.subscribe(subscriber2);
		youtubeChannel1.subscribe(subscriber3);
		youtubeChannel1.subscribe(subscriber4);
		youtubeChannel1.subscribe(subscriber5);
		
		youtubeChannel1.uploadVideo("How to learn DSA?");
		youtubeChannel1.uploadVideo("How to learn SystemDesign?");
		
		youtubeChannel1.unsubscribe(subscriber1);
		youtubeChannel1.unsubscribe(subscriber2);
		
		youtubeChannel1.uploadVideo("How to learn Design Patterns?");
	}
}
