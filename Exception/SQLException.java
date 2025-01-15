import java.sql.*;

class TestSQLException{
	public static void main(){
		try{
			Connection con=DriverManager.getConnection("url","user", "password");
		}
		catch(SQLException e){
			System.out.println("Exception occurs: "+ e.getMessage());
		}
	}
}