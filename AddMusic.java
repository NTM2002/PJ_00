import java.awt.Toolkit;
import java.io.File;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.*;


public class AddMusic extends javax.swing.JFrame {

    static String path,name,artist;
    static File selectedFile;
    public AddMusic() {
        initComponents();
        listDataToJTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        musicname = new javax.swing.JTextField();
        Addmusic = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        filename = new javax.swing.JTextField();
        bt_file = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        artistname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MFU Music");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Picture/logo.png")));
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(900, 650));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        Table.setFont(new java.awt.Font("Impact", 0, 16)); // NOI18N
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No", "Music", "Artist", "File"
            }
        ));
        jScrollPane1.setViewportView(Table);

        jLabel1.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Music ");

        musicname.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N

        Addmusic.setFont(new java.awt.Font("Impact", 0, 13)); // NOI18N
        Addmusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/addlogo.png"))); // NOI18N
        Addmusic.setBorderPainted(false);
        Addmusic.setContentAreaFilled(false);
        Addmusic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddmusicMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddmusicMouseExited(evt);
            }
        });
        Addmusic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddmusicActionPerformed(evt);
            }
        });

        cancel.setFont(new java.awt.Font("Impact", 0, 13)); // NOI18N
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/cancelogo.png"))); // NOI18N
        cancel.setBorderPainted(false);
        cancel.setContentAreaFilled(false);
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelMouseExited(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("File ");

        bt_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/browselogo.png"))); // NOI18N
        bt_file.setBorderPainted(false);
        bt_file.setContentAreaFilled(false);
        bt_file.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt_fileMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bt_fileMouseExited(evt);
            }
        });
        bt_file.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_fileActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Artist ");

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Add Music");

        back.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/backlogo.png"))); // NOI18N
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(musicname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(artistname, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                    .addComponent(filename))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bt_file)))
                        .addGap(459, 459, 459))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(320, 320, 320))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Addmusic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancel))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(musicname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Addmusic)
                        .addComponent(cancel)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(artistname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(12, 12, 12)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(filename, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addGap(32, 32, 32))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt_file)
                                    .addGap(23, 23, 23))))))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(back)
                .addGap(14, 14, 14))
        );

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(900, 50));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/logo_head.png"))); // NOI18N
        jLabel12.setText("  MFU MUSIC");

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/close.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });

        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/minimize.png"))); // NOI18N
        mini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                miniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                miniMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mini)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(close)
                .addGap(0, 0, 0))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel12)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mini)
                    .addComponent(close))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddmusicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddmusicActionPerformed
        if (verifyCompleteInput())
        {
                try {
                    String sql = "insert into music (MusicName,MusicArtist,MusicPath) value (?,?,?)";
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/midpj"+ 
                            "?verifyServerCertificate=false" + 
                            "&useSSL=false"+
                            "&requireSSL=false","root","123456");
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1,musicname.getText());
                    pstmt.setString(2,artistname.getText());
                    pstmt.setString(3,filename.getText());
                    if (pstmt.executeUpdate()!=0)
                    {
                        JOptionPane.showMessageDialog(null, "Save data!");
                        listDataToJTable();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Error! Plese recheck your data!" );

                    }
                    conn.close();
                }
                catch (Exception e){
                  JOptionPane.showMessageDialog(null,e);
                }
            
            
        }
        musicname.setText("");
        artistname.setText("");
        filename.setText("");
    }//GEN-LAST:event_AddmusicActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        musicname.setText("");
        artistname.setText("");
        filename.setText("");
    }//GEN-LAST:event_cancelActionPerformed

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.setVisible (false);
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/close_red.png")));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/close.png")));
    }//GEN-LAST:event_closeMouseExited

    private void miniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseClicked
        this.setState(this.ICONIFIED);
    }//GEN-LAST:event_miniMouseClicked

    private void miniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseEntered
        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/minimize_focus.png")));
    }//GEN-LAST:event_miniMouseEntered

    private void miniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miniMouseExited
        mini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/minimize.png")));
    }//GEN-LAST:event_miniMouseExited

    private void bt_fileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_fileActionPerformed
        JFileChooser fileopen = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(".mp3", "mp3");
        fileopen.setFileFilter(filter);
        int ret = fileopen.showDialog(null, "Select");
        if (ret == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileopen.getSelectedFile();
            path = selectedFile.getPath().toString();
            filename.setText(path);
        }
    }//GEN-LAST:event_bt_fileActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.setVisible (false);
        new AdminProfile().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/backlogo_focus.png")));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/backlogo.png")));
    }//GEN-LAST:event_backMouseExited

    private void AddmusicMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddmusicMouseEntered
        Addmusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/addlogo_focus.png")));
    }//GEN-LAST:event_AddmusicMouseEntered

    private void AddmusicMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddmusicMouseExited
        Addmusic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/addlogo.png")));
    }//GEN-LAST:event_AddmusicMouseExited

    private void cancelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseEntered
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/cancelogo_focus.png")));
    }//GEN-LAST:event_cancelMouseEntered

    private void cancelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseExited
        cancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/cancelogo.png")));
    }//GEN-LAST:event_cancelMouseExited

    private void bt_fileMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_fileMouseEntered
        bt_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/browselogo_focus.png")));
    }//GEN-LAST:event_bt_fileMouseEntered

    private void bt_fileMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_fileMouseExited
        bt_file.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/browselogo.png")));
    }//GEN-LAST:event_bt_fileMouseExited


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMusic().setVisible(true);
            }
        });
    }
    public boolean verifyCompleteInput(){
        String Name = musicname.getText();
        String Artist = artistname.getText();
        String File = filename.getText();
        
        if (Name.trim().equals("")||Artist.trim().equals("")||File.trim().equals(""))
            {
              JOptionPane.showMessageDialog(null, "Plaese full all data!");  
              return false;
            }
        else
            {
              return true;
            }
    }



public void listDataToJTable(){
        try
        {
            String sql = "select * from Music";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/midpj"+ 
                    "?verifyServerCertificate=false" + 
                    "&useSSL=false"+
                    "&requireSSL=false","root","123456");
            PreparedStatement pstmt = conn.prepareStatement(sql);         
            ResultSet rs = pstmt.executeQuery();
            DefaultTableModel model = (DefaultTableModel)Table.getModel();  
            model.setRowCount(0);
            while(rs.next()){
                Object o[] = {
                    rs.getInt("idMusic"),
                    rs.getString("MusicName"),
                    rs.getString("MusicArtist"),
                    rs.getString("MusicPath")};
                model.addRow(o);
            }
            conn.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }   
 
     }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addmusic;
    private javax.swing.JTable Table;
    private javax.swing.JTextField artistname;
    private javax.swing.JButton back;
    private javax.swing.JButton bt_file;
    private javax.swing.JButton cancel;
    private javax.swing.JLabel close;
    private javax.swing.JTextField filename;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel mini;
    private javax.swing.JTextField musicname;
    // End of variables declaration//GEN-END:variables
}
