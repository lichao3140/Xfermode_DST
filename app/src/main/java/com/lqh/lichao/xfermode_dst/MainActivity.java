package com.lqh.lichao.xfermode_dst;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.rounddstinbtn).setOnClickListener(this);
        findViewById(R.id.invertdstinbtn).setOnClickListener(this);
        findViewById(R.id.irregularwavebtn).setOnClickListener(this);
        findViewById(R.id.heartbitbtn).setOnClickListener(this);
        findViewById(R.id.lightbookview).setOnClickListener(this);
        findViewById(R.id.twitterview).setOnClickListener(this);
        findViewById(R.id.eraserview).setOnClickListener(this);
        findViewById(R.id.guaguaview).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        hideAllViews();
        switch (v.getId()){
            case R.id.rounddstinbtn:
                findViewById(R.id.roundimage).setVisibility(View.VISIBLE);
                break;
            case R.id.invertdstinbtn:
                findViewById(R.id.invertimg).setVisibility(View.VISIBLE);
                break;
            case R.id.irregularwavebtn:
                findViewById(R.id.irregularwaveview).setVisibility(View.VISIBLE);
                break;
            case R.id.heartbitbtn:
                findViewById(R.id.heartbitview).setVisibility(View.VISIBLE);
                break;
            case R.id.lightbookview:
                findViewById(R.id.lightbookview_view).setVisibility(View.VISIBLE);
                break;
            case R.id.twitterview:
                findViewById(R.id.twitterview_view).setVisibility(View.VISIBLE);
                break;
            case R.id.eraserview:
                findViewById(R.id.eraserview_view).setVisibility(View.VISIBLE);
                break;
            case R.id.guaguaview:
                findViewById(R.id.guaguaview_view).setVisibility(View.VISIBLE);
                break;
        }
    }

    private void hideAllViews(){
        findViewById(R.id.roundimage).setVisibility(View.GONE);
        findViewById(R.id.invertimg).setVisibility(View.GONE);
        findViewById(R.id.irregularwaveview).setVisibility(View.GONE);
        findViewById(R.id.heartbitview).setVisibility(View.GONE);
        findViewById(R.id.lightbookview_view).setVisibility(View.GONE);
        findViewById(R.id.twitterview_view).setVisibility(View.GONE);
        findViewById(R.id.eraserview_view).setVisibility(View.GONE);
        findViewById(R.id.guaguaview_view).setVisibility(View.GONE);
    }
}
