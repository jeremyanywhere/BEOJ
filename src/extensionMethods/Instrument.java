package extensionMethods;

//@FunctionalInterface  // this is optional. If the interface has only one abstract method 
		// with no defaults, then it counts as functional anyway.  
public interface Instrument {
	//String S = "functional?";
	//public void play();
   default public void play() {
  		System.out.println("Make Sounds..");
   }
//  default public void tune() {};
}
