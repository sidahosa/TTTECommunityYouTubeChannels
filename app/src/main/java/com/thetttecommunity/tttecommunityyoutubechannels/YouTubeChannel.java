package com.thetttecommunity.tttecommunityyoutubechannels;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by Shawn Idahosa on 4/14/2016.
 */
public class YouTubeChannel {
    //private int channelId;                // Unique YouTube Channel ID for App (Structure Generated)
    private String subCount;				  // Subscriber Count (Scanned)
    private String primary_content;		  // Primary Content that is produced (Manually)
    private String YT_name;				  // YouTube Name (Scanned)
    private String total_channel_views;	  // YouTube Channel Total Video Views (Scanned)
    public LinkedList<String> videolist;  // Brings the URL of latest video (Scanned)
    public String active;				  // Shows the date of latest activity from channel
    public String total_number_of_videos; // Total number of YouTube videos
    public String URL;                    // Channel URL
    protected String ChannelIcon;            // Channel Icon Picture URL

    public YouTubeChannel( String name, String primarycontent, String URL){
       // channelId = channel;
        YT_name = name;
        primary_content = primarycontent;
        this.URL = URL;
    }

    // Setter for the YouTube channel ID to give each channel a unique id.
    //public void channelIdSetter(int index){
      //  channelId = index;
    //}

    // Return unique channel ID
    //public int channelIdGetter(){
      //  return channelId;
    //}

    // Return the YouTube Channel's Current name
    public String getYouTubeName(){
        return YT_name;
    }

    public void addYouTubeVideoViews(String views){
        total_channel_views = views;
    }

    public String getYouTubeVideoViews(){
        return total_channel_views;
    }

    public void addSubCount(String subs){
        subCount = subs;
    }

    public String getSubCount(){
        return subCount;
    }

    public String getPrimaryContent(){
        return primary_content;
    }

    public String subButton(){
        return "http://www.youtube.com/user/" + YT_name + "?sub_confirmation=1";
    }

    public void addNumberOfVideos(String videonumber){
        total_number_of_videos = videonumber;
    }

    public String getNumberOfVideos(){
        return total_number_of_videos;
    }

    public void addLastActiveDate(String active){
        this.active = active;
    }

    public String getLastActiveDate(){
        return active;
    }

    public void addVideoList(LinkedList<String> oldlist){
        videolist = new LinkedList<String>(oldlist);
    }

    public String getURL(){
        return URL;
    }

    public void addChannelIconURL(String url){
        ChannelIcon = url;
    }

    public String getChannelIconURL(){
        // Fail Safe
        if (ChannelIcon != null){
            return ChannelIcon;
        }
        return "http://i1036.photobucket.com/albums/a443/patsviper46/yt_icon_fail_zpsm7d4bssa.png";
    }

    public String printChannel(){
        return YT_name + " was active " + active + ", " + "has a total of " + total_number_of_videos +" videos" + ", a total of "
                + subCount + " subs, and " + total_channel_views + " channel views." + "\n";
        //+"Sample Work: "+ videolist.get(0)+ "\n";
    }


}
