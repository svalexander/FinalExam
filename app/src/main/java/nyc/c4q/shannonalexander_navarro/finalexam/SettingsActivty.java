package nyc.c4q.shannonalexander_navarro.finalexam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class SettingsActivty extends AppCompatActivity {

    private RecyclerView intRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_activty);
        initRV();
    }

    private void initRV(){
        intRV = (RecyclerView) findViewById(R.id.settingsRV);
        intRV.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        intRV.setAdapter(new SettingsAdapter());
    }
}
