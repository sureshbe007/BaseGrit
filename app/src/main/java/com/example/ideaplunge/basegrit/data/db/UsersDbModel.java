package com.example.ideaplunge.basegrit.data.db;


import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class UsersDbModel {

  @PrimaryKey(autoGenerate = true)
    private String id;

    private String name;
    private String age;
    private String email;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }
}
