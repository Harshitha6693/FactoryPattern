package edu.neu.csye6200.AssignmentPart2;

public class ParrotFactory extends AbstractBirdsFactoryApi{
	@Override
	public Bird getObject() {
		return new Parrot();
	}
}
