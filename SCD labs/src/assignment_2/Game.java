package assignment_2;

import java.util.List;

public class Game {
	private List<TourDescription> TourDescriptions;
	public Game(List<TourDescription> TourDescriptions) {
		this.TourDescriptions =  TourDescriptions;
	}
	
	public void display() {
		TourDescriptions.forEach(tour -> tour.showDescription());
	}
}	
