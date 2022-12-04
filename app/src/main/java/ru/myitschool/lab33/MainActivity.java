package ru.myitschool.lab33;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import ru.myitschool.lab33.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {
    private final String  TAG = "TAG";
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Button buttonMain = binding.content.getRandomNums;
        buttonMain.setOnClickListener(v ->
        {
            Log.d(TAG, "viewId: " + "viewId");

            //Start-New-Activity
            Intent myIntent = new Intent(MainActivity.this, RecyclerActivity.class);
            String value = "PROVERKA";
            myIntent.putExtra("key", value); //Optional parameters
            this.startActivity(myIntent);
        });
    }
}
