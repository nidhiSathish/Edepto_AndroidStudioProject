package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fifth extends AppCompatActivity {
Button f1,f2,f3,f4,f5,f6,f7,f8,f9,fss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);


        f1.findViewById(R.id.f1);
        f2.findViewById(R.id.f2);
        f3.findViewById(R.id.f3);
        f4.findViewById(R.id.f4);
        f5.findViewById(R.id.f5);
        f6.findViewById(R.id.f6);
        f7.findViewById(R.id.f7);
        f8.findViewById(R.id.f8);
        f9.findViewById(R.id.f9);
        fss.findViewById(R.id.fss);

       f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/folders/1MEeM9_WxjTsUU7j8x1u8f_r26WG_pKtQ?usp=sharing");
            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/folders/1KOUKXKPbTqxod3UhbxD7SXk4lmlcixIy?usp=sharing");
            }
        });

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/folders/1Z01BnlxN2jikC-uECRSteX0pnmrpJYQy?usp=drive_link");
            }
        });

        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/folders/14VNebaKPh6hylL1jIdiN72gp41fYsv0k?usp=drive_link");
            }
        });

        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/folders/1uwq0ppTWK49ZrKLe1VA53QJJEu20a5Pq?usp=drive_link");
            }
        });

        f6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/folders/1EDaXRKQ98Hlmh_s6ZYM6HJXm5VNnIKB5?usp=drive_link");
            }
        });

        f9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/drive/folders/1svfUblO7peq6vzKQDnJOE7Uei-aPNqeg?usp=drive_link");
            }
        });

        f8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1P5WEAQF3Veqqu10mxz-aKzq6n1ddoud_/view?usp=sharing");
            }
        });

        f7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://drive.google.com/file/d/1S_nzWIrBLRqYCT2iNzVnhLrvmmCv-LQV/view");
            }
        });

        fss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.inspirenignite.com/vtu/vtu-cse-5th-sem-syllabus-for-be-2018-scheme/");
            }
        });


    }

    private void gotoUrl(String s) {
        Uri uri= Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri ));
    }
}