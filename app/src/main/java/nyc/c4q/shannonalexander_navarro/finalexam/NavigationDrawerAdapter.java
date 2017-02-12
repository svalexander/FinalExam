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

public class NavigationDrawerAdapter extends RecyclerView.Adapter {

    private List<NavigationItem> navItems = new ArrayList<>();

    public NavigationDrawerAdapter(List<NavigationItem> navigationItems) {
        this.navItems = navigationItems;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.nav_list_item, parent, false);
        return new NavigationDrawerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        NavigationDrawerViewHolder navigationDrawerViewHolder = (NavigationDrawerViewHolder) holder;
        NavigationItem aNavItem = navItems.get(position);
        navigationDrawerViewHolder.bind(aNavItem);
    }

    @Override
    public int getItemCount() {
        return navItems.size();
    }
}
