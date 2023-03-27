package id.ac.uinsuska.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapterdata extends RecyclerView.Adapter<Adapterdata.holderdata> {
    List<String> listdata;
    LayoutInflater inflater;

    public Adapterdata (Context context, List<String> listdata){
        this.listdata = listdata;
        this.inflater = LayoutInflater.from(context);
    }




    @NonNull
    @Override
    public holderdata onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.item_data,parent,false);
        return new holderdata(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holderdata holder, int position) {
        holder.txtdata.setText(listdata.get(position));
    }

    @Override
    public int getItemCount() {
        return listdata.size();
    }

    public class holderdata extends RecyclerView .ViewHolder{
            TextView txtdata;
        public holderdata(@NonNull View itemView) {
            super(itemView);

            txtdata = itemView.findViewById(R.id.datatext);
        }
    }
}
