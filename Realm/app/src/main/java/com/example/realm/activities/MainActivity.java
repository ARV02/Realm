package com.example.realm.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.realm.Fragments.ClientesFragment;
import com.example.realm.Fragments.PrecioFragment;
import com.example.realm.Fragments.ProductoFragment;
import com.example.realm.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView mBottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBottomNavigationView=findViewById(R.id.bottomNavigationView);
        showSelectedFragment(new ClientesFragment());
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if(menuItem.getItemId() == R.id.cliente){
                    showSelectedFragment(new ClientesFragment());
                }else if(menuItem.getItemId() == R.id.producto){
                    showSelectedFragment(new ProductoFragment());
                }else if(menuItem.getItemId() == R.id.precio){
                    showSelectedFragment(new PrecioFragment());
                }
                return true;
            }
        });
    }
    public void showSelectedFragment(Fragment fragment){
        getSupportFragmentManager().beginTransaction().replace(R.id.container , fragment).
                setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).
                commit();
    }
}
