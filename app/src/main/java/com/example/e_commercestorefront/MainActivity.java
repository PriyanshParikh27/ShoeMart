/*
Name: Priyansh Parikh
StudentID: 158341214
Email: pparikh8@myseneca.ca
Subject: MAP524
*/


package com.example.e_commercestorefront;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onItemClick(View view) {
        int viewId = view.getId();

        String title = "";
        String description = "";
        int imageResourceId = 0;

        if (viewId == R.id.itemCardView1) {
            title = "Nike";
            description = "Nike Men's Court Vision Low Basketball Sneaker\n\n" +
                    "Slam dunk your way to victory while wearing these men's Nike Court Vision Lo Next Nature black/white/black basketball shoes. Built with a perforated synthetic upper for air flow, these low-top athletic sneakers sport a round toe, lace-up closure, stitched overlays, Nike Swoosh overlay at the side, low-cut padded collar for stability, and a durable rubber outsole. These sneakers contain up to 20% recycled materials (by weight) responsibly sourced from post consumer and/or post manufactured waste for sustainability. From the Nike Next Nature collection, these sneakers are made from at least 20% recycled content, in part of Nike's commitment to help protect the future of sport.";
            imageResourceId = R.drawable.ns;
        } else if (viewId == R.id.itemCardView2) {
            title = "Skechers";
            description = "Skechers Men's Track Ripkent Wide Width Running Shoe\n\n" +
                    "Whether you’re running laps around the track or working out at the gym, these men’s Skechers Track – Ripkent charcoal (grey) running shoes are designed to keep you comfortable while improving performance. Made of soft mesh upper, these vegan-friendly athletic sneakers sport a round toe and secure lace-up closure. Along with a convenient pull loop at rear for easy wearing, features include Skechers® logo detail for sporty vibes, Memory Foam™ cushioned insole for superior comfort, and a flexibleEVA  cushioned midsole and outsole. Great news – these sneakers are machine washable!";
            imageResourceId = R.drawable.skecherss;
        } else if (viewId == R.id.itemCardView3) {
            title = "Adidas";
            description = "Adidas Men's Predator Club Firm Ground Soccer Cleats\n\n" +
                    "Run pass your opponents and score the winning goal in comfort and style in these men’s Adidas Predator Club Firm Ground core black/cloud white/solar red soccer cleats. Made of synthetic upper containing at least 20% recycled materials, these performance athletic sneakers have a secure lace-up closure and Strikeprint elements on the medial side. Features include breathable textile lining, 3-Stripes detail for iconic sporty vibes, and a durable flexible outsole that offers reliable traction and stability on firm ground (natural grass and artificial grass). The lightweight design allows you to accelerate pass the competition.";
            imageResourceId = R.drawable.aa;
        } else if (viewId == R.id.itemCardView4) {
            title = "Timberland";
            description = "Timberland Men's Radford Boot\n\n" +
                    "Both classy and cozy, these men's Timberland Radford beige boots are a reliable choice for any season. Made using a full-grain leather and sporting round toe front, these boots comprise optimal lace-up closure, protective seam-sealed design, plush padded collar, comfortable EVA footbed and outsole with SensorFlex™ comfort system for maximum comfort and flexibility.";
            imageResourceId = R.drawable.tt;
        } else if (viewId == R.id.itemCardView5) {
            title = "Puma";
            description = "Puma Men's Rebound LayUp Sneaker\n\n" +
                    "Show off your classic sporty style by opting these men's Puma Rebound Layup Mid black/peaoat/white basketball-inspired athletic sneakers. Made of synthetic leather upper, these mid height kicks feature a round toe design with perforations at the vamp for ventilation, secure lace-up closure, and a thick padded tongue and collar. Other enjoyable details include the ultra-cushioned SoftFoam+ footbed for all-day comfort, signature formstrips and logo, and a durable rubber outsole for reliable grip.";
            imageResourceId = R.drawable.pp;
        } else if (viewId == R.id.itemCardView6) {
            title = "Bullboxer";
            description = "Bullboxer Anthony Sneaker\n\n" +
                    "These men’s Bullboxer Anthony cognac (brown) casual sneakers will become your go-to pair for office to happy hour wearing. Crated with durable leather upper, these trendy casual kicks sport a round toe, lace-up closure, perforated side panels, lightly padded collar, smooth synthetic lining, and a synthetic outsole with chevron and diamond patterned tread.";
            imageResourceId = R.drawable.bb;
        }

        Intent intent = new Intent(this, DetailsActivity.class);

        intent.putExtra("title", title);
        intent.putExtra("description", description);
        intent.putExtra("imageResourceId", imageResourceId);

        startActivity(intent);
    }
}
