package com.example.androidpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageView  armmapImg, azermapImg, bahmapImg, chinmapImg,
            indmapImg, japmapImg, nepmapImg, pakmapImg, srimapImg, afganmapimg, bhumapimg, bdmapImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        armmapImg = (ImageView) findViewById(R.id.armmapid);
        azermapImg = (ImageView) findViewById(R.id.azermapid);
        bahmapImg = (ImageView) findViewById(R.id.bahmapid);
        chinmapImg = (ImageView) findViewById(R.id.chinmapid);
        indmapImg = (ImageView) findViewById(R.id.indmapid);
        japmapImg = (ImageView) findViewById(R.id.japmapid);
        nepmapImg = (ImageView) findViewById(R.id.nepmapid);
        pakmapImg = (ImageView) findViewById(R.id.pakmapid);
        srimapImg = (ImageView) findViewById(R.id.srimapid);
        afganmapimg = (ImageView) findViewById(R.id.afganmapid);
        bhumapimg = (ImageView) findViewById(R.id.bhumapid);
        bdmapImg = (ImageView) findViewById(R.id.bdmapid);

        armmapImg.setOnClickListener(this);
        azermapImg.setOnClickListener(this);
        bahmapImg.setOnClickListener(this);
        chinmapImg.setOnClickListener(this);
        indmapImg.setOnClickListener(this);
        japmapImg.setOnClickListener(this);
        nepmapImg.setOnClickListener(this);
        pakmapImg.setOnClickListener(this);
        srimapImg.setOnClickListener(this);
        afganmapimg.setOnClickListener(this);
        bhumapimg.setOnClickListener(this);
        bdmapImg.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId()==R.id.bdmapid){

            bdmapImg.setVisibility(View.GONE);
            bhumapimg.setVisibility(View.VISIBLE);

        }

          if (view.getId()==R.id.armmapid){

            armmapImg.setVisibility(View.GONE);
            bdmapImg.setVisibility(View.VISIBLE);

        }
          if (view.getId()==R.id.azermapid){

            azermapImg.setVisibility(View.GONE);
              armmapImg.setVisibility(View.VISIBLE);

        }

          if (view.getId()==R.id.bahmapid){

            bahmapImg.setVisibility(View.GONE);
              azermapImg.setVisibility(View.VISIBLE);

        }

          if (view.getId()==R.id.chinmapid){

            chinmapImg.setVisibility(View.GONE);
              bahmapImg.setVisibility(View.VISIBLE);

        }

          if (view.getId()==R.id.indmapid){

            indmapImg.setVisibility(View.GONE);
              chinmapImg.setVisibility(View.VISIBLE);

        }

          if (view.getId()==R.id.japmapid){

            japmapImg.setVisibility(View.GONE);
              indmapImg.setVisibility(View.VISIBLE);

        }

          if (view.getId()==R.id.nepmapid){

            nepmapImg.setVisibility(View.GONE);
              japmapImg.setVisibility(View.VISIBLE);

        }

          if (view.getId()==R.id.pakmapid){

            pakmapImg.setVisibility(View.GONE);
              nepmapImg.setVisibility(View.VISIBLE);

        }

          if (view.getId()==R.id.srimapid){

            srimapImg.setVisibility(View.GONE);
              pakmapImg.setVisibility(View.VISIBLE);

        }

            if (view.getId()==R.id.afganmapid){

            afganmapimg.setVisibility(View.GONE);
              srimapImg.setVisibility(View.VISIBLE);

        }

            if (view.getId()==R.id.bhumapid){

            bhumapimg.setVisibility(View.GONE);
              afganmapimg.setVisibility(View.VISIBLE);

        }


    }
}