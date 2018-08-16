package com.example.android.news;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by norbi21um on 2018. 08. 13..
 */

public class NewsAdapter extends ArrayAdapter<News> {


    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }


        News currentNews = getItem(position);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title);
        titleTextView.setText(currentNews.getTitle());

        TextView authorTextView = (TextView) listItemView.findViewById(R.id.author);
        authorTextView.setText(currentNews.getAuthor());

        TextView sectionTextView = (TextView) listItemView.findViewById(R.id.section);
        sectionTextView.setText(currentNews.getSection());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        dateTextView.setText(currentNews.getDate());

        return listItemView;
    }

}
