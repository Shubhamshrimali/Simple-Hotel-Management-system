/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 15MIS0206
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        surname = new javax.swing.JTextField();
        jtxtCustomerRef = new javax.swing.JTextField();
        first = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        post = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        ext = new javax.swing.JComboBox<>();
        email = new javax.swing.JTextField();
        nationality = new javax.swing.JComboBox<>();
        id = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();
        meal = new javax.swing.JComboBox<>();
        type = new javax.swing.JComboBox<>();
        no = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        total1 = new javax.swing.JTextField();
        tax = new javax.swing.JTextField();
        sub = new javax.swing.JTextField();
        total = new javax.swing.JButton();
        update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        out = new com.toedter.calendar.JDateChooser();
        dob = new com.toedter.calendar.JDateChooser();
        in = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Room Ext. No.:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Customer_Ref:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("First name:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Surname:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Address:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Post code:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Mobile No.:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Email:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Nationality:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("DOB:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("ID type:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Gender:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Check in date:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Check out date:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Meal:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Room Type:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("Room No.:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));
        getContentPane().add(surname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 100, -1));
        getContentPane().add(jtxtCustomerRef, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 100, -1));
        getContentPane().add(first, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 100, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 100, -1));
        getContentPane().add(post, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 100, -1));
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 100, -1));
        getContentPane().add(mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 100, -1));

        ext.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "001", "002", "003", "004", "005", "006", "007", "008" }));
        getContentPane().add(ext, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 490, 100, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 100, -1));

        nationality.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "English", "Indian", "German", "American" }));
        getContentPane().add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 100, -1));

        id.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select ID", "Driving Licence", "Passport", "Student ID", "Aadhar card" }));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 100, -1));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Male", "Female", "Other" }));
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 100, -1));

        meal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "1", "2", "3" }));
        getContentPane().add(meal, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 400, 100, -1));

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Single", "Double", "Family" }));
        getContentPane().add(type, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 100, -1));

        no.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "001", "002", "003", "004", "005", "006", "007", "008", "009" }));
        getContentPane().add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 100, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.gray, java.awt.Color.white));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Tax:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Sub Total:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setText("Total:");

        total.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        total.setText("Total Cost");
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        Delete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exit.setText("Exit");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(total1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel20)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel21)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 1010, 120));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer_ref", "First name", "Surname", "Address", "Post code", "Mobile no", "Email", "Nationality", "DOB", "ID type", "Gender", "Check in date", "Check out date", "Meal", "Room type", "Room no", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 770, 500));
        getContentPane().add(out, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 370, 100, -1));
        getContentPane().add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 100, -1));
        getContentPane().add(in, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_exitMouseClicked
private JFrame frame;
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        frame=new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Hotel Management", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==-1)
        {
            if(jTable1.getRowCount()==0)
            {
                //JOptionPane.showMessageDialog(null, "Hotel Booking Update Confirmed",JOptionPane.OK_OPTION);
                JOptionPane.showMessageDialog(null, "Hotel Booking Update Confirmed", "Hotel Management", JOptionPane.OK_OPTION);
            }
        }
    }//GEN-LAST:event_DeleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==-1)
        {
            if(jTable1.getRowCount()==0)
            {
                //JOptionPane.showMessageDialog(null, "Hotel Booking Update Confirmed",JOptionPane.OK_OPTION);
                JOptionPane.showMessageDialog(null, "Hotel Booking Update Confirmed", "Hotel Management", JOptionPane.OK_OPTION);
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        jtxtCustomerRef.setText(null);
        first.setText(null);
        surname.setText(null);
        address.setText(null);
        post.setText(null);
        mobile.setText(null);
        email.setText(null);
        dob.setDate(null);
        in.setDate(null);
        out.setDate(null);
        meal.setSelectedIndex(0);
        type.setSelectedIndex(0);
        nationality.setSelectedIndex(0);
        no.setSelectedIndex(0);
        ext.setSelectedIndex(0);
        tax.setText(null);
        sub.setText(null);
        total1.setText(null);
    }//GEN-LAST:event_resetActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
        int single=35;
        int duble=65;
        int family=75;
        
         int one=350;
        int two=650;
        int three=750;
        SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
        Date in1=null;
        Date out1=null;
        try{
            in1=format.parse(format.format(in.getDate()));
            out1=format.parse(format.format(out.getDate()));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        long checkdiff=in1.getTime() - out1.getTime();
        int daysdiff=(int)(checkdiff/1000/60/60/24);
        if(type.getSelectedItem().equals("Single")&& meal.getSelectedItem().equals("1"))
        {
            total1.setText(Integer.toString(daysdiff*single)+one);
            tax.setText(Integer.toString(daysdiff*single)+one);
            sub.setText(Integer.toString(daysdiff*single)+one);
            double q=Double.parseDouble(tax.getText());
            q=(q*0.25)/100;
            String tax1=String.format("$%.2f", q);
            tax.setText(tax1);
            
            double sq=Double.parseDouble(sub.getText());
            String sub1=String.format("$%.2f", sq);
            tax.setText(sub1);
            
            double tt=Double.parseDouble(total1.getText());
            String to=String.format("$%.2f", tt+q);
            tax.setText(to);
        }
        else
            if(type.getSelectedItem().equals("Double")&& meal.getSelectedItem().equals("2"))
        {
            total1.setText(Integer.toString(daysdiff*duble)+two);
            tax.setText(Integer.toString(daysdiff*duble)+two);
            sub.setText(Integer.toString(daysdiff*duble)+two);
            double q=Double.parseDouble(tax.getText());
            q=(q*0.25)/100;
            String tax1=String.format("$%.2f", q);
            tax.setText(tax1);
            
            double sq=Double.parseDouble(sub.getText());
            String sub1=String.format("$%.2f", sq);
            tax.setText(sub1);
            
            double tt=Double.parseDouble(total1.getText());
            String to=String.format("$%.2f", tt+q);
            tax.setText(to);
        }
        else
                if(type.getSelectedItem().equals("Family")&& meal.getSelectedItem().equals("3"))
        {
            total1.setText(Integer.toString(daysdiff*family)+three);
            tax.setText(Integer.toString(daysdiff*family)+three);
            sub.setText(Integer.toString(daysdiff*family)+three);
            double q=Double.parseDouble(tax.getText());
            q=(q*0.25)/100;
            String tax1=String.format("$%.2f", q);
            tax.setText(tax1);
            
            double sq=Double.parseDouble(sub.getText());
            String sub1=String.format("$%.2f", sq);
            tax.setText(sub1);
            
            double tt=Double.parseDouble(total1.getText());
            String to=String.format("$%.2f", tt+q);
            tax.setText(to);
        }
        
        DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{
        jtxtCustomerRef.getText(),
            first.getText(),
            surname.getText(),
            address.getText(),
            post.getText(),
            mobile.getText(),
            email.getText(),
            dob.getDate(),
            in.getDate(),
            out.getDate(),
            meal.getSelectedItem(),
            type.getSelectedItem(),
            nationality.getSelectedItem(),
            no.getSelectedItem(),
            ext.getSelectedItem(),
            tax.getText(),
            sub.getText(),
            total1.getText()
        });
    }//GEN-LAST:event_totalActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Delete;
    private javax.swing.JTextField address;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JTextField email;
    private javax.swing.JButton exit;
    private javax.swing.JComboBox<String> ext;
    private javax.swing.JTextField first;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JComboBox<String> id;
    private com.toedter.calendar.JDateChooser in;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jtxtCustomerRef;
    private javax.swing.JComboBox<String> meal;
    private javax.swing.JTextField mobile;
    private javax.swing.JComboBox<String> nationality;
    private javax.swing.JComboBox<String> no;
    private com.toedter.calendar.JDateChooser out;
    private javax.swing.JTextField post;
    private javax.swing.JButton reset;
    private javax.swing.JTextField sub;
    private javax.swing.JTextField surname;
    private javax.swing.JTextField tax;
    private javax.swing.JButton total;
    private javax.swing.JTextField total1;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
