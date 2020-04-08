package shl.com.myandroidproject.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import shl.com.myandroidproject.R;
import shl.com.myandroidproject.adapter.GridAdapter;
import shl.com.myandroidproject.ui.views.GridItemDecoration;

public class GridActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List<String> list_gridview = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
        recyclerView = findViewById(R.id.list_gridview);
        getData();
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,3);
//        recyclerView.setLayoutManager(gridLayoutManager);

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);

        GridAdapter gridAdapter = new GridAdapter(list_gridview,this);
        gridAdapter.getRandomHeight(list_gridview);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(this,DividerItemDecoration.HORIZONTAL);
        GridItemDecoration gridItemDecoration = new GridItemDecoration();
        recyclerView.addItemDecoration(gridItemDecoration);
        recyclerView.setAdapter(gridAdapter);
    }

    private void getData() {
        list_gridview.add("艾欧尼亚");
        list_gridview.add("德玛西亚");
        list_gridview.add("诺克萨斯");
        list_gridview.add("寒冰射手");
        list_gridview.add("潮汐海灵");
        list_gridview.add("堕落天使");
        list_gridview.add("无畏先锋");
        list_gridview.add("裁决之地");
        list_gridview.add("战争学院");
        list_gridview.add("战争学院");

    }
}
