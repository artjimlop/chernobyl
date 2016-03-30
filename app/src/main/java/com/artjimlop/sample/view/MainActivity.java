package com.artjimlop.sample.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.artjimlop.sample.R;
import com.artjimlop.sample.exception.PrypiatException;
import com.chernobyl.Chernobyl;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button_throw_exception) public void onThrowExceptionClicked(){
        Chernobyl.nuke(new RuntimeException());
    }

    @OnClick(R.id.button_throw_exception_50_probability) public void onThrowExceptionWith50PercentProbabilityClicked() {
        Chernobyl.nuke(new IllegalArgumentException(), 50);
    }

    @OnClick(R.id.button_throw_custom_exception) public void onThrowCustomExceptionClicked() {
        Chernobyl.nuke(new PrypiatException());
    }

    @OnClick(R.id.button_nuke) public void onNukeClicked() {
        Chernobyl.nuke();
    }
}
