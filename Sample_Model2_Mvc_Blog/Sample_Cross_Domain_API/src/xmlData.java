

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class xmlData
 */
@WebServlet("/xmlData")
public class xmlData extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String strurl="";    
    public xmlData() {
        super();
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//response.setContentType("text/xml;charset=UTF-8");
		//response.setContentType("text/plain;charset=UTF-8");
		String data = passUrl();
		//out.println(data);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(data);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	private String passUrl(){
		  try {
		   URL url = new URL("http://api.saramin.co.kr/job-search?keywords=개발자");
		   URLConnection connection;
		   connection = url.openConnection();
		   HttpURLConnection httpconnection = (HttpURLConnection) connection;
		   int responseCode = httpconnection.getResponseCode();
		   if (responseCode == HttpURLConnection.HTTP_OK) {

		    // 내용 읽기 시작
		    InputStream in = httpconnection.getInputStream();
		    BufferedReader br = new BufferedReader(new InputStreamReader(in));
		    String line;
		    StringBuilder sb = new StringBuilder();
		    while ((line = br.readLine()) != null) {
		    	sb.append(line);
		    	//System.out.println(line);
		    }
		    br.close();
		    //System.out.print(sb);
		    // 내용 읽기 끝
		    strurl =sb.toString();
		     }
		  } catch (IOException e) {
			  e.printStackTrace();
		  }
		  return strurl; // 리턴타입 String 으로 주기
		 }


}
