import java.io.IOException;
import java.io.PrintStream;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

class welcome extends HttpServlet
{

    welcome()
    {
    }

    public void service(HttpServletRequest httpservletrequest, HttpServletResponse httpservletresponse)
        throws ServletException, IOException
    {
        httpservletresponse.setContentType("text/html");
        java.io.PrintWriter printwriter = httpservletresponse.getWriter();
        String s = httpservletrequest.getParameter("text1");
        String s1 = httpservletrequest.getParameter("password1");
        try
        {
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
 Connection con=DriverManager.getConnection("jdbc:odbc:ecare","ecare","ecare");
	
//Class.forName("oracle.jdbc.driver.OracleDriver");
//	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:india","ecare","ecare");
	Statement st=con.createStatement();
              ResultSet resultset;
            for(resultset = st.executeQuery("select * from login"); resultset.next();)
                if(s.equals(resultset.getString(1)) && s1.equals(resultset.getString(2)))
                    System.out.println("accepted");
                else
                    System.out.println("access denied");

            resultset.close();
            st.close();
            con.close();
        }
        catch(Exception exception)
        {
            System.out.println("some problem with databse" + exception);
        }
    }
}