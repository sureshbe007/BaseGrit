package com.example.ideaplunge.basegrit.data.db;

import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.ideaplunge.basegrit.utils.AppConstant;

public abstract class AppDatabase extends RoomDatabase {


    private static AppDatabase INSTANCE;

    public abstract UserDbDao userDModelDao();


    public static AppDatabase getDatabase(Context context) {
        if (INSTANCE == null) {
            INSTANCE =
                    Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, AppConstant.BASE_GRID_DB)
                            .build();
        }
        return INSTANCE;
    }

    public static void destroyInstance() {
        INSTANCE = null;
    }


}
