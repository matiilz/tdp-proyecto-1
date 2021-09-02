package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	
	
	public static void main(String[] arg) {
		
		Student alumno = new Student(118683,"Ilz","Matias","matyruso10@hotmail.com","https://github.com/matiilz","images/tdp.png");
    	SimplePresentationScreen frame = new SimplePresentationScreen(alumno);
    	frame.setVisible(true);
		
		
		
	}
	
	
}