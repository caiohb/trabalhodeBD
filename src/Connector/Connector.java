package Connector;

import Windows.ReportWindow;
import exception.InterfaceException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
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
        
        private String driver = "org.postgresql.Driver";
        private String url = "jdbc:postgresql://127.0.0.1:5432/TBMERCADO_LOJA1";
        private String user = "postgres";
        private String pass = "1234";
        
    public void openConnection() {

        try {
            System.setProperty("jdbc.Drivers", driver);
//            Class.forName(driver);
            BufferedReader br = new BufferedReader(new FileReader("config.txt"));
            user = br.readLine();
            pass = br.readLine();
            br.close();
            conn = DriverManager.getConnection(url, user, pass);
            stm = conn.createStatement();
            JOptionPane.showMessageDialog(null, "Conectado ao BD com sucesso");
//        } catch (ClassNotFoundException ex) {
//            JOptionPane.showMessageDialog(null, "Erro de conexão! \n Erro: " + ex.getMessage());
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de conexão! \n Erro: " + e.getMessage());
            throw new InterfaceException();
        }catch (FileNotFoundException file){
            JOptionPane.showMessageDialog(null, "Erro na Leitura do arquivo de configuração! \n Erro: " + file.getMessage());
            throw new InterfaceException();
        }catch(IOException io){
            JOptionPane.showMessageDialog(null, "Erro na Leitura do arquivo de configuração! \n Erro: " + io.getMessage());
            throw new InterfaceException();
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
