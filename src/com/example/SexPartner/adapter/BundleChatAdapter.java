package com.example.SexPartner.adapter;

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
 * Created by Jodie Pham on 9/24/14.
 */
public class BundleChatAdapter extends BaseAdapter
{
    private Context context;
    List<String> logChat = new ArrayList<String>();

    public BundleChatAdapter(Context context)
    {
        this.context = context;
        logChat.add(new String("aaaaa"));
        logChat.add(new String("aaaaa"));
        logChat.add(new String("aaaaa"));
    }


    @Override
    public int getCount()
    {
        return logChat.size();
    }

    @Override
    public Object getItem(int position)
    {
        return logChat.get(position);
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
            convertView = li.inflate(R.layout.bundle_chat_me_item, null);
            viewHolder.ivAvatar = (CircularImageView) convertView.findViewById(R.id.bundle_chat_me_item_ivAvatar);
            viewHolder.ivAvatar.setBorderColor(context.getResources().getColor(R.color.gray));
            viewHolder.ivAvatar.setBorderWidth(1);
            viewHolder.ivAvatar.addShadow();
            convertView.setTag(viewHolder);
        }
        else

        {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        return convertView;
    }

    class ViewHolder
    {
        public TextView tvName;
        public CircularImageView ivAvatar;
    }
}
