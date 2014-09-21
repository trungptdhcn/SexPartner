package com.example.SexPartner.activity.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.SexPartner.R;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jodie Pham on 9/10/14.
 */
public class SelectYourPartnerAdapter extends BaseAdapter
{
    private Context context;
    private List<String> listNames = new ArrayList<String>();

    public SelectYourPartnerAdapter(Context context, List<String> listNames)
    {
        this.context = context;
        this.listNames = listNames;
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
            viewHolder.ivAvatar.setBorderWidth(4);
            viewHolder.ivAvatar.addShadow();
            convertView.setTag(viewHolder);
        }
        else
        {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tvName.setText(listNames.get(position));
        return convertView;
    }

    class ViewHolder
    {
        public TextView tvName;
        public CircularImageView ivAvatar;
    }
}
