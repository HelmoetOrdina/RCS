package com.example.robertcoppes;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String uri = "https://robert.dzengis.nl/broodjesproject.mp4";
        try {
            mp.setAudioStreamType(AudioManager.STREAM_MUSIC);
            mp.setDataSource(uri);
            mp.prepare();
            mp.start();
        } catch (Exception e) {
            // handle exception
            Snackbar.make(findViewById(R.id.videoView2), "F:" + e.getMessage(),
                            Snackbar.LENGTH_LONG)
                    .show();
        }
    }
}