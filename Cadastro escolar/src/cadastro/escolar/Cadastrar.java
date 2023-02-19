/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cadastro.escolar;

import DAO.UsuarioDAOCD;
import Model.Usuario;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author bibop
 */
public class Cadastrar extends javax.swing.JFrame {

    String genero;
    String resposta;
    String[] poss={"Voltar","Criar outra conta"};
    public Cadastrar() {
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
            jTextField1 = new javax.swing.JTextField();
            jLabel2 = new javax.swing.JLabel();
            jTextField2 = new javax.swing.JTextField();
            jLabel3 = new javax.swing.JLabel();
            jTextField4 = new javax.swing.JTextField();
            jLabel4 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            jTextField9 = new javax.swing.JTextField();
            jLabel10 = new javax.swing.JLabel();
            jTextField10 = new javax.swing.JTextField();
            jTextField11 = new javax.swing.JTextField();
            jLabel11 = new javax.swing.JLabel();
            jLabel12 = new javax.swing.JLabel();
            jButton1 = new javax.swing.JButton();
            jLabel5 = new javax.swing.JLabel();
            jButton2 = new javax.swing.JButton();
            jPasswordField1 = new javax.swing.JPasswordField();
            jButton3 = new javax.swing.JButton();
            jButton4 = new javax.swing.JButton();
            jLabel7 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
            setPreferredSize(new java.awt.Dimension(800, 600));
            getContentPane().setLayout(null);

            jLabel1.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
            jLabel1.setText("Nome");
            getContentPane().add(jLabel1);
            jLabel1.setBounds(160, 120, 190, 33);

            jTextField1.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
            jTextField1.setMinimumSize(new java.awt.Dimension(64, 38));
            jTextField1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextField1ActionPerformed(evt);
                  }
            });
            getContentPane().add(jTextField1);
            jTextField1.setBounds(160, 160, 190, 37);

            jLabel2.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
            jLabel2.setText("RM");
            getContentPane().add(jLabel2);
            jLabel2.setBounds(160, 220, 190, 28);

            jTextField2.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
            jTextField2.setMinimumSize(new java.awt.Dimension(64, 38));
            jTextField2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextField2ActionPerformed(evt);
                  }
            });
            getContentPane().add(jTextField2);
            jTextField2.setBounds(160, 250, 190, 37);

            jLabel3.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
            jLabel3.setText("Sexo");
            getContentPane().add(jLabel3);
            jLabel3.setBounds(160, 300, 190, 28);

            jTextField4.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
            jTextField4.setMinimumSize(new java.awt.Dimension(64, 38));
            jTextField4.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jTextField4ActionPerformed(evt);
                  }
            });
            getContentPane().add(jTextField4);
            jTextField4.setBounds(160, 410, 140, 40);

            jLabel4.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
            jLabel4.setText("Idade");
            getContentPane().add(jLabel4);
            jLabel4.setBounds(160, 380, 190, 31);

            jLabel9.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
            jLabel9.setText("CPF");
            getContentPane().add(jLabel9);
            jLabel9.setBounds(450, 120, 60, 33);

            jTextField9.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
            jTextField9.setMinimumSize(new java.awt.Dimension(64, 38));
            getContentPane().add(jTextField9);
            jTextField9.setBounds(450, 160, 206, 37);

            jLabel10.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
            jLabel10.setText("CEP");
            getContentPane().add(jLabel10);
            jLabel10.setBounds(450, 220, 272, 28);

            jTextField10.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
            jTextField10.setMinimumSize(new java.awt.Dimension(64, 38));
            getContentPane().add(jTextField10);
            jTextField10.setBounds(450, 250, 206, 37);

            jTextField11.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
            jTextField11.setMinimumSize(new java.awt.Dimension(64, 38));
            getContentPane().add(jTextField11);
            jTextField11.setBounds(450, 330, 206, 37);

            jLabel11.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
            jLabel11.setText("Email");
            getContentPane().add(jLabel11);
            jLabel11.setBounds(450, 300, 272, 28);

            jLabel12.setFont(new java.awt.Font("Sitka Banner", 1, 24)); // NOI18N
            jLabel12.setText("Senha");
            getContentPane().add(jLabel12);
            jLabel12.setBounds(450, 380, 272, 31);

            jButton1.setBackground(new java.awt.Color(255, 255, 255));
            jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
            jButton1.setText("Criar");
            getContentPane().add(jButton1);
            jButton1.setBounds(410, 470, 86, 31);
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton1ActionPerformed(evt);
                  }
            });

            jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
            jLabel5.setText("Criar Conta");
            getContentPane().add(jLabel5);
            jLabel5.setBounds(330, 50, 156, 36);

            jButton2.setBackground(new java.awt.Color(255, 255, 255));
            jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
            jButton2.setText("Voltar");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton2ActionPerformed(evt);
                  }
            });
            getContentPane().add(jButton2);
            jButton2.setBounds(280, 470, 90, 31);

            jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jPasswordField1.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jPasswordField1ActionPerformed(evt);
                  }
            });
            getContentPane().add(jPasswordField1);
            jPasswordField1.setBounds(450, 410, 206, 42);

            jButton3.setBackground(new java.awt.Color(102, 204, 255));
            jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jButton3.setText("M");
            jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            getContentPane().add(jButton3);
            jButton3.setBounds(160, 330, 90, 40);
            jButton3.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton3ActionPerformed(evt);
                  }
            });

            jButton4.setBackground(new java.awt.Color(255, 102, 255));
            jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            jButton4.setText("F");
            jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
            getContentPane().add(jButton4);
            jButton4.setBounds(260, 330, 90, 40);
            jButton4.addActionListener(new java.awt.event.ActionListener() {
                  public void actionPerformed(java.awt.event.ActionEvent evt) {
                        jButton4ActionPerformed(evt);
                  }
            });

            jLabel7.setBackground(new java.awt.Color(255, 255, 255));
            jLabel7.setOpaque(true);
            getContentPane().add(jLabel7);
            jLabel7.setBounds(150, 50, 510, 460);

            jLabel6.setBackground(new java.awt.Color(255, 255, 255));
            jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cadastro/escolar/fundo.jpg"))); // NOI18N
            jLabel6.setText("jLabel6");
            getContentPane().add(jLabel6);
            jLabel6.setBounds(0, -30, 800, 590);

            setSize(new java.awt.Dimension(816, 567));
            setLocationRelativeTo(null);
      }// </editor-fold>//GEN-END:initComponents

    
    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Login a1 = new Login();
        a1.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jPasswordField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1ActionPerformed
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        genero="Masc";
        jButton3.setBackground(new java.awt.Color(73, 243, 209));
        jButton4.setBackground(new java.awt.Color(255, 102, 255));
    }   
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        genero="Femn";
        jButton4.setBackground(new java.awt.Color(73, 243, 209));
        jButton3.setBackground(new java.awt.Color(102, 204, 255));
    }   
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
     
                Usuario Aluno = new Usuario();
                 Aluno.setNome(jTextField1.getText());
                 Aluno.setCPF(jTextField9.getText());
                 Aluno.setCEP(jTextField10.getText());
                 Aluno.setRM(jTextField2.getText());
                 Aluno.setEmail(jTextField11.getText());
                 Aluno.setIdade(jTextField4.getText());
                 Aluno.setSenha(jPasswordField1.getText());
                 Aluno.setSexo(genero);
                 System.out.println("Cadastro criado, sabe muito");
                
                 
            UsuarioDAOCD usuarioDAO = new UsuarioDAOCD();
            try {                   
                    usuarioDAO.Adicionar(Aluno);
                    
                } catch (SQLException ex) {
                    
                }
            resposta = (String)JOptionPane.showInputDialog(null,"Cadastro Criado com Sucesso","Criado",JOptionPane.QUESTION_MESSAGE,  null,poss,poss[0] );
            if(resposta == "Voltar"){
                 Login a1 = new Login();
                 a1.setVisible(true);
                 setVisible(false); 
            }
            else{
                  jTextField1.setText("");
                  jTextField10.setText("");
                  jTextField11.setText("");
                  jTextField2.setText("");
                  jTextField4.setText("");
                  jTextField9.setText("");
                  jPasswordField1.setText("");
                  jButton4.setBackground(new java.awt.Color(255, 102, 255));
                  jButton3.setBackground(new java.awt.Color(102, 204, 255));
                  genero = "";
            }
              
                }
       

              
                                            

                                           

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
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastrar().setVisible(true);
            }
        });
    }

      // Variables declaration - do not modify//GEN-BEGIN:variables
      private javax.swing.JButton jButton1;
      private javax.swing.JButton jButton2;
      private javax.swing.JButton jButton3;
      private javax.swing.JButton jButton4;
      private javax.swing.JLabel jLabel1;
      private javax.swing.JLabel jLabel10;
      private javax.swing.JLabel jLabel11;
      private javax.swing.JLabel jLabel12;
      private javax.swing.JLabel jLabel2;
      private javax.swing.JLabel jLabel3;
      private javax.swing.JLabel jLabel4;
      private javax.swing.JLabel jLabel5;
      private javax.swing.JLabel jLabel6;
      private javax.swing.JLabel jLabel7;
      private javax.swing.JLabel jLabel9;
      private javax.swing.JPasswordField jPasswordField1;
      private javax.swing.JTextField jTextField1;
      private javax.swing.JTextField jTextField10;
      private javax.swing.JTextField jTextField11;
      private javax.swing.JTextField jTextField2;
      private javax.swing.JTextField jTextField4;
      private javax.swing.JTextField jTextField9;
      // End of variables declaration//GEN-END:variables
    
    
    

}
