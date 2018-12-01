
package Model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
             out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");            
            out.println("</head>");
            out.println("<body>");
            
            String un=request.getParameter("nm");
            String pass=request.getParameter("pw");
            Connection con=null;
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con = DriverManager.getConnection("jdbc:sqlserver://;databaseName=userdata","sa","faculty"); 
           PreparedStatement pst=con.prepareStatement("select User_Name, Password from u_data where User_Name=? and Password=? and status='Valid'");
          pst.setString(1,un);
          pst.setString(2, pass);
           ResultSet rs=pst.executeQuery();
        if(rs.next()) 
        {
           out.println("<h3 style='color:blue'>Welcome "+un+"</h3>"); 
           RequestDispatcher rd=request.getRequestDispatcher("doc_service.jsp"); 
           rd.include(request, response);
           //response.sendRedirect("doc_service.jsp");
        }
        else
        {
//           out.println("<h3 style='color:red'>Invalid login credentials</h3>");
            out.println("<script>alert('Invalid login credentials');</script>");
           RequestDispatcher rd=request.getRequestDispatcher("Doctorlogin.jsp"); 
           rd.include(request, response);
        }
                out.println("</body>");
                out.println("</html>");
                }
                catch(Exception e)
                {
                    out.println(e);
                }
        }
       
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
