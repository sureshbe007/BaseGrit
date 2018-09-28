package com.example.ideaplunge.basegrit.ui.Users;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;

import com.example.ideaplunge.basegrit.data.db.AppDatabase;
import com.example.ideaplunge.basegrit.data.db.UsersDbModel;

import java.util.List;

public class UserListViewModel extends AndroidViewModel {

    private final LiveData<List<UsersDbModel>> itemUsersList;

    private AppDatabase appDatabase;


    public UserListViewModel(Application application) {
        super(application);

        appDatabase = AppDatabase.getDatabase(this.getApplication());

        itemUsersList = appDatabase.userDModelDao().getAllUsers();
    }

                           // GetAllUsers

    public LiveData<List<UsersDbModel>> getUsersList() {
        return itemUsersList;
    }

                      // DeleteUserOperation
    public void deleteUsers(UsersDbModel usersDbModel) {
        new deleteAsyncTask(appDatabase).execute(usersDbModel);
    }

    private static class deleteAsyncTask extends AsyncTask<UsersDbModel, Void, Void> {

        private AppDatabase db;

        deleteAsyncTask(AppDatabase appDatabase) {
            db = appDatabase;
        }

        @Override
        protected Void doInBackground(final UsersDbModel... params) {
            db.userDModelDao().deleteUsers(params[0]);
            return null;
        }

    }
}
