
import java.io.IOException;
import java.io.PrintStream;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class deletecompanyinfo extends HttpServlet
{

    public deletecompanyinfo()
    {
    }

    public void init(ServletConfig servletconfig)
        throws ServletException
    {
        super.init(servletconfig);
        try
        {
            System.out.println("inside try");
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con=DriverManager.getConnection("jdbc:odbc:ecare","ecare","ecare");
//Class.forName("oracle.jdbc.driver.OracleDriver");
  //con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:project","ecare","ecare");
  st=con.createStatement();
            System.out.println("statement is created");
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
    }

    public void service(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
        throws ServletException, IOException
    {
        java.io.PrintWriter printwriter = httpservletresponse.getWriter();
        httpservletresponse.setContentType("text/html");
        try
        {
            String s = httpservletrequest.getParameter("l");
            String s1 = httpservletrequest.getParameter("cn");
            String s2 = httpservletrequest.getParameter("s");
            int i = st.executeUpdate("delete from hdcompanyinfo where location_id='" + s + "'");
            System.out.println(i + "view of company info");
            httpservletresponse.sendRedirect("./companyinfo");
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
    }
Connection con;
Statement st;
    ResultSet rs;
}