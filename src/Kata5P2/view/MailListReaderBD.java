package Kata5P2.view;
import Kata5P2.model.Mail;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MailListReaderBD {
    public static List<Mail> read(String fileName){
        List<Mail> result = new ArrayList<>();
        
        String url = "jdbc:sqlite:" + fileName;
        String sql = "SELECT * FROM EMAIL";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet sqlresult = stmt.executeQuery(sql);

            while (sqlresult.next()){
                String domain = sqlresult.getString("direccion");
                domain = domain.split("@")[1];
                result.add(new Mail(domain));
            }
        }

        catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return result;
    }
}

        