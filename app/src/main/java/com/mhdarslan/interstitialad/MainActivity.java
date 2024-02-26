package com.mhdarslan.interstitialad;

import static android.content.ContentValues.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.mhdarslan.interstitialad.Ads.Interstitial.Interstitial;

public class MainActivity extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    Interstitial interstitial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        interstitial = new Interstitial(this,this, mInterstitialAd);
        interstitial.loadInters();
//        loadInters();

        Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            interstitial.checkAds(ThirdActivity.class);
        });
    }
}