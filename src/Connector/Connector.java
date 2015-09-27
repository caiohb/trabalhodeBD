package Connector;

import Windows.ReportWindow;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Statement;
import javax.swing.JOptionPane;
        
public class Connector {
        
        public Connection conn;
        public Statement stm;
        public ResultSet rs;
        
        private String driver = "oracle.jdbc.OracleDriver";
        private String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
        private String user = "barbosac";
        private String pass = "12345";
        
    public void openConnection() {

        try {
            System.setProperty("jdbc.Drivers", driver);
//            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            JOptionPane.showMessageDialog(null, "Conectado ao BD com sucesso");
//        } catch (ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "Erro de conexão! \n Erro: " + ex.getMessage());
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro de conexão! \n Erro: " + e.getMessage());
        }
    }
    
    public void closeConnection(){
            try {
                conn.close();
                JOptionPane.showMessageDialog(null, "Desconectado com sucesso!");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao fechar a conexão! \n Erro: " + ex.getMessage());
            }
    }

    public void executeSQL(String sql){
            try {
                stm = conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
                rs = stm.executeQuery(sql);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Erro ao executar SQL! \n Erro: " + ex.getMessage());
            }
    }
}
