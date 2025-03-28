package Servletss;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		
		PrintWriter out=res.getWriter();
		out.print("Hi ");
		ServletConfig cf=getServletConfig();
		String initParameter = cf.getInitParameter("name");
		out.println(initParameter);
	}
}
