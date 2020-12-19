import jaco.mp3.player.MP3Player;
import java.awt.Toolkit;
import javax.sound.sampled.*;

public class PlayerForm extends javax.swing.JFrame {
    static MP3Player player;
    
    public PlayerForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        appTitle = new javax.swing.JLabel();
        backHomepage = new javax.swing.JLabel();
        bt_quit = new javax.swing.JLabel();
        songNameMain = new javax.swing.JPanel();
        songNameDisplay = new javax.swing.JLabel();
        bt_control = new javax.swing.JPanel();
        bt_pause = new javax.swing.JLabel();
        bt_stop = new javax.swing.JLabel();
        bt_play = new javax.swing.JLabel();
        bt_open = new javax.swing.JLabel();
        bt_volumeDown = new javax.swing.JLabel();
        bt_voloumeUp = new javax.swing.JLabel();
        bt_volumeFull = new javax.swing.JLabel();
        bt_volumeMute = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/Picture/logo.png")));
        setUndecorated(true);
        setResizable(false);

        main.setBackground(new java.awt.Color(0, 0, 0));
        main.setPreferredSize(new java.awt.Dimension(800, 400));

        header.setBackground(new java.awt.Color(51, 51, 51));

        appTitle.setFont(new java.awt.Font("Impact", 0, 36)); // NOI18N
        appTitle.setForeground(new java.awt.Color(255, 255, 255));
        appTitle.setText("MFU MUSIC");

