/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.*;
import java.util.*;

/**
 *
 * @author karinemellata
 */
public class TileODesignUI extends javax.swing.JFrame {
    private String hLength = "";
    private String vLength = "";
    private String numOfPlayersInGame = "";
    
    private double WINDOW_WIDTH = getContentPane().getSize().getWidth();
    private int WINDOW_HEIGHT = (int)getContentPane().getSize().getHeight();

    /**
     * Creates new form TileOUGUI
     */
    public TileODesignUI() {
        initComponents();

    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        applyChangesConnectionButton = new javax.swing.JButton();
        chosenPlayer = new javax.swing.JComboBox<>();
        removeTileButton = new javax.swing.JButton();
        tileType = new javax.swing.JComboBox<>();
        addTileButton = new javax.swing.JButton();
        selectPositionButton = new javax.swing.JButton();
        removeConnectionButton = new javax.swing.JButton();
        addConnectionButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        nbRollDieCard = new javax.swing.JTextField();
        nbRemoveConnectionCard = new javax.swing.JTextField();
        nbTeleportCard = new javax.swing.JTextField();
        nbLoseTurnCard = new javax.swing.JTextField();
        nbConnectTilesCard = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        nbOfPlayers = new javax.swing.JComboBox<>();
        loadButton = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        cardsLeft = new javax.swing.JLabel();
        horizontalLength = new javax.swing.JComboBox<>();
        verticalLength = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel1.setText("Board:");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setText("Player:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setText("Tile:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel4.setText("Connection:");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel5.setText("Deck:");

        jLabel6.setText("Enter dimensions");

        jLabel7.setText("Enter number of players");

        jLabel8.setText("Select player");

        jLabel9.setText("Change tile type");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel10.setText("x");

        applyChangesConnectionButton.setBackground(new java.awt.Color(0, 204, 0));
        applyChangesConnectionButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        applyChangesConnectionButton.setForeground(new java.awt.Color(255, 255, 255));
        applyChangesConnectionButton.setText("Apply changes");
        applyChangesConnectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyChangesConnectionButtonActionPerformed(evt);
            }
        });

        chosenPlayer.setBackground(new java.awt.Color(204, 204, 255));
        chosenPlayer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        chosenPlayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chosenPlayerActionPerformed(evt);
            }
        });

        removeTileButton.setBackground(new java.awt.Color(153, 153, 255));
        removeTileButton.setText("Remove Tile");
        removeTileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeTileButtonActionPerformed(evt);
            }
        });

        tileType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular Tile", "Action Tile", "Win Tile" }));
        tileType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tileTypeActionPerformed(evt);
            }
        });

        addTileButton.setBackground(new java.awt.Color(153, 153, 255));
        addTileButton.setText("Add Tile");
        addTileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTileButtonActionPerformed(evt);
            }
        });

        selectPositionButton.setBackground(new java.awt.Color(153, 153, 255));
        selectPositionButton.setText("Select Start Position");
        selectPositionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectPositionButtonActionPerformed(evt);
            }
        });

        removeConnectionButton.setBackground(new java.awt.Color(153, 153, 255));
        removeConnectionButton.setText("Remove Connection");
        removeConnectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeConnectionButtonActionPerformed(evt);
            }
        });

        addConnectionButton.setBackground(new java.awt.Color(153, 153, 255));
        addConnectionButton.setText("Add Connection");
        addConnectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addConnectionButtonActionPerformed(evt);
            }
        });

        jLabel11.setText("Cards left :");

        jLabel12.setText("Roll Die");

        jLabel13.setText("Remove Connection");

        jLabel14.setText("Teleport");

        jLabel15.setText("Lose Turn");

        jLabel16.setText("Connect Tiles");

        nbRollDieCard.setText("0");
        nbRollDieCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbRollDieCardActionPerformed(evt);
            }
        });

        nbRemoveConnectionCard.setText("0");
        nbRemoveConnectionCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbRemoveConnectionCardActionPerformed(evt);
            }
        });

        nbTeleportCard.setText("0");
        nbTeleportCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbTeleportCardActionPerformed(evt);
            }
        });

        nbLoseTurnCard.setText("0");
        nbLoseTurnCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbLoseTurnCardActionPerformed(evt);
            }
        });

        nbConnectTilesCard.setText("0");
        nbConnectTilesCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbConnectTilesCardActionPerformed(evt);
            }
        });

        saveButton.setBackground(new java.awt.Color(0, 0, 255));
        saveButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        saveButton.setForeground(new java.awt.Color(255, 255, 255));
        saveButton.setText("Load");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        nbOfPlayers.setBackground(new java.awt.Color(204, 204, 255));
        nbOfPlayers.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4" }));
        nbOfPlayers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbOfPlayersActionPerformed(evt);
            }
        });

        loadButton.setBackground(new java.awt.Color(0, 0, 255));
        loadButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        loadButton.setForeground(new java.awt.Color(255, 255, 255));
        loadButton.setText("Save");
        loadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadButtonActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel17.setText("TileO Design Mode");

        backButton.setBackground(new java.awt.Color(255, 0, 0));
        backButton.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        cardsLeft.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        cardsLeft.setText("32");

        horizontalLength.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        horizontalLength.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horizontalLengthActionPerformed(evt);
            }
        });

        verticalLength.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));
        
        /*
         * 
         * 
         * BEGIN OWN CODE
         * 
         * 
         */
        
        //Window
        
        setResizable(false);
        
        //Board
        
        ArrayList<JToggleButton> tilesUI = new ArrayList<JToggleButton>();
        
        for(int i = 0; i < 15; i++) {
          for(int j = 0; j < 15; j++) {
            JToggleButton tile = new javax.swing.JToggleButton();
            tile.setPreferredSize(new java.awt.Dimension(40,40));
            
            tilesUI.add(tile);
          }
        }
        
        JToggleButton tile1 = new javax.swing.JToggleButton();
        tile1.setPreferredSize(new java.awt.Dimension(40,40));
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        javax.swing.JPanel tilesPanel = new javax.swing.JPanel();
        
        tilesPanel.setPreferredSize(new java.awt.Dimension(1080, 600));
        
        for(int i = 0;i < 50; i++) {
          tilesPanel.add(tilesUI.get(i));
          
        }
        
        /*
         * 
         * END OWN CODE
         * 
         * 
         */
        
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel11))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jLabel12))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(cardsLeft)
                                                                .addGap(52, 52, 52)
                                                                .addComponent(nbRollDieCard, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel13))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(57, 57, 57)
                                                                .addComponent(nbRemoveConnectionCard, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(36, 36, 36)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel14)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(nbTeleportCard, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(50, 50, 50)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent(nbLoseTurnCard, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(87, 87, 87)
                                                                .addComponent(nbConnectTilesCard, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel15)
                                                                .addGap(43, 43, 43)
                                                                .addComponent(jLabel16)))
                                                .addGap(46, 46, 46))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addGap(61, 61, 61)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(100, 100, 100)
                                                                .addComponent(addConnectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(36, 36, 36)
                                                                                .addComponent(removeConnectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(jLabel8)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addComponent(chosenPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(selectPositionButton, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel7)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(jLabel6)
                                                                                .addGap(61, 61, 61)
                                                                                .addComponent(horizontalLength, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(11, 11, 11)
                                                                                .addComponent(nbOfPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jLabel10)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(verticalLength, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(jLabel9)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(tileType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(51, 51, 51)
                                                                .addComponent(addTileButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(removeTileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(applyChangesConnectionButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                        .addComponent(saveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(loadButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(26, 26, 26))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                                .addComponent(jLabel17).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                ).addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup().addComponent(tilesPanel))
                        
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel17)
                                        .addComponent(backButton))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel10)
                                        .addComponent(horizontalLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(verticalLength, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(chosenPlayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(selectPositionButton)
                                        .addComponent(nbOfPlayers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(13, 13, 13)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel9)
                                                        .addComponent(tileType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(addTileButton)
                                                        .addComponent(removeTileButton))
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(removeConnectionButton)
                                                        .addComponent(addConnectionButton)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(loadButton)
                                                .addGap(13, 13, 13)
                                                .addComponent(saveButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel11)
                                                        .addComponent(applyChangesConnectionButton)
                                                        .addComponent(cardsLeft)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel12)
                                                        .addComponent(jLabel13)
                                                        .addComponent(jLabel14)
                                                        .addComponent(jLabel15)
                                                        .addComponent(jLabel16))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(nbRollDieCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nbRemoveConnectionCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nbTeleportCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nbLoseTurnCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(nbConnectTilesCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(tilesPanel))
                                
        );

        pack();
    }// </editor-fold>

    private void applyChangesConnectionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void chosenPlayerActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void removeTileButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void tileTypeActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void addTileButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void selectPositionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void removeConnectionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void addConnectionButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void nbRollDieCardActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void nbRemoveConnectionCardActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void nbTeleportCardActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void nbLoseTurnCardActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void nbConnectTilesCardActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void nbOfPlayersActionPerformed(java.awt.event.ActionEvent evt) {
        String nbOfPlayersChosen = (String) nbOfPlayers.getSelectedItem();
        switch (nbOfPlayersChosen) { //Setting number of pkayers in game, to send to controller
            case "2":
                numOfPlayersInGame = "2";
                break;
            case "3":
                numOfPlayersInGame = "3";
                break;
            case "4":
                numOfPlayersInGame = "4";
                break;
        }
        if (nbOfPlayers.getSelectedItem()== "4") { //Setting value of combo box for choosing a player to defined number of players
            chosenPlayer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1", "2", "3", "4"}));}
        else if(nbOfPlayers.getSelectedItem()== "3"){
            chosenPlayer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"1", "2", "3"}));}
        else{
            chosenPlayer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2" }));
        }
    }

    private void loadButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void horizontalLengthActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

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
            java.util.logging.Logger.getLogger(TileODesignUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TileODesignUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TileODesignUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TileODesignUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TileODesignUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JButton addConnectionButton;
    private javax.swing.JButton addTileButton;
    private javax.swing.JButton applyChangesConnectionButton;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel cardsLeft;
    private javax.swing.JComboBox<String> chosenPlayer;
    private javax.swing.JComboBox<String> horizontalLength;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton loadButton;
    private javax.swing.JTextField nbConnectTilesCard;
    private javax.swing.JTextField nbLoseTurnCard;
    private javax.swing.JComboBox<String> nbOfPlayers;
    private javax.swing.JTextField nbRemoveConnectionCard;
    private javax.swing.JTextField nbRollDieCard;
    private javax.swing.JTextField nbTeleportCard;
    private javax.swing.JButton removeConnectionButton;
    private javax.swing.JButton removeTileButton;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton selectPositionButton;
    private javax.swing.JComboBox<String> tileType;
    private javax.swing.JComboBox<String> verticalLength;
    // End of variables declaration
}
