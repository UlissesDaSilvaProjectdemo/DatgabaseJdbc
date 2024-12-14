package InsertRecordsSystemIn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class InsertRecords {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter employee number: ");
       
        int enb =s.nextInt();
        System.out.println("Enter employee name: ");
        
        String ename =s.next();
        System.out.println("Enter employee salary: ");
        float salary =s.nextFloat();
        
        
        
    	
    	
    	try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "admin");
            PreparedStatement st = con.prepareStatement("insert into employee value (?,?,?)");
            
            st.setInt(1, enb);
            st.setString(2, ename);
            st.setFloat(3, salary);
            st.executeUpdate();
            System.out.println("Records Inserted");
            

            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
