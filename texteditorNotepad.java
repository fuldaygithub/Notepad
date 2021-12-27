package texteditor;

import java.awt.FileDialog;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class texteditorNotepad extends javax.swing.JFrame {
String filename;
Clipboard clipboard = getToolkit().getSystemClipboard();
   
    public texteditorNotepad() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar3 = new javax.swing.JMenuBar();
        file = new javax.swing.JMenu();
        newfile = new javax.swing.JMenuItem();
        openfile = new javax.swing.JMenuItem();
        savefile = new javax.swing.JMenuItem();
        exitfile = new javax.swing.JMenuItem();
        edit = new javax.swing.JMenu();
        copytext = new javax.swing.JMenuItem();
        cuttext = new javax.swing.JMenuItem();
        pasttext = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setAutoscrolls(false);
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout jpanelLayout = new javax.swing.GroupLayout(jpanel);
        jpanel.setLayout(jpanelLayout);
        jpanelLayout.setHorizontalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1032, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jpanelLayout.setVerticalGroup(
            jpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91))
        );

        file.setText("File");

        newfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        newfile.setText("new");
        newfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newfileActionPerformed(evt);
            }
        });
        file.add(newfile);

        openfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openfile.setText("open");
        openfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openfileActionPerformed(evt);
            }
        });
        file.add(openfile);

        savefile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        savefile.setText("save");
        savefile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savefileActionPerformed(evt);
            }
        });
        file.add(savefile);

        exitfile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exitfile.setText("Exit");
        exitfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitfileActionPerformed(evt);
            }
        });
        file.add(exitfile);

        jMenuBar3.add(file);

        edit.setText("Edit");

        copytext.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copytext.setText("copy");
        copytext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copytextActionPerformed(evt);
            }
        });
        edit.add(copytext);

        cuttext.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cuttext.setText("cut");
        cuttext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuttextActionPerformed(evt);
            }
        });
        edit.add(cuttext);

        pasttext.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        pasttext.setText("past");
        pasttext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasttextActionPerformed(evt);
            }
        });
        edit.add(pasttext);

        jMenuBar3.add(edit);

        setJMenuBar(jMenuBar3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newfileActionPerformed
        // TODO add your handling code here:
        textArea.setText("");
        setTitle(filename);
    }//GEN-LAST:event_newfileActionPerformed

    private void copytextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copytextActionPerformed
        
        String copyText = textArea.getSelectedText();
        StringSelection copyselection = new StringSelection(copyText);
        clipboard.setContents(copyselection, copyselection);
        
        
        
    }//GEN-LAST:event_copytextActionPerformed

    private void openfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openfileActionPerformed
        // TODO add your handling code here:
        FileDialog fileDialog = new FileDialog(texteditorNotepad.this,"open file",FileDialog.LOAD);
        fileDialog.setVisible(true);
        if (fileDialog.getDirectory()!=null){
        filename=fileDialog.getDirectory()+fileDialog.getFile();
        setTitle(filename);
        
        }
        try
        {
    BufferedReader reader= new BufferedReader(new FileReader(filename));
             StringBuilder sb= new StringBuilder();
                
        String line =null;
        while((line= reader.readLine()) !=null)
        {
            sb.append(line+"\n");
            textArea.setText(sb.toString());
            
        }
reader.close();

        } catch(IOException e)
          {
              
            System.out.println(" File not find ");
                    
          }
    }//GEN-LAST:event_openfileActionPerformed

    private void savefileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savefileActionPerformed
        FileDialog fileDialog = new  FileDialog(texteditorNotepad.this,"save file",FileDialog.SAVE);
        fileDialog.setVisible(true);
        
        if (fileDialog.getFile() != null)
        {
           filename=fileDialog.getDirectory()+fileDialog.getFile();
           setTitle(filename);
            
        }
        try
        {
           FileWriter filewriter = new FileWriter(filename) ;
           filewriter.write(textArea.getText());
           setTitle(filename);
           filewriter.close();
                   
        }
        catch(IOException e)
                {
                  System.out.println("file is not fiund");
                    
                    
                    
                }
        
    }//GEN-LAST:event_savefileActionPerformed

    private void exitfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitfileActionPerformed
   System.exit(0);
    }//GEN-LAST:event_exitfileActionPerformed

    private void cuttextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuttextActionPerformed
 String cutstring = textArea.getSelectedText();
 StringSelection cutselection =new StringSelection(cutstring);
 clipboard.setContents(cutselection, cutselection);
 textArea.replaceRange("", textArea.getSelectionStart(), textArea.getSelectionEnd());
    }//GEN-LAST:event_cuttextActionPerformed

    private void pasttextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasttextActionPerformed
           try
                   
                   
           {
               Transferable pastText = clipboard.getContents(texteditorNotepad.this);
               String sel =(String) pastText.getTransferData(DataFlavor.stringFlavor);
               textArea.replaceRange(sel, textArea.getSelectionStart(), textArea.getSelectionEnd());
           }
            catch(Exception e)
                    {
                       System.out.println("didet work");
                        
                    }
    }//GEN-LAST:event_pasttextActionPerformed

 
   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new texteditorNotepad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem copytext;
    private javax.swing.JMenuItem cuttext;
    private javax.swing.JMenu edit;
    private javax.swing.JMenuItem exitfile;
    private javax.swing.JMenu file;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanel;
    private javax.swing.JMenuItem newfile;
    private javax.swing.JMenuItem openfile;
    private javax.swing.JMenuItem pasttext;
    private javax.swing.JMenuItem savefile;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
