/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ankit
 */
public class JFrame extends javax.swing.JFrame {

    /**
     * Creates new form JFrame
     */
    private static String action="";
    private static float num1=0;
    private static float num2=0;
    private static float res=0;
    private static String numA="";
    private static String numB="";
    boolean flag=false;
    
    public JFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        txtval = new javax.swing.JTextField();
        bt1 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        btplus = new javax.swing.JButton();
        bt2 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        btminus = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt0 = new javax.swing.JButton();
        btmul = new javax.swing.JButton();
        bteq = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        btdiv = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        lblMSG = new javax.swing.JLabel();
        btpoint = new javax.swing.JButton();
        radio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bt1.setText("1");
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        bt3.setText("3");
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        btplus.setText("+");
        btplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btplusActionPerformed(evt);
            }
        });

        bt2.setText("2");
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt4.setText("4");
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt6.setText("6");
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        btminus.setText("-");
        btminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btminusActionPerformed(evt);
            }
        });

        bt7.setText("7");
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt0.setText("0");
        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });

        btmul.setText("*");
        btmul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btmulActionPerformed(evt);
            }
        });

        bteq.setText("=");
        bteq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteqActionPerformed(evt);
            }
        });

        bt5.setText("5");
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt9.setText("9");
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        btdiv.setText("/");
        btdiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btdivActionPerformed(evt);
            }
        });

        bt8.setText("8");
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        lblMSG.setText("<html>\n<b align=\"center\">   Calculator </b>\n\n\n</html>");

        btpoint.setText(".");
        btpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btpointActionPerformed(evt);
            }
        });

        radio.setText("on/off");
        radio.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radioStateChanged(evt);
            }
        });
        radio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(lblMSG, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(radio, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtval, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(26, 26, 26)
                                        .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btpoint, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(bteq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(bt9, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btplus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btminus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btmul, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMSG, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtval, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btplus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btminus, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btmul, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bteq, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btdiv, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt0, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btpoint, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>                        

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        if(radio.isSelected()){
        String str=txtval.getText()+bt8.getText();
        if(flag==false) numA=str;
        else numB=numB+bt8.getText();
         txtval.setText(str);
        }
    }                                   

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        if(radio.isSelected()){
       String str=txtval.getText()+bt1.getText();
       if(flag==false) numA=str;
        else numB=numB+bt1.getText();
         txtval.setText(str);
        }
    }                                   

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        if(radio.isSelected()){
        String str=txtval.getText()+bt2.getText();
        if(flag==false) numA=str;
        else numB=numB+bt2.getText();
         txtval.setText(str);
        }
    }                                   

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        if(radio.isSelected()){
        String str=txtval.getText()+bt3.getText();
        if(flag==false) numA=str;
        else numB=numB+bt3.getText();
         txtval.setText(str);
        }
    }                                   

    private void btplusActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        if(radio.isSelected()){
        action=btplus.getText();
        num1=Float.valueOf(txtval.getText());
        flag=true;
         String str=txtval.getText()+btplus.getText();
         txtval.setText(str);
        }
    }                                      

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        if(radio.isSelected()){
         String str=txtval.getText()+bt4.getText();
         if(flag==false) numA=str;
        else numB=numB+bt4.getText();
         txtval.setText(str);
        }
    }                                   

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        if(radio.isSelected()){
         String str=txtval.getText()+bt5.getText();
         if(flag==false) numA=str;
        else numB=numB+bt5.getText();
         txtval.setText(str);
        }
    }                                   

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        if(radio.isSelected()){
         String str=txtval.getText()+bt6.getText();
         if(flag==false) numA=str;
         else numB=numB+bt6.getText();
         txtval.setText(str);
        }
    }                                   

    private void btminusActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if(radio.isSelected()){
        action=btminus.getText();
        flag=true;
        num1=Float.valueOf(txtval.getText());
        txtval.setText(txtval.getText()+"-");
        }
    }                                       

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        if(radio.isSelected()){
         String str=txtval.getText()+bt7.getText();
         if(flag==false) numA=str;
        else numB=numB+bt7.getText();
         txtval.setText(str);
        }
    }                                   

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        if(radio.isSelected()){
         String str=txtval.getText()+bt9.getText();
         if(flag==false) numA=str;
         else numB=numB+bt9.getText();
         txtval.setText(str);
        }
    }                                   

    private void btmulActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        if(radio.isSelected()){
        action=btmul.getText();
        num1=Float.valueOf(txtval.getText());
        flag=true;
        txtval.setText(txtval.getText()+"*");
        }
    }                                     

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        if(radio.isSelected()){
          String str=txtval.getText()+bt0.getText();
          if(flag==false) numA=str;
        else numB=numB+bt0.getText();
         txtval.setText(str);
        }
    }                                   

    private void bteqActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        if(radio.isSelected()){
        num2=Float.valueOf(numB);
        if("+".equals(action))
            res=num1+num2;
        if("-".equals(action))
            res=num1-num2;
        if("*".equals(action))
            res=num1*num2;
        if("/".equals(action))
            res=num1/num2;
        txtval.setText(String.valueOf(res));
        }
    }                                    

    private void btdivActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        if(radio.isSelected()){
        action=btdiv.getText();
        num1=Float.valueOf(txtval.getText());
        flag=true;
         txtval.setText(txtval.getText()+"*");
        }
    }                                     

    private void btpointActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if(radio.isSelected()){
       String str=txtval.getText()+btpoint.getText();
         txtval.setText(str);
        }
    }                                       

    private void radioStateChanged(javax.swing.event.ChangeEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void radioActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        if(!radio.isSelected())
            txtval.setText("");
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
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt0;
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JButton btdiv;
    private javax.swing.JButton bteq;
    private javax.swing.JButton btminus;
    private javax.swing.JButton btmul;
    private javax.swing.JButton btplus;
    private javax.swing.JButton btpoint;
    private javax.swing.JLabel lblMSG;
    private javax.swing.JRadioButton radio;
    private javax.swing.JTextField txtval;
    // End of variables declaration                   
}

