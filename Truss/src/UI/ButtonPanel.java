/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author Wislo
 */
public class ButtonPanel extends javax.swing.JPanel {
    private CreateTruss trussGenerator;
    private EditorPanel editor;
    private int currentSelection = -1;
    
    public ButtonPanel(CreateTruss trussGenerator) {
        initComponents();
        this.trussGenerator = trussGenerator;
    }
    
    public int getCurrentSelection(){
        return this.currentSelection;
    }
    
    public void setEditorPanel(EditorPanel editor){
        this.editor = editor;
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
        tbtn_AddJoin = new javax.swing.JToggleButton();
        tbtn_AddMember = new javax.swing.JToggleButton();
        tbtn_AddPinSprt = new javax.swing.JToggleButton();
        tbtn_AddRollerSprt = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        lbl_exp_noJoints = new javax.swing.JLabel();
        lbl_exp_noMembers = new javax.swing.JLabel();
        lbl_exp_noRF = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbl_exp_isSD = new javax.swing.JLabel();
        lbl_isStaticallyDeterminate = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        tbtn_AddJoin.setText("Add Join");
        tbtn_AddJoin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_AddJoinActionPerformed(evt);
            }
        });
        jPanel1.add(tbtn_AddJoin);

        tbtn_AddMember.setText("Add Member");
        tbtn_AddMember.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_AddMemberActionPerformed(evt);
            }
        });
        jPanel1.add(tbtn_AddMember);

        tbtn_AddPinSprt.setText("Add Pinned Support");
        tbtn_AddPinSprt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_AddPinSprtActionPerformed(evt);
            }
        });
        jPanel1.add(tbtn_AddPinSprt);

        tbtn_AddRollerSprt.setText("Add Roller Support");
        tbtn_AddRollerSprt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtn_AddRollerSprtActionPerformed(evt);
            }
        });
        jPanel1.add(tbtn_AddRollerSprt);

        lbl_exp_noJoints.setText("Number of joints:");

        lbl_exp_noMembers.setText("Number of Members:");

        lbl_exp_noRF.setText("Reaction forces:");

        jLabel1.setText("0");

        jLabel2.setText("0");

        jLabel3.setText("0");

        lbl_exp_isSD.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_exp_isSD.setText("Is statically determinate?");

        lbl_isStaticallyDeterminate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_isStaticallyDeterminate.setText("Yes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_exp_noJoints)
                    .addComponent(lbl_exp_noMembers)
                    .addComponent(lbl_exp_noRF))
                .addGap(67, 67, 67)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 207, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_exp_isSD)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lbl_isStaticallyDeterminate)
                        .addGap(120, 120, 120)))
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_exp_noJoints)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lbl_exp_isSD)))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_isStaticallyDeterminate)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_exp_noMembers)
                        .addComponent(jLabel2)))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_exp_noRF)
                    .addComponent(jLabel3))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        jButton1.setText("Add External Forces");
        jPanel3.add(jButton1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(266, 266, 266))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tbtn_AddJoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_AddJoinActionPerformed
        if(currentSelection==0)
            currentSelection = -1;
        else{
            currentSelection=0;
        }
        
        editor.isAddingMember = false;
        System.out.println(currentSelection+" , "+editor.isAddingMember);
        this.tbtn_AddMember.setSelected(false);
        this.tbtn_AddPinSprt.setSelected(false);
        this.tbtn_AddRollerSprt.setSelected(false);
        
    }//GEN-LAST:event_tbtn_AddJoinActionPerformed

    private void tbtn_AddMemberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_AddMemberActionPerformed
        if(currentSelection==1)
            currentSelection = -1;
        else{
            currentSelection=1;
        }
        editor.isAddingMember = !editor.isAddingMember;
        System.out.println(currentSelection+" , "+editor.isAddingMember);
        this.tbtn_AddJoin.setSelected(false);
        this.tbtn_AddPinSprt.setSelected(false);
        this.tbtn_AddRollerSprt.setSelected(false);
    }//GEN-LAST:event_tbtn_AddMemberActionPerformed

    private void tbtn_AddPinSprtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_AddPinSprtActionPerformed
        if(currentSelection==2)
            currentSelection = -1;
        else{
            currentSelection=2;
        }
        editor.isAddingMember = false;
        System.out.println(currentSelection+" , "+editor.isAddingMember);
        this.tbtn_AddJoin.setSelected(false);
        this.tbtn_AddMember.setSelected(false);
        this.tbtn_AddRollerSprt.setSelected(false);
    }//GEN-LAST:event_tbtn_AddPinSprtActionPerformed

    private void tbtn_AddRollerSprtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtn_AddRollerSprtActionPerformed
        if(currentSelection==3)
            currentSelection = -1;
        else{
            currentSelection=3;
        }
        editor.isAddingMember = false;
        System.out.println(currentSelection+" , "+editor.isAddingMember);
        this.tbtn_AddJoin.setSelected(false);
        this.tbtn_AddMember.setSelected(false);
        this.tbtn_AddPinSprt.setSelected(false);
    }//GEN-LAST:event_tbtn_AddRollerSprtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_exp_isSD;
    private javax.swing.JLabel lbl_exp_noJoints;
    private javax.swing.JLabel lbl_exp_noMembers;
    private javax.swing.JLabel lbl_exp_noRF;
    private javax.swing.JLabel lbl_isStaticallyDeterminate;
    private javax.swing.JToggleButton tbtn_AddJoin;
    private javax.swing.JToggleButton tbtn_AddMember;
    private javax.swing.JToggleButton tbtn_AddPinSprt;
    private javax.swing.JToggleButton tbtn_AddRollerSprt;
    // End of variables declaration//GEN-END:variables
}
