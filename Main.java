
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import org.apache.commons.io.FileUtils;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        // Локализация компонентов окна JFileChooser
        UIManager.put(
                 "FileChooser.openButtonText", "Выбрать");
        UIManager.put(
                 "FileChooser.cancelButtonText", "Отмена");
        UIManager.put(
                 "FileChooser.fileNameLabelText", "Наименование файла");
        UIManager.put(
                 "FileChooser.filesOfTypeLabelText", "Типы файлов");
        UIManager.put(
                 "FileChooser.lookInLabelText", "Директория");
        UIManager.put(
                 "FileChooser.saveInLabelText", "Сохранить в директории");
        UIManager.put(
                 "FileChooser.folderNameLabelText", "Путь директории");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButtonCopy = new javax.swing.JButton();
        jButtonFile = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonDirectory = new javax.swing.JButton();
        jTextFieldFile = new javax.swing.JTextField();
        jTextFieldDirectory = new javax.swing.JTextField();
        jButtonClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(800, 400));
        setMinimumSize(null);
        setResizable(false);
        setSize(new java.awt.Dimension(367, 183));

        jLabel1.setText("Выберите файл");

        jButtonCopy.setText("Копировать");
        jButtonCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCopyActionPerformed(evt);
            }
        });

        jButtonFile.setText("...");
        jButtonFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFileActionPerformed(evt);
            }
        });

        jLabel2.setText("Выберите директорию");

        jButtonDirectory.setText("...");
        jButtonDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDirectoryActionPerformed(evt);
            }
        });

        jTextFieldFile.setToolTipText("");

        jButtonClose.setText("Закрыть");
        jButtonClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCloseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldFile)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldDirectory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonDirectory)
                            .addComponent(jButtonFile)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jButtonCopy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonClose)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFile))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDirectory))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCopy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonClose))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCopyActionPerformed
        File source = new File(jTextFieldFile.getText());
        File dest = new File(jTextFieldDirectory.getText());
        try {
            FileUtils.copyFileToDirectory(source, dest);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonCopyActionPerformed

    private void jButtonFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFileActionPerformed
    JFileChooser dialog = new JFileChooser();
    dialog.setDialogTitle("Выбор файла");
    dialog.setFileSelectionMode(JFileChooser.FILES_ONLY);
    int result = dialog.showOpenDialog(this);
    // Если директория выбрана, покажем ее в поле
        if (result == JFileChooser.APPROVE_OPTION ){
            String pathFile = dialog.getSelectedFile().getAbsolutePath();
            jTextFieldFile.setText(pathFile);
        }
    setVisible(true);
    }//GEN-LAST:event_jButtonFileActionPerformed

    private void jButtonDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDirectoryActionPerformed
    JFileChooser dialog = new JFileChooser();
    dialog.setDialogTitle("Выбор директории");
    dialog.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    int result = dialog.showOpenDialog(this);
    // Если директория выбрана, покажем ее в поле
        if (result == JFileChooser.APPROVE_OPTION ){
            String pathDirectory = dialog.getSelectedFile().getAbsolutePath();
            jTextFieldDirectory.setText(pathDirectory);
        }
    setVisible(true);
    }//GEN-LAST:event_jButtonDirectoryActionPerformed

    private void jButtonCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCloseActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonCloseActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonClose;
    private javax.swing.JButton jButtonCopy;
    private javax.swing.JButton jButtonDirectory;
    private javax.swing.JButton jButtonFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextFieldDirectory;
    private javax.swing.JTextField jTextFieldFile;
    // End of variables declaration//GEN-END:variables
}
