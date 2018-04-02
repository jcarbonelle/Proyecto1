package com.example.jorge.proyectomovil.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.example.jorge.proyectomovil.AppDatabase;
import com.example.jorge.proyectomovil.entities.Usuario;

import java.util.List;

/**
 * Created by Jorge on 31/03/2018.
 */

public class UserViewModel extends AndroidViewModel {

    private AppDatabase appDatabase;
    private LiveData<List<Usuario>> usuarios;

    public UserViewModel (@NonNull Application application){
        super(application);

        appDatabase=AppDatabase.getINSTANCE(this.getApplication());
        usuarios= appDatabase.usuarioDao().getAll();

    }

    public  LiveData<List<Usuario>> getUsuarios(){return usuarios;}

    public void addUsuario (Usuario usuario){
        new AddItemTask().execute(usuario);
    }

    private class AddItemTask extends AsyncTask<Usuario,Void,Void> {

        @Override
        protected Void doInBackground(Usuario... usuarios) {
            appDatabase.usuarioDao().insert(usuarios[0]);
            return null;
        }

    }
}