package shl.com.myandroidproject;

import android.app.Fragment;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import shl.com.myandroidproject.ui.RecycleActivity;
import shl.com.myandroidproject.ui.views.CommonListActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

   //添加一条注释

    private Button bt_recycleView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_recycleView = findViewById(R.id.bt_recycle);
        bt_recycleView.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_recycle:
                startActivity(new Intent(this, CommonListActivity.class));
                break;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }
}
