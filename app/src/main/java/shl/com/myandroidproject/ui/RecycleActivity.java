package shl.com.myandroidproject.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import shl.com.myandroidproject.R;
import shl.com.myandroidproject.adapter.RecycAdapter;
import shl.com.myandroidproject.bean.RecycleBean;
import shl.com.myandroidproject.ui.views.LinearItemDecoration;

public class RecycleActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<RecycleBean> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        recyclerView = findViewById(R.id.list_recycle);
        getData();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
        LinearItemDecoration linearItemDecoration = new LinearItemDecoration();
        recyclerView.addItemDecoration(linearItemDecoration);
        RecycAdapter recycAdapter = new RecycAdapter(list,this);
        recyclerView.setAdapter(recycAdapter);

        recycAdapter.setOnItemClick(new RecycAdapter.OnItemClick() {
            @Override
            public void setOnItemClick(int position) {
                Toast.makeText(RecycleActivity.this, ""+list.get(position).getSex(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void getData() {
        RecycleBean recycleBean  = new RecycleBean("无极剑圣","易大师",1);
        RecycleBean recycleBean1 = new RecycleBean("德玛西亚之力","盖伦",1);
        RecycleBean recycleBean2 = new RecycleBean("堕落天使","莫甘娜",2);
        RecycleBean recycleBean3 = new RecycleBean("光辉女郎","拉克丝",1);
        RecycleBean recycleBean4 = new RecycleBean("潮汐海灵","菲兹",2);
        RecycleBean recycleBean5 = new RecycleBean("德邦总管","赵信",1);

        list.add(recycleBean);
        list.add(recycleBean1);
        list.add(recycleBean2);
        list.add(recycleBean3);
        list.add(recycleBean4);
        list.add(recycleBean5);

    }
}
