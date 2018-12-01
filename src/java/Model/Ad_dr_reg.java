package Model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ad_dr_reg extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Ad_dr_reg</title>");            
            out.println("</head>");
            out.println("<body>");
           Connection con=null;
            try{
           
           int p=Integer.parseInt(request.getParameter("did"));
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con = DriverManager.getConnection("jdbc:sqlserver://;databaseName=userdata","sa","faculty"); 
           PreparedStatement pst=con.prepareStatement("select * from u_data where did=?");
           pst.setInt(1,p);
           ResultSet rs=pst.executeQuery();
            while(rs.next())
                   {
             out.println("<form action='Ad_doc_stat' method='post'>"); 
             out.println("<table> <tr> <td> Doctor Id:</td><td><input type='text' value='"+rs.getInt(1)+"' name='did'/></td></tr>");  
             out.println("<tr> <td> Doctor Name:</td><td><input type='text' value='"+rs.getString(2)+"' name='dname'/></td></tr>"); 
             out.println("<tr> <td> Contact:</td><td><input type='text' value='"+rs.getString(4)+"' name='dcon'/></td></tr>");
             out.println("<tr> <td> Role:</td><td><input type='text' value='"+rs.getString(5)+"' name='rol'/></td></tr>");
             out.println("<tr> <td> Age:</td><td><input type='text' value='"+rs.getInt(6)+"' name='dage'/></td></tr>");       
             out.println("<tr> <td> Gender:</td><td><input type='text' value='"+rs.getString(7)+"' name='dgen'/></td></tr>");      
             out.println("<tr> <td>Status:</td><td><select name='stat'><option value='Valid'>Valid</option><option value='Invalid'>Invalid</option></select></td></tr></table>");
             System.out.println(rs.getString(11));
             out.println("<input type='submit' value='Update'/>");
             out.println("</form>");
                   }
          
   
    }
            catch(Exception e)
            {
                out.println("<b> failed</b>");
                out.println("<b>Error:</b>" +e);
                
            }
         finally{
             con.close();
         }
}
@Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Ad_dr_reg.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Ad_dr_reg.class.getName()).log(Level.SEVERE, null, ex);
        }
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


    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        try {
//            processRequest(request, response);
//        } catch (SQLException ex) {
//            Logger.getLogger(Ad_dr_reg.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        try {
//            processRequest(request, response);
//        } catch (SQLException ex) {
//            Logger.getLogger(Ad_dr_reg.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
    
}
