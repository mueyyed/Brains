//package java;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseDbModel {

    DataSource dataSource;
    Connection dbc;

    private static final String DB_URL = "jdbc:mysql://localhost:3306/booklibrary";
    private static final String USER = "dbadmin";
    private static final String PASS = "dbpassword13213";

    public BaseDbModel() {
        try
        {
            // Context ctx = new InitialContext();
            // You must write the database you will use. Here we use "sample" built-in database.
            // dataSource = (DataSource) ctx.lookup("jdbc/sample");

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());

            dbc = DriverManager.getConnection(DB_URL, USER, PASS);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void prepareDbc() throws SQLException{

        /*try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

        dbc = DriverManager.getConnection(DB_URL, USER, PASS);

        /*
        f ( dataSource == null )
            throw new SQLException( "Unable to obtain DataSource" );

        dbc = dataSource.getConnection();

        if ( dbc == null )
            throw new SQLException( "Unable to connect to DataSource" );
        */
    }
}
