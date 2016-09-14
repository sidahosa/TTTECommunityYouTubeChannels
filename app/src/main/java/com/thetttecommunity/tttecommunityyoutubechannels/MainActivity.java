package com.thetttecommunity.tttecommunityyoutubechannels;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.koushikdutta.ion.Ion;
import com.squareup.picasso.Picasso;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;
import java.util.TreeMap;

public class MainActivity extends AppCompatActivity {

    private int number_of_youtube_channels = 38;     // Very Important Number!
    ProgressDialog mProgressDialog;
    public static TreeMap<Integer,YouTubeChannel> bigdata = new TreeMap<>();
    LinkedList<PreYouTubeObject> testmap = new LinkedList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageIcon = (ImageView)findViewById(R.id.thomastubersicon);
        imageIcon.setBackgroundResource(R.drawable.thomas_tuber_icon);

        ImageButton imageButton = (ImageButton)findViewById(R.id.dev_cloud_button);
        imageButton.setBackgroundResource(R.drawable.dev_cloud);

        ImageButton imageButton2 = (ImageButton)findViewById(R.id.yt_cloud_button);
        imageButton2.setBackgroundResource(R.drawable.youtube_cloud);

        ImageButton imageButton3 = (ImageButton)findViewById(R.id.fb_button);
        imageButton3.setBackgroundResource(R.drawable.facebook_cloud);

        ImageButton imageButton4 = (ImageButton)findViewById(R.id.twitter_button);
        imageButton4.setBackgroundResource(R.drawable.empty_cloud_twitter);

        ImageButton imageButton5 = (ImageButton)findViewById(R.id.see_all_users_in_database_button);
        imageButton5.setBackgroundResource(R.drawable.see_users);

        ImageButton imageButton6 = (ImageButton)findViewById(R.id.submit_channel_button);
        imageButton6.setBackgroundResource(R.drawable.submit_channel);

        ImageButton imageButton7 = (ImageButton)findViewById(R.id.update_data_button);
        imageButton7.setBackgroundResource(R.drawable.update_da);

        ImageButton imageButton8 = (ImageButton)findViewById(R.id.find_by_prim_cont_button);
        imageButton8.setBackgroundResource(R.drawable.find_channel);


        ImageView icon = (ImageView) findViewById(R.id.random_user_image_icon);
        Ion.with(icon).load("https://upload.wikimedia.org/wikipedia/commons/b/b1/Loading_icon.gif");

