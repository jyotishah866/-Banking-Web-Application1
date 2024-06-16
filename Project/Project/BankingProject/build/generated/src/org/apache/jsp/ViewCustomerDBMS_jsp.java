package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class ViewCustomerDBMS_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 Connection con ;
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/DBCON.jsp");
    _jspx_dependants.add("/ViewCustomer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<html>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

            try
            {
                Class.forName("com.mysql.jdbc.Driver");
              String connectionURL  = ("jdbc:mysql://localhost:3306/GlobalBankingDB");
                String dbuser="root";
                String dbpass="root";
                
                con = DriverManager.getConnection(connectionURL,dbuser,dbpass);
                
                out.println("Connection Successfull");
            }
            
            catch(Exception e)
            {
                out.print("Connection failed"+e);
                
            }
            
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write('\n');
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <h3 align=\"center\">\n");
      out.write("            \n");
      out.write("            <form action=\"ViewCustomerDBMS.jsp\" method=\"post\">\n");
      out.write("                select <select name=\"choice\">\n");
      out.write("                    <option value=\"all\">all</option>\n");
      out.write("                    <option value=\"customername\">Customer Name</option>\n");
      out.write("                    <option value=\"address\">Address</option>\n");
      out.write("                </select>\n");
      out.write("                <input type=\"text\" name=\"cuschoice\">\n");
      out.write("                <input type=\"submit\" name=\"b1\" value=\"View\">\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("        </h3>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("\n");
      out.write("<html>\n");
      out.write("  \n");
      out.write("    <body>\n");
      out.write("        ");

        
        try{
            String choice = request.getParameter("choice");
            String CustomerViewquery ="";
            
            if(choice.equalsIgnoreCase("customername"))
            {
                String cn = request.getParameter("cuschoice");
                CustomerViewquery ="select * from account where cusname ='"+cn+"'";
            }
            else if(choice.equalsIgnoreCase("address"))
                    {
                        String cn = request.getParameter("cuschoice");
                CustomerViewquery ="select * from account where address ='"+cn+"'";
                    }
            else{
                CustomerViewquery="select * from account";
            }
            Statement stmt = con.createStatement();
                
                ResultSet rs1 = stmt.executeQuery(CustomerViewquery);
                
                while(rs1.next())
                {
                    out.println(" "+rs1.getString(1));
                    out.println(" "+rs1.getString(2));
                    out.println(" "+rs1.getString(3));
                    out.println(" "+rs1.getString(4));
                    out.println(" "+rs1.getString(5));
                    out.println(" "+rs1.getString(6));
                    out.println(" "+rs1.getString(7));
                    out.println(" "+rs1.getString(8));
                   out.println(" <br>");
                }
      
        }
        
            catch(Exception e)
            {
                out.println("data not Found" +e);
            }
         
        
            
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
