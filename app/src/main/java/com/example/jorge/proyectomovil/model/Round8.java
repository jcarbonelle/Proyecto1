
package com.example.jorge.proyectomovil.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Round8 {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("matches")
    @Expose
    private List<Match_________> matches = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Match_________> getMatches() {
        return matches;
    }

    public void setMatches(List<Match_________> matches) {
        this.matches = matches;
    }

}
