package com.example.jorge.proyectomovil.dao;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;

import com.example.jorge.proyectomovil.entities.Partido;

import java.util.List;

/**
 * Created by Jorge on 31/03/2018.
 */

@Dao
public interface PartidoDao {

    @Query("Select * from Partido")
    LiveData<List<Partido>> getAll();

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Partido partido);
}