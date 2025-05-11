import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

@WebServlet("/intro")
public class control extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServlet response) throws ServletException ,IOException{
		((ServletResponse) response).setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = ((ServletResponse) response).getWriter();
		
		out.println("<!DOCTYPE html>                                 ");
		out.println("<html>                                          ");
		out.println("<head>                                          ");
		out.println("<meta charset=\"UTF-8\">                        ");
		out.println("<title>自己紹介サーブレット</title>             ");
		out.println("<link rel=\"stylesheet\" href=\"style.css\">    ");
		out.println("</head>                                         ");
		out.println("<body>                                          ");
		out.println("    <h2>自己紹介</h2>                           ");
		out.println("    <p>こんにちは。たかはしみのるです。</p>     ");
		out.println("    <p>神奈川県出身。東京在住です。</p>         ");
		out.println("</body>                                         ");
		out.println("</html>                                         ");		

	}
	
	protected void doPost(HttpServletRequest request,HttpServlet response)throws ServletException, IOException{
		doGet(request, response);
	}

}
