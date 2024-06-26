package main.java.com.models;

import javax.persistence.*;

@Entity
public class SiteUser {
    
    @Id
    @GeneratedValue(strategy = GenerationType.Identity)

    private Long id;
    private String username;
    private String password;

    pulic SiteUser(){
    }

    public SiteUser(String username, String password){
        this.username = username;
        this.password = password;
    }
}
