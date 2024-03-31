import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import java.sql.DriverManager;
public class Conn {
  Connection c;
  Statement s;
  public Conn(){
    try{

c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","Equality@1#2");
s=c.createStatement();
    }catch (Exception e){
      System.out.println(e);
    }
  }
}
