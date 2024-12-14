package CrudeTestJbdc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JdbcConnectionMysql {
    public static void main(String[] args) {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establish a connection to the database
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "admin");
            // Create a statement object
            Statement st = con.createStatement();

            // Execute SQL query to create the table
//            String createTableSQL = "CREATE TABLE employee (" +
//                    "ebn INT(3), " +
//                    "ename VARCHAR(10), " +
//                    "salary FLOAT(4)" +
//                    ")";
//            st.execute(createTableSQL);
            
            
            //INSERT RECORDS
            st.executeUpdate("INSERT INTO employee VALUES (666, 'marlos', 7779800)");
            st.executeUpdate("INSERT INTO employee VALUES (777, 'ted', 888800)");
            st.executeUpdate("INSERT INTO employee VALUES (888, 'pete', 99900)");

            

            System.out.println("Table created successfully");
         
            
            //Update Records
           // int n = st.executeUpdate("UPDATE employee SET salary = 1200 WHERE ebn = 101");
            //System.out.println(n + " records updated.");
            
            //Delete Records
            //int n = st.executeUpdate("DELETE FROM employee WHERE salary = 1200");
            //System.out.println(n + " rows deleted.");
            
            
//            //Displayed Records
//            ResultSet rs = st.executeQuery("Select + from employee");
//            while (rs.next());
//            {
//            	System.out.print(rs.getInt("ebn"+ " "+ rs.getString("ename")+ ""+rs.getFloat(3))); //Float is colum number
//            	
//            }

            // Close statement and connection
            st.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
