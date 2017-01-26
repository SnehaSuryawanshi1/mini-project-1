import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class addlevel extends HttpServlet
{

    public addlevel()
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
        PrintWriter printwriter = httpservletresponse.getWriter();
        httpservletresponse.setContentType("text/html");
        try
        {
            String s1 = httpservletrequest.getParameter("text1");
            printwriter.println("level name is " + s1);
            String s = httpservletrequest.getParameter("text2");
            printwriter.println("lcode is" + s);
            System.out.println("Before inserting");
            int i = st.executeUpdate("insert into hdlevels values('" + s1 + "','" + s + "')");
            System.out.println(i + " One row is inserted");
            System.out.println("After query");
            httpservletresponse.sendRedirect("./levelconfirm.html");
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