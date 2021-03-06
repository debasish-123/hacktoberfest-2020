
package mangement.panel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import mangement.MySqlConnect;

public class EditProfile_panel extends javax.swing.JPanel {
    
    private Cursor cursor;
    private ButtonGroup group;
    String s;

    /**
     * Creates new form EditProfile_panel
     */
    public EditProfile_panel() {
        initComponents();
        cursor = new Cursor(Cursor.HAND_CURSOR);
        
        group = new ButtonGroup();
        group.add(male);
        group.add(female);
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
        first_Name = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        last_Name = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        contact_Number = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        location = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        blood_Group = new javax.swing.JComboBox<>();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        profilePhoto = new javax.swing.JLabel();
        photoText = new javax.swing.JTextField();
        upload_panel = new javax.swing.JPanel();
        choosePhoto = new javax.swing.JLabel();
        upload = new javax.swing.JPanel();
        upload_photo = new javax.swing.JLabel();
        save = new javax.swing.JToggleButton();
        phone_Number = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        ok = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 51, 102));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 51, 102));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Edit First Name");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 147, 50));

        first_Name.setBackground(new java.awt.Color(0, 51, 102));
        first_Name.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        first_Name.setForeground(new java.awt.Color(255, 255, 255));
        first_Name.setBorder(null);
        add(first_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 250, 30));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 250, 10));

        jLabel1.setBackground(new java.awt.Color(0, 51, 102));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Edit your Age");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 160, 30));

        age.setBackground(new java.awt.Color(0, 51, 102));
        age.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        age.setForeground(new java.awt.Color(255, 255, 255));
        age.setBorder(null);
        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageKeyPressed(evt);
            }
        });
        add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 200, 30));
        add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 200, 10));

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Edit Last Name");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 140, 30));

        last_Name.setBackground(new java.awt.Color(0, 51, 102));
        last_Name.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        last_Name.setForeground(new java.awt.Color(255, 255, 255));
        last_Name.setBorder(null);
        add(last_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 240, 30));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 240, 10));

        jLabel5.setBackground(new java.awt.Color(0, 51, 102));
        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Edit Another Contract Number");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 220, 30));

        contact_Number.setBackground(new java.awt.Color(0, 51, 102));
        contact_Number.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        contact_Number.setForeground(new java.awt.Color(255, 255, 255));
        contact_Number.setBorder(null);
        contact_Number.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contact_NumberKeyPressed(evt);
            }
        });
        add(contact_Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 230, 30));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 230, 10));

        jLabel8.setBackground(new java.awt.Color(0, 51, 102));
        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Edit Location");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 160, 30));

        location.setBackground(new java.awt.Color(0, 51, 102));
        location.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        location.setForeground(new java.awt.Color(255, 255, 255));
        location.setBorder(null);
        add(location, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 250, 30));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 250, 10));

        jLabel7.setBackground(new java.awt.Color(0, 51, 102));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Select your Blood Group");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 180, 30));

        blood_Group.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        blood_Group.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "O (+)", "A(+)", "B(+)", "AB(+)", "O(-)", "A(-)", "B(-)", "AB(-)", " " }));
        blood_Group.setBorder(null);
        add(blood_Group, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 140, 30));

        male.setBackground(new java.awt.Color(0, 51, 102));
        male.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        male.setForeground(new java.awt.Color(255, 255, 255));
        male.setText("Male");
        add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, 90, -1));

        female.setBackground(new java.awt.Color(0, 51, 102));
        female.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        female.setForeground(new java.awt.Color(255, 255, 255));
        female.setText("Female");
        add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 90, -1));
        add(profilePhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 66, 240, 220));

        photoText.setBackground(new java.awt.Color(0, 51, 102));
        photoText.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        photoText.setForeground(new java.awt.Color(255, 255, 255));
        photoText.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        add(photoText, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 290, 220, 30));

        upload_panel.setBackground(new java.awt.Color(0, 51, 102));
        upload_panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        choosePhoto.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        choosePhoto.setForeground(new java.awt.Color(255, 255, 255));
        choosePhoto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        choosePhoto.setText("Choose a Photo");
        choosePhoto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                choosePhotoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                choosePhotoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                choosePhotoMouseExited(evt);
            }
        });
        upload_panel.add(choosePhoto, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 30));

        add(upload_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, 110, 30));

        upload.setBackground(new java.awt.Color(0, 51, 102));
        upload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                uploadMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                uploadMouseExited(evt);
            }
        });
        upload.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        upload_photo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        upload_photo.setForeground(new java.awt.Color(255, 255, 255));
        upload_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Upload.png"))); // NOI18N
        upload_photo.setText("Upload ");
        upload_photo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                upload_photoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                upload_photoMouseEntered(evt);
            }
        });
        upload.add(upload_photo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 90, -1));

        add(upload, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 100, 30));

        save.setBackground(new java.awt.Color(255, 255, 255));
        save.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        save.setForeground(new java.awt.Color(0, 0, 51));
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/save.png"))); // NOI18N
        save.setText("Update");
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saveMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveMouseExited(evt);
            }
        });
        add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 130, 40));

        phone_Number.setBackground(new java.awt.Color(0, 51, 102));
        phone_Number.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        phone_Number.setForeground(new java.awt.Color(255, 255, 255));
        phone_Number.setBorder(null);
        add(phone_Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 300, 30));
        add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 380, 10));

        jLabel9.setBackground(new java.awt.Color(0, 51, 102));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Verify your phone number");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, 50));

        ok.setBackground(new java.awt.Color(255, 255, 255));
        ok.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        ok.setForeground(new java.awt.Color(0, 0, 102));
        ok.setText("OK");
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                okMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                okMouseExited(evt);
            }
        });
        add(ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 80, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void choosePhotoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choosePhotoMouseEntered
        upload_panel.setBackground(new Color(101, 79, 161));
        upload_panel.setCursor(cursor);
        
    }//GEN-LAST:event_choosePhotoMouseEntered

    private void choosePhotoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choosePhotoMouseExited
        
        upload_panel.setBackground(new Color(0, 51, 102));
    }//GEN-LAST:event_choosePhotoMouseExited

    private void choosePhotoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_choosePhotoMouseClicked
       
        JFileChooser choose = new JFileChooser();
        choose.showOpenDialog(this);
        File file = choose.getSelectedFile();
        String filename = file.getAbsolutePath();
        photoText.setText(filename);
        profilePhoto.getIcon();
        
        ImageIcon icon=new ImageIcon(filename); 
        
        //Scaling the image
        Image image = icon.getImage();
        Image new_image = image.getScaledInstance(profilePhoto.getWidth(), profilePhoto.getHeight(), Image.SCALE_SMOOTH);
        
        ImageIcon photo = new ImageIcon(new_image);
        profilePhoto.setIcon(photo);
        
        s = filename;
    }//GEN-LAST:event_choosePhotoMouseClicked

    private void uploadMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadMouseEntered
        
        upload.setBackground(new Color(101, 79, 161));
        upload.setCursor(cursor);
    }//GEN-LAST:event_uploadMouseEntered

    private void uploadMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadMouseExited
        
        upload.setBackground(new Color(0, 51, 102));
    }//GEN-LAST:event_uploadMouseExited

    private boolean validateField(){
        
        if (phone_Number.getText().isEmpty()){
            
            JOptionPane.showMessageDialog(null, "Please enter your 12 digit number","Warning",JOptionPane.PLAIN_MESSAGE);
            
            return false;
        }
        
        return true;
    }
    
    
    private void saveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseClicked
       
        if (validateField()){
 
            
       try
       {        
           
                Connection conn= MySqlConnect.ConnectDB();
                String sql="UPDATE  blood_management_system.donar_information set firstName = ?,lastName = ?,age = ?,bloodGroup = ?,anotherContactNumber = ?,gender = ?,location = ? WHERE phoneNumber = ? ";
       
                PreparedStatement  pst=conn.prepareStatement(sql);
                pst.setString(1,first_Name.getText());
                pst.setString(2,last_Name.getText());
                pst.setInt(3,Integer.parseInt(age.getText()));
              
                String bloodgroup;
                
                bloodgroup = blood_Group.getSelectedItem().toString();
                pst.setString(4,bloodgroup);
              
              
                pst.setString(5, contact_Number.getText());
                
                String gender = null;
                
                if(male.isSelected()){
                    
                    gender = male.getText();
                }
                if (female.isSelected()){
                    
                    gender = female.getText();
                }  
                pst.setString(6, gender);
                pst.setString(7, location.getText());
                pst.setString(8, phone_Number.getText());
               
                 
                pst.executeUpdate();
                 
                 JOptionPane.showMessageDialog(null, "Record updated successfully");
                 conn.close();
       
       }
       catch(Exception e)
       {
         
            JOptionPane.showMessageDialog(null, "Please select all properly","Warning",JOptionPane.PLAIN_MESSAGE);
            
           
             }
        
        }
    }//GEN-LAST:event_saveMouseClicked

    private void upload_photoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upload_photoMouseClicked
        
        try{
            
            Connection conn = MySqlConnect.ConnectDB();
            String sql = "UPDATE  blood_management_system.donar_information set profile_photo = ?  WHERE phoneNumber = '"+phone_Number.getText()+"'";
            
            PreparedStatement  pst=conn.prepareStatement(sql);
            
            InputStream is = new FileInputStream(new File(s));
            
            pst.setBlob(1, is);
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Profile Pucture Uploaded");
            conn.close();
            
        }
        catch(Exception e){
            
            JOptionPane.showMessageDialog(null, "Failed to upload");
            
        }
    }//GEN-LAST:event_upload_photoMouseClicked

    private void contact_NumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contact_NumberKeyPressed
        
         char c = evt.getKeyChar();
        
        if (!(Character.isDigit(c) || (c==com.sun.glass.events.KeyEvent.VK_BACKSPACE) ||(c==com.sun.glass.events.KeyEvent.VK_DELETE))){
            
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_contact_NumberKeyPressed

    private void ageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyPressed
        
         char c = evt.getKeyChar();
        
        if (!(Character.isDigit(c) || (c==com.sun.glass.events.KeyEvent.VK_BACKSPACE) ||(c==com.sun.glass.events.KeyEvent.VK_DELETE))){
            
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_ageKeyPressed

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
      
        save.setBackground(Color.gray);
        save.setForeground(new Color(0,0,51));
        save.setCursor(cursor);
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
       
        save.setBackground(Color.WHITE);
        save.setForeground(new Color(0,0,51));
    }//GEN-LAST:event_saveMouseExited

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked
        
        if (validateField()){
                          
            String username = phone_Number.getText();
        
        try{
            Connection conn = MySqlConnect.ConnectDB();
           String sql = "SELECT phoneNumber,firstName,lastName,age,anotherContactNumber,location,gender,bloodgroup FROM blood_management_system.donar_information WHERE phoneNumber = '"+phone_Number.getText()+"'";
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            rs.next();
            
            if (username.equals(rs.getString("phoneNumber"))){
                
                String firstName = rs.getString("firstName");
                String lastName =  rs.getString("lastName");
                String Age = rs.getString("age");
                String anotherphone = rs.getString("anotherContactNumber");
                String address = rs.getString("location");
                String gender = rs.getString("gender");
                String bloodgroup = rs.getString("bloodGroup");
                
                first_Name.setText(firstName);
                last_Name.setText(lastName);
                age.setText(Age);
                contact_Number.setText(anotherphone);
                location.setText(address);
                
                
            }
            conn.close();
  
        }catch(Exception e){
            
           JOptionPane.showMessageDialog(null, "Details not found","ERROR",JOptionPane.PLAIN_MESSAGE);
            
        }
      }
    }//GEN-LAST:event_okMouseClicked

    private void okMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseEntered
        
        ok.setBackground(Color.darkGray);
        ok.setForeground(Color.WHITE);
        ok.setCursor(cursor);
    }//GEN-LAST:event_okMouseEntered

    private void okMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseExited
       
        ok.setBackground(Color.WHITE);
        ok.setForeground(new Color(0,0,102));
    }//GEN-LAST:event_okMouseExited

    private void upload_photoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_upload_photoMouseEntered
        
        upload_photo.setCursor(cursor);
    }//GEN-LAST:event_upload_photoMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JComboBox<String> blood_Group;
    private javax.swing.JLabel choosePhoto;
    private javax.swing.JTextField contact_Number;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField first_Name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField last_Name;
    private javax.swing.JTextField location;
    private javax.swing.JRadioButton male;
    private javax.swing.JButton ok;
    private javax.swing.JTextField phone_Number;
    private javax.swing.JTextField photoText;
    private javax.swing.JLabel profilePhoto;
    private javax.swing.JToggleButton save;
    private javax.swing.JPanel upload;
    private javax.swing.JPanel upload_panel;
    private javax.swing.JLabel upload_photo;
    // End of variables declaration//GEN-END:variables
}
