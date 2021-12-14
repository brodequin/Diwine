package cz.diwine.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity   {
    private DrawerLayout drawer;

    RecyclerView recyclerView;
    RecyclerAdapter adapter;
    ArrayList<String> list;

    String varietyNames[]={"ACOLON","AGNI","ALIBERNET","ANDRÉ","ARIANA","AURELIUS","AUXERROIS","BLAUBURGER",
            "CABERNET CORTIS","CABERNET DORSA","CABERNET MORAVIA","CABERNET SAUVIGNON","CERASON","DĚVÍN","DORNFELDER","ERILON","FLORIANKA",
            "FRANKOVKA","FRATAVA","HIBERNAL","CHARDONNAY","IRSAI OLIVER","JAKUBSKÉ","KERNER","KOFRANKA","LAUROT","LENA","MALVERINA","MEDEA",
            "MERLOT","MERY","MODRÝ PORTUGAL","MUŠKÁT MORAVSKÝ","MUŠKÁT OTTONEL","MÜLLER THURGAU","NATIVA","NERONET","NEUBURSKÉ","PÁLAVA","RINOT",
            "RUBINET","RULANDSKÉ BÍLÉ","RULANDSKÉ MODRÉ","RULANDSKÉ ŠEDÉ","RULENKA","RYZLINK RÝNSKÝ","RYZLINK VLAŠSKÝ","SAUVIGNON","SAVILON","SEVAR",
            "SVATOVAVŘINECKÉ","SVOJSEN","SYLVÁNSKÉ ZELENÉ","TRAMÍN ČERVENÝ","TRISTAR","VELTLÍNSKÉ ČERVENÉ RANÉ","VELTLÍNSKÉ ZELENÉ","VERITAS","VESNA","VRBOSKA","ZWEIGELTREBE"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setStatusBarColor(ContextCompat.getColor(MainActivity.this,R.color.bckgColor));
        //getSupportActionBar().show();
        SearchView searchView=  findViewById(R.id.search_bar);
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);

        navigationView.setItemTextColor(null);
        navigationView.setItemIconTintList(null);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                switch (item.getItemId()) {

                    case R.id.nav_book: {
                        Intent intent=new Intent(MainActivity.this,VinarskyActivity.class);
                        startActivity(intent);
                        break;
                    }
                    case R.id.nav_circle: {
                        Intent intent2=new Intent(MainActivity.this,AromatickeActivity.class);
                        startActivity(intent2);
                        break;
                    }
                }
                //close navigation drawer
                drawer.closeDrawer(GravityCompat.START);
                return true;
            }
        });


        ImageView menuIcon = findViewById(R.id.menu_icon);
        menuIcon.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                drawer.openDrawer(Gravity.LEFT);
            }
        });

//
//        list = new ArrayList<>();
//        list.add("ACOLON (Ac)");
//        list.add("AGNI (Ag)");
//        list.add("ALIBERNET (Al)");
//        list.add("ANDRÉ (An)");
//        list.add("SVATOVAVŘINECKÉ");
//        list.add("SVOJSEN");
//        list.add("SYLVÁNSKÉ ZELENÉ");
//        list.add("TRAMÍN ČERVENÝ");
//        list.add("");
//        list.add("");
//        list.add("");
//        list.add("");

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayShowTitleEnabled(false);
        drawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        recyclerView = findViewById(R.id.reclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerAdapter(this, varietyNames);
        recyclerView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

//                if(varietyNames.contains(query)){
//                    adapter.getFilter().filter(query);
//                }else{
//                    Toast.makeText(MainActivity.this, "No Match found",Toast.LENGTH_LONG).show();
//                }
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                   adapter.getFilter().filter(newText);

                return false;
            }
        });

    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
        super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        // Handle item selection
//        switch (item.getItemId()) {
//            case R.id.nav_book:
//                Intent intent=new Intent(MainActivity.this,VinarskyActivity.class);
//                startActivity(intent);
//                return true;
//            case R.id.nav_circle:
//                Intent intent2=new Intent(MainActivity.this,AromatickeActivity.class);
//                startActivity(intent2);
//
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }
//    }

//    @Override
//    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//
//            case R.id.nav_book: {
//                Intent intent=new Intent(MainActivity.this,VinarskyActivity.class);
//                startActivity(intent);
//                break;
//            }
//            case R.id.nav_circle: {
//                Intent intent2=new Intent(MainActivity.this,AromatickeActivity.class);
//                startActivity(intent2);
//                break;
//            }
//        }
//        //close navigation drawer
//        drawer.closeDrawer(GravityCompat.START);
//        return true;
//    }
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.main_menu, menu);
//        MenuItem item1=menu.findItem(R.id.nav_book);
//        MenuItem item2=menu.findItem(R.id.nav_circle);
//
//        item1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                Intent intent=new Intent(MainActivity.this,VinarskyActivity.class);
//                startActivity(intent);
//
//                return  false;
//            }
//        });
//
//        item2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                Intent intent=new Intent(MainActivity.this,AromatickeActivity.class);
//                startActivity(intent);
//
//                return  true;
//            }
//        });
//
////        SearchView searchView= (SearchView) item.getActionView();
//        SearchView searchView= (SearchView) findViewById(R.id.search_bar);
////        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
////            @Override
////            public boolean onQueryTextSubmit(String query) {
////                return false;
////            }
////
////            @Override
////            public boolean onQueryTextChange(String newText) {
////                adapter.getFilter().filter(newText);
////                return false;
////            }
////        });
//
//        return super.onCreateOptionsMenu(menu);
//    }
}