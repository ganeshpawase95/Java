package database_console;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;;

class TestSQLException {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("url", "user", "password");
        } catch (SQLException e) {
            System.out.println("Exception occurs: " + e.getMessage());
        }
    }
}
