package edu.neu.csye6200.AssignmentPart2;

public class OwlFactory extends AbstractBirdsFactoryApi{
	@Override
	public Bird getObject() {
		return new Owl();
	}
}
