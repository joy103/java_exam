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
       
	//WAS는 서블릿 요청을 받으면 해당 서블릿이 메모리에 있는지 확인
    public LifecycleServlet() { //처음에만 결과에 나옴 -> 요청이 들어올 때 메모리에 올라와있는지 확인하고 없으면 생성 아니면 메모리에 올림
        System.out.println("LifecycleServlet 생성!!");
    }


	public void init(ServletConfig config) throws ServletException { //처음에만 결과에 나옴
        System.out.println("init test 호출!!");
	}


	public void destroy() {  //수정 후 호출됨 -> WAS가 종료되거나, 웹 어플리케이션이 새롭게 갱신될 경우
        System.out.println("destroy 호출!!"); 
	}


	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head><title>form</title></head>");
		out.println("<body>");
		out.println("<form method='post' action='/firstweb/LifecycleServlet'>"); 
		//input의 submit을 누르면 action의 주소로 요청해주고 메서드는 post값으로 넣어라 ->doPost 실행됨
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
//        System.out.println("service 호출!!"); //새로고침하면 계속 나옴
//	}
	
	

}
