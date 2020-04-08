package shl.com.myandroidproject.ui.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import shl.com.myandroidproject.R;
import shl.com.myandroidproject.ui.GridActivity;
import shl.com.myandroidproject.ui.RecycleActivity;

public class CommonListActivity extends AppCompatActivity  implements View.OnClickListener{

    private Button bt_recycle,bt_grid,bt_steg;
    private boolean fa = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_common_list);
        bt_recycle = findViewById(R.id.bt_relycle);
        bt_grid = findViewById(R.id.bt_grid);
        bt_steg = findViewById(R.id.bt_steg);

        bt_recycle.setOnClickListener(this);
        bt_grid.setOnClickListener(this);
        bt_steg.setOnClickListener(this);

    }




    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bt_relycle:
                startActivity(new Intent(this, RecycleActivity.class));
                break;
            case R.id.bt_grid:
                startActivity(new Intent(this, GridActivity.class));
                break;
            case R.id.bt_steg:
                break;

        }
    }
}
