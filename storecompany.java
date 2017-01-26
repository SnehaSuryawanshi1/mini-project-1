import java.io.IOException;
import java.io.PrintStream;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class storecompany extends HttpServlet
{

    public storecompany()
    {
        flag = 0;
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
            st1 = con.createStatement();
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
        String s = "";
        java.io.PrintWriter printwriter = httpservletresponse.getWriter();
        httpservletresponse.setContentType("text/html");
        HttpSession httpsession = httpservletrequest.getSession(true);
        try
        {
            String s1 = httpservletrequest.getParameter("select1");
            System.out.println("cname is " + s1);
            String s2 = (String)httpsession.getValue("user");
            System.out.println("user is " + s2);
            int i = st.executeUpdate("insert into userinfo values('" + s1 + "','" + s2 + "')");
            if(i == 1)
                httpservletresponse.sendRedirect("./corporateuserview.html");
        }
        catch(Exception exception)
        {
            System.out.println(exception);
        }
    }
Connection con;
Statement st;
    Statement st1;
    ResultSet rs;
    ResultSet rs1;
    int flag;
}