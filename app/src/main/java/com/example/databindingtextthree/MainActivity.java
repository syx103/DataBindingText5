package com.example.databindingtextthree;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ObservableArrayMap;
import androidx.databinding.ObservableMap;

import android.os.Bundle;
import android.util.ArrayMap;

import com.example.databindingtextthree.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    private ObservableMap<String,Object> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        map = new ObservableArrayMap<>();
        map.put("ss",24);
        map.put("yy","yy is yy");
        map.put("xx","xx is xx");
        map.put("aa",29);
        binding.setPeople(map);
    }
}
