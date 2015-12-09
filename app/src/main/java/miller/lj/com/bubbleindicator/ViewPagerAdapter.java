package miller.lj.com.bubbleindicator;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by LJ on 30.11.2015.
 */
public class ViewPagerAdapter extends PagerAdapter {

    private Context context;

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }


    @Override
    public int getCount() {
        return 5;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        TextView textView = new TextView(context);
        textView.setText("Page №" + (position + 1));
        textView.setTextSize(30);
        textView.setGravity(Gravity.CENTER);
        container.addView(textView, 0);
        return textView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
       container.removeView((View) object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view.equals(object);
    }
}
