//Provided by Andy

//A public interface that is being implemented by the Dog and Cat classes
public interface Pet {
	public void reward(int nunTimes);
	public void punish(int numTimes);

	//also including the act method that will print the happiness of the dog or cat. 
	public void act();
}