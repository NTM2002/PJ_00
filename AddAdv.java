import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.Image;
import java.io.File;
import java.awt.*;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AddAdv extends javax.swing.JFrame {
static String path;
static ImageIcon adv;
int i = 1 ;

    public AddAdv() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        file = new javax.swing.JTextField();
        browse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        show_date = new javax.swing.JTextField();
        date_payment = new javax.swing.JTextField();
        time_payment = new javax.swing.JTextField();
        payment = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        mini = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MFU Music");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Picture/logo.png")));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel1.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("File :");

        file.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N

        browse.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        browse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/browselogo.png"))); // NOI18N
        browse.setBorderPainted(false);
        browse.setContentAreaFilled(false);
        browse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                browseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                browseMouseExited(evt);
            }
        });
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Payment ");

        jLabel3.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Date :");

        jLabel4.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date :");

        jLabel5.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Price :");

        jLabel6.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Time :");

        show_date.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        show_date.setForeground(new java.awt.Color(153, 153, 153));
        show_date.setText("7/7/20-14/7/20");
        show_date.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                show_dateFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                show_dateFocusLost(evt);
            }
        });

        date_payment.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        date_payment.setForeground(new java.awt.Color(153, 153, 153));
        date_payment.setText("4/7/20");
        date_payment.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                date_paymentFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                date_paymentFocusLost(evt);
            }
        });

        time_payment.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        time_payment.setForeground(new java.awt.Color(153, 153, 153));
        time_payment.setText("12.03");
        time_payment.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                time_paymentFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                time_paymentFocusLost(evt);
            }
        });

        payment.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        payment.setForeground(new java.awt.Color(153, 153, 153));
        payment.setText("35");
        payment.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                paymentFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                paymentFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Detail");

        jLabel9.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("***note***");

        jLabel11.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("5 THB/day");

        save.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/savelogo.png"))); // NOI18N
        save.setBorderPainted(false);
        save.setContentAreaFilled(false);
        save.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                saveMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                saveMouseExited(evt);
            }
        });
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Constantia", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Add Advetisement");

        jLabel7.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("We will update the advertisement(s) at 00.00 everyday.");

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

        jLabel10.setFont(new java.awt.Font("Constantia", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Picture size : 900x300");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(show_date, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(file, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(browse))
                        .addComponent(jLabel7)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(date_payment))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(39, 39, 39)
                            .addComponent(jLabel6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(time_payment, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(save))
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(browse, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(file, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(show_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(date_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(time_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(save))
                .addGap(50, 50, 50)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(back)
                .addGap(24, 24, 24))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 656, Short.MAX_VALUE)
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 620, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        JFileChooser fileopen = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "png", "jpeg");
        fileopen.setFileFilter(filter);
        int ret = fileopen.showDialog(null, "Select");
        if (ret == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileopen.getSelectedFile();
            path = selectedFile.getAbsolutePath();
            file.setText(path);
            adv = new ImageIcon(path);
            Image img = adv.getImage();
            Image scale = img.getScaledInstance(800, 300, Image.SCALE_SMOOTH);
            adv = new ImageIcon(scale);
            
        }
    }//GEN-LAST:event_browseActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (verifyCompleteInput())
        {
                try {
                    String sql = "insert into advertisement (AdvertisementFile,AdvertisementShowdate,Paydate,Paytime,PayTotal,status) value (?,?,?,?,?,?)";
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection conn = DriverManager.getConnection(
                            "jdbc:mysql://localhost:3306/midpj"+ 
                            "?verifyServerCertificate=false" + 
                            "&useSSL=false"+
                            "&requireSSL=false","root","123456");
                    PreparedStatement pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1,file.getText());
                    pstmt.setString(2,show_date.getText());
                    pstmt.setString(3,date_payment.getText());
                    pstmt.setString(4,time_payment.getText());
                    pstmt.setString(5,payment.getText());
                    pstmt.setString(6,"none");
                    if (pstmt.executeUpdate()!=0)
                    {
                        JOptionPane.showMessageDialog(null, "Save data!");
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
        file.setText("");
        show_date.setText("");
        date_payment.setText("");
        time_payment.setText("");
        payment.setText("");
        JOptionPane.showMessageDialog(null,"Thank you! Your data has saved.");

    }//GEN-LAST:event_saveActionPerformed

    private void show_dateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_show_dateFocusGained
        show_date.setText("");
        show_date.setForeground(Color.black);
    }//GEN-LAST:event_show_dateFocusGained

    private void date_paymentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_date_paymentFocusGained
        date_payment.setText("");
        date_payment.setForeground(Color.black);
    }//GEN-LAST:event_date_paymentFocusGained

    private void time_paymentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_time_paymentFocusGained
        time_payment.setText("");
        time_payment.setForeground(Color.black);
    }//GEN-LAST:event_time_paymentFocusGained

    private void paymentFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paymentFocusGained
        payment.setText("");
        payment.setForeground(Color.black);
    }//GEN-LAST:event_paymentFocusGained

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.setVisible (false);
        new Home().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void show_dateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_show_dateFocusLost
        if(show_date.equals(""))
        {
            show_date.setText("7/7/20-14/7/20");
            show_date.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_show_dateFocusLost

    private void date_paymentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_date_paymentFocusLost
        if(date_payment.equals(""))
        {
            date_payment.setText("4/7/20");
            date_payment.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_date_paymentFocusLost

    private void time_paymentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_time_paymentFocusLost
        if(time_payment.equals(""))
        {
            time_payment.setText("12.03");
            time_payment.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_time_paymentFocusLost

    private void paymentFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_paymentFocusLost
        if(payment.equals(""))
        {
            payment.setText("35");
            payment.setForeground(new Color(255,255,255));
        }
    }//GEN-LAST:event_paymentFocusLost

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

    private void browseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseMouseEntered
        browse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/browselogo_focus.png")));
    }//GEN-LAST:event_browseMouseEntered

    private void browseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_browseMouseExited
        browse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/browselogo.png")));
    }//GEN-LAST:event_browseMouseExited

    private void saveMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseEntered
       save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/savelogo_focus.png")));
    }//GEN-LAST:event_saveMouseEntered

    private void saveMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saveMouseExited
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/savelogo.png")));
    }//GEN-LAST:event_saveMouseExited

    private void backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseEntered
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/backlogo_focus.png")));
    }//GEN-LAST:event_backMouseEntered

    private void backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseExited
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/backlogo.png")));
    }//GEN-LAST:event_backMouseExited

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddAdv().setVisible(true);
            }
        });
    }
    public boolean verifyCompleteInput(){
        String fileName = file.getText();
        String dateshow = show_date.getText();
        String paydate = date_payment.getText();
        String time = time_payment.getText();
        String total = payment.getText();
        
        if (fileName.trim().equals("")||dateshow.trim().equals("")||paydate.trim().equals("")||time.trim().equals("")||total.trim().equals(""))
            {
              JOptionPane.showMessageDialog(null, "Plaese full all data!");  
              return false;
            }
        else
            {
              return true;
            }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton browse;
    private javax.swing.JLabel close;
    private javax.swing.JTextField date_payment;
    private javax.swing.JTextField file;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel mini;
    private javax.swing.JTextField payment;
    private javax.swing.JButton save;
    private javax.swing.JTextField show_date;
    private javax.swing.JTextField time_payment;
    // End of variables declaration//GEN-END:variables
}
