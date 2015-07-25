package extensionMethods;

import java.lang.Runnable;

public class Player {

	public static void main(String[] args) {
		Instrument p,m;
		Toy t;
		m = new TinTrumpet();
		Train choo = new Train();
		
		m.play();
		//m.breakMe();
		choo.breakMe();
		Runnable runMe = () ->  {
				System.out.println("Whoo hoo");
		};
		runMe.run();
		
		
		
//		Instrument lambdaInstrument = () -> System.out.println("play with me..");
//		lambdaInstrument.play();
//		playMusic(()-> System.out.println("Misty"));
//		
	}
//	
//	static void playMusic(Instrument i) {
//		i.play();
//	}

}
