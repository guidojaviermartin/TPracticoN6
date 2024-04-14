package Vistas;

import java.util.TreeSet;
import Entidades.Producto;
import Entidades.Rubro;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Collection;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;

public class Menu extends javax.swing.JFrame {
private TreeSet<Producto> listaProductos=new TreeSet<>();

    public Menu() {
        initComponents();
        cargaDeProductos(listaProductos);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"));
        Image image = icon.getImage();
        escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jmMenuGeneral = new javax.swing.JMenuBar();
        jmAdministracion = new javax.swing.JMenu();
        jmiProductos = new javax.swing.JMenuItem();
        jmConsultas = new javax.swing.JMenu();
        jmiRubro = new javax.swing.JMenuItem();
        jmiNombre = new javax.swing.JMenuItem();
        jmiPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(500, 400));
        setSize(new java.awt.Dimension(500, 400));

        escritorio.setPreferredSize(new java.awt.Dimension(665, 460));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );

        jmAdministracion.setText("Administración");

        jmiProductos.setText("Productos");
        jmiProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiProductosActionPerformed(evt);
            }
        });
        jmAdministracion.add(jmiProductos);

        jmMenuGeneral.add(jmAdministracion);

        jmConsultas.setText("Consultas");

        jmiRubro.setText("Por Rubro");
        jmiRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiRubroActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiRubro);

        jmiNombre.setText("Por Nombre");
        jmiNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNombreActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiNombre);

        jmiPrecio.setText("Por Precio");
        jmiPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPrecioActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiPrecio);

        jmMenuGeneral.add(jmConsultas);

        setJMenuBar(jmMenuGeneral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiProductosActionPerformed
        mostrarPestaña(new gestionDeProductos(listaProductos));
    }//GEN-LAST:event_jmiProductosActionPerformed

    private void jmiRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiRubroActionPerformed
        mostrarPestaña(new PorRubro(listaProductos));        
    }//GEN-LAST:event_jmiRubroActionPerformed

    private void jmiNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNombreActionPerformed
        mostrarPestaña(new ListadoNombre(listaProductos));
    }//GEN-LAST:event_jmiNombreActionPerformed

    private void jmiPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPrecioActionPerformed
        mostrarPestaña(new PorPrecio(listaProductos));
    }//GEN-LAST:event_jmiPrecioActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenuBar jmMenuGeneral;
    private javax.swing.JMenuItem jmiNombre;
    private javax.swing.JMenuItem jmiPrecio;
    private javax.swing.JMenuItem jmiProductos;
    private javax.swing.JMenuItem jmiRubro;
    // End of variables declaration//GEN-END:variables

    private void mostrarPestaña(JInternalFrame x) {
        escritorio.removeAll();
        escritorio.repaint();
        JInternalFrame lpr;        
        x.setVisible(true);
        escritorio.add(x);
    }
    
    
    private void cargaDeProductos(Collection lista){
        lista.add(new Producto(1, "Leche x 1ltr", 1000.0,new Rubro(1,"Comestible"), 5));
        lista.add(new Producto(2, "Galletitas Don Satur 250gr", 700.0,new Rubro(1,"Comestible"), 10));
        lista.add(new Producto(3, "Manteca x 200gr", 1500.0,new Rubro(1,"Comestible"), 8));
        lista.add(new Producto(4, "Trapo de piso", 2000.0,new Rubro(2,"Limpieza"), 2));
        lista.add(new Producto(5, "Shampoo Sedal x 470gr", 7000.0,new Rubro(3,"Perfumeria"), 8));
        lista.add(new Producto(6, "Lavandina x 1ltr", 800.0,new Rubro(2,"Limpieza"), 3));
        lista.add(new Producto(7, "Dulce de Leche x 500gr", 2500.0,new Rubro(1,"Comestible"), 4));
        lista.add(new Producto(8, "Jabon x 4", 700.0,new Rubro(3,"Perfumeria"), 0));
        lista.add(new Producto(9, "Pasta dental x 300gr", 5000.0,new Rubro(3,"Perfumeria"), 15));
    }
}
