package com.artjimlop.sample.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.artjimlop.sample.R;

import butterknife.ButterKnife;
import butterknife.OnClick;

import static com.chernobyl.Chernobyl.checkNotEmpty;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_throw_exception) public void onThrowExceptionClicked(){
        checkNotEmpty("");
    }
}
