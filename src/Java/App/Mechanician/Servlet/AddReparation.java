package Java.App.Mechanician.Servlet;
import Java.App.Mechanician.Class.Reparation;
import Java.App.Responsible.Class.Voiture;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddReparation
 */
@WebServlet("/AddReparation")
public class AddReparation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddReparation() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		@SuppressWarnings("unchecked")
		ArrayList<Voiture> ListeVoitures = (ArrayList<Voiture>) req.getSession().getAttribute("ListeVoitures");
		
		Integer VoitureId = Integer.parseInt(req.getParameter("id"));
		Voiture VoitureRepare = ListeVoitures.get(VoitureId);
		String date = req.getParameter("date");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dateReparation = null;
		try {
			dateReparation = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String tachesEffectuer = req.getParameter("taches");
		Integer montantReparation = Integer.parseInt(req.getParameter("montant"));
		
		Reparation reparation = new Reparation(VoitureRepare, dateReparation, tachesEffectuer, montantReparation);
		VoitureRepare.setHistoriqueReparations(reparation);
		ListeVoitures.set(VoitureId, VoitureRepare);
		req.getSession().setAttribute("ListeVoitures", ListeVoitures);
	}

}
