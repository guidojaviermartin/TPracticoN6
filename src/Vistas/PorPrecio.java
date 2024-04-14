
package Vistas;

import Entidades.Producto;
import Entidades.Rubro;
import java.util.TreeSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class PorPrecio extends javax.swing.JInternalFrame {
    private TreeSet<Producto> productos;
    private DefaultTableModel modelo=new DefaultTableModel();
    /**
     * Creates new form PorPrecio
     */
    public PorPrecio(TreeSet<Producto> productos) {
        initComponents();
        this.productos=productos;
        armarCabecera();
    }
    
     private void armarCabecera(){
       
         modelo.addColumn("Codigo");
         modelo.addColumn("Descripcion");
         modelo.addColumn("Precio");
         modelo.addColumn("Stock");
         jtTabla.setModel(modelo);
     }
     
     private void borrarFilas(){
     
         int filas=modelo.getRowCount()-1;
         for(int f=filas;f >= 0;f--){
         
             modelo.removeRow(f);
         }
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtDesde = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabla = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jtHasta = new javax.swing.JTextField();

        setClosable(true);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Listado por Precio");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(10, 10, 10))
        );

        jLabel2.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel2.setText("Entre");

        jtDesde.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jtDesde.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtDesdeKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Bell MT", 1, 14)); // NOI18N
        jLabel3.setText("y");

        jtTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Descripción", "Precio", "Stock"
            }
        ));
        jScrollPane1.setViewportView(jtTabla);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/svg.png"))); // NOI18N

        jtHasta.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        jtHasta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtHastaKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtDesde, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtHasta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtDesde, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(jtHasta))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDesdeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtDesdeKeyReleased
        borrarFilas();
        if (jtDesde.getText().isEmpty()) {
            borrarFilas();
        }else{
        double compPrecio=Double.parseDouble(jtDesde.getText());
        for (Producto prod : productos) {
            if (prod.getPrecio()>=compPrecio) {
                Vector renglon=new Vector();
                renglon.add(prod.getCodigo());
                renglon.add(prod.getDescripcion());
                renglon.add(prod.getPrecio());
                renglon.add(prod.getStock());
                renglon.add(prod.getRubro());
                modelo.addRow(renglon);
                System.out.println(renglon);
            }
        }
        }
    }//GEN-LAST:event_jtDesdeKeyReleased

    private void jtHastaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtHastaKeyReleased
        borrarFilas();
        borrarFilas();
        if (jtHasta.getText().isEmpty()) {
            borrarFilas();
        }else{
        double compPrecio=Double.parseDouble(jtHasta.getText());
        for (Producto prod : productos) {
            if (prod.getPrecio()>=compPrecio) {
                Vector renglon=new Vector();
                renglon.add(prod.getCodigo());
                renglon.add(prod.getDescripcion());
                renglon.add(prod.getPrecio());
                renglon.add(prod.getStock());
                renglon.add(prod.getRubro());
                modelo.addRow(renglon);
                System.out.println(renglon);
            }
        }
        }
    }//GEN-LAST:event_jtHastaKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtDesde;
    private javax.swing.JTextField jtHasta;
    private javax.swing.JTable jtTabla;
    // End of variables declaration//GEN-END:variables
}
