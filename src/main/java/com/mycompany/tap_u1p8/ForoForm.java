/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.tap_u1p8;

import com.google.gson.Gson;
import static com.mycompany.tap_u1p8.RespuestasForm.fileRespuestas;
import com.mycompany.tap_u1p8.clases.Respuesta;
import com.mycompany.tap_u1p8.clases.Tema;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author chuy-
 */
public class ForoForm extends javax.swing.JFrame {
    public static final String temasFile = "temas.json";
    private ArrayList<Respuesta> respuestas=new ArrayList();
    private ArrayList<Tema> temas = new ArrayList();
    private GridLayout gridLayout =new GridLayout(1,1);
    public ForoForm() {
        initComponents();
        jPanel1.setLayout(gridLayout);
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        clockFace1 = new org.edisoncor.gui.varios.ClockFace();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 255, 204));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setText("Nuevo tema");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Lista de temas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clockFace1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(clockFace1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new TemaForm(temas).setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        File file = new File(temasFile);
        if(file.exists()){
            leerTemas();
            respuestas.clear();
            cargarRespuestas();
            contarRespuestas();
            mostrarTemas();
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus

        jPanel1.removeAll();
        jPanel1.updateUI();
        respuestas.clear();
        cargarRespuestas();
        contarRespuestas();
        mostrarTemas();
    }//GEN-LAST:event_formWindowGainedFocus

    private void cargarRespuestas() {
        Gson gson = new Gson();
        try {
            BufferedReader br = new BufferedReader(
                new FileReader(fileRespuestas)
            );
            String lectura = null;
            String contenido = "";
            while( (lectura = br.readLine()) != null ) {
                contenido += lectura;
            }
            br.close();
            
            JSONParser jsonParser = new JSONParser();
            JSONArray jsonArray = (JSONArray)jsonParser.parse(contenido);
            for (int i = 0; i < jsonArray.size(); i++) {
                Respuesta r = gson.fromJson(jsonArray.get(i).toString(), Respuesta.class);
                
                
                respuestas.add(r);
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    private void leerTemas() {
        try {
            BufferedReader br = new BufferedReader(
                new FileReader(temasFile)
            );
            String contenido = "";
            String lectura = null;
            while( (lectura = br.readLine()) != null ) {
                contenido += lectura;
            }
            br.close();
            
            // Transformar el String contenido en arreglo de json
            JSONParser jsonParser = new JSONParser();
            JSONArray jsonArray = (JSONArray) jsonParser.parse(contenido);
            for (int i = 0; i < jsonArray.size(); i++) {
                System.out.println("" + jsonArray.get(i));
                
                Gson gson = new Gson();
                
                Tema t = gson.fromJson(
                    jsonArray.get(i).toString(), 
                    Tema.class
                );
                
                System.out.println("Tema leido: " + t.getIdTema());
                
                temas.add(t);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void mostrarTemas() {
        for(Tema t:temas){
            gridLayout.setRows(gridLayout.getRows()+1);
            JPanel panel=new JPanel();
            panel.setBackground(Color.decode("#e6fff5"));
            panel.setLayout(new FlowLayout());
            
            JLabel label = new JLabel(t.getTitulo());
            label.setFont(new Font(Font.MONOSPACED, Font.BOLD,15));
            panel.add(label);
            
            JLabel labelR = new JLabel("Respuestas: "+t.getRespuestas());
            labelR.setFont(new Font(Font.SERIF, Font.ITALIC,9));
            labelR.setForeground(Color.darkGray);
            panel.add(labelR);
            JButton btn = new JButton("Ver respuestas");
            btn.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    new RespuestasForm(t).setVisible(true);
                }
            });
            panel.add(btn);
            jPanel1.add(panel);
            gridLayout.setRows(gridLayout.getRows()+1);
            JSeparator separator = new JSeparator();
            separator.setSize(jPanel1.getSize().width-3,3);
            jPanel1.add(separator);
            jPanel1.updateUI();
        }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ForoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForoForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForoForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.edisoncor.gui.varios.ClockFace clockFace1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void contarRespuestas() {
        for(Tema t: temas){
            int cont=0;
            for(Respuesta r : respuestas){
                if(t.getIdTema().equals(r.getIdTema()))
                    cont++;
            }
            t.setRespuestas(cont);
        }
    }

    

    
}
