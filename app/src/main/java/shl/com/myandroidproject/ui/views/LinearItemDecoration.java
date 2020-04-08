package shl.com.myandroidproject.ui.views;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Administrator on 2020/3/14.
 * 自定义ItemDecoration，实现RecycleView间隔
 */

public class LinearItemDecoration extends RecyclerView.ItemDecoration {

    private Paint paint,paintLine;
    public LinearItemDecoration(){
        paint = new Paint();
        paintLine = new Paint();
        paint.setColor(Color.GREEN);
        paintLine.setColor(Color.BLACK);
    }
    @Override
    public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDraw(c, parent, state);

        int childCount = parent.getChildCount();//获取RecycleView Item的数量

        RecyclerView.LayoutManager layoutManager = parent.getLayoutManager();
        for (int i=0;i<childCount;i++){
            View view = parent.getChildAt(i);
            int left = layoutManager.getLeftDecorationWidth(view);
            int x = left/2;//圆心横坐标
            int y = view.getTop()+view.getHeight()/2;//纵坐标
            int h = view.getTop()+view.getHeight()/2+20;
            int h1= view.getTop()+view.getHeight()+view.getHeight()/2-20;
            c.drawCircle(x,y,20,paint);
            c.drawLine(x,h,x,h1,paintLine);

        }

    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        super.onDrawOver(c, parent, state);
    }

    //Item 距离上下左右的间隔
    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);
        outRect.left= 200;
        outRect.bottom = 1;
    }
}
