package com.example.st.project4.CustomAdapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.example.st.project4.R;
import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ST on 26-thg 1-18.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    private List<item_fragment_tab1> data=new ArrayList<>();
    private Context context;
    public RecyclerViewAdapter(Context context,ArrayList<item_fragment_tab1> arr) {
        this.context=context;
        this.data=arr;

    }

    @Override
    public RecyclerViewAdapter.RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.item_fragment_tab1,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewAdapter.RecyclerViewHolder holder, int position) {
       //
        String uri=null;
            item_fragment_tab1 item=data.get(position);
            //load ảnh
            uri=item.getImg();
        Picasso.with(context).load(uri).transform(new CircleTransform()).into(holder.img);
            //
            holder.txtName.setText(item.getName());
            holder.txtTime.setText(item.getTime());
            holder.txtSmSCuoi.setText(item.getSmscuoi());

    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView txtName,txtTime,txtSmSCuoi;
        ImageView img;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            img= itemView.findViewById(R.id.img_avatar_sms);
            txtName= itemView.findViewById(R.id.username_sms);
            txtTime=itemView.findViewById(R.id.time_sms);
            txtSmSCuoi=itemView.findViewById(R.id.nd_sms_cuoi);
        }
    }
}
