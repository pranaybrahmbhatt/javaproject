package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("    function Validate() {\n");
      out.write("        alert(\"Hello\");\n");
      out.write("        var password;\n");
      out.write("        password= document.getElementById(\"Password1\").value;\n");
      out.write("        alert(password);\n");
      out.write("        var confirm_password;\n");
      out.write("        confirm_password = document.getElementById(\"Confirm_Password1\").value;\n");
      out.write("        if(password!=confirm_password)\n");
      out.write("        {\n");
      out.write("            alert(\"Pasword Mismatch\");\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            return true;\n");
      out.write("        }\n");
      out.write("        //return true;\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("        <h3 style='text-align:center'>Doctor Registration</h3>\n");
      out.write("         <form method=\"post\" action=\"userregister\">\n");
      out.write("            <table border=\"0\">\n");
      out.write("                \n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Enter Name</td>\n");
      out.write("                        <td><input type=\"text\" name=\"Name\" size=\"20\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Enter Address</td>\n");
      out.write("                        <td><input type=\"text\" name=\"Address\" size=\"20\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Enter Contact</td>\n");
      out.write("                        <td><input type=\"tel\" name=\"Contact\" size=\"20\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Specialization</td>\n");
      out.write("                        <td><input type=\"text\" name=\"Role\" size=\"20\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Age</td>\n");
      out.write("                        <td><input type=\"number\"  name=\"Age\" size=\"20\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Gender</td>\n");
      out.write("                        <td><input type=\"text\" name=\"Gender\" size=\"20\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Username</td>\n");
      out.write("                        <td><input type=\"text\" name=\"User_Name\" size=\"20\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Password</td>\n");
      out.write("                        <td><input type=\"password\" id=\"Password1\" name=\"Password\" size=\"20\"/></td>\n");
      out.write("                    </tr>                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Confirm Password</td>\n");
      out.write("                        <td><input type=\"password\" id=\"Confirm_Password1\" name=\"Confirm_Password\" size=\"20\" onchange=\"Validate()\"/></td>\n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("             \n");
      out.write("            <input type=\"reset\" value=\"Reset\" name=\"reset\" />\n");
      out.write("            <input type=\"submit\" value=\"Submit\" name=\"submit\" />\n");
      out.write("        </form>\n");
      out.write("         ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
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
