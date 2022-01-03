package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    private List<ModelClass> permits;

    public Adapter(List<ModelClass> permits){
        this.permits=permits;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.permit_design,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int resource=permits.get(position).getImage();
        String nm=permits.get(position).getName();
        String dt=permits.get(position).getDate();
        String tm=permits.get(position).getTime();
        String ln=permits.get(position).getLine();
        holder.setData(resource,nm,dt,tm,ln);
    }

    @Override
    public int getItemCount() {
        return permits.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private ImageView img;
        private TextView name;
        private TextView date;
        private TextView time;
        private TextView line;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img=itemView.findViewById(R.id.img);
            name=(TextView)itemView.findViewById(R.id.name);
            date=(TextView)itemView.findViewById(R.id.date);
            time=(TextView)itemView.findViewById(R.id.time);
            line=(TextView)itemView.findViewById(R.id.line);
        }

        public void setData(int resource, String nm, String dt, String tm, String ln) {
            img.setImageResource(resource);
            name.setText(nm);
            date.setText(dt);
            time.setText(tm);
            line.setText(ln);
        }
    }
}
