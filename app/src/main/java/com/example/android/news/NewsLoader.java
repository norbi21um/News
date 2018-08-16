package com.example.android.news;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by norbi21um on 2018. 08. 14..
 */

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    private static final String LOG_TAG = NewsLoader.class.getName();

    private String url;

    public NewsLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (url == null) {
            return null;
        }

        List<News> news = QueryUtils.fetchNewsData(url);
        return news;
    }
}