package com.example.mohamed_abdelsamad.newsapp;

import android.content.AsyncTaskLoader;
import android.content.Context;

import java.util.List;

/**
 * Created by mohamed_abdelsamad on 25/09/18.
 */

public class EventLoader extends AsyncTaskLoader<List<Event>> {
    private String url;
    public EventLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Event> loadInBackground() {
        if(url == null)
            return null;
        List<Event> eventList = QueryUtils.fetchEarthquakeData(url);
        return eventList;
    }
}