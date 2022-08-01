package routing;

import jakarta.servlet.ServletException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import beans.Coyote;

/**
 * Servlet implementation class coyoteServlet
 */
public class coyoteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public coyoteServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{

        /* Création et initialisation du message. */
        String paramAuteur = request.getParameter( "auteur" );
        String message = "Transmission de variables : OK ! " + paramAuteur;

        /* Création du bean */
        Coyote premierBean = new Coyote();
        /* Initialisation de ses propriétés */
        premierBean.setNom( "Coyote" );
        premierBean.setPrenom( "Wile E." );

        /* Stockage du message et du bean dans l'objet request */
        request.setAttribute( "test", message );
        request.setAttribute( "coyote", premierBean );

        /* Transmission de la paire d'objets request/response à notre JSP */
        this.getServletContext().getRequestDispatcher( "/WEB-INF/test.jsp" ).forward( request, response );
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
