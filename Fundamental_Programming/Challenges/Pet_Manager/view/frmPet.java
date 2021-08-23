
package view;

import clasepet.*;
import java.util.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.SingleSelectionModel;
import Controller.ctlPet;

public class frmPet extends javax.swing.JFrame {

    ctlPet ctlPet = new ctlPet();
    LinkedList<clsCat> catObjectList = new LinkedList<>();
    LinkedList<clsDog> dogObjectList = new LinkedList<>();
    
    public frmPet() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PetList = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        petList = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        catList = new javax.swing.JList<>();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCodeCat = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNameCat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtBornYearCat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtColorCat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbBreedCat = new javax.swing.JComboBox<>();
        btnCreateCat = new javax.swing.JButton();
        btnSearchCat = new javax.swing.JButton();
        btnEditCat = new javax.swing.JButton();
        btnDeleteCat = new javax.swing.JButton();
        cbHealthStatusCat = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        txtCodeDog = new javax.swing.JTextField();
        lblNameDog = new javax.swing.JLabel();
        txtNameDog = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBornYearDog = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtColorDog = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbHealthStatusDog = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        cbBreedDog = new javax.swing.JComboBox<>();
        cbPedigree = new javax.swing.JCheckBox();
        btnCreateDog = new javax.swing.JButton();
        btnSearchDog = new javax.swing.JButton();
        btnEditDog = new javax.swing.JButton();
        btnDeletedog = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pet Manager");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pet Manager");

        petList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Dog 1", "Dog 2", "Dog 3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(petList);

        catList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Cat 1", "Cat 2", "Cat 3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(catList);

        jLabel12.setText("Dogs");

        jLabel13.setText("Cats");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel12)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );

        PetList.addTab("Pet List", jPanel1);

        jLabel2.setText("Code");

        txtCodeCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeCatActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jLabel4.setText("Born Year");

        jLabel5.setText("Color");

        jLabel6.setText("Health Status");

        jLabel7.setText("Breed");

        cbBreedCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Angora", "Bengal", "Ragdoll" }));
        cbBreedCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBreedCatActionPerformed(evt);
            }
        });

        btnCreateCat.setText("Create");
        btnCreateCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateCatActionPerformed(evt);
            }
        });

        btnSearchCat.setText("Search");
        btnSearchCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCatActionPerformed(evt);
            }
        });

        btnEditCat.setText("Edit");
        btnEditCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCatActionPerformed(evt);
            }
        });

        btnDeleteCat.setText("Delete");
        btnDeleteCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCatActionPerformed(evt);
            }
        });

        cbHealthStatusCat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Healthy", "Ill", "Surgery" }));
        cbHealthStatusCat.setAutoscrolls(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbHealthStatusCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtBornYearCat, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCodeCat, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNameCat, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtColorCat, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbBreedCat, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnCreateCat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearchCat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditCat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDeleteCat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCodeCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtNameCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtBornYearCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtColorCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(cbBreedCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHealthStatusCat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateCat, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchCat, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditCat, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeleteCat, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        PetList.addTab("Cat Manager", jPanel2);

        jLabel14.setText("Code");

        txtCodeDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeDogActionPerformed(evt);
            }
        });

        lblNameDog.setText("Name");

        txtNameDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameDogActionPerformed(evt);
            }
        });

        jLabel8.setText("Born Year");

        txtBornYearDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBornYearDogActionPerformed(evt);
            }
        });

        jLabel9.setText("Color");

        jLabel10.setText("Health Status");

        cbHealthStatusDog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Healthty", "Ill", "Surgery" }));

        jLabel11.setText("Breed");

        cbBreedDog.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "German Shepher", "siberian Husky", "Chihuahua", "Criollo" }));

        cbPedigree.setText("Pedigree");
        cbPedigree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPedigreeActionPerformed(evt);
            }
        });

        btnCreateDog.setText("Create");
        btnCreateDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDogActionPerformed(evt);
            }
        });

        btnSearchDog.setText("Search");
        btnSearchDog.setToolTipText("");
        btnSearchDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchDogActionPerformed(evt);
            }
        });

        btnEditDog.setText("Edit");
        btnEditDog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditDogActionPerformed(evt);
            }
        });

        btnDeletedog.setText("Delete");
        btnDeletedog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletedogActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodeDog, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBornYearDog, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNameDog)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNameDog, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtColorDog)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbHealthStatusDog, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbBreedDog, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnCreateDog, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(btnSearchDog, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditDog, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDeletedog, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbPedigree))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtCodeDog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNameDog)
                        .addComponent(txtNameDog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBornYearDog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtColorDog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbHealthStatusDog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(cbBreedDog, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbPedigree))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateDog, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditDog, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletedog, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchDog, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnSearchDog.getAccessibleContext().setAccessibleName("");

        PetList.addTab("Dog Manager", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PetList)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PetList, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateCatActionPerformed
        
        // Create the cat class, with parameters fill out by the user
        try {
            String code = txtCodeCat.getText();
            String name = txtNameCat.getText();
            String color = txtColorCat.getText();
            int bornYear = Integer.parseInt(txtBornYearCat.getText());
            String healthStatus = (String) cbHealthStatusCat.getSelectedItem().toString();
            String breed = (String) cbBreedCat.getSelectedItem().toString();

            if (code.equals("") || name.equals("") || color.equals("")) {
                JOptionPane.showMessageDialog(this, "Fill all fields");
            } else {
                clsCat cat = new clsCat(code, name, bornYear, color, healthStatus, breed);
                catObjectList.add(cat);
                this.FillJlistCat();
                JOptionPane.showMessageDialog(this, "The record has been saved");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please add a valid born year");
        }
    }//GEN-LAST:event_btnCreateCatActionPerformed
    // This method used by create cat method fill the pet list with the cats writing down by users 
    private void FillJlistCat() {
        DefaultListModel modelCat = new DefaultListModel();
        int index = 0;
        for (clsCat cat : catObjectList) {
            String data = cat.getName() + " - " + cat.getBreed() + " - Cat";
            modelCat.add(index, data);
            index++;
        }
        catList.setModel(modelCat);
    }
    private void btnSearchCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCatActionPerformed
        // search by code a cat stored in catObjectList
        String code = txtCodeCat.getText();
        boolean found = false;
        for (clsCat cat : catObjectList) {
            if (code.equals(cat.getCode())) {
                txtNameCat.setText(cat.getName());
                txtColorCat.setText(cat.getColor());
                txtBornYearCat.setText(cat.getBornYear() + "");
                cbHealthStatusCat.setSelectedItem(cat.getHealthStatus());
                cbBreedCat.setSelectedItem(cat.getBreed());
                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(this, " This pet was not found");
        }
    }//GEN-LAST:event_btnSearchCatActionPerformed

    private void cbBreedCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBreedCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBreedCatActionPerformed

    private void cbPedigreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPedigreeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbPedigreeActionPerformed

    private void txtCodeDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeDogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeDogActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnCreateDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDogActionPerformed
        // Create the dog class, with parameters fill out by the user

        try {
            String code = txtCodeDog.getText();
            String name = txtNameDog.getText();
            String color = txtColorDog.getText();
            int bornYear = Integer.parseInt(txtBornYearDog.getText());
            String healthStatus = (String) cbHealthStatusDog.getSelectedItem().toString();
            String breed = (String) cbBreedDog.getSelectedItem().toString();
            boolean pedigree = cbPedigree.isSelected();

            if (code.equals("") || name.equals("") || color.equals("")) {
                JOptionPane.showMessageDialog(this, "Fill all fields");
            } else {
                clsDog dog = new clsDog(code, name, bornYear, color, healthStatus, breed, pedigree);

                dogObjectList.add(dog);
                System.out.println(dog.getAnimalType());
                ctlPet.createPet(dog);
                this.FillJlist();
                JOptionPane.showMessageDialog(this, "The record has been saved");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btnCreateDogActionPerformed
     // This method is used by create dog method and fill the pet list with the dogs writing down by users 
    private void FillJlist(){
        DefaultListModel model = new DefaultListModel();
        int index = 0;
        for (clsDog dog : dogObjectList){
            String data = dog.getName() + " - " + dog.getBreed() + " - Perro";
            model.add(index, data);
            index++;
        }

        petList.setModel(model);
    }
    private void txtBornYearDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBornYearDogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBornYearDogActionPerformed

    private void btnSearchDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchDogActionPerformed
        // search by code a dog stored in dogObjectList
        String code = txtCodeDog.getText();
        boolean found = false;
                for(clsDog dog: dogObjectList){
            if(code.equals(dog.getCode())){
                txtNameDog.setText(dog.getName());
                txtColorDog.setText(dog.getColor()); 
                txtBornYearDog.setText(dog.getBornYear() + "");
                cbHealthStatusDog.setSelectedItem(dog.getHealthStatus());
                cbBreedDog.setSelectedItem(dog.getBreed());
                cbPedigree.setSelected(dog.getPedrigree()); 
                found = true;
                break;
            }
        }
        if(! found){
            JOptionPane.showMessageDialog(this," This pet was not found");
        }
    }//GEN-LAST:event_btnSearchDogActionPerformed

    private void btnEditDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditDogActionPerformed
        // used to modify a class dog instance
        String code = txtCodeDog.getText();
        boolean found = false;
        for(clsDog dog: dogObjectList){
            if(code.equals(dog.getCode())){
                String name = txtNameDog.getText();
                String color = txtColorDog.getText();
                int bornYear = Integer.parseInt(txtBornYearDog.getText());
                String healthStatus = (String) cbHealthStatusDog.getSelectedItem().toString();
                String breed = (String) cbBreedDog.getSelectedItem().toString();
                boolean pedigree = cbPedigree.isSelected();
                dog.setName(name);
                dog.setColor(color);
                dog.setBornYear(bornYear);
                dog.setHealthStatus(healthStatus);
                dog.setBreed(breed);
                dog.setPedigree(pedigree);
                JOptionPane.showMessageDialog(this, "Record updated succesfully");
                found = true;
                this.FillJlist();
                this.ClearFieldsDog();
                break;
            }
        }   if(! found){
                JOptionPane.showMessageDialog(this," This pet was not found");
        }
        
    }//GEN-LAST:event_btnEditDogActionPerformed

    private void btnDeletedogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletedogActionPerformed
        // used to delete a dog from dogObjectList
        String code = txtCodeDog.getText();
        boolean found = false;
        for(clsDog dog: dogObjectList){
            if(code.equals(dog.getCode())){
                this.dogObjectList.remove(dog);
                this.ClearFieldsDog();
                this.FillJlist();
                JOptionPane.showMessageDialog(this, "Record deleted succesfully");
                found = true;
                break;
            }
        }   if(! found){
                JOptionPane.showMessageDialog(this," This pet was not found");
        }
    }//GEN-LAST:event_btnDeletedogActionPerformed

    private void txtCodeCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeCatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeCatActionPerformed

    private void txtNameDogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameDogActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameDogActionPerformed

    private void btnEditCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCatActionPerformed
        // used to edit a cat class instance
        String code = txtCodeCat.getText();
        boolean found = false;
        for (clsCat cat : catObjectList) {
            if (code.equals(cat.getCode())) {
                String name = txtNameCat.getText();
                String color = txtColorCat.getText();
                int bornYear = Integer.parseInt(txtBornYearCat.getText());
                String healthStatus = (String) cbHealthStatusCat.getSelectedItem().toString();
                String breed = (String) cbBreedCat.getSelectedItem().toString();
                cat.setName(name);
                cat.setColor(color);
                cat.setBornYear(bornYear);
                cat.setHealthStatus(healthStatus);
                cat.setBreed(breed);
                JOptionPane.showMessageDialog(this, "Record updated succesfully");
                found = true;
                this.FillJlistCat();
                this.ClearFieldsCat();
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(this, " This pet was not found");
        }
    }//GEN-LAST:event_btnEditCatActionPerformed

    private void btnDeleteCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCatActionPerformed
        // used tod delete a cat from catObjectList
        String code = txtCodeCat.getText();
        boolean found = false;
        for (clsCat cat : catObjectList) {
            if (code.equals(cat.getCode())) {
                this.catObjectList.remove(cat);
                this.ClearFieldsCat();
                this.FillJlistCat();
                JOptionPane.showMessageDialog(this, "Record deleted succesfully");
                found = true;
                break;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(this, " This pet was not found");
        }
    }//GEN-LAST:event_btnDeleteCatActionPerformed
    // clear the fields of both, dogs and cats tabs
    private void ClearFieldsDog() {
        txtCodeDog.setText("");
        txtNameDog.setText("");
        txtColorDog.setText("");
        txtBornYearDog.setText("");
        cbBreedDog.setSelectedIndex(0);
        cbHealthStatusDog.setSelectedIndex(0);
        cbPedigree.setSelected(false);
    }

    private void ClearFieldsCat() {
        txtCodeCat.setText("");
        txtNameCat.setText("");
        txtColorCat.setText("");
        txtBornYearCat.setText("");
        cbBreedCat.setSelectedIndex(0);
        cbHealthStatusCat.setSelectedIndex(0);
    }

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
            java.util.logging.Logger.getLogger(frmPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane PetList;
    private javax.swing.JButton btnCreateCat;
    private javax.swing.JButton btnCreateDog;
    private javax.swing.JButton btnDeleteCat;
    private javax.swing.JButton btnDeletedog;
    private javax.swing.JButton btnEditCat;
    private javax.swing.JButton btnEditDog;
    private javax.swing.JButton btnSearchCat;
    private javax.swing.JButton btnSearchDog;
    private javax.swing.JList<String> catList;
    private javax.swing.JComboBox<String> cbBreedCat;
    private javax.swing.JComboBox<String> cbBreedDog;
    private javax.swing.JComboBox<String> cbHealthStatusCat;
    private javax.swing.JComboBox<String> cbHealthStatusDog;
    private javax.swing.JCheckBox cbPedigree;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblNameDog;
    private javax.swing.JList<String> petList;
    private javax.swing.JTextField txtBornYearCat;
    private javax.swing.JTextField txtBornYearDog;
    private javax.swing.JTextField txtCodeCat;
    private javax.swing.JTextField txtCodeDog;
    private javax.swing.JTextField txtColorCat;
    private javax.swing.JTextField txtColorDog;
    private javax.swing.JTextField txtNameCat;
    private javax.swing.JTextField txtNameDog;
    // End of variables declaration//GEN-END:variables
}
