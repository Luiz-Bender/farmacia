/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

/**
 *
 * @author user
 */
public class menuprincipal extends javax.swing.JFrame {

    /**
     * Creates new form menuprincipal
     */
    public menuprincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Cadastro = new javax.swing.JMenu();
        Cliente = new javax.swing.JMenuItem();
        serviço = new javax.swing.JMenuItem();
        produtos = new javax.swing.JMenuItem();
        Operação = new javax.swing.JMenu();
        Venda = new javax.swing.JMenuItem();
        Compra = new javax.swing.JMenuItem();
        Relatorios = new javax.swing.JMenu();
        Relatariocompras = new javax.swing.JMenuItem();
        Relatoriovendas = new javax.swing.JMenuItem();
        Relatoriolucro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 600));
        setPreferredSize(new java.awt.Dimension(1000, 733));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/imagens/pharmacies-1.png"))); // NOI18N

        Cadastro.setText("Cadastro");

        Cliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icons/cliente.png"))); // NOI18N
        Cliente.setText("Cliente");
        Cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClienteActionPerformed(evt);
            }
        });
        Cadastro.add(Cliente);

        serviço.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icons/servico.png"))); // NOI18N
        serviço.setText("Serviço");
        Cadastro.add(serviço);

        produtos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icons/produtos.png"))); // NOI18N
        produtos.setText("Produtos");
        Cadastro.add(produtos);

        jMenuBar1.add(Cadastro);

        Operação.setText("Operação");

        Venda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icons/venda.png"))); // NOI18N
        Venda.setText("Venda");
        Venda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VendaActionPerformed(evt);
            }
        });
        Operação.add(Venda);

        Compra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icons/carrinho-de-compras.png"))); // NOI18N
        Compra.setText("Compra");
        Compra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompraActionPerformed(evt);
            }
        });
        Operação.add(Compra);

        jMenuBar1.add(Operação);

        Relatorios.setText("Relatorios");

        Relatariocompras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icons/relatorio de lucro.png"))); // NOI18N
        Relatariocompras.setText("Relatorio de compras");
        Relatorios.add(Relatariocompras);

        Relatoriovendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icons/4230540-analysis-graph-report_115003.png"))); // NOI18N
        Relatoriovendas.setText("Relatorio de vendas");
        Relatorios.add(Relatoriovendas);

        Relatoriolucro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Views/icons/vendas.png"))); // NOI18N
        Relatoriolucro.setText("Relatorio de lucro");
        Relatorios.add(Relatoriolucro);

        jMenuBar1.add(Relatorios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1324, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_VendaActionPerformed

    private void ClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ClienteActionPerformed

    private void CompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CompraActionPerformed

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
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Cadastro;
    private javax.swing.JMenuItem Cliente;
    private javax.swing.JMenuItem Compra;
    private javax.swing.JMenu Operação;
    private javax.swing.JMenuItem Relatariocompras;
    private javax.swing.JMenuItem Relatoriolucro;
    private javax.swing.JMenu Relatorios;
    private javax.swing.JMenuItem Relatoriovendas;
    private javax.swing.JMenuItem Venda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem produtos;
    private javax.swing.JMenuItem serviço;
    // End of variables declaration//GEN-END:variables
}