        (new Title()).execute();

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Dev_team.class);
                startActivity(intent);
            }
        });

        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new UpdateData().execute();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private void goToUrl(String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    public void goToYoutube (View view) { goToUrl("https://www.youtube.com/watch?v=5ZIsq-mTQ9I"); }

    public void goToTwitter(View view) {
        goToUrl("https://twitter.com/tttecommunity");
    }

    public void goToFacebook(View view) {
        goToUrl("https://facebook.com/thetttecommunity");
    }

    public void channelUrlDatabase() {

        String index0 = "http://www.youtube.com/user/DieselD199";
        String index1 = "https://www.youtube.com/channel/UC0cob5l7cfWVsAXiluKs_mw";
        String index2 = "https://www.youtube.com/channel/UCA4qBCU2NMIxgNyf4Sf-yww";
        String index3 = "https://www.youtube.com/channel/UCVGDKHtdsy1vrj8lLB4agpQ";
        String index4 = "https://www.youtube.com/channel/UCZU8wCYAuF_qS-Lh7dUevJQ";
        String index5 = "https://www.youtube.com/channel/UCa9uKWiqwYPLaAbmBu68FWg";
        String index6 = "https://www.youtube.com/channel/UCrIA_pelrLwWMoD4XDtqxdg";
        String index7 = "https://www.youtube.com/user/ADuck23711";
        String index8 = "https://www.youtube.com/user/BrendenReis10";
        String index9 = "https://www.youtube.com/user/Calebtrain";
        String index10 = "https://www.youtube.com/user/Enterprisingengine93";
        String index11 = "https://www.youtube.com/user/HeroDuelist2000";
        String index12 = "https://www.youtube.com/user/LarrisonFamily";
        String index13 = "https://www.youtube.com/user/Percyengine619";
        String index14 = "https://www.youtube.com/user/RorroOrtiz";
        String index15 = "https://www.youtube.com/user/Sidekickjason";
        String index16 = "https://www.youtube.com/user/SilverDragonTV";
        String index17 = "https://www.youtube.com/user/TheSodorSteamworks";
        String index18 = "https://www.youtube.com/user/TMBrewer1126";
        String index19 = "https://www.youtube.com/user/TheScotsmanReturns";
        String index20 = "https://www.youtube.com/user/TheTrainModeller";
        String index21 = "https://www.youtube.com/user/ThomasPercy99";
        String index22 = "https://www.youtube.com/user/ThomasWoodenEpisodes";
        String index23 = "https://www.youtube.com/user/ThomasWoodenRailway";
        String index24 = "https://www.youtube.com/user/TomTomandPals";
        String index25 = "https://www.youtube.com/user/TomyThomasHDRemakes";
        String index26 = "https://www.youtube.com/user/VisionScaleModeling";
        String index27 = "https://www.youtube.com/user/bernuson";
        String index28 = "https://www.youtube.com/user/carson08022000";
        String index29 = "https://www.youtube.com/user/doctorthomas200";
        String index30 = "https://www.youtube.com/user/halfbakedhex8";
        String index31 = "https://www.youtube.com/user/juliet7p1";
        String index32 = "https://www.youtube.com/user/missoliverandblossom";
        String index33 = "https://www.youtube.com/user/thetttecommunity";
        String index34 = "https://www.youtube.com/user/trainlover476";
        String index35 = "https://www.youtube.com/user/turtlesandthomas";
        String index36 = "https://www.youtube.com/user/ucwepn";
        String index37 = "https://www.youtube.com/user/upsidenow";

        String indexcontent0 = "Original";
        String indexcontent1 = "Music";
        String indexcontent2 = "Discussion";
        String indexcontent3 = "Original";
        String indexcontent4 = "Music";
        String indexcontent5 = "Other";
        String indexcontent6 = "Discussion";
        String indexcontent7 = "Custom";
        String indexcontent8 = "Remakes";
        String indexcontent9 = "Remakes";
        String indexcontent10 = "Original";
        String indexcontent11 = "Remakes";
        String indexcontent12 = "Remakes";
        String indexcontent13 = "Remakes";
        String indexcontent14 = "Remakes";
        String indexcontent15 = "Original";
        String indexcontent16 = "Music";
        String indexcontent17 = "Other";
        String indexcontent18 = "Merchandising";
        String indexcontent19 = "Other";
        String indexcontent20 = "Remakes";
        String indexcontent21 = "Music";
        String indexcontent22 = "Remakes";
        String indexcontent23 = "Original";
        String indexcontent24 = "Remakes";
        String indexcontent25 = "Remakes";
        String indexcontent26 = "Remakes";
        String indexcontent27 = "Music";
        String indexcontent28 = "Remakes";
        String indexcontent29 = "Other";
        String indexcontent30 = "Original";
        String indexcontent31 = "Remakes";
        String indexcontent32 = "Original";
        String indexcontent33 = "Remakes";
        String indexcontent34 = "Original";
        String indexcontent35 = "Original";
        String indexcontent36 = "Merchandising";
        String indexcontent37 = "Music";

        testmap.add(new PreYouTubeObject(index0, indexcontent0));
        testmap.add(new PreYouTubeObject(index1, indexcontent1));
        testmap.add(new PreYouTubeObject(index2, indexcontent2));
        testmap.add(new PreYouTubeObject(index3, indexcontent3));
        testmap.add(new PreYouTubeObject(index4, indexcontent4));
        testmap.add(new PreYouTubeObject(index5, indexcontent5));
        testmap.add(new PreYouTubeObject(index6, indexcontent6));
        testmap.add(new PreYouTubeObject(index7, indexcontent7));
        testmap.add(new PreYouTubeObject(index8, indexcontent8));
        testmap.add(new PreYouTubeObject(index9, indexcontent9));
        testmap.add(new PreYouTubeObject(index10, indexcontent10));
        testmap.add(new PreYouTubeObject(index11, indexcontent11));
        testmap.add(new PreYouTubeObject(index12, indexcontent12));
        testmap.add(new PreYouTubeObject(index13, indexcontent13));
        testmap.add(new PreYouTubeObject(index14, indexcontent14));
        testmap.add(new PreYouTubeObject(index15, indexcontent15));
        testmap.add(new PreYouTubeObject(index16, indexcontent16));
        testmap.add(new PreYouTubeObject(index17, indexcontent17));
        testmap.add(new PreYouTubeObject(index18, indexcontent18));
        testmap.add(new PreYouTubeObject(index19, indexcontent19));
        testmap.add(new PreYouTubeObject(index20, indexcontent20));
        testmap.add(new PreYouTubeObject(index21, indexcontent21));
        testmap.add(new PreYouTubeObject(index22, indexcontent22));
        testmap.add(new PreYouTubeObject(index23, indexcontent23));
        testmap.add(new PreYouTubeObject(index24, indexcontent24));
        testmap.add(new PreYouTubeObject(index25, indexcontent25));
        testmap.add(new PreYouTubeObject(index26, indexcontent26));
        testmap.add(new PreYouTubeObject(index27, indexcontent27));
        testmap.add(new PreYouTubeObject(index28, indexcontent28));
        testmap.add(new PreYouTubeObject(index29, indexcontent29));
        testmap.add(new PreYouTubeObject(index30, indexcontent30));
        testmap.add(new PreYouTubeObject(index31, indexcontent31));
        testmap.add(new PreYouTubeObject(index32, indexcontent32));
        testmap.add(new PreYouTubeObject(index33, indexcontent33));
        testmap.add(new PreYouTubeObject(index34, indexcontent34));
        testmap.add(new PreYouTubeObject(index35, indexcontent35));
        testmap.add(new PreYouTubeObject(index36, indexcontent36));
        testmap.add(new PreYouTubeObject(index37, indexcontent37));

        Thread[] threads = new Thread[number_of_youtube_channels];

        for (int index = 0; index < number_of_youtube_channels; index++) {
            threads[index] = new YouTubeChannelThreads(testmap.get(index).getURL(), index,
                    testmap.get(index).getPrimary_content());
            threads[index].start();
        }
        for (Thread t2 : threads) {
            try {
                t2.join();
            } catch (InterruptedException e){}
        }
    }

    public static void ScanChannel(String channelUrl, int index, String content){
        // YouTuber's Current Name
        //synchronized (bigdata) {
            String name;

            try {
                // Retrieves YouTube playlist URL and puts into a Document node.
                Document channel_homepage = Jsoup.connect(channelUrl).userAgent("Chrome").get();
                // Gets YouTube Channel Title
                Element channel_exact_name = channel_homepage.select("meta[property=og:title]").first();
                // Gets YouTube Channel's Sub Count
                Element channel_sub_count = channel_homepage.select("span[class=yt-subscription-button-subscriber-count-branded-horizontal "
                        + "subscribed yt-uix-tooltip]").first();

                // Extracts YouTube Name
                name = channel_exact_name.attr("content");

                // Used for finding information about YouTuber's number of videos
                Document doc3 = Jsoup.connect("https://www.youtube.com/results?search_query=" + name).userAgent("Chrome").get();

                // Search for About link
                Elements video_about_user = channel_homepage.select("a");

                // Used for as the About link
                String about_url = "";

                // Gets the link to the YouTuber's Video and About page
                int i;
                for (i = 0; i < video_about_user.size(); i++){
                    String t = video_about_user.get(i).attr("abs:href");
                    if (t.contains("about")){
                        about_url = t;
                        break;
                    }
                }

                // Scans YouTuber's Video and About page
                Document doc1 = Jsoup.connect(about_url).userAgent("Chrome").get();
                Element about_user = channel_homepage.select("img").first();
                Elements test = doc3.select("ul[class=yt-lockup-meta-info]");
                Elements videoviews = doc1.select("span[class=about-stat]");

                // Last active date YouTuber appear and total video views
                String views[] = videoviews.text().split(" ");
                String video[] = test.text().split(" ");

                // Makes the Final Version of YouTubeObject
                YouTubeChannel temporary_YouTuber = new YouTubeChannel(name, content, channelUrl);
                temporary_YouTuber.addSubCount(channel_sub_count.text());
                temporary_YouTuber.addChannelIconURL(about_user.attr("abs:src"));
                temporary_YouTuber.addYouTubeVideoViews(views[3]);
                temporary_YouTuber.addLastActiveDate(video[1] + " " + video[2] + " ago");
                temporary_YouTuber.addNumberOfVideos(video[4]);
                bigdata.put(index, temporary_YouTuber);
            } catch (IOException e) {

            }
       // }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    // AsyncTask
    private class Title extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressDialog = new ProgressDialog(MainActivity.this);
            mProgressDialog.setTitle("Loading Channels");
            mProgressDialog.setMessage("Wait Please...");
            mProgressDialog.setIndeterminate(false);
            mProgressDialog.show();
        }

        @Override
        protected Void doInBackground(Void... params) {
            channelUrlDatabase();
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            // Deletes temporary YouTube Object list
            testmap.clear();
            int week;

            // Feature HomePage Channel
            TextView yt_name = (TextView) findViewById(R.id.yt_name_fill);
            TextView yt_sub_count = (TextView) findViewById(R.id.sub_count_fill);
            TextView yt_pri_content = (TextView) findViewById(R.id.pri_cont_fill);
            TextView yt_total_view = (TextView) findViewById(R.id.total_view_fill);
            TextView yt_num_video = (TextView) findViewById(R.id.video_count_fill);
            TextView yt_active = (TextView) findViewById(R.id.last_active_fill);
            ImageView icon = (ImageView) findViewById(R.id.random_user_image_icon);

            //if (Calendar.SUNDAY == Calendar.getInstance().get(Calendar.DAY_OF_WEEK)){
                Random num = new Random();
                week = num.nextInt(number_of_youtube_channels);
            //}

            // Featured Homepage YouTube Channel
            Log.d("The number is", week + "");
            Picasso.with(MainActivity.this).load(bigdata.get(week).getChannelIconURL()).into(icon);
            yt_name.setText(bigdata.get(week).getYouTubeName());
            yt_sub_count.setText(bigdata.get(week).getSubCount());
            yt_pri_content.setText(bigdata.get(week).getPrimaryContent());
            yt_total_view.setText(bigdata.get(week).getYouTubeVideoViews());
            yt_num_video.setText(bigdata.get(week).getNumberOfVideos());
            yt_active.setText(bigdata.get(week).getLastActiveDate());
            mProgressDialog.dismiss();
        }

    }

    // AsyncTask
    private class UpdateData extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            mProgressDialog = new ProgressDialog(MainActivity.this);
            mProgressDialog.setTitle("Updating Channels Info");
            mProgressDialog.setMessage("Wait Please...");
            mProgressDialog.setIndeterminate(false);
            mProgressDialog.show();
            mProgressDialog.setCancelable(false);
            mProgressDialog.setCanceledOnTouchOutside(false);
        }

        @Override
        protected Void doInBackground(Void... params) {
            //bigdata.clear();
            channelUrlDatabase();
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            // Deletes temporary YouTube Object list
            testmap.clear();
            mProgressDialog.dismiss();

        }

    }

    // Baby version of the YouTube Channel Object
    class PreYouTubeObject {
        String URL;
        String primary_content;

        public PreYouTubeObject(String url, String content_channel) {
            URL = url;
            primary_content = content_channel;
        }

        public String getURL(){ return URL; }
        public String getPrimary_content () { return primary_content; }
    }
}



