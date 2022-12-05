package ru.myitschool.lab33;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

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
        EditText sizeParam = binding.content.sizeParam;

        buttonMain.setOnClickListener(v ->
        {
            Log.d(TAG, "viewId: " + "viewId");

            //Start-New-Activity

            Intent myIntent = new Intent(MainActivity.this, RecyclerActivity.class);
//            String value = "PROVERKA";
            String value = String.valueOf(sizeParam.getText());
            myIntent.putExtra("keySizeParam", value); //Optional parameters
            this.startActivity(myIntent);
        });
    }
}
