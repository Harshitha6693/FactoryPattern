package edu.neu.csye6200.AssignmentPart2;

import java.util.ArrayList;
import java.util.List;

public class BirdsController {
	private int birdsCount = 0;
	private List<Bird> birds = new ArrayList<>();
	private List<AbstractBirdsFactoryApi> birdFactories = new ArrayList<>();
	
	public BirdsController() {
		super();
	}
	
	public BirdsController(int birdsCount) {
		this.birdsCount = birdsCount;
		this.load(new PeacockFactory());
		this.load(new OwlFactory());
		this.load(new ParrotFactory());
		System.out.println(this.birdFactories.size() + " factories Added.");
		this.load();
	}
	
	public void load(AbstractBirdsFactoryApi f) {
		birdFactories.add(f);
	}
	
	private void load() {
		this.add(this.birdsCount);
	}
	
	public void load(int n) {
		if (0 == n) {
			this.birds.clear();
			this.birdsCount = n;
		} else {			
			this.add(n);
		}
	}
	
	private void add(int n) {
		System.out.println( "Adding " + n * this.birdFactories.size() + " birds (" + n + " each of " + this.birdFactories.size() + " different types).");
		for (int i = 0; i < n; i++) {
			for (AbstractBirdsFactoryApi f : this.birdFactories) {
				this.birds.add(f.getObject());// add new object of respective factories
				this.birdsCount++;// increment initialized variable: explosionCount
			}
		}
	}
	
	public void load(Bird e) {
		this.birds.add(e);
		this.birdsCount++;
	}
	
	public void start() {
		System.out.println(birds.size() + " birds to set off.");
		for (Bird e : birds) {
			System.out.print(e.getClass().getSimpleName() + " ");
			e.bird();
		}
	}
	public static void demo2() {
		System.out.println("\t" + BirdsController.class.getName() + " .demo() starting...\n");
		BirdsController obj = new BirdsController();	// empty		
		/*
		 * Explosion Controller uses Factory Pattern
		 * Load Explosion Factories (AbstractExplosionFactory)
		 */
		obj.load(new PeacockFactory());
		obj.load(new OwlFactory());
		obj.load(new ParrotFactory());
		/*
		 * Use loaded factories to create Explosions
		 */
		obj.load(2);		// creating two explosions from each factory
		obj.start();
		
		System.out.println(BirdsController.class.getName() + " .demo() done!\n");
	}
}















