package com.example.jorge.proyectomovil.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.MutableLiveData;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.util.Log;

import com.example.jorge.proyectomovil.AppDatabase;
import com.example.jorge.proyectomovil.entities.Partido;
import com.example.jorge.proyectomovil.model.A;
import com.example.jorge.proyectomovil.model.B;
import com.example.jorge.proyectomovil.model.C;
import com.example.jorge.proyectomovil.model.D;
import com.example.jorge.proyectomovil.model.E;
import com.example.jorge.proyectomovil.model.F;
import com.example.jorge.proyectomovil.model.G;
import com.example.jorge.proyectomovil.model.Groups;
import com.example.jorge.proyectomovil.model.H;
import com.example.jorge.proyectomovil.model.JSonData;
import com.example.jorge.proyectomovil.model.Match;
import com.example.jorge.proyectomovil.model.Match_;
import com.example.jorge.proyectomovil.model.Match__;
import com.example.jorge.proyectomovil.model.Match___;
import com.example.jorge.proyectomovil.model.Match____;
import com.example.jorge.proyectomovil.model.Match_____;
import com.example.jorge.proyectomovil.model.Match______;
import com.example.jorge.proyectomovil.model.Match_______;
import com.example.jorge.proyectomovil.retrofit.ApiService;
import com.example.jorge.proyectomovil.retrofit.RetroClient;

import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Jorge on 31/03/2018.
 */

public class PartidosViewModel extends AndroidViewModel {

    private Groups jSonData;
    private MutableLiveData<List<Partido>> partidos;
    private AppDatabase appDatabase;

    public PartidosViewModel(@NonNull Application application) {
        super(application);
        if (jSonData == null){
            jSonData= new Groups();
        }
        appDatabase = AppDatabase.getINSTANCE(this.getApplication());
        Log.d("MSG","Constructor");
        getJSon();
        setPartidos(jSonData);
    }

    private void getJSon(){
        ApiService api = RetroClient.getApiService();
        retrofit2.Call<Groups> dataCall = api.getMyJSonData();
        dataCall.enqueue(new Callback<Groups>() {
            @Override
            public void onResponse(retrofit2.Call<Groups> call, Response<Groups> response) {
                jSonData=response.body();

            }

            @Override
            public void onFailure(retrofit2.Call<Groups> call, Throwable t) {
                Log.d("TAG","onFailure");
            }
        });
    }

    public MutableLiveData<List<Partido>> getPartidos() {
        return partidos;
    }


    public void setPartidos (Groups jSonData){
        List<Partido> lista = null;
        A a =jSonData.getA();
        for (int i = 0; i < a.getMatches().size(); i++) {
            Match match=a.getMatches().get(i);
            Partido partido= new Partido(match.getHomeTeam()+"",match.getAwayTeam()+"",match.getDate());
            lista.add(partido);
        }
        B b =jSonData.getB();
        for (int i = 0; i < b.getMatches().size(); i++) {
            Match_ match=b.getMatches().get(i);
            Partido partido= new Partido(match.getHomeTeam()+"",match.getAwayTeam()+"",match.getDate());
            lista.add(partido);
        }
        C c =jSonData.getC();
        for (int i = 0; i < c.getMatches().size(); i++) {
            Match__ match=c.getMatches().get(i);
            Partido partido= new Partido(match.getHomeTeam()+"",match.getAwayTeam()+"",match.getDate());
            lista.add(partido);
        }
        D d =jSonData.getD();
        for (int i = 0; i < d.getMatches().size(); i++) {
            Match___ match =d.getMatches().get(i);
            Partido partido= new Partido(match.getHomeTeam()+"",match.getAwayTeam()+"",match.getDate());
            lista.add(partido);
        }
        E e =jSonData.getE();
        for (int i = 0; i < e.getMatches().size(); i++) {
            Match____ match=e.getMatches().get(i);
            Partido partido= new Partido(match.getHomeTeam()+"",match.getAwayTeam()+"",match.getDate());
            lista.add(partido);
        }
        F f =jSonData.getF();
        for (int i = 0; i < f.getMatches().size(); i++) {
            Match_____ match=f.getMatches().get(i);
            Partido partido= new Partido(match.getHomeTeam()+"",match.getAwayTeam()+"",match.getDate());
            lista.add(partido);
        }
        G g =jSonData.getG();
        for (int i = 0; i < g.getMatches().size(); i++) {
            Match______ match=g.getMatches().get(i);
            Partido partido= new Partido(match.getHomeTeam()+"",match.getAwayTeam()+"",match.getDate());
            lista.add(partido);
        }
        H h =jSonData.getH();
        for (int i = 0; i < h.getMatches().size(); i++) {
            Match_______ match =h.getMatches().get(i);
            Partido partido= new Partido(match.getHomeTeam()+"",match.getAwayTeam()+"",match.getDate());
            lista.add(partido);
        }

        partidos.setValue(lista);
        for (int i = 0; i < lista.size() ; i++) {
            addPartido(lista.get(i));
        }
    }

    public void addPartido (Partido partido){
        new AddItemTask().execute(partido);
    }

    private class AddItemTask extends AsyncTask<Partido,Void,Void> {

        @Override
        protected Void doInBackground(Partido... partidos) {
            appDatabase.partidosDao().insert(partidos[0]);
            return null;
        }
    }
}
