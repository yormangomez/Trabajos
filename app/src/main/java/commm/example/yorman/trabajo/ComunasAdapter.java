package commm.example.yorman.trabajo;

import android.app.Activity;
import android.app.Notification;
import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;

/**
 * Created by yormanantonio on 30.05.2017.
 */

public class ComunasAdapter extends ArrayAdapter<comunas> {
    Context mycontext;
    int mylayoutResourceID;
    comunas mydata[] = null;

    public ComunasAdapter (Context context,int layoutResourceID,comunas [] data) {
    super(context,layoutResourceID,data);

        this.mycontext = context;
        this.mylayoutResourceID = layoutResourceID;
        this.mydata = data;
    }

    public View getView(int position, View convertView, ViewGroup parent){
        View row = convertView;
        comunasHolder holder = null;

        if(row == null){
            LayoutInflater inflater = ((Activity)mycontext).getLayoutInflater();
            row = inflater.inflate(mylayoutResourceID,parent,false);

            holder = new comunasHolder();
            holder.imagen = (ImageView) row.findViewById(R.id.imagen);
            holder.textView = (TextView) row.findViewById(R.id.texto);
            row.setTag(holder);

        }else {
            holder = (comunasHolder)row.getTag();
        }

        comunas comunas = mydata[position];
        holder.textView.setText(comunas.title);
        holder.imagen.setImageResource(comunas.icon);

        return row;
    }

    static class comunasHolder{
        ImageView imagen;
        TextView textView;
    }

}
