package ru.myitschool.lab33;

import static java.lang.Math.random;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Random;

import ru.myitschool.lab33.databinding.ActivityRecyclerBinding;


public class RecyclerActivity extends AppCompatActivity {

    private final String  TAG = "TAG";
    private ActivityRecyclerBinding binding;
    int keyS = 130;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_recycler);
        binding = ActivityRecyclerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
//Get-Params-form-First-Activity
        Intent intent = getIntent();
        String value = intent.getStringExtra("keySizeParam"); //if it's a string you stored.
        String valueShape = intent.getStringExtra("keyShapeParam");
        String valueRate = intent.getStringExtra("keyRateParam");

        TextView tvRecycler = (TextView) findViewById(R.id.random_number_result);

        Random rand = new Random(); //instance of random class
        int upperbound = 25;
        //generate random values from 0-24
        int int_random = rand.nextInt(upperbound);
        double double_random = rand.nextDouble();
        float float_random = rand.nextFloat();
//        tvRecycler.setText("__!!!!!AAAAA__");
        // ArrayList for person names
//        ArrayList personNames = new ArrayList<>(Arrays.asList("Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7"));
////        RecyclerView recycler = binding.generatedList;
//        // get the reference of RecyclerView
//        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.generated_list);
//// set a LinearLayoutManager with default orientation
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
//        recyclerView.setLayoutManager(linearLayoutManager); // set LayoutManager to RecyclerView
//
//        //  call the constructor of CustomAdapter to send the reference and data to Adapter
//        // call the constructor of CustomAdapter to send the reference and data to Adapter
//        CustomAdapter customAdapter = new CustomAdapter(RecyclerActivity.this, personNames) {
//
//
//        };
//        recyclerView.setAdapter(customAdapter); // set the Adapter to RecyclerView



        ArrayList<Model> list= new ArrayList();
//        list.add(new Model(Model.TEXT_TYPE,"Hello. This is the Text-only View Type. Nice to meet you",0));
//        list.add(new Model(Model.TEXT_TYPE,"Hello1. This is the Text-only View Type. Nice to meet you",0));
//        list.add(new Model(Model.TEXT_TYPE,"Hello2. This is the Text-only View Type. Nice to meet you",0));
//        list.add(new Model(Model.TEXT_TYPE,"Hello3. This is the Text-only View Type. Nice to meet you",0));
        //Shrink string to only digits
        value = value.split("\\.")[0];
        value = value.replaceAll("[^\\d]", "");
        int keyS = Integer.valueOf(value);
        Log.d(TAG, "viewIdkeyS: " + keyS);
//        int k = Integer.valueOf(valueShape);
//        int h = Integer.valueOf(valueRate);
        valueRate = valueRate.split("\\.")[0];
        valueRate = valueRate.replaceAll("[^\\d]", "");
        int h = Integer.valueOf(valueRate);
        Log.d(TAG, "viewIdH: " + h);
        valueShape = valueShape.split("\\.")[0];
        valueShape = valueShape.replaceAll("[^\\d]", "");
        int k = Integer.parseInt(valueShape);
        Log.d(TAG, "viewIdK: " + k);
        for (short i = 1; i <= keyS; i++) {
            double sum=0;
            for (short j = 1; j <= k; j++) {
                sum+=Math.log(rand.nextDouble());
            }
            String randTXT = String.valueOf(-sum/h);
            Log.d(TAG, "viewId: " + randTXT);
            list.add(new Model(Model.TEXT_TYPE, randTXT, 0));
        }
//        list.add(new Model(Model.IMAGE_TYPE,"Hi. I display a cool image too besides the omnipresent TextView.",R.drawable.wtc));
//        list.add(new Model(Model.AUDIO_TYPE,"Hey. Pressing the FAB button will playback an audio file on loop.",R.raw.sound));
//        list.add(new Model(Model.IMAGE_TYPE,"Hi again. Another cool image here. Which one is better?",R.drawable.snow));

        MultiViewTypeAdapter adapter = new MultiViewTypeAdapter(list,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.generated_list);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(adapter);

//        private static boolean isNumeric(String str){
//            return str != null && str.matches("[0-9.]+");
//        }
    }
}