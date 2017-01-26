<%@ page language="java" import="java.sql.*" errorPage="" %>
<html>
<head>
<title>Untitled Document</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>

<body>
<%
java.sql.Date sdate;
java.util.Date udate=new java.util.Date();

%>
<p>
  <%sdate=new java.sql.Date(udate.getYear(),udate.getMonth(),udate.getDate());%>
  </p>
<p><font color="#FF0000" face="Courier New, Courier, mono">Date : <%=sdate%> </font></p>
<p align="center"><font color="#FF0000" face="Courier New, Courier, mono"><strong>Student 
  Application Form</strong></font></p>
<form name="form1" method="post" action="">
  <table width="77%" border="1" align="center">
    <tr bgcolor="#CCCCCC"> 
      <td> <div align="right"><font color="#FF0000" face="Courier New, Courier, mono">Class 
          : </font></div></td>
      <td><font color="#FF0000" face="Courier New, Courier, mono"> 
        <input type="text" name="textfield10">
        </font></td>
      <td> <div align="right"><font color="#FF0000" face="Courier New, Courier, mono">Section 
          : </font></div></td>
      <td><font color="#FF0000" face="Courier New, Courier, mono"> 
        <input type="text" name="textfield11">
        </font></td>
    </tr>
    <tr bordercolor="#666633"> 
      <td colspan="4" nowrap><strong><font color="#0000FF" size="3" face="Courier New, Courier, mono">Student 
        Details</font></strong></td>
    </tr>
    <tr bordercolor="#FFFFFF"> 
      <td width="22%" nowrap><font color="#0033FF">Roll No</font></td>
      <td width="29%" nowrap> <font color="#0033FF"> 
        <input type="text" name="textfield2">
        </font></td>
      <td width="27%" nowrap><font color="#0033FF">Name Of The Student</font></td>
      <td width="22%" nowrap> <font color="#0033FF"> 
        <input type="text" name="textfield">
        <font color="#FF0000">*</font> </font></td>
    </tr>
    <tr bordercolor="#FFFFFF"> 
      <td nowrap><font color="#0033FF">Date Of Birth</font></td>
      <td nowrap> <font color="#0033FF">Date 
        <select name="bdate">
          <%
		int i=1;
		while(i<=31)
		{
		  %>
          <option value="<%=i%>"><%=i%></option>
          <%
		  }
		  %>
        </select>
        <font color="#FF0000">/</font> Month 
        <select name="month">
          <%
		int j=1;
		while(j<=12)
		{
		  %>
          <option value="<%=j%>"><%=j%></option>
          <%
		  }
		  %>
        </select>
        <font color="#FF0000">/ </font>Year 
        <select name="year">
		 <%
		int k=udate.getYear()-16;
		
		while(k<=udate.getYear())
		{
		  %>
          <option value="<%=k%>"><%=k%></option>
          <%
		  }
		  %>
        </select>
        <font color="#FF0000">*</font> </font></td>
      <td nowrap><font color="#0033FF">Age </font></td>
      <td nowrap> <font color="#0033FF"> 
        <input type="text" name="textfield7">
        <font color="#FF0000">*</font> </font></td>
    </tr>
    <tr bordercolor="#FFFFFF"> 
      <td nowrap><font color="#0033FF">Sex</font></td>
      <td nowrap><font color="#0033FF"> 
        <select name="select4">
        </select>
        <font color="#FF0000">*</font> </font></td>
      <td nowrap><font color="#0033FF">Blood Group</font></td>
      <td nowrap><font color="#0033FF"> 
        <select name="select5">
        </select>
        <font color="#FF0000">*</font> </font></td>
    </tr>
    <tr bordercolor="#009966"> 
      <td colspan="2"><font color="#FF9966" face="Courier New, Courier, mono"><strong>Father 
        Details</strong></font></td>
      <td colspan="2"><font color="#FF3366" face="Courier New, Courier, mono"><strong>Mother 
        Details</strong></font></td>
    </tr>
    <tr> 
      <td nowrap bordercolor="#FFFFFF"><font color="#FF9966">Father Name</font></td>
      <td nowrap bordercolor="#FFFFFF"> <font color="#FF9966"> 
        <input type="text" name="textfield3">
        </font><font color="#0033FF"> <font color="#FF0000">*</font></font><font color="#FF9966">&nbsp; 
        </font></td>
      <td nowrap bordercolor="#FFFFFF"><font color="#FF3366">Mother Name</font></td>
      <td nowrap bordercolor="#FFFFFF"> <font color="#FF3366"> 
        <input type="text" name="textfield4">
        </font><font color="#0033FF"> <font color="#FF0000">*</font></font><font color="#FF3366">&nbsp; 
        </font></td>
    </tr>
    <tr> 
      <td nowrap bordercolor="#FFFFFF"><font color="#FF9966">Qualification</font></td>
      <td nowrap bordercolor="#FFFFFF"> <font color="#FF9966"> 
        <input type="text" name="textfield5">
        </font></td>
      <td nowrap bordercolor="#FFFFFF"><font color="#FF3366">Qualification</font></td>
      <td nowrap bordercolor="#FFFFFF"> <font color="#FF3366"> 
        <input type="text" name="textfield6">
        </font></td>
    </tr>
    <tr> 
      <td nowrap bordercolor="#FFFFFF"><font color="#FF9966">Designation</font></td>
      <td nowrap bordercolor="#FFFFFF"><font color="#FF9966"> 
        <input type="text" name="textfield8">
        </font></td>
      <td nowrap bordercolor="#FFFFFF"><font color="#FF3366">Designation</font></td>
      <td nowrap bordercolor="#FFFFFF"><font color="#FF3366"> 
        <input type="text" name="textfield9">
        </font></td>
    </tr>
    <tr bordercolor="#0066CC"> 
      <td colspan="4"><strong><font color="#009933" face="Courier New, Courier, mono">Fee 
        Details </font></strong></td>
    </tr>
    <tr> 
      <td bordercolor="#666666">&nbsp;</td>
      <td bordercolor="#666666">&nbsp;</td>
      <td bordercolor="#666666">&nbsp;</td>
      <td bordercolor="#666666">&nbsp;</td>
    </tr>
  </table>
  </form>
<p align="center"><strong><font color="#FF0000" face="Courier New, Courier, mono"></font></strong></p>
</body>
</html>
