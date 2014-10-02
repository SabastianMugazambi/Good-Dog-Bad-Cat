//By Sabastian Mugazambi
//Implementing an Interface that represents a virtual trainable pet. 

//The cat class that will keep track of the happiness of the cat. 
public class Cat implements Pet {

		//creating the variable name for happiness. 
		public int c_happy;

		//the method which will reward the cat.
		//Chose a loop rather than multiplication to get practice with loops. 
		public void reward(int numTimes) {
			for (int i = 0; i < numTimes; i++) {
				c_happy= c_happy+1 ;
			}
		}

		//Method that will punish the cat, created utilising loops. 
		public void punish(int numTimes) {
			for (int i = 0; i < numTimes; i++){
				c_happy = c_happy-3 ;
			}
		}
	
	//creating the act method for the Cat class such that the happiness can be printed. 
	public void act(){
		
		String sound;

		//cat's meows are bassed on the happiness with the number of meows corresponding the number of happiness points. 
		if (c_happy > 0) {
			for (int i=0; i< c_happy; i++){
				System.out.print("meow! ");
			}
			System.out.println(" ;My Cat happy scale: " +c_happy);
		}

		//the cat growls when the happiness is negative. 
		else 
				System.out.print("grrrrrrrrr");
				System.out.println(" ;My Cat happy scale: " +c_happy);
			
	}
}