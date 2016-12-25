package com.tldn1.recyclerviewvolley;

/**
 * Created by X on 12/25/2016.
 */

public class Contact {
    private String name;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String name, String email) {

        this.setName(name);
        this.setEmail(email);
    }
}
