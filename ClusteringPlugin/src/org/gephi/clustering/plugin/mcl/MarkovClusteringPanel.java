/*
Copyright 2008-2010 Gephi
Authors : Mathieu Bastian <mathieu.bastian@gephi.org>
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as
published by the Free Software Foundation, either version 3 of the
License, or (at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.gephi.clustering.plugin.mcl;

import org.gephi.clustering.spi.Clusterer;

/**
 *
 * @author Mathieu Bastian
 */
public class MarkovClusteringPanel extends javax.swing.JPanel {

    private MarkovClustering markovClustering;

    public MarkovClusteringPanel() {
        initComponents();
    }

    public void setup(Clusterer clusterer) {
        markovClustering = (MarkovClustering) clusterer;
        gamma.setText("" + markovClustering.getGammaExp());
        maxresidual.setText("" + markovClustering.getMaxResidual());
        loop.setText("" + markovClustering.getLoopGain());
        zeromax.setText("" + markovClustering.getZeroMax());
    }

    public void unsetup() {
        try {
            markovClustering.setGammaExp(Double.parseDouble(gamma.getText()));
        } catch (Exception e) {
        }
        try {
            markovClustering.setLoopGain(Double.parseDouble(loop.getText()));
        } catch (Exception e) {
        }
        try {
            markovClustering.setMaxResidual(Double.parseDouble(maxresidual.getText()));
        } catch (Exception e) {
        }
        try {
            markovClustering.setZeroMax(Double.parseDouble(zeromax.getText()));
        } catch (Exception e) {
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        maxresidual = new javax.swing.JTextField();
        loop = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gamma = new javax.swing.JTextField();
        zeromax = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jLabel4.setText(org.openide.util.NbBundle.getMessage(MarkovClusteringPanel.class, "MarkovClusteringPanel.jLabel4.text")); // NOI18N

        maxresidual.setText(org.openide.util.NbBundle.getMessage(MarkovClusteringPanel.class, "MarkovClusteringPanel.maxresidual.text")); // NOI18N

        loop.setText(org.openide.util.NbBundle.getMessage(MarkovClusteringPanel.class, "MarkovClusteringPanel.loop.text")); // NOI18N

        jLabel3.setText(org.openide.util.NbBundle.getMessage(MarkovClusteringPanel.class, "MarkovClusteringPanel.jLabel3.text")); // NOI18N

        jLabel2.setText(org.openide.util.NbBundle.getMessage(MarkovClusteringPanel.class, "MarkovClusteringPanel.jLabel2.text")); // NOI18N

        gamma.setText(org.openide.util.NbBundle.getMessage(MarkovClusteringPanel.class, "MarkovClusteringPanel.gamma.text")); // NOI18N

        zeromax.setText(org.openide.util.NbBundle.getMessage(MarkovClusteringPanel.class, "MarkovClusteringPanel.zeromax.text")); // NOI18N

        jLabel1.setText(org.openide.util.NbBundle.getMessage(MarkovClusteringPanel.class, "MarkovClusteringPanel.jLabel1.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loop)
                    .addComponent(gamma)
                    .addComponent(zeromax)
                    .addComponent(maxresidual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(zeromax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(gamma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(loop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(maxresidual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField gamma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField loop;
    private javax.swing.JTextField maxresidual;
    private javax.swing.JTextField zeromax;
    // End of variables declaration//GEN-END:variables
}