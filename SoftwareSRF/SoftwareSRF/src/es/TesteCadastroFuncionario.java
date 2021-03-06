/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es;

import es.funcoes.Conexao;
import es.funcoes.ValidaCPF;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author Jean
 */
public class TesteCadastroFuncionario extends javax.swing.JInternalFrame {

    /**
     * Creates new form TesteCadastroFuncionario
     */
    public TesteCadastroFuncionario() throws ParseException, SQLException {
        initComponents();
        setFrameIcon(new ImageIcon(this.getClass().getResource("/es/imagens/logomt16.png")));

        MaskFormatter maskData = new MaskFormatter("###########");
        maskData.install(cpfCT);
        maskData = new MaskFormatter("(##)#####-####");
        maskData.install(telefoneCT);

        Conexao.Conectar();
        String sql = "select descricao from projetosrf.funcao";
        PreparedStatement ps = Conexao.con.prepareStatement(sql);
        ps.executeQuery();
        ResultSet rs = ps.getResultSet();
        while (rs.next()) {
            funcaoCB.addItem(rs.getString("descricao"));
        }
        funcaoCB.updateUI();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        painelBotoes = new javax.swing.JPanel();
        LabelNome = new javax.swing.JLabel();
        LabelCPF = new javax.swing.JLabel();
        LabelRua = new javax.swing.JLabel();
        LabelCidade = new javax.swing.JLabel();
        LabelNascimento = new javax.swing.JLabel();
        LabemComplemento = new javax.swing.JLabel();
        LabelTelefone = new javax.swing.JLabel();
        nomeCT = new javax.swing.JTextField();
        ruaCT = new javax.swing.JTextField();
        cidadeCT = new javax.swing.JTextField();
        complementoCT = new javax.swing.JTextField();
        numeroCT = new javax.swing.JTextField();
        calendarioJC = new com.toedter.calendar.JCalendar();
        LabelFuncao = new javax.swing.JLabel();
        funcaoCB = new javax.swing.JComboBox<>();
        cadastrar = new javax.swing.JButton();
        cpfCT = new javax.swing.JFormattedTextField();
        LabelBairro = new javax.swing.JLabel();
        bairroCT = new javax.swing.JTextField();
        LabelNumero = new javax.swing.JLabel();
        telefoneCT = new javax.swing.JFormattedTextField();
        cancelar = new javax.swing.JButton();
        Automatico = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de Funcionário");

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        LabelNome.setText("Nome:");

        LabelCPF.setText("CPF:");

        LabelRua.setText("Rua:");

        LabelCidade.setText("Cidade:");

        LabelNascimento.setText("Nascimento:");

        LabemComplemento.setText("Complemento:");

        LabelTelefone.setText("Telefone:");

        LabelFuncao.setText("Função:");

        cadastrar.setText("Cadastrar");
        cadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarActionPerformed(evt);
            }
        });

        LabelBairro.setText("Bairro:");

        LabelNumero.setText("Número:");

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        Automatico.setText("Auto-Preencher");
        Automatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutomaticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelBotoesLayout = new javax.swing.GroupLayout(painelBotoes);
        painelBotoes.setLayout(painelBotoesLayout);
        painelBotoesLayout.setHorizontalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelCPF)
                            .addComponent(LabelRua)
                            .addComponent(LabelNome)
                            .addComponent(LabelFuncao)
                            .addComponent(LabelCidade)
                            .addComponent(LabelTelefone)
                            .addComponent(LabelBairro)
                            .addComponent(LabelNumero))
                        .addGap(27, 27, 27)
                        .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelBotoesLayout.createSequentialGroup()
                                .addComponent(numeroCT, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabemComplemento)
                                .addGap(18, 18, 18)
                                .addComponent(complementoCT))
                            .addComponent(bairroCT)
                            .addComponent(nomeCT)
                            .addComponent(cpfCT)
                            .addComponent(ruaCT)
                            .addComponent(cidadeCT, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelBotoesLayout.createSequentialGroup()
                                .addComponent(funcaoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(painelBotoesLayout.createSequentialGroup()
                                .addComponent(telefoneCT, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabelNascimento)
                                .addGap(18, 18, 18)
                                .addComponent(calendarioJC, javax.swing.GroupLayout.PREFERRED_SIZE, 315, Short.MAX_VALUE))))
                    .addGroup(painelBotoesLayout.createSequentialGroup()
                        .addComponent(Automatico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cadastrar)))
                .addGap(30, 30, 30))
        );

        painelBotoesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cadastrar, cancelar});

        painelBotoesLayout.setVerticalGroup(
            painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelBotoesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(funcaoCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelFuncao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomeCT)
                    .addComponent(LabelNome))
                .addGap(13, 13, 13)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelCPF))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ruaCT)
                    .addComponent(LabelRua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabemComplemento)
                    .addComponent(complementoCT)
                    .addComponent(LabelNumero)
                    .addComponent(numeroCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBairro)
                    .addComponent(bairroCT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cidadeCT)
                    .addComponent(LabelCidade))
                .addGap(12, 12, 12)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LabelTelefone)
                        .addComponent(telefoneCT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(LabelNascimento))
                    .addComponent(calendarioJC, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cancelar)
                        .addComponent(Automatico))
                    .addComponent(cadastrar))
                .addGap(73, 73, 73))
        );

        painelBotoesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cadastrar, cancelar});

        jScrollPane1.setViewportView(painelBotoes);

        jTabbedPane1.addTab("Funcionário", jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("funcionario");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarActionPerformed

        if (nomeCT.getText().length() > 0 && cpfCT.getText().length() > 0 && ruaCT.getText().length() > 0 && numeroCT.getText().length() > 0
                && complementoCT.getText().length() > 0 && bairroCT.getText().length() > 0 && cidadeCT.getText().length() > 0) {
            boolean validacpf = ValidaCPF.isCPF(cpfCT.getText());
            if (validacpf == false) {
                JOptionPane.showMessageDialog(null, "CPF Inválido!");
                return;
            }

            Pattern pattern = Pattern.compile("\\([0-9]{2}?\\)[0-9]{5}?\\-[0-9]{4}?");
            Matcher matcher = pattern.matcher(telefoneCT.getText());
            if (matcher.find()) {
            } else {
                JOptionPane.showMessageDialog(null, "Campo " + LabelTelefone.getText() + " inválido!");
                return;
            }

            pattern = Pattern.compile("[0-9]{1,6}");
            matcher = pattern.matcher(numeroCT.getText());
            if (matcher.find()) {
            } else {
                JOptionPane.showMessageDialog(null, "Campo " + LabelNumero.getText() + " inválido!");
                return;
            }

            pattern = Pattern.compile("[a-z]");
            matcher = pattern.matcher(nomeCT.getText());
            if (matcher.find()) {
            } else {
                JOptionPane.showMessageDialog(null, "Campo " + LabelNome.getText() + " inválido!");
                return;
            }

            matcher = pattern.matcher(ruaCT.getText());
            if (matcher.find()) {
            } else {
                JOptionPane.showMessageDialog(null, "Campo " + LabelRua.getText() + " inválido!");
                return;
            }

            matcher = pattern.matcher(bairroCT.getText());
            if (matcher.find()) {
            } else {
                JOptionPane.showMessageDialog(null, "Campo " + LabelBairro.getText() + " inválido!");
                return;
            }

            matcher = pattern.matcher(cidadeCT.getText());
            if (matcher.find()) {
            } else {
                JOptionPane.showMessageDialog(null, "Campo " + LabelCidade.getText() + " inválido!");
                return;
            }

            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            String Data = formatador.format(calendarioJC.getDate());

            String sql = "INSERT INTO `funcionario`(`cpf`, `id_func`, `nome`, `endereco`, `numerocasa`, `complemento`, `bairro`, `cidade`, `telefone`, `nascimento`) "
                    + "VALUES ('" + cpfCT.getText() + "','" + funcaoCB.getSelectedIndex() + 1 + "','" + nomeCT.getText() + "','" + ruaCT.getText() + "','" + numeroCT.getText() + "','" + complementoCT.getText() + "','" + bairroCT.getText() + "','" + cidadeCT.getText() + "','" + telefoneCT.getText() + "','" + Data + "')";

            PreparedStatement ps;
            try {
                ps = Conexao.con.prepareStatement(sql);
                ps.executeUpdate();
                ps.close();
            } catch (SQLException ex) {
                Logger.getLogger(TesteCadastroPaciente.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Há campos vazios!");
            return;
        }
        JOptionPane.showMessageDialog(null, "Funcionário" + nomeCT.getText() + " Cadastrado com sucesso!");
        dispose();
    }//GEN-LAST:event_cadastrarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void AutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutomaticoActionPerformed
        nomeCT.setText("Teobaldo");
        cpfCT.setText(geraCPF());
        ruaCT.setText("presidente vargas");
        numeroCT.setText("2850");
        complementoCT.setText("casa");
        cidadeCT.setText("Bagé");
        bairroCT.setText("Centro");
        telefoneCT.setText("53999999999");
        
        String data= "02/07/1990";
        DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
        Date date = null; 
        try {
            date = (java.util.Date)formatter.parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(TesteCadastroFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
        calendarioJC.setDate(date);
        
    }//GEN-LAST:event_AutomaticoActionPerformed

    private static String calcDigVerif(String num) {
        Integer primDig, segDig;
        int soma = 0, peso = 10;
        for (int i = 0; i < num.length(); i++) {
            soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;
        }
        if (soma % 11 == 0 | soma % 11 == 1) {
            primDig = new Integer(0);
        } else {
            primDig = new Integer(11 - (soma % 11));
        }
        soma = 0;
        peso = 11;
        for (int i = 0; i < num.length(); i++) {
            soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;
        }
        soma += primDig.intValue() * 2;
        if (soma % 11 == 0 | soma % 11 == 1) {
            segDig = new Integer(0);
        } else {
            segDig = new Integer(11 - (soma % 11));
        }
        return primDig.toString() + segDig.toString();
    }

    public static String geraCPF() {
        String iniciais = "";
        Integer numero;
        for (int i = 0; i < 9; i++) {
            numero = new Integer((int) (Math.random() * 10));
            iniciais += numero.toString();
        }
        return iniciais + calcDigVerif(iniciais);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Automatico;
    private javax.swing.JLabel LabelBairro;
    private javax.swing.JLabel LabelCPF;
    private javax.swing.JLabel LabelCidade;
    private javax.swing.JLabel LabelFuncao;
    private javax.swing.JLabel LabelNascimento;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelNumero;
    private javax.swing.JLabel LabelRua;
    private javax.swing.JLabel LabelTelefone;
    private javax.swing.JLabel LabemComplemento;
    private javax.swing.JTextField bairroCT;
    private javax.swing.JButton cadastrar;
    private com.toedter.calendar.JCalendar calendarioJC;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cidadeCT;
    private javax.swing.JTextField complementoCT;
    private javax.swing.JFormattedTextField cpfCT;
    private javax.swing.JComboBox<String> funcaoCB;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nomeCT;
    private javax.swing.JTextField numeroCT;
    private javax.swing.JPanel painelBotoes;
    private javax.swing.JTextField ruaCT;
    private javax.swing.JFormattedTextField telefoneCT;
    // End of variables declaration//GEN-END:variables

}
