/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Connector.Connector;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author caio.bar
 */
public class ReportWindow extends javax.swing.JFrame {
    private PrincipalWindow previousWindow;
    Connector conn = new Connector();
    
    
    public ReportWindow() {
        initComponents();
    }
    
    public ReportWindow(PrincipalWindow previousWindow){
        this();
        this.previousWindow = previousWindow;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cancelar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatórios");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        jButton1.setText("Acumulado Produto Dia");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Top 10 Produtos (Acumulado)");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Top 10 Produtos (Diário)");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Down 10 Produtos (Acumulado)");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Down 10 Produtos (Diário)");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Acumulado Produto Ranking");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Top 10 Cat. Produto (Diário)");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Down 10 Cat. Produto (Diário)");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Top 10 Cat. Produto (Acum.)");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Down 10 Cat. Produto (Acum.)");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton9)
                    .addComponent(jButton10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(cancelar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        previousWindow.toFront();
        previousWindow.setEnabled(true);
    }//GEN-LAST:event_formWindowClosed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        this.dispose();
        previousWindow.toFront();
        previousWindow.setEnabled(true);
    }//GEN-LAST:event_cancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            previousWindow.connect.executeSQL(
                    "SELECT DISTINCT JANELA.\"DATA_VENDA\" AS \"DATA_VENDA\", \"QUANTIDADE_TOTAL_PRODUTO_DIA\",\n" +
