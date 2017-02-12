package nyc.c4q.shannonalexander_navarro.finalexam;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by shannonalexander-navarro on 2/12/17.
 */

public class SettingsViewHolder extends RecyclerView.ViewHolder {

    private TextView settingsTV;

    public SettingsViewHolder(View itemView) {
        super(itemView);

        settingsTV = (TextView) itemView.findViewById(R.id.settingsTV);
    }

    public void bind(Integer anInteger) {
        //this is not finished, the text should be set properly here
        settingsTV.setText(anInteger);
    }
}
