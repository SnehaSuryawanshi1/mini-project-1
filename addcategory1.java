import java.io.IOException;
import java.io.PrintStream;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class addcategory1 extends HttpServlet
{

    public addcategory1()
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
        String s2 = "yes";
        java.io.PrintWriter printwriter = httpservletresponse.getWriter();
        httpservletresponse.setContentType("text/html");//mime type
        try
        {
            String s = httpservletrequest.getParameter("text1");
            String s1 = httpservletrequest.getParameter("text2");
            String s3 = httpservletrequest.getParameter("text3");
            System.out.println("Before inserting");
            int i = st.executeUpdate("insert into categoryies values('" + s + "','" + s1 + "','" + s3 + "')");
            System.out.println(i + " One row is inserted");
            System.out.println("After query");
            httpservletresponse.sendRedirect("./categoryconfirm.html");
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