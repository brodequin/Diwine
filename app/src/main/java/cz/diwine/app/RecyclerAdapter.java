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
//                    Toast.makeText(context, "Clicked on "+data[getAdapterPosition()], Toast.LENGTH_SHORT).show();

                    if (data[getAdapterPosition()].equals("AUXERROIS"))
                    {
                        Intent intent=new Intent(context,AuxerroisActivity.class);
                        context.startActivity(intent);
                    }

                    if (data[getAdapterPosition()].equals("BLAUBURGER"))
                    {
                        Intent intent=new Intent(context,BlauburgerActivity.class);
                        context.startActivity(intent);
                    }

                    if (data[getAdapterPosition()].equals("PÁLAVA"))
                    {
                        Intent intent=new Intent(context,PalavaActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("ACOLON"))
                    {
                        Intent intent=new Intent(context,AcolonActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("AGNI"))
                    {
                        Intent intent=new Intent(context,AgniActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("ALIBERNET"))
                    {
                        Intent intent=new Intent(context,AlibernetActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("ANDRÉ"))
                    {
                        Intent intent=new Intent(context,AndreActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("ARIANA"))
                    {
                        Intent intent=new Intent(context,ArianaActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("AURELIUS"))
                    {
                        Intent intent=new Intent(context,AureliusActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("CABERNET CORTIS"))
                    {
                        Intent intent=new Intent(context,CabernetcortisActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("CABERNET DORSA"))
                    {
                        Intent intent=new Intent(context,CabernetDorsaActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("CABERNET MORAVIA"))
                    {
                        Intent intent=new Intent(context,CabernetMoraviaActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("CABERNET SAUVIGNON"))
                    {
                        Intent intent=new Intent(context,CabernetSauvignonActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("CERASON"))
                    {
                        Intent intent=new Intent(context,CerasonActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("DĚVÍN"))
                    {
                        Intent intent=new Intent(context,DevinActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("DORNFELDER"))
                    {
                        Intent intent=new Intent(context,DornfelderActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("DOMINA"))
                    {
                        Intent intent=new Intent(context,DominaActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("ERILON"))
                    {
                        Intent intent=new Intent(context,ErilonActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("FLORIANKA"))
                    {
                        Intent intent=new Intent(context,FloriankaActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("FRATAVA"))
                    {
                        Intent intent=new Intent(context,FratavaActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("FRANKOVKA"))
                    {
                        Intent intent=new Intent(context,FrankovkaActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("HIBERNAL"))
                    {
                        Intent intent=new Intent(context,HibernalActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("CHARDONNAY"))
                    {
                        Intent intent=new Intent(context,ChardonnayActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("IRSAI OLIVER"))
                    {
                        Intent intent=new Intent(context,IrsaiActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("JAKUBSKÉ"))
                    {
                        Intent intent=new Intent(context,JakubskeActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("KERNER"))
                    {
                        Intent intent=new Intent(context,KernerActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("KOFRANKA"))
                    {
                        Intent intent=new Intent(context,KofrankaActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("LAUROT"))
                    {
                        Intent intent=new Intent(context,LaurotActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("LENA"))
                    {
                        Intent intent=new Intent(context,LenaActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("MALVERINA"))
                    {
                        Intent intent=new Intent(context,MalverinaActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("MEDEA"))
                    {
                        Intent intent=new Intent(context,MedeaActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("MERLOT"))
                    {
                        Intent intent=new Intent(context,MerlotActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("MERY"))
                    {
                        Intent intent=new Intent(context,MeryActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("MODRÝ PORTUGAL"))
                    {
                        Intent intent=new Intent(context,PortugalActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("MUŠKÁT MORAVSKÝ"))
                    {
                        Intent intent=new Intent(context,MuskatmoravskyActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("MUŠKÁT OTTONEL"))
                    {
                        Intent intent=new Intent(context,OttonelActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("MÜLLER THURGAU"))
                    {
                        Intent intent=new Intent(context,ThurgauActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("NATIVA"))
                    {
                        Intent intent=new Intent(context,NativaActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("NERONET"))
                    {
                        Intent intent=new Intent(context,NeronetActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("NEUBURSKÉ"))
                    {
                        Intent intent=new Intent(context,NeuburskeActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("RINOT"))
                    {
                        Intent intent=new Intent(context,RinotActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("RUBINET"))
                    {
                        Intent intent=new Intent(context,RubinetActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("RULANDSKÉ BÍLÉ"))
                    {
                        Intent intent=new Intent(context,RulandskebileActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("RULANDSKÉ MODRÉ"))
                    {
                        Intent intent=new Intent(context,RulandskemodreActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("RULANDSKÉ ŠEDÉ"))
                    {
                        Intent intent=new Intent(context,RulandskesedeActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("RULENKA"))
                    {
                        Intent intent=new Intent(context,RulenkaActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("RYZLINK RÝNSKÝ"))
                    {
                        Intent intent=new Intent(context,RyzlinkrynskyActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("RYZLINK VLAŠSKÝ"))
                    {
                        Intent intent=new Intent(context,RyzlinkvlaskyActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("SAUVIGNON"))
                    {
                        Intent intent=new Intent(context,SauvignonActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("SAVILON"))
                    {
                        Intent intent=new Intent(context,SavilonActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("SEVAR"))
                    {
                        Intent intent=new Intent(context,SevarActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("SVATOVAVŘINECKÉ"))
                    {
                        Intent intent=new Intent(context,SvatovavrineckeActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("SVOJSEN"))
                    {
                        Intent intent=new Intent(context,SvojsenActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("SYLVÁNSKÉ ZELENÉ"))
                    {
                        Intent intent=new Intent(context,SylvanskezeleneActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("TRAMÍN ČERVENÝ"))
                    {
                        Intent intent=new Intent(context,TramincervenyActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("TRISTAR"))
                    {
                        Intent intent=new Intent(context,TristarActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("JOHANNITER"))
                    {
                        Intent intent=new Intent(context,JohanniterActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("SOLARIS"))
                    {
                        Intent intent=new Intent(context,SolarisActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("VELTLÍNSKÉ ČERVENÉ RANÉ"))
                    {
                        Intent intent=new Intent(context,VeltlineskecerveneraneActivity.class);
                        context.startActivity(intent);
                    }
                    if (data[getAdapterPosition()].equals("VELTLÍNSKÉ ZELENÉ"))
                    {
                        Intent intent=new Intent(context,VeltlineskezeleneActivity.class);
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
