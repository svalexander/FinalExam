package nyc.c4q.shannonalexander_navarro.finalexam;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

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
//    public void bind(NavigationItem aNavItem) {
//        iconTV.setText(aNavItem.geticonText());
//        iconIV.setImageResource(aNavItem.getIcon());
//
//        switch ()
//    }

    public void bind(int position) {
        switch (position){
            case 0: iconTV.setText("Button 1");
                iconIV.setImageResource(R.drawable.heart);
                break;
            case 1: iconTV.setText("Button 2");
                iconIV.setImageResource(R.drawable.message);
                break;
            case 2: iconTV.setText("Button 3");
                iconIV.setImageResource(R.drawable.settings);
                break;
            case 3: iconTV.setText("Button 4");
                iconIV.setImageResource(R.drawable.logout);
        }
    }
}
