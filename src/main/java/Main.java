import db.DB;
import db.DbException;
import entities.Encurtador;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) {
        try{
            Connection conn = DB.getConnection();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM url_original");

            while (rs.next()) {
                System.out.print("Column 1 returned ");
                System.out.println(rs.getString(1));
            }
            rs.close();
            st.close();

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }

        DB.closeConnection();
    }

}
