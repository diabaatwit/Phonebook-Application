/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ahmed Diab, Fengnan Zhang.
 */
public class EditContact_interface extends javax.swing.JFrame {
    
    String userName = "root";
    String password = "";
    
    DoublyLinkedList<Contact> contacts;

    DoublyLinkedList<Contact> searchContacts;
    /**
     * Creates new form EditContact_interface
     */
    public EditContact_interface() throws Exception {
        initComponents();
        ContactDAO DBcontacts = new ContactDAO("phonebook_database",userName,password);
        
        contacts = new DoublyLinkedList<>();
        searchContacts = new DoublyLinkedList<>();
 
        // populate the table with contacts data.
        contacts = DBcontacts.getContacts();
        addRowToJTable(contacts);
        
        
        // add all contacts ids to ids list, and all contacts names to names list.
        for(int i = 0; i < contacts.size(); i++){
            System.out.println(contacts.get(i).toString());

        }
        System.out.println();
        System.out.println();
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton_delete = new javax.swing.JButton();
        jButton_update = new javax.swing.JButton();
        jTextField_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContacts = new javax.swing.JTable();
        jLabel_sort = new javax.swing.JLabel();
        jButton_clear = new javax.swing.JButton();
        jButton_search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(51, 51, 0));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "By Name", "By Id" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jButton_delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_delete.setText("delete");
        jButton_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_deleteActionPerformed(evt);
            }
        });

        jButton_update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_update.setText("Update");
        jButton_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_updateActionPerformed(evt);
            }
        });

        jTextField_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_searchActionPerformed(evt);
            }
        });

        jTableContacts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Address", "City", "State", "Phone"
            }
        ));
        jTableContacts.setFocusable(false);
        jTableContacts.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTableContacts.setSelectionBackground(new java.awt.Color(102, 153, 255));
        jScrollPane1.setViewportView(jTableContacts);

        jLabel_sort.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel_sort.setText("    Sort");

        jButton_clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_clear.setText("Clear");
        jButton_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_clearActionPerformed(evt);
            }
        });

        jButton_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton_search.setText("Search");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/phonebookPic.jpeg"))); // NOI18N
        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton_clear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_search, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_sort, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(71, 71, 71)
                                .addComponent(jLabel1)))
                        .addGap(0, 93, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel_sort, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(82, 82, 82)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton_update, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(11, 11, 11))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField_search, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton_search, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(10, 10, 10)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 474, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_deleteActionPerformed
        try {
            deleteContact();
            System.out.println("Contact is deleted successfully");
        } catch (Exception ex) {
            Logger.getLogger(EditContact_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_deleteActionPerformed

    private void jButton_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_updateActionPerformed
        try {
            
            updateContact();
            System.out.println("Contact has been updated successfully");
        } catch (Exception ex) {
            Logger.getLogger(EditContact_interface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton_updateActionPerformed

    private void jTextField_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_searchActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
        String byName = "By Name";
        String byId = "By Id";
        
        if(jComboBox1.getSelectedItem().toString() == byName){
            
            // sort contact by names.
            SelectionSortByName(contacts);
            
            // destroy table rows.
            DefaultTableModel model = (DefaultTableModel) jTableContacts.getModel();
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            
            // create table tows and populate it with contacts sorted by name.
            Object rowData[] = new Object[6];
            for (int i = 0; i < contacts.size(); i++) {
                rowData[0] = contacts.get(i).getId();
                rowData[1] = contacts.get(i).getName();
                rowData[2] = contacts.get(i).getAddress();
                rowData[3] = contacts.get(i).getCity();
                rowData[4] = contacts.get(i).getState();
                rowData[5] = contacts.get(i).getPhoneNumber();
                //model.addRow(rowData);
                model.insertRow(i, rowData);
            }
            
            
        }
        if (jComboBox1.getSelectedItem().toString() == byId) {
            
            // sort contacts by id.
            SelectionSortById(contacts);
            
            // destroy the table rows.
            DefaultTableModel model = (DefaultTableModel) jTableContacts.getModel();
            model.getDataVector().removeAllElements();
            model.fireTableDataChanged();
            
            // create table tows and populate it with contacts sorted by id.
            Object rowData[] = new Object[6];
            for (int i = 0; i < contacts.size(); i++) {
                rowData[0] = contacts.get(i).getId();
                rowData[1] = contacts.get(i).getName();
                rowData[2] = contacts.get(i).getAddress();
                rowData[3] = contacts.get(i).getCity();
                rowData[4] = contacts.get(i).getState();
                rowData[5] = contacts.get(i).getPhoneNumber();
                //model.addRow(rowData);
                model.insertRow(i, rowData);
            }
            
        }
        
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_clearActionPerformed
        
        // clear search text field.
        jTextField_search.setText("");
        
        // destroy table rows.
        DefaultTableModel model = (DefaultTableModel) jTableContacts.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        // create table tows and populate it with contacts list.
        Object rowData[] = new Object[6];
        for (int i = 0; i < contacts.size(); i++) {
            rowData[0] = contacts.get(i).getId();
            rowData[1] = contacts.get(i).getName();
            rowData[2] = contacts.get(i).getAddress();
            rowData[3] = contacts.get(i).getCity();
            rowData[4] = contacts.get(i).getState();
            rowData[5] = contacts.get(i).getPhoneNumber();
            //model.addRow(rowData);
            model.insertRow(i, rowData);
        }
    }//GEN-LAST:event_jButton_clearActionPerformed

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        
        String element = jTextField_search.getText().toString();
        
        
        
        // creating trie and inserting all contacts name to it.
        Trie trie = new Trie();
        for(int i = 0; i < contacts.size(); i++){
            trie.insert(contacts.get(i).getName());
        }
        
        // creating set and give it all the names that matches the searched word.
        Set<String> list = trie.getAllWords(element);
        System.out.println(list);
        
        // converting set to array.
        String[] contactsSearched = list.toArray(new String[list.size()]);
        for(int i = 0; i < contactsSearched.length; i++){
            System.out.println(contactsSearched[i]);
        }
        
        // if any contact match the name in array, add this contact to searchContacts list.
        for(int i = 0; i < contactsSearched.length; i++){
            for(int j = 0; j < contacts.size(); j++){
                if(contacts.get(j).getName().contains(contactsSearched[i])){
                    searchContacts.add(contacts.get(j));
                }
            }
        }
        
        for(int i = 0; i < searchContacts.size(); i++){
            System.out.println(searchContacts.get(i).toString());
        }
        
        // destroy table rows.
        DefaultTableModel model = (DefaultTableModel) jTableContacts.getModel();
        model.getDataVector().removeAllElements();
        model.fireTableDataChanged();
        
        // create table tows and populate it with searchContacts list.
        Object rowData[] = new Object[6];
        for (int i = 0; i < searchContacts.size(); i++) {
            rowData[0] = searchContacts.get(i).getId();
            rowData[1] = searchContacts.get(i).getName();
            rowData[2] = searchContacts.get(i).getAddress();
            rowData[3] = searchContacts.get(i).getCity();
            rowData[4] = searchContacts.get(i).getState();
            rowData[5] = searchContacts.get(i).getPhoneNumber();
            //model.addRow(rowData);
            model.insertRow(i, rowData);
        }
        
        // clear searchContacts list.
        searchContacts.clear();

        
        
    }//GEN-LAST:event_jButton_searchActionPerformed

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
            java.util.logging.Logger.getLogger(EditContact_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditContact_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditContact_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditContact_interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new EditContact_interface().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(EditContact_interface.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_clear;
    private javax.swing.JButton jButton_delete;
    private javax.swing.JButton jButton_search;
    private javax.swing.JButton jButton_update;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_sort;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContacts;
    private javax.swing.JTextField jTextField_search;
    // End of variables declaration//GEN-END:variables

    private static void close(Connection con, Statement st, ResultSet rs) throws Exception {
		try{
			if(con!=null)
				con.close();
			if(st!=null)
				st.close();
			if(rs!=null)
				rs.close();
			
		}
		catch(Exception ex){
			throw new Exception();
		}
		
    }
    
     // add rows to table and populate them with list of contacts data.
     public void addRowToJTable(DoublyLinkedList<Contact> listContacts)
    {
        DefaultTableModel model = (DefaultTableModel) jTableContacts.getModel();
        //listContacts = ListUsers();
        Object rowData[] = new Object[6];
        for(int i = 0; i < listContacts.size(); i++)
        {
            rowData[0] = listContacts.get(i).getId();
            rowData[1] = listContacts.get(i).getName();
            rowData[2] = listContacts.get(i).getAddress();
            rowData[3] = listContacts.get(i).getCity();
            rowData[4] = listContacts.get(i).getState();
            rowData[5] = listContacts.get(i).getPhoneNumber();
            model.insertRow(i, rowData);
        }
                
    }
     
    public void updateContact() throws Exception{
        
        int id = Integer.parseInt(String.valueOf(jTableContacts.getModel().getValueAt(jTableContacts.getSelectedRow(), 0)));
        String name = (String) jTableContacts.getModel().getValueAt(jTableContacts.getSelectedRow(), 1);
        String address = (String) jTableContacts.getModel().getValueAt(jTableContacts.getSelectedRow(), 2);
        String city = (String) jTableContacts.getModel().getValueAt(jTableContacts.getSelectedRow(), 3);
        String state = (String) jTableContacts.getModel().getValueAt(jTableContacts.getSelectedRow(), 4);
        String phoneNumber = (String) jTableContacts.getModel().getValueAt(jTableContacts.getSelectedRow(), 5);
    
        ContactDAO DBContacts = new ContactDAO("phonebook_database",userName,password);
        
        Contact contact = new Contact(id, name, address, city, state, phoneNumber);
        
        DBContacts.updateContact(contact);
        
        contacts.removeAt(jTableContacts.getSelectedRow());
        contacts.addAt(jTableContacts.getSelectedRow(), contact);
  
 
    }
    
    public void deleteContact() throws Exception{
        
        // delete the selected contact from the database.
        DefaultTableModel model = (DefaultTableModel) jTableContacts.getModel();
        int id = Integer.parseInt(String.valueOf(model.getValueAt(jTableContacts.getSelectedRow(), 0)));
        ContactDAO DBContacts = new ContactDAO("phonebook_database",userName,password);
        DBContacts.deleteContact(id);
        
        
        // remove the deleted contact from the contacts list and from the table.
        contacts.removeAt(jTableContacts.getSelectedRow());
        model.removeRow(jTableContacts.getSelectedRow());
        
        for(int i = 0; i < contacts.size(); i++){
            System.out.println(contacts.get(i).toString());
        }
        System.out.println();
    }
    
 
    // sort contacts by id.
    public void SelectionSortById(DoublyLinkedList<Contact> listContacts) {
        for (int i = 0; i < listContacts.size() - 1; i++) {                      
            Contact minIdContact = listContacts.get(i);
            for (int j = i + 1; j < listContacts.size(); j++) {
                Contact temp = new Contact();                
                // if contacts at position j has less id than at position i, 
                // set contact at position j to be the minIdContact.
                if (listContacts.get(j).getId() < listContacts.get(i).getId()) {
                    
                    minIdContact = listContacts.get(j);                    
                    // Swap contact with smallest id to the current position in list.                    
                    temp.setId(listContacts.get(i).getId());
                    temp.setName(listContacts.get(i).getName());
                    temp.setAddress(listContacts.get(i).getAddress());
                    temp.setCity(listContacts.get(i).getCity());
                    temp.setState(listContacts.get(i).getState());
                    temp.setPhoneNumber(listContacts.get(i).getPhoneNumber());

                    listContacts.get(i).setId(minIdContact.getId());
                    listContacts.get(i).setName(minIdContact.getName());
                    listContacts.get(i).setAddress(minIdContact.getAddress());
                    listContacts.get(i).setCity(minIdContact.getCity());
                    listContacts.get(i).setState(minIdContact.getState());
                    listContacts.get(i).setPhoneNumber(minIdContact.getPhoneNumber());

                    minIdContact.setId(temp.getId());
                    minIdContact.setName(temp.getName());
                    minIdContact.setAddress(temp.getAddress());
                    minIdContact.setCity(temp.getCity());
                    minIdContact.setState(temp.getState());
                    minIdContact.setPhoneNumber(temp.getPhoneNumber());
                }
            }
        }
    }
    
    
    // sort contacts by name.
    public void SelectionSortByName(DoublyLinkedList<Contact> listContacts) {
        for (int i = 0; i < listContacts.size() - 1; i++) {
           
            Contact minNameContact = listContacts.get(i);

            for (int j = i + 1; j < listContacts.size(); j++) {
                Contact temp = new Contact();
                
                // if contacts at position j has smaller name than at position i, set contact at position j to be the minNameContact.
                if (listContacts.get(j).getName().compareToIgnoreCase(listContacts.get(i).getName()) < 0) {

                    minNameContact = listContacts.get(j);
                                        
                    // Swap contact with smallest name to the current position in list.
                    
                    temp.setId(listContacts.get(i).getId());
                    temp.setName(listContacts.get(i).getName());
                    temp.setAddress(listContacts.get(i).getAddress());
                    temp.setCity(listContacts.get(i).getCity());
                    temp.setState(listContacts.get(i).getState());
                    temp.setPhoneNumber(listContacts.get(i).getPhoneNumber());

                    listContacts.get(i).setId(minNameContact.getId());
                    listContacts.get(i).setName(minNameContact.getName());
                    listContacts.get(i).setAddress(minNameContact.getAddress());
                    listContacts.get(i).setCity(minNameContact.getCity());
                    listContacts.get(i).setState(minNameContact.getState());
                    listContacts.get(i).setPhoneNumber(minNameContact.getPhoneNumber());

                    minNameContact.setId(temp.getId());
                    minNameContact.setName(temp.getName());
                    minNameContact.setAddress(temp.getAddress());
                    minNameContact.setCity(temp.getCity());
                    minNameContact.setState(temp.getState());
                    minNameContact.setPhoneNumber(temp.getPhoneNumber());

                }

            }

        }
    }
    
    
    
    
}
