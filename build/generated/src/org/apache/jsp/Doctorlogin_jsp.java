package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Doctorlogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Doctor login</title>\n");
      out.write("    </head>\n");
      out.write("   <style>\n");
      out.write(" body\n");
      out.write("{\n");
      out.write("margin:0;\n");
      out.write("padding:0;\n");
      out.write("background-size:cover;\n");
      out.write("font-family:sans-serif;\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write(".dloginBox\n");
      out.write("{\n");
      out.write("position:absolute;\n");
      out.write("top:60%;\n");
      out.write("left:50%;\n");
      out.write("transform:translate(-50%,-50%);\n");
      out.write("width:350px;\n");
      out.write("height:450px;\n");
      out.write("padding:80px 40px;\n");
      out.write("box-sizing:border-box;\n");
      out.write("background:rgba(0,0,0,.5);\n");
      out.write("}\n");
      out.write("\n");
      out.write("h2\n");
      out.write("{\n");
      out.write("margin:0;\n");
      out.write("padding:0 0 10px;\n");
      out.write("color:#4d88ff;\n");
      out.write("text-align:center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dloginBox input\n");
      out.write("{\n");
      out.write("width:100%;\n");
      out.write("margin-bottom:20px;\n");
      out.write("}\n");
      out.write(".dloginBox input[type=\"text\"],\n");
      out.write(".dloginBox input[type=\"password\"]\n");
      out.write("{\n");
      out.write("border:none;\n");
      out.write("border-bottom:1px solid #fff;\n");
      out.write("background:transparent;\n");
      out.write("outline:none;\n");
      out.write("height:40px;\n");
      out.write("color:#fff;\n");
      out.write("font-size:16px;\n");
      out.write("}\n");
      out.write("::placeholder\n");
      out.write("{\n");
      out.write("color:rgba(255,255,255,.5);\n");
      out.write("}\n");
      out.write(".dloginBox input[type=\"submit\"]\n");
      out.write("{\n");
      out.write("border:none;\n");
      out.write("outline:none;\n");
      out.write("height:40px;\n");
      out.write("color:#fff;\n");
      out.write("font-size:16px;\n");
      out.write("background:#4d88ff;\n");
      out.write("cursor:pointer;\n");
      out.write("border-radius:20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".dloginBox input[type=\"submit\"]:hover\n");
      out.write("{\n");
      out.write("background:aqua;\n");
      out.write("color:#ffffff;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".dloginBox a\n");
      out.write("{\n");
      out.write("color:#fff;\n");
      out.write("font-size:14px;\n");
      out.write("font-weight:bold;\n");
      out.write("text-decoration:none;\n");
      out.write("\n");
      out.write("\n");
      out.write("}\n");
      out.write(".dloginBox input[type=\"checkbox\"]\n");
      out.write("{\n");
      out.write("    \n");
      out.write("margin:0;\n");
      out.write("padding:0;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("  </style>\n");
      out.write("    <script>\n");
      out.write("function display() {\n");
      out.write("    var x = document.getElementById(\"pa\");\n");
      out.write("    if (x.type === \"password\") {\n");
      out.write("        x.type = \"text\";\n");
      out.write("    } else {\n");
      out.write("        x.type = \"password\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("  </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\n");
      out.write("        <div class=\"dloginBox\">\n");
      out.write("        <h2>Doctor Login</h2>\n");
      out.write("        <form action=\"Login\" method=\"post\">\n");
      out.write("\t\t<table>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Username</td> \n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"nm\" placeholder=\"Enter name\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td>Password</td> \n");
      out.write("\t\t\t\t<td><input type=\"password\" name=\"pw\" placeholder=\"Enter password\" id=\"pa\"></td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t<tr>\n");
      out.write("\t\t\t\t<td><input type=\"Submit\" value=\"Login\" /></td>\n");
      out.write("                                <td>Show password<input type=\"checkbox\" onclick=\"display()\"/><td>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<td><a href=\"register.jsp\">Create Account?</a><td></tr>\n");
      out.write("\t\t\t</table>\n");
      out.write("\t\t\t</form>\n");
      out.write("    </div>\n");
      out.write("       \n");
      out.write("\t</body>\n");
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
