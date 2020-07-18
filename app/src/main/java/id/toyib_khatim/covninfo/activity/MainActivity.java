
package id.toyib_khatim.covninfo.activity;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import id.toyib_khatim.covninfo.R;
import id.toyib_khatim.covninfo.fragment.IdnFragment;
import id.toyib_khatim.covninfo.fragment.SummaryFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menampilkan Fragment Summary Ketika App Dibuka
        SummaryFragment summaryFragment = new SummaryFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.main_frame,summaryFragment)
                .commit();

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);


    }

    //Menu Navigasi Bawah
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            //Ke Fragment Summary
            case R.id.summaryMenu:
                SummaryFragment summaryFragment = new SummaryFragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_frame,summaryFragment)
                        .commit();
                return true;

            //Ke Fragment Idn
            case R.id.summaryIdnMenu:
                IdnFragment idnFragment = new IdnFragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_frame,idnFragment)
                        .commit();
                return true;
            case R.id.homeMenu:
                Home home = new Home();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_frame,home)
                        .commit();
                return true;

            //ke Fragment News
        }
        return false;
    }




}
