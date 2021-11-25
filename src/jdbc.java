import java.sql.*;

public class jdbc {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        //oracle.jdbc.oracledriver
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306","root","" );
        Statement s= con.createStatement();
        ResultSet rs=s.executeQuery("select * from student");
        while (rs.next()){
            System.out.println(rs.getInt("Rollno"+" "+rs.getString("2")));
        }
        con.close();
    }
}