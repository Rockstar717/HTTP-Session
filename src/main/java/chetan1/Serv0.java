package chetan1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Serv0
 */
@WebServlet("/Serv0")
public class Serv0 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv0() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String Firstname=request.getParameter("Firstname");
		String Lastname=request.getParameter("Lastname");		
		String Address = request.getParameter("Address");
		String Pincode =request.getParameter("Pincode");
		String City = request.getParameter("City");
		String State = request.getParameter("State");
		String Education = request.getParameter("Education");
		String Email = request.getParameter("Email");
		String Username = request.getParameter("Username");
		String Password = request.getParameter("Password");
		String Age = request.getParameter("Age");
		String Mobile = request.getParameter("Mobile");
		String Gender = request.getParameter("Gender");
		String Nationality =request.getParameter("Nationality");
		String PassingYear = request.getParameter("PassingYear");
		
		HttpSession obj = request.getSession();
		obj.setAttribute("Firstname", Firstname);
		obj.setAttribute("Lastname", Lastname);
		obj.setAttribute("Address", Address);
		obj.setAttribute("Pincode", Pincode);
		obj.setAttribute("City", City);
		obj.setAttribute("State", State);
		obj.setAttribute("Education", Education);
		obj.setAttribute("Email", Email);
        obj.setAttribute("Username", Username);
        obj.setAttribute("Password", Password);
        obj.setAttribute("Age", Age);
        obj.setAttribute("Mobile", Mobile);
        obj.setAttribute("Gender", Gender);
        obj.setAttribute("Nationality", Nationality );
        obj.setAttribute("PassingYear", PassingYear);
        pw.print("First Page");
        pw.print("<a href ='Serv1'> visit </a>");
        pw.close();
	}
}

	
