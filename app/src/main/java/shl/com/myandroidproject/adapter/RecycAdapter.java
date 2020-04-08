package shl.com.myandroidproject.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;
import shl.com.myandroidproject.R;
import shl.com.myandroidproject.bean.RecycleBean;

/**
 * Created by Administrator on 2020/3/13.
 */

public class RecycAdapter extends RecyclerView.Adapter<RecycAdapter.ViewHolder> {
    private List<RecycleBean> list;
    private Context context;
    private OnItemClick onItemClick;
    private static final int VIEW_TYPEONE = 1;
    private static final int VIEW_TYPETWO = 2;

    public RecycAdapter(List<RecycleBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = null;
        switch (viewType){
            case VIEW_TYPEONE:
                view = layoutInflater.inflate(R.layout.layout_item_recycle,parent,false);
                break;
            case VIEW_TYPETWO:
                view = layoutInflater.inflate(R.layout.layout_item_recycle2,parent,false);
                break;
        }

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        RecycleBean recycleBean = list.get(position);
        switch (list.get(position).getType()){
            case VIEW_TYPEONE:
                holder.text.setText(recycleBean.getSex());
                break;
            case VIEW_TYPETWO:
                holder.textSex.setText(recycleBean.getSex());
                holder.textName.setText(recycleBean.getName());
                break;
        }


            holder.view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onItemClick.setOnItemClick(position);
                }
            });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(list.get(position).getType() == VIEW_TYPEONE){
            return VIEW_TYPEONE;
        }else if(list.get(position).getType() == VIEW_TYPETWO){
            return VIEW_TYPETWO;
        }else {
            return 0;
        }

    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        TextView text;

        TextView textSex;
        TextView textName;
        View view;
        public ViewHolder(View itemView) {
            super(itemView);
            view = itemView;

            text = itemView.findViewById(R.id.item_text);

            textSex = itemView.findViewById(R.id.textSex);
            textName= itemView.findViewById(R.id.textName);


        }
    }

    public void setOnItemClick(OnItemClick onItemClick){
        this.onItemClick = onItemClick;
    }

    public interface OnItemClick {
        void setOnItemClick(int position);
    }

}
