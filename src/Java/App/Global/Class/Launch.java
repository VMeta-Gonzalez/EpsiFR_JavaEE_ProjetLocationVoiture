package Java.App.Global.Class;

import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import Java.App.Responsible.Class.Voiture;


public class Launch implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ArrayList<Voiture> ListeVoitures = new ArrayList<Voiture>();
		
		Voiture voiture1 = new Voiture(1, "Wings of fire", "Ferrari", 500, false, false);
		Voiture voiture2 = new Voiture(2, "Steel Blade", "Mercedes", 7800, false, false);
		Voiture voiture3 = new Voiture(3, "King of the night", "Bugati", 300, false, false);
		
		ListeVoitures.add(1, voiture1);
		ListeVoitures.add(2, voiture2);
		ListeVoitures.add(3, voiture3);
		
		sce.getServletContext().setAttribute("CustomerSession", ListeVoitures);
		sce.getServletContext().setAttribute("Test", "Go");
	}
}