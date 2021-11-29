package cz.diwine.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> implements Filterable
{

    String data[];
    String data2[];
    String filtered[];
    Context context;

    public RecyclerAdapter(Context context,String[] data) {
        this.data = data;
        this.data2 = data;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.custom_design, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") final int position)
    {

        holder.textView.setText(data[position]);
//        holder.textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(context, "Clicked on "+data[position], Toast.LENGTH_SHORT).show();
//
//                if (data[position].equals("AUXERROIS"))
//                {
//                    Intent intent=new Intent(context,AuxerroisActivity.class);
//                    context.startActivity(intent);
//                }
//
//                if (data[position].equals("BLAUBURGER"))
//                {
//                    Intent intent=new Intent(context,BlauBurgerActivity.class);
//                    context.startActivity(intent);
//                }
//
//            }
//        });

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    @Override
    public Filter getFilter() {
        return Searched_Filter;
    }
    private Filter Searched_Filter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            if (constraint == null || constraint.length() == 0) {
                filtered = data2;
            } else {
                filtered = test(data, constraint.toString()).toArray(new String[0]);
            }
            FilterResults results = new FilterResults();
            results.values = filtered;
            //Log.d("ree ", results.values.toString());

            return results;
        }
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            data = (String[]) results.values;
            notifyDataSetChanged();
        }
    };

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            textView = itemView.findViewById(R.id.textNames);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "Clicked on "+data[getAdapterPosition()], Toast.LENGTH_SHORT).show();

                    if (data[getAdapterPosition()].equals("AUXERROIS"))
                    {
                        Intent intent=new Intent(context,AuxerroisActivity.class);
                        context.startActivity(intent);
                    }

                    if (data[getAdapterPosition()].equals("BLAUBURGER"))
                    {
                        Intent intent=new Intent(context,BlauBurgerActivity.class);
                        context.startActivity(intent);
                    }

                    if (data[getAdapterPosition()].equals("PÁLAVA"))
                    {
                        Intent intent=new Intent(context,PalavaActivity.class);
                        context.startActivity(intent);
                    }
                }
            });
        }
    }

    public List<String> test(String[] strs, String filter){
        List<String> res = new LinkedList<>();
        Arrays.sort(strs);
        for(String str : strs){
            if(str.toLowerCase().startsWith(filter.toLowerCase())){
                res.add(str);
                continue;
            }
            if(str.compareTo(filter)>0){
                return res;
            }
        }
        return res;
    }
}
