package com.example.urss;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        videoView = findViewById(R.id.videoView);

        //Esconde a statusBar e barra de navegação
        View decorView = getWindow().getDecorView(); //decorVie modifica objetos na tela / getwindow recupera objeto de tela
        int uiOpcoes = View.SYSTEM_UI_FLAG_FULLSCREEN; //opçção para configurar o video na tela

        decorView.setSystemUiVisibility(uiOpcoes); //manipular componentes de tela

        //Esconde ActionBar barra
        getSupportActionBar().hide();

        //executar o video
        videoView.setMediaController( new MediaController(this));
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.video);
        videoView.start();

    }
}
