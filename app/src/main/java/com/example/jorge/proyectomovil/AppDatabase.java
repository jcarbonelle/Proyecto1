package com.example.jorge.proyectomovil;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.jorge.proyectomovil.dao.ApuestaDao;
import com.example.jorge.proyectomovil.dao.PartidoDao;
import com.example.jorge.proyectomovil.dao.UsuarioDao;
import com.example.jorge.proyectomovil.entities.Apuesta;
import com.example.jorge.proyectomovil.entities.Partido;
import com.example.jorge.proyectomovil.entities.Usuario;

/**
 * Created by Jorge on 31/03/2018.
 */

@Database(entities = {Usuario.class, Apuesta.class, Partido.class}, version =1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract UsuarioDao usuarioDao();
    public abstract PartidoDao partidosDao();
    public abstract ApuestaDao apuestasDao();

    private static AppDatabase INSTANCE;

    public static AppDatabase getINSTANCE (final Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),AppDatabase.class , "Mundial2018").build();
        }

        return INSTANCE;
    }
}