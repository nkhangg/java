package model;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PetManagementModel implements PetManagementInterface {

    private List<Pet> list;
    private String path;
    private int index;

    public PetManagementModel() {
        this.list = new ArrayList<>();
        this.path = "data.txt";
        this.index = this.list.size();
    }

    public List<Pet> getList() {
        return list;
    }

    public void setList(List<Pet> list) {
        this.list = list;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    public int getListSize(){
        return this.list.size();
    }
    
    public void sort(){
        Collections.sort(list, (a, b) -> (a.getId() - b.getId()));
    }

    @Override
    public void save(String path) {
        try {
            XFile.writeObj(path, list);
        } catch (IOException ex) {
            
        }
    }

    @Override
    public void open(String path) {
        try {
            list = (ArrayList<Pet>) XFile.readObj(path);
        } catch (IOException ex) {
            
        } catch (ClassNotFoundException ex) {
            
        }
    }

    @Override
    public void add(Pet p) {
        list.add(p);
    }

    @Override
    public void remove(Pet p) {
        list.remove(p);
    }

    @Override
    public void update(Pet p) {
    }

    @Override
    public Pet find(Serializable id) {
        for (Pet p : list) {
            if (id.equals(p.getId())) {
                return p;
            }
        }
        return null;
    }
    
    public ObjPet findIdReturnObj(Serializable id) {
        int index = -1;
        for (Pet p : list) {
            index++;
            if (id.equals(p.getId())) {
                return new ObjPet(p, index);
            }
        }
        return null;
    }
    
    public void test(){
        int index = -1;
        for (Pet p : list) {
            index++;
            System.out.println(list.get(index));
        }
    }
    
    

    @Override
    public boolean checkConteiner(String id) {
        return true;
    }

}
