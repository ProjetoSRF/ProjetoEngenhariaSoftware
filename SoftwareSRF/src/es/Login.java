package es;

import com.jgoodies.looks.plastic.PlasticLookAndFeel;
import com.jgoodies.looks.plastic.theme.ExperienceRoyale;
import es.funcoes.Conexao;
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author flavi
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();

        setLocationRelativeTo(null); //projela tela centralizada
        setIconImage(new ImageIcon(getClass().getResource("/es/imagens/logomtbranco2.png")).getImage()); //icone da empresa 

        //mudar design da tela
        try {
            PlasticLookAndFeel.setPlasticTheme(new ExperienceRoyale());
            try {
                UIManager.setLookAndFeel("com.jgoodies.looks.windows.WindowsLookAndFeel");
            } catch (InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (ClassNotFoundException ex) {
        }
        SwingUtilities.updateComponentTreeUI(this);

        getRootPane().setDefaultButton(Acessar);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jDesktopPane1 = new javax.swing.JDesktopPane(){

            Image image = new ImageIcon(getClass().getResource("/es/imagens/login.jpg")).getImage();

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }
        }
        ;
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Acessar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/es/imagens/cadeado.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Senha:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Usuário:");

        Acessar.setText("Acessar");
        Acessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcessarActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jPasswordField1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Acessar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(Acessar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(389, Short.MAX_VALUE)))
        );

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPasswordField1, jTextField1});

        jDesktopPane1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2});

        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel2))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(Acessar)
                .addGap(83, 83, 83))
            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(24, Short.MAX_VALUE)))
        );

        jMenu1.setText("Ferramentas");

        jMenuItem1.setText("Restaurar Backup do Banco de Dados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcessarActionPerformed

        String valor = new String(jPasswordField1.getPassword());
        boolean resposta = consultar(jTextField1.getText(), valor);
        if (resposta == true) {
            new TelaInicio().setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Acesso Negado\n");
            return;
        }

    }//GEN-LAST:event_AcessarActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        // Cria campo onde o usuario entra com a senha
        JPasswordField password = new JPasswordField(10);
        password.setEchoChar('*');
        // Cria um rótulo para o campo
        JLabel rotulo = new JLabel("Entre com a senha:");
        // Coloca o rótulo e a caixa de entrada numa JPanel:
        JPanel entUsuario = new JPanel();
        entUsuario.add(rotulo);
        entUsuario.add(password);
        // Mostra o rótulo e a caixa de entrada de password para o usuario fornecer a senha:
        JOptionPane.showMessageDialog(null, entUsuario, "Acesso restrito", JOptionPane.PLAIN_MESSAGE);
        // O programa só prossegue quando o usuário clicar o botao de OK do showMessageDialog. 
        // Captura a senha:
        String valor = new String(password.getPassword());
        System.out.println(valor);

        if (valor.equals("admin")) {
            FileNameExtensionFilter filtro = new FileNameExtensionFilter("Filtro .sql", "sql");
            jFileChooser1.setFileFilter(filtro);
            int returnVal = jFileChooser1.showOpenDialog(this);
            String Caminho;

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                Caminho = jFileChooser1.getSelectedFile().getPath();
                try {
                    FileWriter arq = null;
                    try {
                        arq = new FileWriter("C:\\BACKUPBD\\restaurabackup.bat");
                    } catch (IOException ex) {
                        Logger.getLogger(TelaInicio.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    PrintWriter gravarArq = new PrintWriter(arq);

                    gravarArq.printf("@echo off%n echo Realizando backup do MySQL... %n"
                            + "\"C:\\xampp\\mysql\\bin\\mysql.exe\" -u root -e \"CREATE DATABASE projetosrf\"%n"
                            + "\"C:\\xampp\\mysql\\bin\\mysql.exe\" -u root projetosrf < \"" + Caminho + "\"%n"
                            + "echo");
                    try {
                        arq.close();
                    } catch (IOException ex) {
                        Logger.getLogger(TelaInicio.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    Runtime.getRuntime().exec("\"C:\\BACKUPBD\\restaurabackup.bat\"");

                } catch (IOException ex) {
                    Logger.getLogger(TelaInicio.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "Backup restaurado");
            } else {

            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Acesso negado!");
        }

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    public boolean consultar(String login, String senha) {
        boolean autenticado = false;
        String sql;
        Conexao.Conectar();
        try {
            sql = "SELECT username, password FROM login WHERE username=? and password=?";
            PreparedStatement ps;
            ps = Conexao.con.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs;
            rs = ps.executeQuery();
            if (rs.next()) {
                autenticado = true;
            } else {
                ps.close();
                return autenticado;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ex);
        }
        return autenticado;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                new Login().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Acessar;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
