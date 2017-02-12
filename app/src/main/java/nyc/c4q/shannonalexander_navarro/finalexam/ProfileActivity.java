package nyc.c4q.shannonalexander_navarro.finalexam;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ProfileActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView profileIV;
    private DrawerLayout navigationDrawer;
    private RecyclerView navigationDrawerRV;
    private NavDrawerAdapter navigationDrawerAdapter;
    private List<NavigationItem> navigationItems = new ArrayList<>();
    private ImageButton btnOne;
    private ImageButton btnTwo;
    private ImageButton btnThree;
    private ImageButton btnFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.navigation_drawer);
        addNavItems();
        initViews();
       initRV();
    }

    private void initRV() {
        navigationDrawerRV = (RecyclerView) findViewById(R.id.nav_rv);
        navigationDrawerRV.setLayoutManager(new LinearLayoutManager(ProfileActivity.this));
        navigationDrawerAdapter = new NavDrawerAdapter(navigationItems);
        navigationDrawerRV.setAdapter(navigationDrawerAdapter);
    }

    private void addNavItems() {
        navigationItems.add(new NavigationItem(R.drawable.heart, "Button 1"));
        navigationItems.add(new NavigationItem(R.drawable.message, "Button 2"));
        navigationItems.add(new NavigationItem(R.drawable.settings, "Button 3"));
        navigationItems.add(new NavigationItem(R.drawable.logout, "Logout"));
    }

    private void initViews() {
        navigationDrawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        profileIV = (ImageView) findViewById(R.id.profileIV);
        btnOne = (ImageButton) findViewById(R.id.imageBtnOne);
        btnTwo = (ImageButton) findViewById(R.id.imageBtnTwo);
        btnThree = (ImageButton) findViewById(R.id.imageBtnThree);
        btnFour = (ImageButton) findViewById(R.id.imageBtnFour);
        btnOne.setOnClickListener(this);
        btnTwo.setOnClickListener(this);
        btnThree.setOnClickListener(this);
        btnFour.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageBtnOne:
                Toast.makeText(getBaseContext(), "Selected Heart Activity", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageBtnTwo:
                Toast.makeText(getBaseContext(), "Selected Message Activity", Toast.LENGTH_SHORT).show();
                break;
            case R.id.imageBtnThree:
                Intent settingsIntent = new Intent(ProfileActivity.this, SettingsActivty.class);
                startActivity(settingsIntent);
                break;
            case R.id.imageBtnFour:
                Toast.makeText(getBaseContext(), "Selected Logout Activity", Toast.LENGTH_SHORT).show();
                finish();
                moveTaskToBack(true);
        }
    }

}
