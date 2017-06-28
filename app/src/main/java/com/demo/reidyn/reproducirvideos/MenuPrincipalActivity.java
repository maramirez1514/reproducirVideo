package com.demo.reidyn.reproducirvideos;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by desarrollo on 28/06/17.
 */

public class MenuPrincipalActivity extends AppCompatActivity {

    @BindView(R.id.btnMediaPlayer) Button btnMediaPlayer;
    @BindView(R.id.btnExoplayer) Button btnExoplayer;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_principal);
        ButterKnife.bind(this);
        asignarEventos();
    }

    private void asignarEventos(){
        btnMediaPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MediaPlayerActivity.class));
            }
        });

        btnExoplayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ExoPlayerActivity.class));
            }
        });
    }
}
