
package com.example.jorge.proyectomovil.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class A {

    @SerializedName("matches")
    @Expose
    private List<Match> matches = null;

    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

}
