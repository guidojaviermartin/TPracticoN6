package Vistas;

import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import Entidades.Producto;
import Entidades.Rubro;
import static java.awt.Color.red;

public class gestionDeProductos extends javax.swing.JInternalFrame {
private TreeSet<Producto> listaProductos;
private Producto auxiliar=null;
    
public gestionDeProductos(TreeSet<Producto> lista) {
        initComponents();
        this.listaProductos=lista;
        llenarCombo();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtDescripcion = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jtStock = new javax.swing.JTextField();
        jcRubros = new javax.swing.JComboBox<>();
        jbNuevo = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        jLabel1.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N
        jLabel1.setText("Descripcion");

        jLabel2.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N
        jLabel2.setText("Stock");

        jLabel3.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N
        jLabel3.setText("Precio");

        jLabel4.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N
        jLabel4.setText("Rubro");

        jLabel5.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N
        jLabel5.setText("Codigo");

        jtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCodigoActionPerformed(evt);
            }
        });

        jtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtPrecioKeyTyped(evt);
            }
        });

        jbNuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbGuardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jbSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jbEliminar.setText("Eliminar");
        jbEliminar.setEnabled(false);
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/buscar.png"))); // NOI18N
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Gestion de productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jbGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(jbEliminar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jcRubros, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jbSalir)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcRubros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbGuardar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();      //Limpia todos los objetos, cierra todo
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        int codigo;
        if(!jtCodigo.getText().isEmpty()){            
                if(validaEntero(jtCodigo.getText())){
                    codigo = Integer.parseInt(jtCodigo.getText());
                }else {

                    JOptionPane.showMessageDialog(this, "Ingresar un nro ");
                    jtCodigo.requestFocus();
                    return;
                }

                for(Producto prod:listaProductos){
                    if(codigo==prod.getCodigo()){            
                        jtDescripcion.setText(prod.getDescripcion());
                        jtPrecio.setText(prod.getPrecio()+"");
                        jtStock.setText(prod.getStock()+"");
                        jcRubros.setSelectedItem(prod.getRubro());
                        jbEliminar.setEnabled(true);
                        auxiliar=prod;
                        return;
                    }
                }        
                JOptionPane.showMessageDialog(this, "Codigo inexistente");
        }else{
            JOptionPane.showMessageDialog(this, "Ingrese un código");
        }
        limpiar();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        if(jtCodigo.getText().isEmpty()||jtDescripcion.getText().isEmpty()||!jtPrecio.getText().matches("^([0-9]{1,10}(\\.[0-9]{1,2})?)$")||jtStock.getText().isEmpty()||jcRubros.getSelectedIndex()==-1){
            JOptionPane.showMessageDialog(this, "Complete todos los campos", "CAMPOS VACIOS", JOptionPane.ERROR_MESSAGE);
        }else{
            int codigo = Integer.parseInt(jtCodigo.getText());
            String desc = jtDescripcion.getText();
            double precio = Double.parseDouble(jtPrecio.getText());
            int stock = Integer.parseInt(jtStock.getText());
            Rubro rub = (Rubro)jcRubros.getSelectedItem();
            
            Producto p=new Producto(codigo, desc, precio, rub, stock);
            
            if(listaProductos.add(p)){
                JOptionPane.showMessageDialog(this, "*** PRODUCTO GUARDADO ***", "GUARDANDO...", JOptionPane.INFORMATION_MESSAGE);
                limpiar();
            }else{                
                JOptionPane.showMessageDialog(this, "!!!No fue posible almacenar el producto¡¡¡\n*** CODIGO REPETIDO ***", "ERROR...", JOptionPane.ERROR_MESSAGE);
                jtCodigo.requestFocus();
                jtCodigo.setForeground(red);
            }
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // TODO add your handling code here:
         
                int opcion=JOptionPane.showConfirmDialog(this, "Confirma Eliminación S/N", "Confirmación",JOptionPane.YES_NO_OPTION);
                if(opcion==JOptionPane.YES_OPTION){
                    listaProductos.remove(auxiliar);
                    JOptionPane.showMessageDialog(this, "Producto Eliminado ");
                    limpiar();
                    auxiliar=null;
                }
               
                
      
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPrecioKeyTyped
        // TODO add your handling code here:
            if(!Character.isDigit(evt.getKeyChar()) && !(evt.getKeyChar() == '.')){
            evt.consume();
        }
            
        
    }//GEN-LAST:event_jtPrecioKeyTyped

    private void jtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCodigoActionPerformed

    private void llenarCombo(){
    
        Rubro comestible=new Rubro(1,"Comestible");
        Rubro limpieza=new Rubro(2,"Limpieza");
        Rubro perfumeria=new Rubro(3,"Perfumeria");
        
        jcRubros.addItem(comestible);
        jcRubros.addItem(limpieza);
        jcRubros.addItem(perfumeria);
        
    }

    private boolean validaEntero(String nro){
    
        Pattern patron=Pattern.compile("^[0-9]+$");
        Matcher m=patron.matcher(nro);
        return m.matches();
    }

//    private boolean validaReal(String nro){
//    Pattern patron=Pattern.compile("^[0-9]+.[0-9]{2}$");
//        Matcher m=patron.matcher(nro);
//        return m.matches();
//        
//    }
    
    private void limpiar(){
    
        jtCodigo.setText("");
        jtDescripcion.setText("");
        jtPrecio.setText("");
        jtStock.setText("");
        jcRubros.setSelectedIndex(-1);
        jbEliminar.setEnabled(false);
        auxiliar=null;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Rubro> jcRubros;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables
}
