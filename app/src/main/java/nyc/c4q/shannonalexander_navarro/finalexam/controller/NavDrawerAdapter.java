package nyc.c4q.shannonalexander_navarro.finalexam.controller;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import nyc.c4q.shannonalexander_navarro.finalexam.model.NavigationItem;
import nyc.c4q.shannonalexander_navarro.finalexam.R;
import nyc.c4q.shannonalexander_navarro.finalexam.views.NavDrawerViewHolder;

/**
 * Created by shannonalexander-navarro on 2/12/17.
 */

public class NavDrawerAdapter extends RecyclerView.Adapter  implements View.OnClickListener{
    private List<NavigationItem> navItems = new ArrayList<>();

    Context context;
    public NavDrawerAdapter(List<NavigationItem> navigationItems) {
        this.navItems = navigationItems;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.nav_list_item, parent, false);
        context = itemView.getContext();
        return new NavDrawerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        NavDrawerViewHolder navigationDrawerViewHolder = (NavDrawerViewHolder) holder;
        NavigationItem aNavItem = navItems.get(position);
        navigationDrawerViewHolder.bind(aNavItem);

        if (aNavItem.geticonText() == "Button 1"){


        }
        if (aNavItem.geticonText()=="Button 2") {

        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case 0: Toast.makeText(context, "Selected Heart Activity", Toast.LENGTH_SHORT).show();
        }
    }
}
