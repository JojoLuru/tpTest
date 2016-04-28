package presentation;

import domaine.Personne;
import metier.ListePersonnes;


/**
 * 
 * Fenêtre principale de l'application
 *
 * @author Raillard Jonathan
 * 
*/


public class FrmMain extends java.awt.Frame {
  private ListePersonnes lstPers;


    
  /** Constructeur */
  public FrmMain () {
    initComponents();
    listerEmploye();
    etatInitial();
  } // Constructeur
 
  private void etatInitial(){
    chSemaine.select(chSemaine.getItemCount()-1);
  }
  
  private void listerEmploye(){
    lstPersonnes.removeAll();
    lstPers = new ListePersonnes();
    for (int i = 0; i < lstPers.size(); i++) {
       lstPersonnes.add(((Personne)(lstPers.get(i))).toString());
    }
  }

  private void miseAJourDesChamps(){
    Personne pers = lstPers.get(lstPersonnes.getSelectedIndex());
    tfCafes.setText(String.valueOf(pers.getNbCafes())); 
    majBouton();
  }
  
  private void incCafe(int inc){
    Personne pers = lstPers.get(lstPersonnes.getSelectedIndex());
    pers.incCafes(inc);
    miseAJourDesChamps();
  }
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
  */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label4 = new java.awt.Label();
        chSemaine = new java.awt.Choice();
        for (int k = 1; k <= 13; k++) {chSemaine.add(Integer.toString(k));} /* PD: définir les numéros de semaine */
        label7 = new java.awt.Label();
        label6 = new java.awt.Label();
        label5 = new java.awt.Label();
        tfTotalCafes = new java.awt.TextField();
        tfFonction = new java.awt.TextField();
        label2 = new java.awt.Label();
        tfBureau = new java.awt.TextField();
        label3 = new java.awt.Label();
        label1 = new java.awt.Label();
        lstPersonnes = new java.awt.List();
        label8 = new java.awt.Label();
        tfCafes = new java.awt.TextField();
        btnMoins = new java.awt.Button();
        btnPlus = new java.awt.Button();

        label4.setText("label4");

        chSemaine.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                chSemaineItemStateChanged(evt);
            }
        });

        label7.setText("Semaine");

        label6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label6.setText("Mise à jour des cafés");

        label5.setText("Nombre total de cafés");

        tfTotalCafes.setEditable(false);

        tfFonction.setEditable(false);
        tfFonction.setName(""); // NOI18N

        label2.setText("Fonction");

        tfBureau.setEditable(false);

        label3.setText("Bureau");

        setResizable(false);
        setTitle("Gestion des consommations de cafés");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        label1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        label1.setText("Employés");

        lstPersonnes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                lstPersonnesItemStateChanged(evt);
            }
        });
        lstPersonnes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstPersonnesActionPerformed(evt);
            }
        });

        label8.setText("Cafés consommés");

        tfCafes.setEditable(false);

        btnMoins.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnMoins.setLabel("-");
        btnMoins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoinsActionPerformed(evt);
            }
        });

        btnPlus.setLabel("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lstPersonnes, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(tfCafes, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMoins, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(lstPersonnes, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnMoins, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tfCafes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  /* Fin de l'application */
  private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
      System.exit(0);
  }//GEN-LAST:event_exitForm

    private void lstPersonnesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_lstPersonnesItemStateChanged
        miseAJourDesChamps();
    }//GEN-LAST:event_lstPersonnesItemStateChanged

    private void majBouton(){ 
        btnMoins.setEnabled(true);
        if(Integer.parseInt(tfCafes.getText())==0){
            btnMoins.setEnabled(false);
        }
    }
    
    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlusActionPerformed
       incCafe(+1);
       majBouton();
    }//GEN-LAST:event_btnPlusActionPerformed

    private void btnMoinsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoinsActionPerformed
       incCafe(-1);
       majBouton();
    }//GEN-LAST:event_btnMoinsActionPerformed

    private void lstPersonnesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstPersonnesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lstPersonnesActionPerformed

    private void chSemaineItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_chSemaineItemStateChanged
    
    }//GEN-LAST:event_chSemaineItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnMoins;
    private java.awt.Button btnPlus;
    private java.awt.Choice chSemaine;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.List lstPersonnes;
    private java.awt.TextField tfBureau;
    private java.awt.TextField tfCafes;
    private java.awt.TextField tfFonction;
    private java.awt.TextField tfTotalCafes;
    // End of variables declaration//GEN-END:variables
} // FrmMain