package Model;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class InsertPatient extends HttpServlet {
    
    
  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
           
        }
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
            response.setContentType("text/html;charset=UTF-8");
            Connection con=null;
            PreparedStatement pst;
            PrintWriter out = response.getWriter();
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Insert Patient details</title>");            
            out.println("</head>");
            out.println("<body>");
            String nm=request.getParameter("usrna");
            String add=request.getParameter("addr");
            String cont=request.getParameter("con");
            String em=request.getParameter("em");
            String pgen=request.getParameter("gen");
            String pb=request.getParameter("prob");
            Integer page=Integer.parseInt(request.getParameter("age"));
            
            try
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                con = DriverManager.getConnection("jdbc:sqlserver://;databaseName=userdata","sa","faculty");   
                String sql="insert into patient_data values(?,?,?,?,?,?,?)";
                pst=con.prepareStatement(sql);
                pst.setString(1,nm);
                pst.setString(2,add);
                pst.setString(3,cont);
                pst.setString(4,em);
                pst.setString(5,pgen);
                pst.setString(6,pb);
                pst.setInt(7,page);
                pst.executeUpdate();
                out.println("Registered successfully");
                pst.close();
                con.close(); 
                out.println("</body>");
                out.println("</html>");
            }
               
                
                
               
                
                
//             Statement s= con.createStatement();
//                ResultSet rs= s.executeQuery("select Email from patient_data");
//                
//               
//                while(rs.next())
//                {
//                String e=rs.getString(4);
//                   
////                if(e.equals("em"))
//                 if(rs.getString("Email")== em.toString())
//                {
//                    out.println("Already exists!");
//                }
//                
//                else
//                {
//               
//                }
//            
                
            

             
                
              
           //Statement s= con.createStatement();
          
                 
           
            
        
            catch(Exception e)
            {
                out.println(e);
            }
    }
    }


    
    