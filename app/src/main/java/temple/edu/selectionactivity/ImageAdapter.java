package temple.edu.selectionactivity;

import android.content.Context;
import android.provider.ContactsContract;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class ImageAdapter extends BaseAdapter {
    Context context;
    ArrayList<String> items;
    int[] catResIds;
    private Object contextView;

    public ImageAdapter(Context context, ArrayList items, int[] catResIds){
        this.context = context;
        this.items = items;
        this.catResIds = catResIds;

    }

    @Override
    public int getCount(){

        return items.size();
    }

    @Override
    public Object getItem(int position){

        return items.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View contextView, ViewGroup parent){
        LinearLayout linearLayout;
        TextView textView;
        ImageView imageView;

        if (contextView == null){
            linearLayout = new LinearLayout(context);
            textView = new TextView(context);
            imageView = new ImageView(context);

            linearLayout.setOrientation(LinearLayout.HORIZONTAL);

            textView.setTextSize(20);
            textView.setPadding(8,8,0,8);
            linearLayout.addView(imageView);
            linearLayout.addView(textView);
            imageView.getLayoutParams().height = 150;
            imageView.getLayoutParams().width = 150;

        }else{
            linearLayout = (LinearLayout) contextView;
            imageView = (ImageView) linearLayout.getChildAt(0);
            textView = (TextView) linearLayout.getChildAt(1);

            textView = (TextView) contextView;
        }

        textView.setText(items.get(position));
        imageView.setImageResource(catResIds[position]);

        return linearLayout;
    }
}
