package nyc.c4q.shannonalexander_navarro.finalexam.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nyc.c4q.shannonalexander_navarro.finalexam.R;
import nyc.c4q.shannonalexander_navarro.finalexam.views.SettingsViewHolder;

/**
 * Created by shannonalexander-navarro on 2/12/17.
 */

public class SettingsAdapter extends RecyclerView.Adapter {


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.settings_item, parent, false);
        return new SettingsViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        SettingsViewHolder settingsViewHolder = (SettingsViewHolder) holder;
        settingsViewHolder.bind(position);
    }

    @Override
    public int getItemCount() {
        return Integer.MAX_VALUE;
    }
}
