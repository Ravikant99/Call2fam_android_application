package com.example.android.call2fam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void A(String phone){
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + phone));
        startActivity(intent);
    }
    public void papaCall(View view){
        String Papa = "9102635480";
        A(Papa);
    }
    public void shivamCall(View view){
        String shivam = "7250457214";
        A(shivam);
    }
    public void chachaCall(View view){
        String Chacha = "9572418230";
        A(Chacha);
    }
    public void laduCall(View view){
        String ladu = "8527928784";
        A(ladu);
    }
    public void uBhaiyaCall(View view){
        String ubhaiya = "9525000163";
        A(ubhaiya);
    }
    public void delhiCall(View view){
        String delhi = "9958548118";
        A(delhi);
    }
    public void jalalpurCall(View view){
        String jalalpur = "8789950668";
        A(jalalpur);
    }
    public void mikuCall(View view){
        String miku = "8507016262";
        A(miku);
    }
    public void mamaCall(View view){
        String mama = "8757346844";
        A(mama);
    }
    public void ankitCall(View view){
        String ankit = "7004868933";
        A(ankit);
    }
    public void amritCall(View view){
        String amrit = "7739094413";
        A(amrit);
    }
    public void shubhamCall(View view){
        String shubham = "9128961436";
        A(shubham);
    }
}