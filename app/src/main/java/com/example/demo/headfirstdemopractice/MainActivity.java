package com.example.demo.headfirstdemopractice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.example.demo.headfirstdemopractice.duck.Duck;
import com.example.demo.headfirstdemopractice.duck.MallardDuck;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.demo_duck_model)
    Button mDemoDuckModel;
    @BindView(R.id.demo_observer_model)
    Button mDemoObserverModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }


    @OnClick({R.id.demo_duck_model, R.id.demo_observer_model})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.demo_duck_model:
                Duck duck = new MallardDuck();
                duck.display();
                duck.performFly();
                duck.performQuack();
                break;
            case R.id.demo_observer_model:
                break;
        }
    }
}
