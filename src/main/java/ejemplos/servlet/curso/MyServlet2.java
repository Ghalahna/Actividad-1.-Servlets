package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		// Obtener el nombre del formulario
		String nombre = request.getParameter("nombre");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// // Obtener  el bienvenido con el nombre.
		out.println("<html>");
		out.println("<head><MyServlet2</title></head>");
		out.println("<body>");
		out.println("<h1>Bienvenido "+nombre+ "!</h1>");
	}

}