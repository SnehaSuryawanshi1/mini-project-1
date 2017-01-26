<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<%@page import="java.util.*,java.sql.*"%>
<HTML><HEAD><TITLE></TITLE>
<META content="text/html; charset=unicode" http-equiv=Content-Type>
<META content="MSHTML 5.00.2614.3500" name=GENERATOR></HEAD>
<BODY bgcolor=lightyellow>
<form action="./elogin.html" name=f1 
style="COLOR: forestgreen">
<P>&nbsp;</P>
<P align=center><FONT size=5><U><STRONG>Confirmation Form</STRONG> </U></FONT></P>
<P align=center>&nbsp;</P><h4  align="center">Your UserId is:
<font color="black"><blink>
<%
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:ecare","ecare","ecare");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select user_id from registration where user_id='"+request.getSession().getAttribute("uid")+"'");
 while(rs.next()){
	 out.println(rs.getString("user_id"));
	 
 }
%></blink></font></h4>
<P align=center><STRONG><FONT size=4>New&nbsp;Company information is Added </FONT></STRONG></P>
<P align=center>&nbsp;</P>
<P align=center><INPUT id=submit1 name=submit1 style="HEIGHT: 24px; WIDTH: 60px" type=submit value=OK></P></form></BODY></HTML>







<HTML>
<BODY >
<script language=vbscript>

</script>
<script language=vbscript>
</script>
</BODY>
</HTML>