
package pr.com.DAO;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class ConexaoDAO {
    public static Connection Conector() {
        java.sql.Connection conexao = null;
        String Driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/bdprojetoLogin";
        String user = "root";
        String password = "root";
        
        try{
            
            Class.forName(Driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Conexao" + e);
            return null;
            
        }
    }
            
}
