package View;


import Controller.CarsDAO;
import Controller.PositionDAO;
import Model.Cars;
import Model.Position;
import View.CrudCarsFrm;
import View.CrudPositionFrm;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vang
 */
public class CrudPositionFormFrm extends javax.swing.JDialog {
    private int position_id;
    private final CrudPositionFrm home;
    private boolean isEdit = false;
    public CrudPositionFormFrm(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        home = (CrudPositionFrm) parent;
        showComboData();
    }
    private void showComboData(){
        ArrayList<Cars> itemsCars = new ArrayList<>();
        itemsCars = new CarsDAO().getListItem();
        for(Cars i: itemsCars){
            combNumberCar.addItem(i.getNumber_car());
        }
    
    }
    
    public void getSelectedItem(boolean edit, Position item){
        isEdit = edit;
        txtName.setText(item.getName());
        
        if(item.getStatus() == 0)
            rdConTrong.setSelected(true);
        else
            rdDaDat.setSelected(true);
        
        combNumberCar.setSelectedItem(item.getNumber_car());
        position_id = item.getPosition_id();
                
    }
    
    public void reset(){
        txtName.setText("");
        rdConTrong.setSelected(true);
        combNumberCar.setSelectedIndex(0);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        rdConTrong = new javax.swing.JRadioButton();
        rdDaDat = new javax.swing.JRadioButton();
        combNumberCar = new javax.swing.JComboBox();
        btnSubmit = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thông tin ghế");

        jLabel1.setText("Tên Ghế");

        jLabel2.setText("Số Xe");

        jLabel3.setText("Trạng Thái");

        buttonGroup1.add(rdConTrong);
        rdConTrong.setSelected(true);
        rdConTrong.setText("Còn trống");

        buttonGroup1.add(rdDaDat);
        rdDaDat.setText("Đã Đặt");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnThoat.setText("Thoát");
        btnThoat.setToolTipText("");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdConTrong)
                                .addGap(27, 27, 27)
                                .addComponent(rdDaDat))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(combNumberCar, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combNumberCar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(rdConTrong)
                    .addComponent(rdDaDat))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        String numberCar = null, name = null;
        int status = 0;
        boolean isOk = true;
        if(!rdConTrong.isSelected() && !rdDaDat.isSelected() || txtName.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Nhập đầy đủ thông tin");
            isOk = false;
        }
        else{
            name = txtName.getText();
            if(rdConTrong.isSelected())
                status = 0;
            else
                status = 1;
            numberCar = (String) combNumberCar.getSelectedItem();
        }
        
        if(isOk){
            Position item = new Position(position_id,name, numberCar, status);
            if(!isEdit){
                
                if(new PositionDAO().addItem(item)){
                    home.addItem(item);           
                    JOptionPane.showMessageDialog(this, "thêm mới thành công");
                    txtName.setText("");
                    
                }else{
                    JOptionPane.showMessageDialog(this, "có lỗi khi thêm");
                }
            }else{
                if(new PositionDAO().updateItem(item)){
                    //home.updateItem(item);
                    JOptionPane.showMessageDialog(this, "update thành công");
                    this.dispose();
                    home.setVisible(false);
                    CrudPositionFrm view = new CrudPositionFrm();
                    view.setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(this, "có lỗi khi update");
                }
            }
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
       this.dispose();
       home.setVisible(false);
       CrudPositionFrm view = new CrudPositionFrm();
       view.setVisible(true);
    }//GEN-LAST:event_btnThoatActionPerformed

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
            java.util.logging.Logger.getLogger(CrudPositionFormFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudPositionFormFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudPositionFormFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudPositionFormFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CrudPositionFormFrm dialog = new CrudPositionFormFrm(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JButton btnThoat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox combNumberCar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton rdConTrong;
    private javax.swing.JRadioButton rdDaDat;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}