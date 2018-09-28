package com.example.ideaplunge.basegrit.data.db;


import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface UserDbDao {

    @Query("select * from UsersDbModel")
    LiveData<List<UsersDbModel>> getAllUsers();      // getAllUsers


    @Insert(onConflict = REPLACE)
    void addUsers(UsersDbModel usersDbModel);        // Add Users

    @Delete
    void deleteUsers(UsersDbModel usersDbModel);     // Delete Users
}
