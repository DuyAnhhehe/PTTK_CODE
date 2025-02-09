/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package huce.View;

import huce.Controller.HandelExpiredProduct;
import huce.Controller.HandleSearchingProducts;
import huce.Controller.LoadAllProducts;
import huce.DAO.ProductDAO;
import huce.Model.ApplyPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class ListProducts extends javax.swing.JPanel {

    /**
     * Creates new form ListProducts
     */
    public ListProducts(JPanel gobackJPanel) {
        initComponents();
        this.jAddBtn.addActionListener((e) -> {
            ApplyPanel.apply(gobackJPanel, new FormAddProduct(gobackJPanel));
        });
        this.jOutofDateBtn.addActionListener((e) -> {
            new HandelExpiredProduct().handel();
        });
        LookUpPanel lkp = new LookUpPanel(new HandleSearchingProducts(), jListProductsTable);
        this.jLookUpPanel.add(lkp);
        new LoadAllProducts().loadTo(jListProductsTable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        jListProductsTable = new javax.swing.JTable();
        jLookUpPanel = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jAddBtn = new javax.swing.JButton();
        jDelBtn = new javax.swing.JButton();
        jOutofDateBtn = new javax.swing.JButton();
        jSearchPanel = new javax.swing.JPanel();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 51));
        jLabel1.setText("Danh sách sản phẩm trong kho");
        jPanel3.add(jLabel1);

        add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jListProductsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "ID", "Tên sản phẩm", "Vị trí", "Nhóm hàng", "Giá tiền", "NSX", "HSD", "Số lượng tồn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jListProductsTable);

        jPanel1.add(jScrollPane1);

        add(jPanel1, java.awt.BorderLayout.CENTER);

        jLookUpPanel.setLayout(new java.awt.BorderLayout());

        jPanel4.setLayout(new java.awt.GridLayout(2, 0));

        jPanel5.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT));

        jAddBtn.setText("Thêm sản phẩm");
        jPanel5.add(jAddBtn);

        jDelBtn.setText("Xóa sản phẩm");
        jDelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDelBtnActionPerformed(evt);
            }
        });
        jPanel5.add(jDelBtn);

        jOutofDateBtn.setText("Xem sản phẩm hết hạn");
        jPanel5.add(jOutofDateBtn);

        jPanel4.add(jPanel5);
        jPanel4.add(jSearchPanel);

        jLookUpPanel.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        add(jLookUpPanel, java.awt.BorderLayout.PAGE_END);
    }// </editor-fold>//GEN-END:initComponents

    private void jDelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDelBtnActionPerformed
        int selectedRow = jListProductsTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Vui lòng chọn một sản phẩm trong kho");
            return;
        }
        String idProduct = (String) jListProductsTable.getModel().getValueAt(selectedRow, 1);
        ProductDAO pdao = new ProductDAO();

        if (pdao.deletedForever(idProduct)) {
            JOptionPane.showMessageDialog(null, "Đã xóa thành công");

        } else {
            JOptionPane.showMessageDialog(null, "Có lỗi xảy ra");
        }


    }//GEN-LAST:event_jDelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jAddBtn;
    private javax.swing.JButton jDelBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTable jListProductsTable;
    public javax.swing.JPanel jLookUpPanel;
    private javax.swing.JButton jOutofDateBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jSearchPanel;
    // End of variables declaration//GEN-END:variables
}
