package com.example.sairam.finalproject;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class GridView1 extends AppCompatActivity {
//    GridView gridView;
//
//    String imageName[] = {"Image 1", "Image 2", "Image 3", "Image 4", "Image 5", "Image 6", "Image 7",
//            "Image 9", "Image 8"};
//
//    int icons[] = {R.drawable.image_1, R.drawable.image_2,
//            R.drawable.image_3, R.drawable.image_4,
//            R.drawable.image_5, R.drawable.image_6,
//            R.drawable.image_7, R.drawable.image_8,
//            R.drawable.image_9};
//
//    public GridView1() {
//
//    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_grid_view);
//        gridView = findViewById(R.id.gridView);
//        GridAdapter adapter = new GridAdapter(GridView1.this, icons, imageName);
//        gridView.setAdapter(adapter);
//
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);

        GridView gridview = findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(GridView1.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });

        Button backbutton1 = (Button) findViewById(R.id.backbutton1);
        backbutton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent backbutton1 = new Intent(GridView1.this, com.example.sairam.finalproject.Message.class);
                startActivity(backbutton1);
            }
        });

    }
}
//
//class GridAdapter extends BaseAdapter {
//
//    private int icons[];
//    private String imageName[];
//    private Context context;
//    private LayoutInflater inflater;
//
//
//    public GridAdapter(Context context, int icons[], String imageName[]) {
//
//        this.context = context;
//        this.icons = icons;
//        this.imageName = imageName;
//
//    }
//
//    @Override
//    public int getCount() {
//        return imageName.length;
//    }
//
//    @Override
//    public Object getItem(int position) {
//        return imageName[position];
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        View gridView = convertView;
//
//        if (convertView == null) {
//            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//            gridView = inflater.inflate(R.layout.activity_grid_view, null);
//        }
//        ImageView imgicons = (ImageView) gridView.findViewById(R.id.icons);
//        TextView imgimageName =(TextView) gridView.findViewById(R.id.imageName);
//
//        imgicons.setImageResource(icons[position]);
//       // imgimageName.setText(imageName[position]);
//
//        return gridView;
//    }
//}
