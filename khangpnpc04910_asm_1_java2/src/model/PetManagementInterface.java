package model;

import java.io.Serializable;

public interface PetManagementInterface {
    public void save(String path);
   public void open(String path);
   public void add(Pet p);
   public void remove(Pet p);
   public void update(Pet p);
   public Pet find(Serializable id);
   public boolean checkConteiner(String id);
}
