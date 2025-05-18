

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class control2
 */
@WebServlet("/control2")
public class control2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		
		String nameStr = "【名前】" + request.getParameter("name");
		String[] langArray = request.getParameterValues("lang");
		String langStr = "【言語】";
		if(langArray != null) {
			for(String lang: langArray) {
				langStr += (lang +"　"); 
			}
		}else {
			langStr += "(未選択)";
		}
		
		String careerStr = "【経験】" + request.getParameter("career"); 
		
		response.setContentType("text/html; charset = UTF-8");
		
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>                                 ");
		out.println("<html>                                          ");
		out.println("<head>                                          ");
		out.println("<meta charset=\"UTF-8\">                        ");
		out.println("<title>入力内容</title>                         ");
		out.println("<link rel=\"stylesheet\" href=\"style3.css\">    ");
		out.println("</head>                                         ");
		out.println("<body>                                          ");
		out.println("    <h2>入力内容</h2>                           ");
		out.println("    " + nameStr + "<br><br>                     ");
		out.println("    " + langStr + "<br><br>                     ");
		out.println("    " + careerStr + "<br><br>                    ");
		out.println("<br><a href=\"skill.html\">入力フォームへ</a>     ");
		out.println("</body>                                         ");
		out.println("</html>                                         ");
	}


}
