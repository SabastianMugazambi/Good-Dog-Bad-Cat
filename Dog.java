//By Sabastian Mugazambi
//Implementing an Interface that represents a virtual trainable pet. 

//The dog class that will keep track of the happiness of the dog.
public class Dog implements Pet {

		//creating the variable name for happiness
		public int d_happy;

		//the method which will reward the dog.
		//Chose a loop rather than multiplication to get practice with loops. 
		public void reward(int numTimes) {
			for (int i = 0; i < numTimes; i++) {
				d_happy = d_happy +3 ;
			}
		}

		//Method that will punish the dog, created utilising loops.
		public void punish(int numTimes) {
			for (int i = 0; i < numTimes; i++){
				d_happy = d_happy -2 ;
			}
		}
	
	//creating the act method for the dog class such that the happiness can be printed. 
	public void act(){
		

		String sound;

		//Dog's barking is conditioned according to the number of happiness and the hoofs correspond. 
		if (d_happy > 0) {
			for (int i=0; i< d_happy; i++){
				System.out.print("hoof! ");
			}
		 System.out.println(" ;My Dog Happy scale: " +d_happy);
		} 

		//dog whining since the happiness is below Zero. 
		else 
			System.out.print("whiiiiiiiii");
			System.out.println(" ;My Dog Happy scale: " +d_happy);
	}
}



