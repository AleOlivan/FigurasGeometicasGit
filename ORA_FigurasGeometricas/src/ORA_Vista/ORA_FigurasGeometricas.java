package ORA_Vista;
/* @author Olivan Rojas Alejandra  */
import ORA_Controlador.ORA_Cilindro;
import ORA_Controlador.ORA_Cono;
import ORA_Controlador.ORA_Esfera;
import ORA_Controlador.ORA_Paralelepipedo;

public class ORA_FigurasGeometricas extends javax.swing.JFrame{
  
    public ORA_FigurasGeometricas() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        cbxFigura = new javax.swing.JComboBox<>();
        lblSeleccione = new javax.swing.JLabel();
        lblA = new javax.swing.JLabel();
        lblB = new javax.swing.JLabel();
        lblH = new javax.swing.JLabel();
        lblR = new javax.swing.JLabel();
        lblG = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        txtB = new javax.swing.JTextField();
        txtH = new javax.swing.JTextField();
        txtR = new javax.swing.JTextField();
        txtG = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnCalcular = new javax.swing.JButton();
        lblArea = new javax.swing.JLabel();
        lblVolumen = new javax.swing.JLabel();
        txtArea = new javax.swing.JTextField();
        txtVolumen = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA DE ÁREA Y VOLUMEN");
        setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitulo.setText("Área y Volumen de Figuras Geométricas");

