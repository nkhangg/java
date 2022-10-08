package model;

import java.io.Serializable;

public class Pet implements Serializable {

    private int id;
    private String namePet;
    private String typePet;
    private boolean genderPet;
    private int agePet;
    private String nameAuth;
    private String email;
    private String std;
    private double price;
    private String service;



    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public Pet(int id, String namePet, String typePet, boolean genderPet, int agePet, String nameAuth, String email, String std, double price, String service) {
        this.id = id;
        this.namePet = namePet;
        this.typePet = typePet;
        this.genderPet = genderPet;
        this.agePet = agePet;
        this.nameAuth = nameAuth;
        this.email = email;
        this.std = std;
        this.price = price;
        this.service = service;
    }

    

    public double getPrice() {
        if(this.service.equals("Shower")){
            return price = 120000;
        }
        return price = 200000;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    

    public Pet() {
    }

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public String getTypePet() {
        return typePet;
    }

    public void setTypePet(String typePet) {
        this.typePet = typePet;
    }

    public boolean isGenderPet() {
        return genderPet;
    }

    public void setGenderPet(boolean genderPet) {
        this.genderPet = genderPet;
    }

    public int getAgePet() {
        return agePet;
    }

    public void setAgePet(int agePet) {
        this.agePet = agePet;
    }

    public String getNameAuth() {
        return nameAuth;
    }

    public void setNameAuth(String nameAuth) {
        this.nameAuth = nameAuth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStd() {
        return std;
    }

    public void setStd(String std) {
        this.std = std;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Pet{" + "namePet=" + namePet + ", typePet=" + typePet + ", genderPet=" + genderPet + ", agePet=" + agePet + ", nameAuth=" + nameAuth + ", email=" + email + ", std=" + std + '}';
    }

}
