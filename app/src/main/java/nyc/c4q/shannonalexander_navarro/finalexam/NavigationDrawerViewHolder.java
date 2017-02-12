package nyc.c4q.shannonalexander_navarro.finalexam;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by shannonalexander-navarro on 2/12/17.
 */

public class NavigationDrawerViewHolder extends RecyclerView.ViewHolder {

    private TextView iconTV;
    private ImageView iconIV;

    public NavigationDrawerViewHolder(View itemView) {
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