package edu.neu.csye6200.AssignmentPart2;

public class PeacockFactory extends AbstractBirdsFactoryApi{
	@Override
	public Bird getObject() {
		return new Peacock();
	}
}
