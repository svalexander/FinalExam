package nyc.c4q.shannonalexander_navarro.finalexam.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.shannonalexander_navarro.finalexam.model.NavigationItem;
import nyc.c4q.shannonalexander_navarro.finalexam.R;
import nyc.c4q.shannonalexander_navarro.finalexam.views.NavDrawerViewHolder;

/**
 * Created by shannonalexander-navarro on 2/12/17.
 */

public class NavDrawerAdapter extends RecyclerView.Adapter {
    private List<NavigationItem> navItems = new ArrayList<>();

    public NavDrawerAdapter(List<NavigationItem> navigationItems) {
        this.navItems = navigationItems;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.nav_list_item, parent, false);
        return new NavDrawerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        NavDrawerViewHolder navigationDrawerViewHolder = (NavDrawerViewHolder) holder;
        NavigationItem aNavItem = navItems.get(position);
        navigationDrawerViewHolder.bind(aNavItem);
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
