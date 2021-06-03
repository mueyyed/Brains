package brains;//package java;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDbModel {

    DataSource dataSource;
    Connection dbc;

    private static final String DB_URL = "jdbc:mysql://localhost:3306/booklibrary?useTimeZone=true&serverTimezone=UTC&autoReconnect=true&useSSL=false";
    private static final String USER = "dbadmin";
    private static final String PASS = "dbpassword";

    public BaseDbModel() {

    }

    public void prepareDbc(){

        try
        {
            //System.out.println("kokowawa");
            // Context ctx = new InitialContext();
            // You must write the database you will use. Here we use "sample" built-in database.
            // dataSource = (DataSource) ctx.lookup("jdbc/sample");

            //Class.forName("com.mysql.jdbc.Driver");
            //DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            dbc = DriverManager.getConnection(DB_URL, USER, PASS);
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
