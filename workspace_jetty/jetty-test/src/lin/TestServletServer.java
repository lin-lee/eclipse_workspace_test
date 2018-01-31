package lin;  
  
import java.io.IOException;  
  
import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
  
import org.eclipse.jetty.server.Server;  
import org.eclipse.jetty.servlet.ServletContextHandler;  
import org.eclipse.jetty.servlet.ServletHolder;  
  
/**    
 * @Title: TestServletServer.java 
 * @Package com.ddz.web.test 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author Potter 
 * @date 2013-12-13 上午11:32:27 
 * @version V2.0    
 */  
public class TestServletServer {  
      
    public static void main(String[] args) throws Exception{  
        Server server=new Server(8080);  
        //第一种方式:通过构造函数,设置默认的session  
        ServletContextHandler context=new ServletContextHandler(ServletContextHandler.SESSIONS);  
        context.setContextPath("/");  
          
        server.setHandler(context);  
          
        //第二种方式：设置session  
        //Create the SessionHandler (wrapper) to handle the sessions  
        /*HashSessionManager manager = new HashSessionManager(); 
        SessionHandler sessions = new SessionHandler(manager); 
        context.setHandler(sessions);*/  
          
        context.addServlet(new ServletHolder(new HelloServlet()), "/*");  
          
        server.start();  
        server.join();  
    }  
  
}  
  
class HelloServlet extends HttpServlet{  
      
    private static final long serialVersionUID = 1L;  
    private String greeting = "Hello World!";    
   
    public HelloServlet() {  
    }    
   
    public HelloServlet(String greeting) {  
        this.greeting = greeting;  
    }    
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)   
            throws ServletException, IOException {  
         response.setContentType("text/html");  
         response.setStatus(HttpServletResponse.SC_OK);  
         response.getWriter().println("<h1>"+greeting+"</h1>");  
         response.getWriter().println("session=" + request.getSession(true).getId());   
    }  
}  