package com.example.publicapi;

import com.example.publicapi.models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
    void onfetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
