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
 * Servlet implementation class Serv1
 */
@WebServlet("/Serv1")
public class Serv1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Serv1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		HttpSession obj = request.getSession();
		String Firstname =(String) obj.getAttribute("Firstname");
		String Lastname= (String) obj.getAttribute("Lastname");
		String Address = (String) obj.getAttribute("Address");
		String Pincode =(String) obj.getAttribute("Pincode");
		String City = (String) obj.getAttribute("City");
		String State =(String) obj.getAttribute("State");
		String Education =(String) obj.getAttribute("Education");
		String Email =(String) obj.getAttribute("Email");
		String Username = (String)obj.getAttribute("Username");
		String Password=(String)obj.getAttribute("Password");
		String Age =(String) obj.getAttribute("Age");
		String Mobile =(String) obj.getAttribute("Mobile");
		String Gender =(String) obj.getAttribute("Gender");
		String Nationality =(String) obj.getAttribute("Nationality");
		String PassingYear =(String)obj.getAttribute("PassingYear");
		
		
		pw.print("<br>"+"Firstname   :          "+Firstname+"<br>");
		pw.print("Lastname    :          "+Lastname+"<br>");
		pw.print("Address     :          "+Address+"<br>");
		pw.print("Pincode     :          "+Pincode+"<br>");
		pw.print("City        :          "+City+"<br>");
		pw.print("State       :          "+State+"<br>");
	    pw.print("Education   :          "+Education+"<br>");
	    pw.print("Email       :          "+Email+"<br>");
	    pw.print("Username    :          "+Username+"<br>");
	    pw.print("Password    :          "+Password+"<br>");
	    pw.print("Age         :          "+Age+"<br>");
	    pw.print("Mobile      :          "+Mobile+"<br>");
	    pw.print("Gender      :          "+Gender+"<br>");
	    pw.print("Nationality :          "+Nationality+"<br>");
	    pw.print("PassingYear :          "+PassingYear+"<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
