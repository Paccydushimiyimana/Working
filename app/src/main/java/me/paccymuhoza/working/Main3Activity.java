package me.paccymuhoza.working;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class Main3Activity extends AppCompatActivity {

    String titles[] = {"Capati","Cake","Pizza","Chinese bread","American bread"};
    int images[] = {R.drawable.capati,R.drawable.cake1,R.drawable.pizza,R.drawable.chinese,R.drawable.american};
    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        lst=findViewById(R.id.listview);

        Myadapter adp=new Myadapter(this,titles,images);
        lst.setAdapter(adp);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(getApplicationContext(),Capati.class));
                }
                if(position==1){
                    startActivity(new Intent(getApplicationContext(),Cake.class));
                }
                if(position==2){
                    startActivity(new Intent(getApplicationContext(),Pizza.class));
                }
                if(position==3){
                    startActivity(new Intent(getApplicationContext(),Chnbread.class));
                }
                if(position==4){
                    startActivity(new Intent(getApplicationContext(),Amrbread.class));
                }

            }
        });
    }


class Myadapter extends ArrayAdapter<String> {
    Context context;
    String titls[];
    int imgs[];

    Myadapter(Context c,String titl[],int img[]){
        super(c,R.layout.laying,R.id.textview1,titl);
        this.context=c;
        this.titls=titl;
        this.imgs=img;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=(LayoutInflater)getContext().getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View laying=layoutInflater.inflate(R.layout.laying,parent,false);

        ImageView images=laying.findViewById(R.id.imageview);
        TextView mytitle=laying.findViewById(R.id.textview1);

        images.setImageResource(imgs[position]);
        mytitle.setText(titls[position]);
        return laying;
    }
}

}