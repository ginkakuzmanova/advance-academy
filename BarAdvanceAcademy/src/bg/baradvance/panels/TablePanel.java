package bg.baradvance.panels;

import bg.baradvance.AdvanceAcademyBarFrame;
import bg.baradvance.repositories.ExistingOrdersRepo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TablePanel extends JPanel {
    private JButton table10Btn;
    private JButton table15Btn;
    private JButton table20Btn;
    private JButton table25Btn;
    private JButton table30Btn;
    private JButton table35Btn;
    private JButton table40Btn;
    private JButton table45Btn;
    private JButton table50Btn;

    AdvanceAcademyBarFrame barFrame;
    ExistingOrdersRepo ordersRepo = new ExistingOrdersRepo();

    public TablePanel(AdvanceAcademyBarFrame barFrame){
        super(new FlowLayout());
        this.barFrame = barFrame;
        this.table10Btn = new JButton("10");
        add(table10Btn);
        table10Btn.setActionCommand("10");
        table10Btn.addActionListener(e -> {
                    ordersRepo.set(e.getActionCommand());
                    if(AdvanceAcademyBarFrame.operationState == 1
                            || AdvanceAcademyBarFrame.operationState==2){
                    barFrame.showProductPanel();}
                    //else if(AdvanceAcademyBarFrame.operationState == 3){
                   // }
                }
        );
        this.table15Btn = new JButton("15");
        add(table15Btn);
        table15Btn.setActionCommand("15");
        table15Btn.addActionListener(e -> ordersRepo.set(e.getActionCommand()));
        this.table20Btn = new JButton("20");
        add(table20Btn);
        table20Btn.setActionCommand("20");
        table20Btn.addActionListener(e -> ordersRepo.set(e.getActionCommand()));
        this.table25Btn = new JButton("25");
        add(table25Btn);
        this.table30Btn = new JButton("30");
        add(table30Btn);
        this.table35Btn = new JButton("35");
        add(table35Btn);
        this.table40Btn = new JButton("40");
        add(table40Btn);
        this.table45Btn = new JButton("45");
        add(table45Btn);
        this.table50Btn = new JButton("50");
        add(table50Btn);

    }



}
