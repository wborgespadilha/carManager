
package model;

import java.util.Date;

public class Car
{
    private String plate;
    private String owner;
    private String brand;
    private String model;
    private Date entrance;
    private Date exit;
    private String comments;
    private int id;
    private boolean inFirstLocal;
    private boolean inSecondLocal;
    private boolean inThirdLocal;
    private boolean inFourthLocal;

    public Car() 
    {
        this.plate = null;
        this.owner = null;
        this.brand = null;
        this.model = null;
        this.entrance = null;
        this.exit = null;
        this.comments = null;
        this.inFirstLocal = false;
        this.inSecondLocal = false;
        this.inThirdLocal = false;
        this.inFourthLocal = false;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Date getEntrance() {
        return entrance;
    }

    public void setEntrance(Date entrance) {
        this.entrance = entrance;
    }

    public Date getExit() {
        return exit;
    }

    public void setExit(Date exit) {
        this.exit = exit;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isInFirstLocal() {
        return inFirstLocal;
    }

    public void setInFirstLocal(boolean inFirstLocal) {
        this.inFirstLocal = inFirstLocal;
    }

    public boolean isInSecondLocal() {
        return inSecondLocal;
    }

    public void setInSecondLocal(boolean inSecondLocal) {
        this.inSecondLocal = inSecondLocal;
    }

    public boolean isInThirdLocal() {
        return inThirdLocal;
    }

    public void setInThirdLocal(boolean inThirdLocal) {
        this.inThirdLocal = inThirdLocal;
    }

    public boolean isInFourthLocal() {
        return inFourthLocal;
    }

    public void setInFourthLocal(boolean inFourthLocal) {
        this.inFourthLocal = inFourthLocal;
    }

}
