package com.example.SexPartner.activity.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.SexPartner.R;
import com.example.SexPartner.backend.model.Friend;
import com.mikhaellopez.circularimageview.CircularImageView;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jodie Pham on 9/10/14.
 */
public class SelectYourPartnerAdapter extends BaseAdapter
{
    private Context context;
    private List<Friend> listNames = new ArrayList<Friend>();
    public ImageLoader imageLoader = ImageLoader.getInstance();
    DisplayImageOptions options;


    public SelectYourPartnerAdapter(Context context, List<Friend> listNames)
    {
        this.context = context;
        this.listNames = listNames;
        options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.drawable.avarta_progress_normal)
                .showImageForEmptyUri(0)
                .showImageOnFail(0)
                .cacheInMemory(true)
                .considerExifParams(true)
                .bitmapConfig(Bitmap.Config.RGB_565)
                .displayer(new FadeInBitmapDisplayer(500))
                .build();
    }

    @Override
    public int getCount()
    {
        return listNames.size();
    }

    @Override
    public Object getItem(int position)
    {
        return listNames.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        ViewHolder viewHolder = null;
        if (convertView == null)
        {
            viewHolder = new ViewHolder();
            LayoutInflater li = (LayoutInflater) context
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = li.inflate(R.layout.select_partner_item, null);
            viewHolder.tvName = (TextView) convertView.findViewById(R.id.select_partner_item_tvName);
            viewHolder.ivAvatar = (CircularImageView) convertView.findViewById(R.id.select_partner_item_ivAvatar);
            viewHolder.ivAvatar.setBorderColor(context.getResources().getColor(R.color.gray));
            viewHolder.ivAvatar.setBorderWidth(2);
            viewHolder.ivAvatar.addShadow();
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tvName.setText(listNames.get(position).getUserName());
        imageLoader.init(ImageLoaderConfiguration.createDefault(context));
        imageLoader.displayImage(listNames.get(position).getUrlPhoto(),viewHolder.ivAvatar,options);
        return convertView;
    }

    class ViewHolder
    {
        public TextView tvName;
        public CircularImageView ivAvatar;
    }
}
