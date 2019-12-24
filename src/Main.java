// Cameron Samuels

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		
		
		//////////
		System.out.println("ENCAPSULATION");
		
		Division ca15 = new District("CA", 15);
		Position representative = new Position("Representative", "Rep");
		Race repCA15 = new Race(representative, ca15);
		Candidate swalwell = new Candidate("Eric Swalwell");
		Campaign swalwell2020 = new Campaign(swalwell, repCA15);
		
		swalwell2020.getCandidate();   // must be acquired through method
		//swalwell2020.setCandidate(); // method does not exist to restrict access
		
		repCA15.setGeneralElection(new Date(1604383200000L)); // modify through set method
		System.out.println("General election: " + repCA15.getGeneralElection()); //retrieve through get method
		
		
		
		//////////
		System.out.println();
		System.out.println("INHERITANCE");
		
		State tx = new State("TX");
		tx.setPopulation(29000000); //inherits from Division
		System.out.println("Population of Texas: " + tx.getPopulation()); //inherits from Division
		
		
		
		//////////
		System.out.println();
		System.out.println("COMPILE-TIME POLYMORPHISM (check code)");
		
		Candidate beginner = new Candidate("Sri Kulkarni"); //one parameter
		
		Position rep = new Position("Representative", "Rep");
		Candidate pro = new Candidate("Beto O'Rourke", rep); //two parameter
		
		
		
		//////////
		System.out.println();
		System.out.println("RUNTIME POLYMORPHISM (check code for expected results)");
		
		State la = new State("LA");
		State la1 = new District("LA", 1);
		District LA1 = new District("LA", 1);
		
		// contains() is overridden with late binding
		System.out.println(la1.contains(LA1)); //true
		System.out.println(LA1.contains(la1)); //true
		System.out.println(la.contains(la1)); //true
		
		
		//////////
		System.out.println();
		System.out.println("ABSTRACTION (check code for expected results)");
		
		//Division division = new Division()    //cannot instantiate
		
		Country unitedStates = new Country("US");
		Country canada = new Country("CA");
		State texas = new State("TX");
		State california = new State("CA");
		District hd28 = new District("TX", 28);
		District ca12 = new District("CA", 12);
		
		// contains() is abstract
		System.out.println(canada.contains(unitedStates)); //false
		System.out.println(unitedStates.contains(california)); //true
		System.out.println(california.contains(texas)); //false
		System.out.println(texas.contains(hd28)); //true
		System.out.println(hd28.contains(ca12)); //false
		System.out.println(ca12.contains(unitedStates)); //false
		
		
		
	}
	
}
