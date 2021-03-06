/*
Copyright 2008-2010 Gephi
Authors : Mathieu Bastian <mathieu.bastian@gephi.org>, Mathieu Jacomy, Julian Bilcke, Eduardo Ramos
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
package org.gephi.desktop.datalab;

/**
 * Configurations dialog for DataTableTopComponent
 * @author Eduardo Ramos <eduramiba@gmail.com>
 */
public class ConfigurationPanel extends javax.swing.JPanel {

    private DataTableTopComponent dataTableTopComponent;

    /** Creates new form ConfigurationPanel */
    public ConfigurationPanel(DataTableTopComponent dataTableTopComponent) {
        this.dataTableTopComponent=dataTableTopComponent;
        initComponents();
        onlyVisibleCheckBox.setSelected(dataTableTopComponent.isShowOnlyVisible());
        useSparklinesCheckBox.setSelected(dataTableTopComponent.isUseSparklines());
        timeIntervalsGraphicsCheckBox.setSelected(dataTableTopComponent.isTimeIntervalGraphics());
        showEdgesNodesLabelsCheckBox.setSelected(dataTableTopComponent.isShowEdgesNodesLabels());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        onlyVisibleCheckBox = new javax.swing.JCheckBox();
        useSparklinesCheckBox = new javax.swing.JCheckBox();
        showEdgesNodesLabelsCheckBox = new javax.swing.JCheckBox();
        descriptionLabel = new javax.swing.JLabel();
        timeIntervalsGraphicsCheckBox = new javax.swing.JCheckBox();

        onlyVisibleCheckBox.setText(org.openide.util.NbBundle.getMessage(ConfigurationPanel.class, "ConfigurationPanel.onlyVisibleCheckBox.text")); // NOI18N
        onlyVisibleCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onlyVisibleCheckBoxActionPerformed(evt);
            }
        });

        useSparklinesCheckBox.setText(org.openide.util.NbBundle.getMessage(ConfigurationPanel.class, "ConfigurationPanel.useSparklinesCheckBox.text")); // NOI18N
        useSparklinesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                useSparklinesCheckBoxActionPerformed(evt);
            }
        });

        showEdgesNodesLabelsCheckBox.setText(org.openide.util.NbBundle.getMessage(ConfigurationPanel.class, "ConfigurationPanel.showEdgesNodesLabelsCheckBox.text")); // NOI18N
        showEdgesNodesLabelsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showEdgesNodesLabelsCheckBoxActionPerformed(evt);
            }
        });

        descriptionLabel.setText(org.openide.util.NbBundle.getMessage(ConfigurationPanel.class, "ConfigurationPanel.descriptionLabel.text")); // NOI18N

        timeIntervalsGraphicsCheckBox.setText(org.openide.util.NbBundle.getMessage(ConfigurationPanel.class, "ConfigurationPanel.timeIntervalsGraphicsCheckBox.text")); // NOI18N
        timeIntervalsGraphicsCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeIntervalsGraphicsCheckBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(descriptionLabel, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(onlyVisibleCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(useSparklinesCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(showEdgesNodesLabelsCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(timeIntervalsGraphicsCheckBox, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(descriptionLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 4, Short.MAX_VALUE)
                .addComponent(onlyVisibleCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(useSparklinesCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(timeIntervalsGraphicsCheckBox)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showEdgesNodesLabelsCheckBox)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void onlyVisibleCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onlyVisibleCheckBoxActionPerformed
        dataTableTopComponent.setShowOnlyVisible(onlyVisibleCheckBox.isSelected());
    }//GEN-LAST:event_onlyVisibleCheckBoxActionPerformed

    private void useSparklinesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_useSparklinesCheckBoxActionPerformed
        dataTableTopComponent.setUseSparklines(useSparklinesCheckBox.isSelected());
    }//GEN-LAST:event_useSparklinesCheckBoxActionPerformed

    private void timeIntervalsGraphicsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeIntervalsGraphicsCheckBoxActionPerformed
        dataTableTopComponent.setTimeIntervalGraphics(timeIntervalsGraphicsCheckBox.isSelected());
    }//GEN-LAST:event_timeIntervalsGraphicsCheckBoxActionPerformed

    private void showEdgesNodesLabelsCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showEdgesNodesLabelsCheckBoxActionPerformed
        dataTableTopComponent.setShowEdgesNodesLabels(showEdgesNodesLabelsCheckBox.isSelected());
    }//GEN-LAST:event_showEdgesNodesLabelsCheckBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JCheckBox onlyVisibleCheckBox;
    private javax.swing.JCheckBox showEdgesNodesLabelsCheckBox;
    private javax.swing.JCheckBox timeIntervalsGraphicsCheckBox;
    private javax.swing.JCheckBox useSparklinesCheckBox;
    // End of variables declaration//GEN-END:variables

}
