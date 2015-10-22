/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicados;

import java.awt.Image;
import java.io.File;
//import java.sql.CallableStatement;
//import java.sql.Connection;
import javax.swing.Icon;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author alfonsogalvanmadera
 */
public class insertarLibro extends javax.swing.JFrame {

    /**
     * Creates new form insertarLibro
     */
    public insertarLibro() {
        initComponents();
        botonRegresar.setVisible(false);
        botonExaminar.setVisible(false);
        textImagen.setVisible(false);
        //jImagen.setVisible(false);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonInsertar = new javax.swing.JButton();
        textAutor = new javax.swing.JTextField();
        textTitulo = new javax.swing.JTextField();
        textEditorial = new javax.swing.JTextField();
        textPrecio = new javax.swing.JTextField();
        botonBorrar = new javax.swing.JButton();
        botonConsultar = new javax.swing.JButton();
        botonRegresar = new javax.swing.JButton();
        botonExaminar = new javax.swing.JButton();
        textImagen = new javax.swing.JTextField();
        jImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Autor");

        jLabel2.setText("Titulo");

        jLabel3.setText("Editorial");

        jLabel4.setText("Precio");

        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        textAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAutorActionPerformed(evt);
            }
        });

        textTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTituloActionPerformed(evt);
            }
        });

        botonBorrar.setText("Borrar");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonConsultar.setText("Consultar");
        botonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonConsultarActionPerformed(evt);
            }
        });

        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        botonExaminar.setText("Examinar imagen del libro");
        botonExaminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExaminarActionPerformed(evt);
            }
        });

        jImagen.setText("Aqui va la foto del libro");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonRegresar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                                .addComponent(botonConsultar)
                                .addGap(85, 85, 85)
                                .addComponent(botonBorrar)
                                .addGap(26, 26, 26))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(132, 132, 132)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonExaminar, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(botonInsertar)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(textAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(textTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(textEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(textPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonExaminar)
                            .addComponent(textImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonInsertar)
                    .addComponent(botonBorrar)
                    .addComponent(botonConsultar)
                    .addComponent(botonRegresar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAutorActionPerformed

    private void textTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTituloActionPerformed

    private void botonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonConsultarActionPerformed
        // TODO add your handling code here:
        botonBorrar.setVisible(false);
        botonInsertar.setVisible(false);
        botonConsultar.setVisible(true);
        botonRegresar.setVisible(true);
        jImagen.setVisible(true);
      
        
         String titulo= textTitulo.getText();
       try{
            //paso 1: Establecer conexion a ORACLE
           
            Connection con=Conexion.conectarse();
            //  Paso 2 crear un Statement de sql
            Statement st=con.createStatement();
            //Paso 3 con el Statement invocamos al query
            ResultSet res=st.executeQuery("SELECT * FROM libros where titulo="+titulo+" order by ID_LIBROS");
            //Paso 4: Interamos el ResultSet con un While
            int filas=0; 
            while(res.next()){
            filas++;
            }
           
            ResultSet res2=st.executeQuery("SELECT * FROM LIBROS where titulo="+titulo+" order by ID_LIBROS");
      
     
            
            
            int fila= 0;
        while(res2.next()){
            
            String autores= res2.getString(1);
            String titulos= res2.getString(2);
            String editoriales= res2.getString(3);       
            String precio=  res2.getString(4);
            String ruta= res2.getString(5);
            
            
            textAutor.setText(autores);
            textTitulo.setText(titulos);
            textEditorial.setText(editoriales);
            textPrecio.setText(precio);
            textImagen.setText(ruta);
            
            fila++;
            
            
             ImageIcon icon = new ImageIcon(textImagen.getText());

                Icon icono = new ImageIcon(icon.getImage().
                getScaledInstance(jImagen.getWidth(), jImagen.getHeight(), 
                Image.SCALE_DEFAULT));

                jImagen.setText(null);

                jImagen.setIcon( icono );
       
        }     
          
            
       
             
       }catch(Exception e){
       }
          
        
        
    }//GEN-LAST:event_botonConsultarActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        try{                                              
            // TODO add your handling code here:
            botonBorrar.setVisible(false);
            botonInsertar.setVisible(true);
            botonConsultar.setVisible(false);
            botonRegresar.setVisible(true);
            botonExaminar.setVisible(true);
            textImagen.setVisible(true);
            jImagen.setVisible(true);
            
            String a= textAutor.getText();
            String t= textTitulo.getText();
            String e=textEditorial.getText();
            String p=textPrecio.getText();
            
            
            
            //if(a.trim().length()==0||t.trim().length()==0||e.trim().length()==0||p.trim().length()==0)throw new ingreException();
            
            logicaVacio.logica(a, t, e, p);
            
            Conexion c=new Conexion();
            try{
                
                ImageIcon icon = new ImageIcon(textImagen.getText());

                Icon icono = new ImageIcon(icon.getImage().
                        getScaledInstance(jImagen.getWidth(), jImagen.getHeight(),
                                Image.SCALE_DEFAULT));
                
                jImagen.setText(null);

                jImagen.setIcon( icono );
                
                Connection cone=c.conectarse();
                CallableStatement callate=cone.prepareCall("{call GUARDAR_LIBRO(?,?,?,?,?)}");
                
                callate.setString(1,textAutor.getText());
                callate.setString(2,textTitulo.getText());
                callate.setString(3,textEditorial.getText());
                callate.setFloat(4, Float.parseFloat(textPrecio.getText()));
                callate.setString(5,textImagen.getText());
                
                
                callate.execute();
                
                cone.close();
                
                
                
                
            }catch(Exception ex){
                
                
                
                
                
            }
            
            
            
            
            
        }catch(VacioExcepcion ex){
           // Logger.getLogger(insertarLibro.class.getName()).log(Level.SEVERE, null, ex);


               


        }
        
      
        
        
    
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        // TODO add your handling code here:
        botonBorrar.setVisible(true);
        botonInsertar.setVisible(true);
        botonConsultar.setVisible(true);
        botonRegresar.setVisible(false);
        botonExaminar.setVisible(false);
        textImagen.setVisible(false);
        //jImagen.setVisible(false);
        jImagen.setIcon(null);
        textAutor.setText(null);
        textEditorial.setText(null);
        textImagen.setText(null);
        textPrecio.setText(null);
        textTitulo.setText(null);
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonExaminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExaminarActionPerformed
        // TODO add your handling code here:
        JFileChooser selector=new JFileChooser();
        selector.showOpenDialog(this);
        File archivo =selector.getSelectedFile();
        textImagen.setText(archivo.getAbsolutePath());
    }//GEN-LAST:event_botonExaminarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        // TODO add your handling code here:
        botonBorrar.setVisible(false);
        botonInsertar.setVisible(false);
        botonConsultar.setVisible(false);
        botonRegresar.setVisible(true);
        
        
        Conexion c=new Conexion();
        try{

                
                 Connection cone=c.conectarse();
            CallableStatement callate=cone.prepareCall("{call BORRAR_LIBRO(?)}");
           
            callate.setString(1,textTitulo.getText());
            
            callate.execute();
            
            cone.close();
          



        }catch(Exception ex){


               


        }
        
        
    }//GEN-LAST:event_botonBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(insertarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insertarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insertarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insertarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insertarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonConsultar;
    private javax.swing.JButton botonExaminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel jImagen;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField textAutor;
    private javax.swing.JTextField textEditorial;
    private javax.swing.JTextField textImagen;
    private javax.swing.JTextField textPrecio;
    private javax.swing.JTextField textTitulo;
    // End of variables declaration//GEN-END:variables
}