        backHomepage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/home.png"))); // NOI18N
        backHomepage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backHomepageMouseClicked(evt);
            }
        });

        bt_quit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/quit.png"))); // NOI18N
        bt_quit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_quitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(appTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                .addComponent(backHomepage)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_quit)
                .addGap(21, 21, 21))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_quit)
                    .addComponent(backHomepage)
                    .addComponent(appTitle))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        songNameMain.setBackground(new java.awt.Color(0, 0, 0));
        songNameMain.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(250, 250, 250)));

        songNameDisplay.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        songNameDisplay.setForeground(new java.awt.Color(255, 255, 255));
        songNameDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        songNameDisplay.setText("PLAYING");

        javax.swing.GroupLayout songNameMainLayout = new javax.swing.GroupLayout(songNameMain);
        songNameMain.setLayout(songNameMainLayout);
        songNameMainLayout.setHorizontalGroup(
            songNameMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, songNameMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(songNameDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        songNameMainLayout.setVerticalGroup(
            songNameMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songNameMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(songNameDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bt_control.setBackground(new java.awt.Color(0, 0, 0));

        bt_pause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/pause.png"))); // NOI18N
        bt_pause.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_pauseMouseClicked(evt);
            }
        });

        bt_stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/stop.png"))); // NOI18N
        bt_stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_stopMouseClicked(evt);
            }
        });

        bt_play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/play.png"))); // NOI18N
        bt_play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_playMouseClicked(evt);
            }
        });

        bt_open.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/open.png"))); // NOI18N
        bt_open.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_openMouseClicked(evt);
            }
        });

        bt_volumeDown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/volume_down.png"))); // NOI18N
        bt_volumeDown.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_volumeDownMouseClicked(evt);
            }
        });

        bt_voloumeUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/volume_up.png"))); // NOI18N
        bt_voloumeUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_voloumeUpMouseClicked(evt);
            }
        });

        bt_volumeFull.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/volume_full.png"))); // NOI18N
        bt_volumeFull.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_volumeFullMouseClicked(evt);
            }
        });

        bt_volumeMute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/mute.png"))); // NOI18N
        bt_volumeMute.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bt_volumeMuteMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bt_controlLayout = new javax.swing.GroupLayout(bt_control);
        bt_control.setLayout(bt_controlLayout);
        bt_controlLayout.setHorizontalGroup(
            bt_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bt_controlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bt_pause)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_play)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_stop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bt_open)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bt_volumeDown)
                .addGap(18, 18, 18)
                .addComponent(bt_voloumeUp)
                .addGap(18, 18, 18)
                .addComponent(bt_volumeFull)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bt_volumeMute)
                .addContainerGap())
        );
        bt_controlLayout.setVerticalGroup(
            bt_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bt_controlLayout.createSequentialGroup()
                .addGroup(bt_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bt_controlLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(bt_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_voloumeUp)
                            .addComponent(bt_volumeDown)
                            .addComponent(bt_volumeFull)
                            .addComponent(bt_volumeMute)))
                    .addComponent(bt_play)
                    .addGroup(bt_controlLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(bt_pause))
                    .addGroup(bt_controlLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(bt_controlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_open)
                            .addComponent(bt_stop))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainLayout = new javax.swing.GroupLayout(main);
        main.setLayout(mainLayout);
        mainLayout.setHorizontalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(songNameMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bt_control, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        mainLayout.setVerticalGroup(
            mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(songNameMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(bt_control, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backHomepageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backHomepageMouseClicked
        this.setVisible (false);
        new Home().setVisible(true);
    }//GEN-LAST:event_backHomepageMouseClicked

    private void bt_quitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_quitMouseClicked
        this.dispose();
    }//GEN-LAST:event_bt_quitMouseClicked

    private void bt_pauseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_pauseMouseClicked
        player.pause();
    }//GEN-LAST:event_bt_pauseMouseClicked

    private void bt_stopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_stopMouseClicked
        player.stop();
    }//GEN-LAST:event_bt_stopMouseClicked

    private void bt_playMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_playMouseClicked
        player.play();
    }//GEN-LAST:event_bt_playMouseClicked

    private void bt_openMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_openMouseClicked
        new Search().setVisible(true);
    }//GEN-LAST:event_bt_openMouseClicked

    private void bt_volumeDownMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_volumeDownMouseClicked
        volumeDownControl (0.1);
    }//GEN-LAST:event_bt_volumeDownMouseClicked

    private void bt_voloumeUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_voloumeUpMouseClicked
        volumeUpControl (0.1);
    }//GEN-LAST:event_bt_voloumeUpMouseClicked

    private void bt_volumeFullMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_volumeFullMouseClicked
        volumeControl (1.0);
    }//GEN-LAST:event_bt_volumeFullMouseClicked

    private void bt_volumeMuteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_volumeMuteMouseClicked
        volumeControl (0.0);
    }//GEN-LAST:event_bt_volumeMuteMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayerForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appTitle;
    private javax.swing.JLabel backHomepage;
    private javax.swing.JPanel bt_control;
    private javax.swing.JLabel bt_open;
    private javax.swing.JLabel bt_pause;
    private javax.swing.JLabel bt_play;
    private javax.swing.JLabel bt_quit;
    private javax.swing.JLabel bt_stop;
    private javax.swing.JLabel bt_voloumeUp;
    private javax.swing.JLabel bt_volumeDown;
    private javax.swing.JLabel bt_volumeFull;
    private javax.swing.JLabel bt_volumeMute;
    private javax.swing.JPanel header;
    private javax.swing.JPanel main;
    public static javax.swing.JLabel songNameDisplay;
    private javax.swing.JPanel songNameMain;
    // End of variables declaration//GEN-END:variables


        private void volumeDownControl(Double valueTOPlusMinus) {
            Mixer.Info[] mixers = AudioSystem.getMixerInfo();
            
            for(Mixer.Info mixerInfo : mixers) {
                Mixer mixer = AudioSystem.getMixer(mixerInfo);
            
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
                for(Line.Info lineInfo : lineInfos){
                    Line line = null;
                    boolean opened = true;
                    try{
                        line = mixer.getLine(lineInfo);
                        opened = line.isOpen() || line instanceof Clip;
                        
                        if(!opened){
                            line.open();
                        }
                        FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                        float currentVolume = volControl.getValue();
                        Double volumeToCut = valueTOPlusMinus;
                        float changedCalc = (float) ((float)currentVolume-(double)volumeToCut);
                        volControl.setValue(changedCalc);
                        
                       
                    }catch (LineUnavailableException lineException){
                    }catch (IllegalArgumentException illException){
                    }finally{
                    if(line != null && !opened){
                        line.close();
                    }
                }
            }
        }
    }
    private void volumeUpControl(Double valueToPlusMinus){
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for(Mixer.Info mixerInfo : mixers){
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            for(Line.Info lineInfo : lineInfos){
                Line line = null;
                boolean opened = true;
                try{
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if(!opened){
                        line.open();
                    }
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVolume = volControl.getValue();
                    Double volumeToCut = valueToPlusMinus;
                    float changedCalc = (float) ((float)currentVolume+(double)volumeToCut);
                    
                }catch (LineUnavailableException lineException){
                }catch (IllegalArgumentException illException){
                }finally{
                    if(line != null && !opened){
                        line.close();
                    }
                }
            }
        }
    }
    
    
    private void volumeControl(Double valueToPlusMinus){
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for(Mixer.Info mixerInfo : mixers){
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            for(Line.Info lineInfo : lineInfos){
                Line line = null;
                boolean opened = true;
                try{
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if(!opened){
                        line.open();
                    }
                    
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVolume = volControl.getValue();
                    Double volumeToCut = valueToPlusMinus;
                    float changedCalc = (float) ((double)volumeToCut);
                    volControl.setValue(changedCalc);
                    
                }catch (LineUnavailableException lineException){
                }catch (IllegalArgumentException illException){
                }finally{                   
                    if(line != null && !opened){
                        line.close();
                    }
                }
            }
        }
    }
}



                    
                
            
        

