//By Sabastian Mugazambi
//Creating a class for demostrating the effects of using the pets interface. 	

//Creating the class that will create the dog and cat objects
public class InterfaceDemo {

	//Calling main
	public static void main(String[] args) {

		//creating two obejects related to the Dog and the Cat classes. 
  		Pet socks = new Cat();
  		Pet fido = new Dog();

  		//calling the methods of the dog and cat classes by rewarding or punishing the animal. 
 		fido.reward(4);
 		socks.punish(2);

 		//calling the act method that shows how happy the Dog or Cat is.
 		fido.act();
 		socks.act();

	}
}