package com.example.jorge.proyectomovil.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Jorge on 31/03/2018.
 */

@Entity
public class Apuesta {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "User_ID")
    private int uid;

    @ColumnInfo(name = "Partida_ID")
    private int pid;

    @ColumnInfo(name = "Goles1")
    private int goles1;

    @ColumnInfo(name = "Goles2")
    private int goles2;

    @ColumnInfo(name = "Puntos")
    private int puntos;


    public Apuesta(int uid, int pid, int goles1, int goles2) {
        this.uid = uid;
        this.pid = pid;
        this.goles1 = goles1;
        this.goles2 = goles2;
        puntos=0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getGoles1() {
        return goles1;
    }

    public void setGoles1(int goles1) {
        goles1 = goles1;
    }

    public int getGoles2() {
        return goles2;
    }

    public void setGoles2(int goles2) {
        goles2 = goles2;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }
}
