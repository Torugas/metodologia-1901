/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testExamen;

import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JRadioButton;


/**
 *
 * @author T-107
 */
public class pregunta extends javax.swing.JFrame {
 JRadioButton radios[];
    Opciones[] Op;
    Pregunta etiquetaTitulo;
    /**
     * Creates new form pregunta
     */
    public pregunta() {
        initComponents();
        setLocationRelativeTo(this);
        
        
        
        radios=new JRadioButton[5];
        Op=new Opciones[4];
     JRadioButton radioOp1 = null;
        radios[0]=radioOp1;
     JRadioButton radioOp2 = null;
        radios[1]=radioOp2;
     JRadioButton radioOp3 = null;
        radios[2]=radioOp3;
     JRadioButton radioOp4 = null;
        radios[3]=radioOp4;
      
        
         Opciones Op1=new Opciones("El Popocatepelt",false);
       
        Opciones Op2=new Opciones("El Everest",true);
        Opciones Op3=new Opciones("El Aconagua",false);
        Opciones Op4=new Opciones("El pico de orizaba",false);
        
        
        Op[0]=Op1;
        Op[1]=Op2;
        Op[2]=Op3;
        Op[3]=Op4;
       
        
         etiquetaTitulo=new Pregunta("Cual es la montaña mas alta del mundo?", Op);
        //Llenamos el modelo con los valores correctos en la interfaz de usuario
        etiquetaTitulo.setText(etiquetaTitulo.titulo);
        for(int i=0;i<radios.length;i++){
            radios[i].setText(etiquetaTitulo.Opciones[i].titulo);
            
        }
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public class pregunta2 extends javax.swing.JFrame {
 JRadioButton radios[];
    Opciones[] Op;
    Pregunta etiquetaTitulo;
    /**
     * Creates new form pregunta
     */
    public pregunta2() {
        initComponents();
        setLocationRelativeTo(this);
        
        
        
        radios=new JRadioButton[5];
        Op=new Opciones[4];
     JRadioButton radioOp1 = null;
        radios[0]=radioOp1;
     JRadioButton radioOp2 = null;
        radios[1]=radioOp2;
     JRadioButton radioOp3 = null;
        radios[2]=radioOp3;
     JRadioButton radioOp4 = null;
        radios[3]=radioOp4;
      
        
         Opciones Op1=new Opciones("Jalisco",false);
       
        Opciones Op2=new Opciones("Michoacan",true);
        Opciones Op3=new Opciones("Coahulia",false);
        Opciones Op4=new Opciones("Tamaulipas",false);
        
        
        Op[0]=Op1;
        Op[1]=Op2;
        Op[2]=Op3;
        Op[3]=Op4;
       
        
         etiquetaTitulo=new Pregunta("Todos los siguientes estados tienen costas exepto...", Op);
        //Llenamos el modelo con los valores correctos en la interfaz de usuario
        etiquetaTitulo.setText(etiquetaTitulo.titulo);
        for(int i=0;i<radios.length;i++){
            radios[i].setText(etiquetaTitulo.Opciones[i].titulo);
            
        }
    }
    
    public class ventana extends javax.swing.JFrame {
int contador=0;
    /**
     * Creates new form ventana
     */
    public ventana() {
        initComponents();
        //deshabilitamos el boton siguiente
        checarRespuesta.setEnabled(false);
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        etiquetaTitulo = new javax.swing.JLabel();
        radioOp1 = new javax.swing.JRadioButton();
        radioOp2 = new javax.swing.JRadioButton();
        radioiOp3 = new javax.swing.JRadioButton();
        radioOp4 = new javax.swing.JRadioButton();
        checarRespuesta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaTitulo.setText("etiquetaTitulo");

        radioOp1.setText("Op1");

        radioOp2.setText("Op2");

        radioiOp3.setText("Op3");

        radioOp4.setText("Op4");

        checarRespuesta.setText("Checar");
        checarRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checarRespuestaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(radioOp1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(radioOp2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(radioiOp3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(114, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(checarRespuesta)
                    .addComponent(radioOp4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(etiquetaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(radioOp1)
                .addGap(18, 18, 18)
                .addComponent(radioOp2)
                .addGap(18, 18, 18)
                .addComponent(radioiOp3)
                .addGap(18, 18, 18)
                .addComponent(radioOp4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(checarRespuesta)
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checarRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checarRespuestaActionPerformed
      
          int contador = 0;
        
     

 int indiceSeleccionado=0;
        for(int i=0;i<radios.length;i++){
            if(radios[i].isSelected()){
                indiceSeleccionado=i;
                break;
            }
        }
        System.out.println("El indice seleccionado es: "+indiceSeleccionado);
      
        JOptionPane.showConfirmDialog(this,""+evaluar(etiquetaTitulo,indiceSeleccionado));
        // TODO add your handling code here:
      contador++;
       etiquetaContador.setText(""+contador);
        checarRespuesta.;
// TODO add your handling code here:
    }                                    
    }//GEN-LAST:event_checarRespuestaActionPerformed

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
            java.util.logging.Logger.getLogger(pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pregunta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pregunta().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checarRespuesta;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioOp1;
    private javax.swing.JRadioButton radioOp2;
    private javax.swing.JRadioButton radioOp4;
    private javax.swing.JRadioButton radioiOp3;
    // End of variables declaration//GEN-END:variables

public boolean evaluar(Pregunta etiquetaTitulo, int indiceSeleccionado){
    boolean correcta=false;
    
        if(etiquetaTitulo.Opciones[indiceSeleccionado].correcta){
            
            correcta=true;
           
        
    }
    
    return correcta;
}
}





