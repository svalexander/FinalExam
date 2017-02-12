package nyc.c4q.shannonalexander_navarro.finalexam.views;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import nyc.c4q.shannonalexander_navarro.finalexam.R;
import nyc.c4q.shannonalexander_navarro.finalexam.model.NavigationItem;

/**
 * Created by shannonalexander-navarro on 2/12/17.
 */

public class NavDrawerViewHolder extends RecyclerView.ViewHolder {
    private TextView iconTV;
    private ImageView iconIV;


    public NavDrawerViewHolder(View itemView) {
        super(itemView);
        initViews();
    }

    private void initViews(){
        iconTV = (TextView) itemView.findViewById(R.id.itemTV);
        iconIV = (ImageView) itemView.findViewById(R.id.itemIV);
    }
    public void bind(NavigationItem aNavItem) {
        iconTV.setText(aNavItem.geticonText());
        iconIV.setImageResource(aNavItem.getIcon());

    }

}
