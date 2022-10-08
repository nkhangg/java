package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import model.PetManagementModel;
import view.PetManagementView;

public class PetManagementController implements ActionListener, MouseListener {

    private PetManagementModel model;
    private PetManagementView view;
    private int index = 0;

    public PetManagementController(PetManagementView view) {
        this.view = view;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        int listSize = this.view.getListSize();

        switch (src) {
            case "New":
                this.view.reset();
                break;
            case "Save":
                this.view.showRecord(0);
                this.view.handleSave();
                break;

            case "Find":
                this.view.find();
                break;

            case "Open":
                this.view.read();
                this.view.fillFild(0);
                this.view.showRecord(1);
                break;

            case "Delete":
                this.view.delete();
                break;

            case "comboBoxChanged":
                this.view.showTotal();
                break;

            case "<<":

                if (this.view.checkError()) {
                    --index;
                    if (index < 0) {
                        index = 0;
                    }

                    this.view.fillFild(index);
                    this.view.showRecord(index + 1);
                } else {
                    this.view.showWarning("Data not found !");
                }
                break;

            case ">>":
                try {
                if (this.view.checkError()) {
                    ++index;
                    this.view.fillFild(index);
                    this.view.showRecord(index + 1);

                    if (index >= listSize - 1) {
                        index = listSize - 1;
                    }
                } else {
                    this.view.showWarning("Data not found !");
                }
            } catch (Exception ex) {
                index = listSize - 1;
            }

            break;

            case ">|":
                if (this.view.checkError()) {
                    this.view.fillFild(0);
                    this.view.showRecord(1);
                    index = 0;
                } else {
                    this.view.showWarning("Data not found !");
                }
                break;

            case "|<":
                if (this.view.checkError()) {
                    if (this.view.checkError()) {
                        this.view.fillFild(listSize - 1);
                        this.view.showRecord(listSize);
                        index = listSize - 1;

                    }
                } else {
                    this.view.showWarning("Data not found !");
                }
                break;

            case "Exit":
                this.view.exit();
            default:
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        this.view.showInfo();
        this.view.showRecord(this.view.showSelectedToTable() + 1);
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

}