"\"QUANTIDADE_TOTAL_PRODUTO_DIA\"/SUM(\"QUANTIDADE_TOTAL_PRODUTO_DIA\") OVER () * 100   AS PORCENTAGEM \n" +
"  FROM JANELA_QUANTIDADE JANELA\n" +
"  ORDER BY JANELA.\"DATA_VENDA\"");
            JRResultSetDataSource reportResult = new JRResultSetDataSource(previousWindow.connect.rs);
            Map parametros = new HashMap();
            parametros.put("REPORT_CONNECTION", previousWindow.connect.conn);
            JasperPrint jpPrint = JasperFillManager.fillReport("Topicos_BD/ACUMULADO_PRODUTO_DIA.jasper", parametros , reportResult);
            
            JasperViewer jv = new JasperViewer(jpPrint, false);
            //jv.setVisible(true);
            JasperViewer.viewReport(jpPrint, false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatório! \nErro:" + ex.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    /**
     * Top 10 Produto Acumulado
     * @param evt 
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        try {
        previousWindow.connect.executeSQL(
                    " SELECT PROD.NOME, PROD_ACUM.\"TOTAL_PRODUTO_ACUM\", PROD_ACUM.\"VLR_VENDA\", \"VLR_VENDA\"/PROD_ACUM.\"TOTAL_PRODUTO_ACUM\" AS MEDIA\n" +
"	FROM JANELA_QTDE_PROD_ACUM PROD_ACUM \n" +
"  INNER JOIN PRODUTO PROD\n" +
"  ON PROD.COD_PRODUTO = PROD_ACUM.\"COD_PRODUTO\",\n" +
"	(SELECT \"COD_PRODUTO\", \"TOTAL_PRODUTO_ACUM\", RANK() OVER (ORDER BY \"TOTAL_PRODUTO_ACUM\" DESC) AS RANKING\n" +
"		FROM JANELA_QTDE_PROD_ACUM) SUB\n" +
"	WHERE RANKING <=10\n" +
"	AND SUB.\"COD_PRODUTO\" = PROD_ACUM.\"COD_PRODUTO\"\n" +
"	ORDER BY PROD_ACUM.\"TOTAL_PRODUTO_ACUM\" DESC");
            JRResultSetDataSource reportResult = new JRResultSetDataSource(previousWindow.connect.rs);
            Map parametros = new HashMap();
            parametros.put("REPORT_CONNECTION", previousWindow.connect.conn);
            JasperPrint jpPrint = JasperFillManager.fillReport("Topicos_BD/TOP_10_PRODUTO_ACUMULADO.jasper", parametros , reportResult);
            
            JasperViewer jv = new JasperViewer(jpPrint, false);
            //jv.setVisible(true);
            JasperViewer.viewReport(jpPrint, false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatório! \nErro:" + ex.getMessage());
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed
    /**
     * Top 10 Produto Diário
     * @param evt 
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
              try {
        previousWindow.connect.executeSQL(
                    "SELECT JANELA.\"DATA_VENDA\", P.NOME, JANELA.\"TOTAL_PRODUTO_DIA\", JANELA.\"VLR_VENDA\", JANELA.\"VLR_VENDA\"/JANELA.\"TOTAL_PRODUTO_DIA\" AS MEDIA\n" +
"    FROM JANELA_QUANTIDADE_PRODUTO_DIA JANELA\n" +
"    INNER JOIN PRODUTO AS P\n" +
"    ON P.COD_PRODUTO = JANELA.\"COD_PRODUTO\",\n" +
"    (SELECT \"DATA_VENDA\", \"COD_PRODUTO\", RANK() OVER (PARTITION BY \"DATA_VENDA\" ORDER BY \"TOTAL_PRODUTO_DIA\" DESC) AS PRODUTOS_MAIS_VENDIDOS\n" +
"    FROM JANELA_QUANTIDADE_PRODUTO_DIA) SUB\n" +
"  WHERE PRODUTOS_MAIS_VENDIDOS <=10\n" +
"  AND SUB.\"DATA_VENDA\" = JANELA.\"DATA_VENDA\"\n" +
"  AND SUB.\"COD_PRODUTO\" = JANELA.\"COD_PRODUTO\"\n" +
"  ORDER BY \"DATA_VENDA\", \"TOTAL_PRODUTO_DIA\" DESC, JANELA.\"COD_PRODUTO\"");
            JRResultSetDataSource reportResult = new JRResultSetDataSource(previousWindow.connect.rs);
            Map parametros = new HashMap();
            parametros.put("REPORT_CONNECTION", previousWindow.connect.conn);
            JasperPrint jpPrint = JasperFillManager.fillReport("Topicos_BD/TOP10_PRODUTO_DIARIO.jasper", parametros , reportResult);
            
            JasperViewer jv = new JasperViewer(jpPrint, false);
            //jv.setVisible(true);
            JasperViewer.viewReport(jpPrint, false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatório! \nErro:" + ex.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
        previousWindow.connect.executeSQL(
                    "    SELECT CAT_DIA.\"DATA_VENDA\", CAT.NOM_CATEGORIA_PRODUTO, CAT_DIA.\"TOTAL_CAT_PRODUTO_DIA\", CAT_DIA.\"vlr_venda\"\n" +
"  FROM JANELA_QTDE_CAT_PROD_DIA CAT_DIA\n" +
"  INNER JOIN CATEGORIA_PRODUTO CAT\n" +
"  ON CAT.COD_CATEGORIA_PRODUTO = CAT_DIA.\"COD_CATEGORIA_PRODUTO\",\n" +
"  (SELECT \"DATA_VENDA\", \"COD_CATEGORIA_PRODUTO\", \"TOTAL_CAT_PRODUTO_DIA\",\n" +
"    RANK() OVER (PARTITION BY \"DATA_VENDA\", \"COD_CATEGORIA_PRODUTO\" ORDER BY  \"TOTAL_CAT_PRODUTO_DIA\" DESC, \"COD_CATEGORIA_PRODUTO\") AS RANKING\n" +
"  FROM JANELA_QTDE_CAT_PROD_DIA) SUB\n" +
"  WHERE RANKING <= 10\n" +
"  AND SUB.\"DATA_VENDA\" = CAT_DIA.\"DATA_VENDA\"\n" +
"  AND SUB.\"COD_CATEGORIA_PRODUTO\" = CAT_DIA.\"COD_CATEGORIA_PRODUTO\"\n" +
"  AND SUB.\"TOTAL_CAT_PRODUTO_DIA\" = CAT_DIA.\"TOTAL_CAT_PRODUTO_DIA\"\n" +
"  ORDER BY CAT_DIA.\"DATA_VENDA\", CAT_DIA.\"TOTAL_CAT_PRODUTO_DIA\" DESC");
            JRResultSetDataSource reportResult = new JRResultSetDataSource(previousWindow.connect.rs);
            Map parametros = new HashMap();
            parametros.put("REPORT_CONNECTION", previousWindow.connect.conn);
            JasperPrint jpPrint = JasperFillManager.fillReport("Topicos_BD/TOP_10_CATEGORIA_PRODUTO_DIARIO.jasper", parametros , reportResult);
            
            JasperViewer jv = new JasperViewer(jpPrint, false);
            //jv.setVisible(true);
            JasperViewer.viewReport(jpPrint, false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatório! \nErro:" + ex.getMessage());
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
             try {
        previousWindow.connect.executeSQL(
                    "SELECT CAT.NOM_CATEGORIA_PRODUTO, CAT_PROD_ACUM.\"TOTAL_CAT_PRODUTO_DIA\", CAT_PROD_ACUM.\"VLR_VENDA\"\n" +
"  FROM JANELA_CAT_PROD_ACUM CAT_PROD_ACUM\n" +
"  INNER JOIN CATEGORIA_PRODUTO CAT\n" +
"  ON CAT.COD_CATEGORIA_PRODUTO = CAT_PROD_ACUM.\"COD_CATEGORIA_PRODUTO\",\n" +
"    (SELECT \"COD_CATEGORIA_PRODUTO\", \"TOTAL_CAT_PRODUTO_DIA\", \n" +
"      RANK() OVER (ORDER BY \"TOTAL_CAT_PRODUTO_DIA\" DESC, \"COD_CATEGORIA_PRODUTO\") AS CATEGORIAS_MAIS_VENDIDAS \n" +
"  FROM JANELA_CAT_PROD_ACUM) SUB\n" +
"  WHERE CATEGORIAS_MAIS_VENDIDAS <=10\n" +
"  AND SUB.\"COD_CATEGORIA_PRODUTO\" = CAT_PROD_ACUM.\"COD_CATEGORIA_PRODUTO\"\n" +
"  AND SUB.\"TOTAL_CAT_PRODUTO_DIA\" = CAT_PROD_ACUM.\"TOTAL_CAT_PRODUTO_DIA\"\n" +
"  ORDER BY CAT_PROD_ACUM.\"TOTAL_CAT_PRODUTO_DIA\" DESC");
            JRResultSetDataSource reportResult = new JRResultSetDataSource(previousWindow.connect.rs);
            Map parametros = new HashMap();
            parametros.put("REPORT_CONNECTION", previousWindow.connect.conn);
            JasperPrint jpPrint = JasperFillManager.fillReport("Topicos_BD/TOP_10_CATEGORIA_PRODUTO_ACUMULADO.jasper", parametros , reportResult);
            
            JasperViewer jv = new JasperViewer(jpPrint, false);
            //jv.setVisible(true);
            JasperViewer.viewReport(jpPrint, false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatório! \nErro:" + ex.getMessage());
        }
    }//GEN-LAST:event_jButton9ActionPerformed
   
   /**
    * Down 10 produto Acumulado
    * @param evt 
    */    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
        previousWindow.connect.executeSQL(
                    "SELECT PROD.NOME, PROD_ACUM.\"TOTAL_PRODUTO_ACUM\", PROD_ACUM.\"VLR_VENDA\", \"VLR_VENDA\"/PROD_ACUM.\"TOTAL_PRODUTO_ACUM\" AS MEDIA\n" +
"	FROM JANELA_QTDE_PROD_ACUM PROD_ACUM \n" +
"  INNER JOIN PRODUTO PROD\n" +
"  ON PROD.COD_PRODUTO = PROD_ACUM.\"COD_PRODUTO\",\n" +
"	(SELECT \"COD_PRODUTO\", \"TOTAL_PRODUTO_ACUM\", RANK() OVER (ORDER BY \"TOTAL_PRODUTO_ACUM\") AS RANKING\n" +
"		FROM JANELA_QTDE_PROD_ACUM) SUB\n" +
"	WHERE RANKING <=10\n" +
"	AND SUB.\"COD_PRODUTO\" = PROD_ACUM.\"COD_PRODUTO\"\n" +
"	ORDER BY PROD_ACUM.\"TOTAL_PRODUTO_ACUM\"");
            JRResultSetDataSource reportResult = new JRResultSetDataSource(previousWindow.connect.rs);
            Map parametros = new HashMap();
            parametros.put("REPORT_CONNECTION", previousWindow.connect.conn);
            JasperPrint jpPrint = JasperFillManager.fillReport("Topicos_BD/DOWN_10_PRODUTO_ACUMULADO.jasper", parametros , reportResult);
            
            JasperViewer jv = new JasperViewer(jpPrint, false);
            //jv.setVisible(true);
            JasperViewer.viewReport(jpPrint, false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatório! \nErro:" + ex.getMessage());
        }
    }//GEN-LAST:event_jButton4ActionPerformed
/**
 * Down 10 Produto Diário
 * @param evt 
 */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

         try {
        previousWindow.connect.executeSQL(
                    "SELECT JANELA.\"DATA_VENDA\", P.NOME, JANELA.\"TOTAL_PRODUTO_DIA\", JANELA.\"VLR_VENDA\", JANELA.\"VLR_VENDA\"/JANELA.\"TOTAL_PRODUTO_DIA\" AS MEDIA\n" +
"    FROM JANELA_QUANTIDADE_PRODUTO_DIA JANELA\n" +
"    INNER JOIN PRODUTO P\n" +
"    ON P.COD_PRODUTO = JANELA.\"COD_PRODUTO\",\n" +
"    (SELECT \"DATA_VENDA\", \"COD_PRODUTO\", RANK() OVER (PARTITION BY \"DATA_VENDA\" ORDER BY \"TOTAL_PRODUTO_DIA\", \"COD_PRODUTO\") AS PRODUTOS_MAIS_VENDIDOS\n" +
"    FROM JANELA_QUANTIDADE_PRODUTO_DIA) SUB\n" +
"  WHERE PRODUTOS_MAIS_VENDIDOS <=10\n" +
"  AND SUB.\"DATA_VENDA\" = JANELA.\"DATA_VENDA\"\n" +
"  AND SUB.\"COD_PRODUTO\" = JANELA.\"COD_PRODUTO\"\n" +
"  ORDER BY \"DATA_VENDA\", \"TOTAL_PRODUTO_DIA\", JANELA.\"COD_PRODUTO\"");
            JRResultSetDataSource reportResult = new JRResultSetDataSource(previousWindow.connect.rs);
            Map parametros = new HashMap();
            parametros.put("REPORT_CONNECTION", previousWindow.connect.conn);
            JasperPrint jpPrint = JasperFillManager.fillReport("Topicos_BD/DOWN_10_PRODUTO_DIARIO.jasper", parametros , reportResult);
            
            JasperViewer jv = new JasperViewer(jpPrint, false);
            //jv.setVisible(true);
            JasperViewer.viewReport(jpPrint, false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatório! \nErro:" + ex.getMessage());
        }
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
       try {
        previousWindow.connect.executeSQL(
                    " SELECT CAT.NOM_CATEGORIA_PRODUTO, CAT_PROD_ACUM.\"TOTAL_CAT_PRODUTO_DIA\", CAT_PROD_ACUM.\"VLR_VENDA\"\n" +
"  FROM JANELA_CAT_PROD_ACUM CAT_PROD_ACUM\n" +
"  INNER JOIN CATEGORIA_PRODUTO CAT\n" +
"  ON CAT.COD_CATEGORIA_PRODUTO = CAT_PROD_ACUM.\"COD_CATEGORIA_PRODUTO\",\n" +
"    (SELECT \"COD_CATEGORIA_PRODUTO\", \"TOTAL_CAT_PRODUTO_DIA\", \n" +
"      RANK() OVER (ORDER BY \"TOTAL_CAT_PRODUTO_DIA\" , \"COD_CATEGORIA_PRODUTO\") AS CATEGORIAS_MAIS_VENDIDAS \n" +
"  FROM JANELA_CAT_PROD_ACUM) SUB\n" +
"  WHERE CATEGORIAS_MAIS_VENDIDAS <=10\n" +
"  AND SUB.\"COD_CATEGORIA_PRODUTO\" = CAT_PROD_ACUM.\"COD_CATEGORIA_PRODUTO\"\n" +
"  AND SUB.\"TOTAL_CAT_PRODUTO_DIA\" = CAT_PROD_ACUM.\"TOTAL_CAT_PRODUTO_DIA\"\n" +
"  ORDER BY CAT_PROD_ACUM.\"TOTAL_CAT_PRODUTO_DIA\"");
            JRResultSetDataSource reportResult = new JRResultSetDataSource(previousWindow.connect.rs);
            Map parametros = new HashMap();
            parametros.put("REPORT_CONNECTION", previousWindow.connect.conn);
            JasperPrint jpPrint = JasperFillManager.fillReport("Topicos_BD/DOWN_10_CATEGORIA_PRODUTO_ACUMULADO.jasper", parametros , reportResult);
            
            JasperViewer jv = new JasperViewer(jpPrint, false);
            //jv.setVisible(true);
            JasperViewer.viewReport(jpPrint, false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatório! \nErro:" + ex.getMessage());
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:DOWN_10_CATEGORIA_PRODUTO_DIARIO
        try {
        previousWindow.connect.executeSQL(
                    " SELECT CAT_DIA.\"DATA_VENDA\", CAT.NOM_CATEGORIA_PRODUTO, CAT_DIA.\"TOTAL_CAT_PRODUTO_DIA\", CAT_DIA.\"vlr_venda\"\n" +
"  FROM JANELA_QTDE_CAT_PROD_DIA CAT_DIA\n" +
"  INNER JOIN CATEGORIA_PRODUTO CAT\n" +
"  ON CAT.COD_CATEGORIA_PRODUTO = CAT_DIA.\"COD_CATEGORIA_PRODUTO\",\n" +
"  (SELECT \"DATA_VENDA\", \"COD_CATEGORIA_PRODUTO\", \"TOTAL_CAT_PRODUTO_DIA\",\n" +
"    RANK() OVER (PARTITION BY \"DATA_VENDA\", \"COD_CATEGORIA_PRODUTO\" ORDER BY  \"TOTAL_CAT_PRODUTO_DIA\" , \"COD_CATEGORIA_PRODUTO\") AS RANKING\n" +
"  FROM JANELA_QTDE_CAT_PROD_DIA) SUB\n" +
"  WHERE RANKING <= 10\n" +
"  AND SUB.\"DATA_VENDA\" = CAT_DIA.\"DATA_VENDA\"\n" +
"  AND SUB.\"COD_CATEGORIA_PRODUTO\" = CAT_DIA.\"COD_CATEGORIA_PRODUTO\"\n" +
"  AND SUB.\"TOTAL_CAT_PRODUTO_DIA\" = CAT_DIA.\"TOTAL_CAT_PRODUTO_DIA\"\n" +
"  ORDER BY CAT_DIA.\"DATA_VENDA\", CAT_DIA.\"TOTAL_CAT_PRODUTO_DIA\"");
            JRResultSetDataSource reportResult = new JRResultSetDataSource(previousWindow.connect.rs);
            Map parametros = new HashMap();
            parametros.put("REPORT_CONNECTION", previousWindow.connect.conn);
            JasperPrint jpPrint = JasperFillManager.fillReport("Topicos_BD/DOWN_10_CATEGORIA_PRODUTO_DIARIO.jasper", parametros , reportResult);
            
            JasperViewer jv = new JasperViewer(jpPrint, false);
            //jv.setVisible(true);
            JasperViewer.viewReport(jpPrint, false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatório! \nErro:" + ex.getMessage());
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //acumulado_prod_dia_ranking
        try {
        previousWindow.connect.executeSQL(
                    " SELECT DISTINCT JANELA.\"DATA_VENDA\", \"QUANTIDADE_TOTAL_PRODUTO_DIA\",\n" +
"  \"QUANTIDADE_TOTAL_PRODUTO_DIA\"/SUM(\"QUANTIDADE_TOTAL_PRODUTO_DIA\") OVER () * 100, 2   AS PORCENTAGEM \n" +
"  FROM JANELA_QUANTIDADE JANELA\n" +
"  ORDER BY \"QUANTIDADE_TOTAL_PRODUTO_DIA\" DESC");
            JRResultSetDataSource reportResult = new JRResultSetDataSource(previousWindow.connect.rs);
            Map parametros = new HashMap();
            parametros.put("REPORT_CONNECTION", previousWindow.connect.conn);
            JasperPrint jpPrint = JasperFillManager.fillReport("Topicos_BD/ACUMULADO_PRODUTO_DIA_RANKING.jasper", parametros , reportResult);
            
            JasperViewer jv = new JasperViewer(jpPrint, false);
            //jv.setVisible(true);
            JasperViewer.viewReport(jpPrint, false);
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao chamar o relatório! \nErro:" + ex.getMessage());
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ReportWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    // End of variables declaration//GEN-END:variables
}
