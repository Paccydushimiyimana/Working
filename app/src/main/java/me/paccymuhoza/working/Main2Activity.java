package me.paccymuhoza.working;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity  {
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private NavigationView navigationView;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mDrawerLayout=findViewById(R.id.activity_main);
        navigationView=findViewById(R.id.navview);
        btn=findViewById(R.id.bhome);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.ordz:
                        startActivity(new Intent(getApplicationContext(), Main3Activity.class));
                    break;
                    case R.id.lgout:
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        break;
                }
                return true;
            }
        });

        mToggle=new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
         mDrawerLayout.addDrawerListener(mToggle);
         mToggle.syncState();
         getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


  }


