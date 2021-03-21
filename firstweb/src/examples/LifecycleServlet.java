package examples;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LifecycleServlet")
public class LifecycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	//WAS�� ������ ��û�� ������ �ش� �������� �޸𸮿� �ִ��� Ȯ��
    public LifecycleServlet() { //ó������ ����� ���� -> ��û�� ���� �� �޸𸮿� �ö���ִ��� Ȯ���ϰ� ������ ���� �ƴϸ� �޸𸮿� �ø�
        System.out.println("LifecycleServlet ����!!");
    }


	public void init(ServletConfig config) throws ServletException { //ó������ ����� ����
        System.out.println("init test ȣ��!!");
	}


	public void destroy() {  //���� �� ȣ��� -> WAS�� ����ǰų�, �� ���ø����̼��� ���Ӱ� ���ŵ� ���
        System.out.println("destroy ȣ��!!"); 
	}


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");
		out.println("<form method='post' action='/firstweb/LifecycleServlet'>"); 
		//input�� submit�� ������ action�� �ּҷ� ��û���ְ� �޼���� post������ �־�� ->doPost �����
		out.println("name : <input type='text' name='name'><br>");
		out.println("<input type='submit' value='ok'><br>");                                                 
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");
		out.close();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		out.println("<h1> hello " + name + "</h1>");
		out.close();
	}



//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        System.out.println("service ȣ��!!"); //���ΰ�ħ�ϸ� ��� ����
//	}
	
	

}