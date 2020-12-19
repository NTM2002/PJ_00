import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.DefaultListModel;
import javax.swing.ListSelectionModel;
import java.io.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Search extends javax.swing.JFrame {
    static int i;
    ArrayList Music = new ArrayList();
    DefaultListModel defaultListModel=new DefaultListModel();
        
    public Search() {
       
        initComponents();
        this.bindData();
        getMusic();
            
    }   
    private ArrayList getMusic()
    {
        ArrayList Music = new ArrayList();
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
            while(rs.next()){
                String data = rs.getString("MusicName")+"--"+ rs.getString("MusicArtist");
                Music.add(data);
                    }
            conn.close();
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }   
    
        return Music;
    }
    
        private void bindData(){
        
        getMusic().stream().forEach((music) -> {
            defaultListModel.addElement(music);
        });
        List.setModel(defaultListModel);
        List.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
        
private void searchFilter(String searchTerm)
    {
        DefaultListModel filteredItems=new DefaultListModel();
        ArrayList Music = getMusic();
        Music.stream().forEach((music) -> {
            String musicName=music.toString().toLowerCase();
            if (musicName.contains(searchTerm.toLowerCase())) {
                filteredItems.addElement(music);
            }
        });
        defaultListModel=filteredItems;
        List.setModel(defaultListModel);
    }
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        rand = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        List = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MFU MUSIC--Search");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Picture/logo.png")));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        name.setBackground(new java.awt.Color(0, 0, 0));
        name.setFont(new java.awt.Font("Constantia", 0, 13)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setToolTipText("");
        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });

        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/searchlogo.png"))); // NOI18N
        search.setBorderPainted(false);
        search.setContentAreaFilled(false);
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                searchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                searchMouseExited(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        rand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/randomlogo.png"))); // NOI18N
        rand.setBorderPainted(false);
        rand.setContentAreaFilled(false);
        rand.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                randMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                randMouseExited(evt);
            }
        });
        rand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                randActionPerformed(evt);
            }
        });

        List.setBackground(new java.awt.Color(0, 0, 0));
        List.setFont(new java.awt.Font("Constantia", 0, 16)); // NOI18N
        List.setForeground(new java.awt.Color(255, 255, 255));
        List.setSelectionBackground(new java.awt.Color(255, 255, 255));
        List.setSelectionForeground(new java.awt.Color(0, 0, 0));
        List.setVisibleRowCount(10);
        List.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(List);

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
                .addGap(1, 1, 1)
                .addComponent(close))
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(rand))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(search))))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 444, Short.MAX_VALUE)
                        .addGap(36, 36, 36))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rand)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMouseClicked
        i = List.getSelectedIndex()+1;
        try
        {
        String sql = "select * from Music where idMusic = ?";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/midpj"+ 
                    "?verifyServerCertificate=false" + 
                    "&useSSL=false"+
                    "&requireSSL=false","root","123456");
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,i);
        ResultSet rs = pstmt.executeQuery();
        if(rs.next()){
                PlayerForm.songNameDisplay.setText("Playing Now... |" + rs.getString("MusicName")+"-"+ rs.getString("MusicArtist") );
                File pth = new File(rs.getString("MusicPath"));
                System.out.print(pth);
                this.setVisible(false); 
                PlayerForm.player.addToPlayList(pth);
                PlayerForm.player.skipForward();
                PlayerForm.player.play();
                
            conn.close();
        }}
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }   

    }//GEN-LAST:event_ListMouseClicked

    private void randActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_randActionPerformed
        Random rand = new Random();
        int max = 100;
        int i = rand.nextInt(max);
        try
        {
        String sql = "select * from Music where idMusic = ?";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/midpj"+ 
                    "?verifyServerCertificate=false" + 
                    "&useSSL=false"+
                    "&requireSSL=false","root","123456");
        PreparedStatement pstmt = conn.prepareStatement(sql);
        pstmt.setInt(1,i);
        ResultSet rs = pstmt.executeQuery();
        if(!rs.next()){
            i = rand.nextInt(max);  
        }
        else{
            PlayerForm.songNameDisplay.setText("Playing Now... |" + rs.getString("MusicName")+"-"+ rs.getString("MusicArtist") );
                File pth = new File(rs.getString("MusicPath"));
                this.setVisible(false); 
                PlayerForm.player.addToPlayList(pth);
                PlayerForm.player.skipForward();
                PlayerForm.player.play();
                conn.close();
        }} 
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }   
    }//GEN-LAST:event_randActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        searchFilter(name.getText());
    }//GEN-LAST:event_searchActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameKeyReleased
        searchFilter(name.getText());
    }//GEN-LAST:event_nameKeyReleased

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.setVisible (false);
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

    private void nameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusGained
        name.setBackground(Color.WHITE);
        name.setForeground(Color.BLACK);
    }//GEN-LAST:event_nameFocusGained

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        name.setBackground(Color.BLACK);
        name.setForeground(Color.WHITE);
    }//GEN-LAST:event_nameFocusLost

    private void searchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseEntered
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/searchlogo_focus.png")));
    }//GEN-LAST:event_searchMouseEntered

    private void searchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseExited
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/searchlogo.png")));
    }//GEN-LAST:event_searchMouseExited

    private void randMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_randMouseEntered
        rand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/randomlogo_focus.png")));
    }//GEN-LAST:event_randMouseEntered

    private void randMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_randMouseExited
        rand.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/randomlogo.png")));
    }//GEN-LAST:event_randMouseExited

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JList<String> List;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mini;
    private javax.swing.JTextField name;
    private javax.swing.JButton rand;
    private javax.swing.JButton search;
    // End of variables declaration//GEN-END:variables
}
