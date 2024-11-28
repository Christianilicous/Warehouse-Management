import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Warehouse extends javax.swing.JFrame {
    
private Connection connect() {
        String url = "jdbc:mysql://localhost:3306/warehouse"; // Update with your database name
        String user = "root"; // Update with your database username
        String password = "nemuimors"; // Update with your database password

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    private void loadTableData() {
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
        tableModel.setRowCount(0); // Clear existing rows

        String query = "SELECT * FROM management"; // Adjust table name and columns as per your database structure

        try (Connection conn = connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            while (rs.next()) {
                Object[] row = {
                    rs.getInt("product_id"),
                    rs.getString("product_name"),
                    rs.getString("category"),
                    rs.getInt("stock_level"),
                    rs.getString("location"),
                    rs.getString("stock_status"),
                    rs.getTimestamp("last_updated"),
                    rs.getString("tracking_info") // Assuming tracking_info is stored as a string
                };
                tableModel.addRow(row);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error loading data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public Warehouse() {
        initComponents();
        setLocationRelativeTo(null);
    }

    private void clearFields() {
        ProductIDField.setText("");
        ProductNameFLD.setText("");
        CatField.setText("");
        StockLevelField.setText("");
        LocationField.setText("");
        StockStatusField.setText("");
        LastUpdatedField.setText("");
        TrackingInfoField.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ProductIDField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ProductNameFLD = new javax.swing.JTextField();
        CatField = new javax.swing.JTextField();
        StockLevelField = new javax.swing.JTextField();
        LocationField = new javax.swing.JTextField();
        UpdateBTN = new javax.swing.JButton();
        SaveBTN = new javax.swing.JButton();
        DeleteBTN = new javax.swing.JButton();
        DisplayAllBTN = new javax.swing.JButton();
        StockStatusField = new javax.swing.JTextField();
        LastUpdatedField = new javax.swing.JTextField();
        TrackingInfoField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        SearchBTN = new javax.swing.JButton();
        HidelBTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setBackground(new java.awt.Color(102, 255, 255));
        jTable1.setForeground(new java.awt.Color(51, 51, 51));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Product Name", "Category", "Stock Level", "Location", "Stock Status", "Last Updated", "Tracking Info"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.setBackground(new java.awt.Color(153, 153, 0));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product ID:");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product Name:");

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Category:");

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Location:");

        ProductIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductIDFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Stock Level:");

        ProductNameFLD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNameFLDActionPerformed(evt);
            }
        });

        CatField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatFieldActionPerformed(evt);
            }
        });

        StockLevelField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockLevelFieldActionPerformed(evt);
            }
        });

        LocationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationFieldActionPerformed(evt);
            }
        });

        UpdateBTN.setBackground(new java.awt.Color(204, 204, 204));
        UpdateBTN.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        UpdateBTN.setForeground(new java.awt.Color(51, 51, 51));
        UpdateBTN.setText("Update");
        UpdateBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBTNActionPerformed(evt);
            }
        });

        SaveBTN.setBackground(new java.awt.Color(204, 204, 204));
        SaveBTN.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        SaveBTN.setForeground(new java.awt.Color(51, 51, 51));
        SaveBTN.setText("Save");
        SaveBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveBTNActionPerformed(evt);
            }
        });

        DeleteBTN.setBackground(new java.awt.Color(204, 204, 204));
        DeleteBTN.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        DeleteBTN.setForeground(new java.awt.Color(51, 51, 51));
        DeleteBTN.setText("Delete");
        DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTNActionPerformed(evt);
            }
        });

        DisplayAllBTN.setBackground(new java.awt.Color(204, 204, 204));
        DisplayAllBTN.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        DisplayAllBTN.setForeground(new java.awt.Color(51, 51, 51));
        DisplayAllBTN.setText("Show Records");
        DisplayAllBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisplayAllBTNActionPerformed(evt);
            }
        });

        StockStatusField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StockStatusFieldActionPerformed(evt);
            }
        });

        LastUpdatedField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastUpdatedFieldActionPerformed(evt);
            }
        });

        TrackingInfoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TrackingInfoFieldActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Stock Status:");

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Last Updated:");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Tracking Info:");

        SearchBTN.setBackground(new java.awt.Color(204, 204, 204));
        SearchBTN.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        SearchBTN.setForeground(new java.awt.Color(51, 51, 51));
        SearchBTN.setText("Search");
        SearchBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBTNActionPerformed(evt);
            }
        });

        HidelBTN.setBackground(new java.awt.Color(204, 204, 204));
        HidelBTN.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        HidelBTN.setForeground(new java.awt.Color(51, 51, 51));
        HidelBTN.setText("Hide");
        HidelBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HidelBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ProductIDField)
                                    .addComponent(ProductNameFLD, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                    .addComponent(CatField)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(StockLevelField, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 205, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HidelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StockStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LocationField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LastUpdatedField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TrackingInfoField, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(DisplayAllBTN))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(UpdateBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                    .addComponent(DeleteBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SaveBTN, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                    .addComponent(SearchBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(101, 101, 101))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(ProductIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LocationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StockStatusField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(ProductNameFLD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LastUpdatedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(StockLevelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TrackingInfoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(HidelBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DisplayAllBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UpdateBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SaveBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DeleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SearchBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductIDFieldActionPerformed

    private void ProductNameFLDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductNameFLDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductNameFLDActionPerformed

    private void CatFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatFieldActionPerformed

    private void StockLevelFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockLevelFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StockLevelFieldActionPerformed

    private void LocationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocationFieldActionPerformed

    private void UpdateBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBTNActionPerformed
       int productId;
        try {
            productId = Integer.parseInt(ProductIDField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Product ID.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String productName = ProductNameFLD.getText();
        String category = CatField.getText();
        int stock;
        try {
            stock = Integer.parseInt(StockLevelField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid numeric value for Stock Level.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String location = LocationField.getText();
        String stockStatus = StockStatusField.getText();
        String trackingInfo = TrackingInfoField.getText();

        String query = "UPDATE management SET product_name = ?, category = ?, stock_level = ?, location = ?, stock_status = ?, tracking_info = ? WHERE product_id = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, productName);
            pstmt.setString(2, category);
            pstmt.setInt(3, stock);
            pstmt.setString(4, location);
            pstmt.setString(5, stockStatus);
            pstmt.setString(6, trackingInfo);
            pstmt.setInt(7, productId);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product updated successfully.");
            loadTableData();
            clearFields();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error updating product: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }                         
    }//GEN-LAST:event_UpdateBTNActionPerformed

    private void SaveBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveBTNActionPerformed
  String productName = ProductNameFLD.getText();
        String category = CatField.getText();
        int stock;
        try {
            stock = Integer.parseInt(StockLevelField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid numeric value for Stock Level.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String location = LocationField.getText();
        String stockStatus = StockStatusField.getText();
        String trackingInfo = TrackingInfoField.getText();

        String query = "INSERT INTO management (product_name, category, stock_level, location, stock_status, tracking_info) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, productName);
            pstmt.setString(2, category);
            pstmt.setInt(3, stock);
            pstmt.setString(4, location);
            pstmt.setString(5, stockStatus);
            pstmt.setString(6, trackingInfo);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added successfully.");
            loadTableData();
            clearFields();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error adding product: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }                             
    }//GEN-LAST:event_SaveBTNActionPerformed

    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed
 int productId;
        try {
            productId = Integer.parseInt(ProductIDField.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Product ID.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String query = "DELETE FROM management WHERE product_id = ?";
        try (Connection conn = connect();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setInt(1, productId);
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product deleted successfully.");
            loadTableData();
            clearFields();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error deleting product: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_DeleteBTNActionPerformed

    private void DisplayAllBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisplayAllBTNActionPerformed
    loadTableData();
    }//GEN-LAST:event_DisplayAllBTNActionPerformed

    private void StockStatusFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StockStatusFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_StockStatusFieldActionPerformed

    private void LastUpdatedFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastUpdatedFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastUpdatedFieldActionPerformed

    private void SearchBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBTNActionPerformed
    try {
            int productId = Integer.parseInt(ProductIDField.getText());
            String query = "SELECT * FROM management WHERE product_id = ?";
            try (Connection conn = connect();
                 PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setInt(1, productId);
                ResultSet rs = pstmt.executeQuery();
                
                DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
                tableModel.setRowCount(0); // Clear existing rows before adding new results
                
                if (rs.next()) {
                    Object[] row = {
                        rs.getInt("product_id"),
                        rs.getString("product_name"),
                        rs.getString("category"),
                        rs.getInt("stock_level"),
                        rs.getString("location"),
                        rs.getString("stock_status"),
                        rs.getTimestamp("last_updated"),
                        rs.getString("tracking_info")
                    };
                    tableModel.addRow(row); // Add the result to the table
                } else {
                    JOptionPane.showMessageDialog(this, "Product not found.", "Info", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Product ID.", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error searching product: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_SearchBTNActionPerformed

    private void HidelBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HidelBTNActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) jTable1.getModel();
    tableModel.setRowCount(0); // Clear all rows from the table
    }//GEN-LAST:event_HidelBTNActionPerformed

    private void TrackingInfoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TrackingInfoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TrackingInfoFieldActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Warehouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CatField;
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JButton DisplayAllBTN;
    private javax.swing.JButton HidelBTN;
    private javax.swing.JTextField LastUpdatedField;
    private javax.swing.JTextField LocationField;
    private javax.swing.JTextField ProductIDField;
    private javax.swing.JTextField ProductNameFLD;
    private javax.swing.JButton SaveBTN;
    private javax.swing.JButton SearchBTN;
    private javax.swing.JTextField StockLevelField;
    private javax.swing.JTextField StockStatusField;
    private javax.swing.JTextField TrackingInfoField;
    private javax.swing.JButton UpdateBTN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
