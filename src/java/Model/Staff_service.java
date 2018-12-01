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

public class Staff_service extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
         Connection con=null;
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Staff Service</title>");            
            out.println("</head>");
            out.println("<body>");
          
            try{
           
           int p=Integer.parseInt(request.getParameter("pid"));
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con = DriverManager.getConnection("jdbc:sqlserver://;databaseName=userdata","sa","faculty"); 
           PreparedStatement pst=con.prepareStatement("select * from patient_record where pid=?");
           pst.setInt(1,p);
           ResultSet rs=pst.executeQuery();
            while(rs.next())
                   {
             out.println("<form action='Payment_status' method='post'>"); 
             out.println("<table> <tr> <td> Patient Id:</td><td><input type='text' value='"+rs.getInt(1)+"' name='pid'></td></tr>");  
             out.println("<tr> <td> Patient Name:</td><td><input type='text' value='"+rs.getString(2)+"' name='pname'></td></tr>"); 
             out.println("<tr> <td> Gender:</td><td><input type='text' value='"+rs.getString(3)+"' name='pgen'></td></tr>");
             out.println("<tr> <td> Problem:</td><td><input type='text' value='"+rs.getString(4)+"' name='prob'></td></tr>");
             out.println("<tr> <td> Age:</td><td><input type='text' value='"+rs.getString(5)+"' name='page'></td></tr>");       
             out.println("<tr> <td>Prescription:</td><td><input type='text' value='"+rs.getString(6)+"' name='Pres'/></td> </tr>");
             out.println("<tr> <td>Appointment date:</td><td><input type='text' value='"+rs.getString(7)+"' name='Appdate'/></td> </tr>");
             out.println("<tr> <td>Amount:</td><td><input type='text' value='"+rs.getString(8)+"' name='amt'/></td> </tr></table>");     
             out.println("<tr> <td>Payment Status:</td><td><select name='stat'><option value='Paid'>Paid</option><option value='Pending'>Pending</option></select></td></tr></table>");
             
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
            Logger.getLogger(Staff_service.class.getName()).log(Level.SEVERE, null, ex);
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
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(Staff_service.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
}
