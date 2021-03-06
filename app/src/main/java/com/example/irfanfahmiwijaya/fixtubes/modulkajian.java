package com.example.irfanfahmiwijaya.fixtubes;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

/**
 * Created by irfanfahmiwijaya on 07/12/2017.
 */

public class modulkajian extends AppCompatActivity {

    //RECYCLER VIEW FIELD
    RecyclerView recyclerView;

    //VECTOR FOR VIDEO URLS
    Vector<YoutubeVideo> youtubeVideos = new Vector<YoutubeVideo>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lay_videokajian);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        //Load video List
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/w-_ZjY2Qohk\" frameborder=\"0\" allowfullscreen></iframe>"));
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/RqrzKopyHJY\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/kA-ysN3lQNc\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/9fUa-bPHM1Q\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/aCR8KeZUR2g\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/p16wdq1ipI4\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/tUVrvThu9I4\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ISt4prd68ck&t=392s\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YoutubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/z-qdo1AD_VI\" frameborder=\"0\" allowfullscreen></iframe>") );


        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);


    }

}