        cbxFigura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIGURA", "Cubo", "Cono", "Esfera", "Cilindro", "Paralelepipedo" }));
        cbxFigura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxFiguraActionPerformed(evt);
            }
        });

        lblSeleccione.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblSeleccione.setText("Seleccione");

        lblA.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblA.setText("Valor A:");

        lblB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblB.setText("Valor B:");

        lblH.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblH.setText("Valor H:");

        lblR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblR.setText("Valor R:");

        lblG.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblG.setText("Valor G:");

        txtA.setEnabled(false);
        txtA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAActionPerformed(evt);
            }
        });

        txtB.setEnabled(false);
        txtB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBActionPerformed(evt);
            }
        });

        txtH.setEnabled(false);
        txtH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHActionPerformed(evt);
            }
        });

        txtR.setEnabled(false);
        txtR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRActionPerformed(evt);
            }
        });

        txtG.setEnabled(false);
        txtG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGActionPerformed(evt);
            }
        });

        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        lblArea.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblArea.setText("ÁREA:");

        lblVolumen.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblVolumen.setText("VOLUMEN:");

        txtArea.setEditable(false);
        txtArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaActionPerformed(evt);
            }
        });

        txtVolumen.setEditable(false);
        txtVolumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolumenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(lblSeleccione))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblG)
                                    .addComponent(lblR)
                                    .addComponent(lblH)
                                    .addComponent(lblB)
                                    .addComponent(lblA))))
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbxFigura, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtA)
                            .addComponent(txtB)
                            .addComponent(txtH)
                            .addComponent(txtR, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtG, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnLimpiar)
                        .addGap(49, 49, 49)
                        .addComponent(btnCalcular)
                        .addGap(24, 24, 24)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(lblArea)
                        .addGap(18, 18, 18)
                        .addComponent(txtArea, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblVolumen)
                        .addGap(18, 18, 18)
                        .addComponent(txtVolumen)))
                .addGap(22, 22, 22))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxFigura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSeleccione, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblA)
                            .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblArea)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblB)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVolumen)
                    .addComponent(txtVolumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblH)
                    .addComponent(txtH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblR)
                    .addComponent(txtR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblG)
                    .addComponent(txtG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCalcular))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void cbxFiguraActionPerformed(java.awt.event.ActionEvent evt) {                                          
          String figuraSeleccionada = cbxFigura.getSelectedItem().toString();
        
        switch (figuraSeleccionada) {
            case "Cubo": {
                txtA.setEnabled(true);
                txtB.setEnabled(false);
                txtH.setEnabled(false);
                txtR.setEnabled(false);
                txtG.setEnabled(false);
            }
            break;
            case "Cilindro": {
                txtA.setEnabled(false);
                txtB.setEnabled(false);
                txtR.setEnabled(true);
                txtH.setEnabled(true);
                txtG.setEnabled(false);
            }
            break;
            case "Esfera": {
                txtR.setEnabled(true);
                txtA.setEnabled(false);
                txtB.setEnabled(false);
                txtH.setEnabled(false);
                txtG.setEnabled(false);
            }
            break;
            case "Cono": {
                txtR.setEnabled(true);
                txtG.setEnabled(true);
                txtH.setEnabled(true);
                txtA.setEnabled(false);
                txtB.setEnabled(false);
            }
            break;
            case "Paralelepipedo": {
                txtA.setEnabled(true);
                txtB.setEnabled(true);
                txtH.setEnabled(true);
                txtR.setEnabled(false);
                txtG.setEnabled(false);
            }
            break;
            case "-----": {
                txtA.setEnabled(false);
                txtB.setEnabled(false);
                txtH.setEnabled(false);
                txtR.setEnabled(false);
                txtG.setEnabled(false);
            }
            break;
            
        }
    }                                         

    private void txtAActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void txtBActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void txtHActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void txtRActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void txtGActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        txtA.setText("");
        txtB.setText("");
        txtH.setText("");
        txtR.setText("");
        txtG.setText("");
        txtArea.setText("");
        txtVolumen.setText("");
    }                                          

    private void txtAreaActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void txtVolumenActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String figuraSeleccionada = cbxFigura.getSelectedItem().toString();
        
        switch (figuraSeleccionada) {
            case "Cubo": {
                double valorA = Double.parseDouble(txtA.getText());
                ORA_Controlador.ORA_Cubo micubo = new ORA_Controlador.ORA_Cubo(valorA);
                txtArea.setText(String.valueOf(micubo.getArea()));
                txtVolumen.setText(String.valueOf(micubo.getVolumen()));
                
            }
            break;
            case "Cilindro": {
                double valorR = Double.parseDouble(txtR.getText());
                double valorH = Double.parseDouble(txtH.getText());
                ORA_Controlador.ORA_Cilindro micilindro = new ORA_Cilindro(valorR, valorH);
                txtArea.setText(String.valueOf(micilindro.getArea()));
                txtVolumen.setText(String.valueOf(micilindro.getVolumen()));
                
            }
            break;
            case "Esfera": {
                double valorR = Double.parseDouble(txtR.getText());
                ORA_Controlador.ORA_Esfera miesfera = new ORA_Esfera(valorR);
                txtArea.setText(String.valueOf(miesfera.getArea()));
                txtVolumen.setText(String.valueOf(miesfera.getVolumen()));
                
            }
            break;
            case "Cono": {
                double valorR = Double.parseDouble(txtR.getText());
                double valorH = Double.parseDouble(txtH.getText());
                double valorG = Double.parseDouble(txtH.getText());
                ORA_Controlador.ORA_Cono micono = new ORA_Cono(valorR, valorH, valorG);
                txtArea.setText(String.valueOf(micono.getArea()));
                txtVolumen.setText(String.valueOf(micono.getVolumen()));
                
            }
            break;
            case "Paralelepipedo": {
                double valorA = Double.parseDouble(txtA.getText());
                double valorB = Double.parseDouble(txtB.getText());
                double valorH = Double.parseDouble(txtH.getText());
                ORA_Controlador.ORA_Paralelepipedo mip = new ORA_Paralelepipedo(valorA, valorB, valorH);
                txtArea.setText(String.valueOf(mip.getArea()));
                txtVolumen.setText(String.valueOf(mip.getVolumen()));
                
            }
            break;
            case "-----": {
                
            }
            break;
            
        }
    }                                           

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ORA_FigurasGeometricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ORA_FigurasGeometricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ORA_FigurasGeometricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ORA_FigurasGeometricas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ORA_FigurasGeometricas().setVisible(true);
            }
        });
    }                   
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxFigura;
    private javax.swing.JLabel lblA;
    private javax.swing.JLabel lblArea;
    private javax.swing.JLabel lblB;
    private javax.swing.JLabel lblG;
    private javax.swing.JLabel lblH;
    private javax.swing.JLabel lblR;
    private javax.swing.JLabel lblSeleccione;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVolumen;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtArea;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtG;
    private javax.swing.JTextField txtH;
    private javax.swing.JTextField txtR;
    private javax.swing.JTextField txtVolumen;    
}