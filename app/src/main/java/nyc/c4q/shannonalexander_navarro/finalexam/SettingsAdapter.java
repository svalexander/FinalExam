package nyc.c4q.shannonalexander_navarro.finalexam;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shannonalexander-navarro on 2/12/17.
 */

public class SettingsAdapter extends RecyclerView.Adapter {

    private List<Integer> integerList = new ArrayList<>();
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.settings_item, parent, false);
        return new SettingsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        SettingsViewHolder settingsViewHolder = (SettingsViewHolder) holder;
        Integer anInteger = integerList.get(position);
        settingsViewHolder.bind(anInteger);
    }

    @Override
    public int getItemCount() {
        return integerList.size();
    }
}
