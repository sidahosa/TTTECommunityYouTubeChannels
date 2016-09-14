package com.thetttecommunity.tttecommunityyoutubechannels;

/**
 * Created by Shawn Idahosa on 4/23/2016.
 */
import java.io.IOException;

public class YouTubeChannelThreads extends Thread{

    private String URL, context;
    private int index;

    public YouTubeChannelThreads(String url, int i, String cont){
        index = i;
        URL = url;
        this.context = cont;
    }

        @Override
        public void run() {
            MainActivity.ScanChannel(URL, index, context);
        }
}

