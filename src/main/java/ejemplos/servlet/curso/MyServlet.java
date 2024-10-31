package ejemplos.servlet.curso;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {


		RequestDispatcher dispatcher = request.getRequestDispatcher("Form html.jsp");
		dispatcher.forward(request, response);



		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
        /*
		// send HTML page to client

		out.println("<html>");
		out.println("<head><title>Actividad 1. servlet HTML</title></head>");
		out.println("<head><h1>Formulario</h1></head>");
		out.println("<body>");
		out.println("<h2>Introduce tu nombre</h2>");
		out.println("<form action='/myServlet2' method='POST'>");
		out.println("Nombre: <input type='text' name='nombre'><br>");
		out.println("<input type='submit' value='Enviar'>");
		out.println("</form>");
		out.println("</body></html>");
		*/

	}

}