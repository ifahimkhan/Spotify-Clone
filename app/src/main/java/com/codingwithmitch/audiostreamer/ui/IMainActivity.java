package com.codingwithmitch.audiostreamer.ui;


import android.support.v4.media.MediaMetadataCompat;

import com.codingwithmitch.audiostreamer.MyApplication;
import com.codingwithmitch.audiostreamer.models.Artist;
import com.codingwithmitch.audiostreamer.util.MyPreferenceManager;

public interface IMainActivity {

    void onMediaSelected(String newPlaylistId, MediaMetadataCompat mediaItem, int queuePosition);

    void setActionBarTitle(String title);

    void playPause();

    void showProgressBar();

    void hideProgressBar();

    void onCategorySelected(String category);

    void onArtistSelected(String category, Artist artist);

    MyApplication getMyApplicationInstance();

    MyPreferenceManager getMyPreferenceManager();
}
