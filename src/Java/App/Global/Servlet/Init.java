package Java.App.Global.Servlet;
import Java.App.Global.*;
import Java.App.Manager.*;
import Java.App.Responsible.*;
import Java.App.Responsible.Class.Voiture;
import Java.App.Mechanician.*;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Init
 */
@WebServlet("/Init")
public class Init extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Init() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ArrayList<Voiture> ListeVoitures = new ArrayList<Voiture>();
		
		Voiture voiture1 = new Voiture(1, "Wings of fire", "Ferrari", 500, false, false);
		Voiture voiture2 = new Voiture(2, "Steel Blade", "Mercedes", 7800, false, false);
		Voiture voiture3 = new Voiture(3, "King of the night", "Bugati", 300, false, false);
		
		ListeVoitures.add(1, voiture1);
		ListeVoitures.add(2, voiture2);
		ListeVoitures.add(3, voiture3);
		
		req.getSession().setAttribute("CustomerSession", ListeVoitures);
		req.setAttribute("Test", "Test");
		req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req, res);
	}

}
