package utilities;

import java.sql.DriverManager;

public class manageDB extends commonOps{
    public static void openConnection(String dbURL, String email, String password){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(dbURL, email, password);
            stmt= con.createStatement();
        } catch (Exception e) {
            System.out.println("error occurred while connecting to DB "+ e);;
        }
    }

    public static void closeConnection(){
        try {
            con.close();
        }catch (Exception e) {
            System.out.println("error occurred while closing the DB "+ e);;
        }
    }
}
