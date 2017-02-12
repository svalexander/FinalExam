package nyc.c4q.shannonalexander_navarro.finalexam;

/**
 * Created by shannonalexander-navarro on 2/12/17.
 */
public class NavigationItem {
    private int icon;
    private String iconText;

    public NavigationItem(int icon, String iconText) {
        this.icon = icon;
        this.iconText = iconText;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String geticonText() {
        return iconText;
    }

    public void seticonText(String iconText) {
        this.iconText = iconText;
    }
}
