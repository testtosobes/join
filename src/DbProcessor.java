import java.sql.Connection;
import java.sql.DriverManager;

public class DbProcessor {
    public static Connection getConnection() {
        try {
            Class.forName("org.h2.jdbc.Driver");
            Connection con = DriverManager.getConnection("org.h2:database/test", "root", "");
            return con;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
