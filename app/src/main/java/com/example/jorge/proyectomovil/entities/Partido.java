package com.example.jorge.proyectomovil.entities;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by Jorge on 31/03/2018.
 */

@Entity
public class Partido {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "Equipo1")
    private String equipo1;

    @ColumnInfo(name = "Equipo2")
    private String equipo2;

    @ColumnInfo(name = "Goles1")
    private int Goles1;

    @ColumnInfo(name = "Goles2")
    private int Goles2;

    @ColumnInfo(name = "Día")
    private String dia;

    @ColumnInfo(name = "Estado")
    private boolean Abierto;

    public Partido(String equipo1, String equipo2, String dia) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.dia = dia;
        Abierto = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(String equipo1) {
        equipo1 = equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(String equipo2) {
        equipo2 = equipo2;
    }

    public int getGoles1() {
        return Goles1;
    }

    public void setGoles1(int goles1) {
        Goles1 = goles1;
    }

    public int getGoles2() {
        return Goles2;
    }

    public void setGoles2(int goles2) {
        Goles2 = goles2;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public boolean isAbierto() {
        return Abierto;
    }

    public void setAbierto(boolean abierto) {
        Abierto = abierto;
    }
}