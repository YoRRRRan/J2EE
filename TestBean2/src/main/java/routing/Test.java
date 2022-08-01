package routing;



import java.io.IOException;

import beans.Auteur;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class Test extends HttpServlet {
    private static final long serialVersionUID = 1L;


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
    	Auteur auteur = new Auteur();
        auteur.setPrenom("Yoran");
        auteur.setNom("Wagner");
        auteur.setActif(true);
        System.out.println(auteur.toString());
        
        request.setAttribute("auteur", auteur);
        request.setAttribute("test", "toto");
        
        this.getServletContext().getRequestDispatcher("/bonjour.jsp").forward(request, response);
    }


}