/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class ObjPet {

    private Pet p;
    private int index;

    public ObjPet(Pet p, int index) {
        this.p = p;
        this.index = index;
    }

    public Pet getP() {
        return p;
    }

    public void setP(Pet p) {
        this.p = p;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "ObjPet{" + "p=" + p + ", index=" + index + '}';
    }

}
