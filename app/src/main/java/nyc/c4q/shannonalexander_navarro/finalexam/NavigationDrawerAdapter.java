package nyc.c4q.shannonalexander_navarro.finalexam;

import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shannonalexander-navarro on 2/12/17.
 */

public class NavigationDrawerAdapter extends RecyclerView.Adapter<NavigationDrawerAdapter.NavigationDrawerViewHolder> {

    //private List<NavigationItem> navItems = new ArrayList<>();
    private List<String> iconNames = new ArrayList<>();
    private TypedArray iconImages;


//    public NavigationDrawerAdapter(List<NavigationItem> navigationItems) {
//        this.navItems = navigationItems;
//    }


    public NavigationDrawerAdapter(List<String> iconNames, TypedArray iconImages) {
        this.iconNames = iconNames;
        this.iconImages = iconImages;
    }

    @Override
    public NavigationDrawerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.nav_list_item, parent, false);
        return new NavigationDrawerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(NavigationDrawerViewHolder holder, int position) {
            holder.iconTV.setText(iconNames.get(position));
            holder.iconIV.setImageResource(iconImages.getResourceId(position,position));

    }


    @Override
    public int getItemCount() {
        return 4;
    }


    public class NavigationDrawerViewHolder extends RecyclerView.ViewHolder {
        private TextView iconTV;
        private ImageView iconIV;

        public NavigationDrawerViewHolder(View itemView) {
            super(itemView);
            initViews();
        }

        private void initViews() {
            iconTV = (TextView) itemView.findViewById(R.id.itemTV);
            iconIV = (ImageView) itemView.findViewById(R.id.itemIV);

        }
    }
}
