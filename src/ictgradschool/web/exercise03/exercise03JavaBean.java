package ictgradschool.web.exercise03;

import java.io.Serializable;

public class exercise03JavaBean implements Serializable {

    private String firstName = null;
    private String type = null;
    private String lastName = null;


    public exercise03JavaBean() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
