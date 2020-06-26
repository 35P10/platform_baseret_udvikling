package MyServlet;
import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import MyBean.MyBean;

/**
 * Servlet implementation class MyServet
 */
@WebServlet("/MyServet")
public class MyServet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String nombre= request.getParameter("nombre");
		String apellido= request.getParameter("apellido");
		MyBean bean = new MyBean();
		bean.setDate(new Date());
		bean.setName(nombre);
		bean.setApellido(apellido);
		request.setAttribute("bean", bean);
		getServletContext().getRequestDispatcher("/jsp/Bienvenido.jsp").forward(request, response);
		
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
