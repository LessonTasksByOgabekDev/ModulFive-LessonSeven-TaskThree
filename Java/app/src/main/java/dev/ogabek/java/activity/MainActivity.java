package dev.ogabek.java.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import dev.ogabek.java.R;
import dev.ogabek.java.adapter.FeedAdapter;
import dev.ogabek.java.adapter.FilterAdapter;
import dev.ogabek.java.model.Feed;
import dev.ogabek.java.model.Filter;
import dev.ogabek.java.model.Short;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerFeed, recyclerFilter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

    }

    private void initViews() {
        recyclerFeed = findViewById(R.id.recyclerFeed);
        recyclerFilter = findViewById(R.id.recyclerFilter);

        recyclerFeed.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerFilter.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        refreshFeedAdapter(getAllFeeds());
        refreshFilterAdapter(getAllFilters());
    }

    private void refreshFeedAdapter(List<Feed> feeds) {
        recyclerFeed.setAdapter(new FeedAdapter(this, feeds));
    }

    private List<Feed> getAllFeeds() {
        List<Feed> feeds = new ArrayList<>();
        List<Short> shorts = new ArrayList<>();

        shorts.add(new Short("A day of work in FlatOn LLC", "310K", R.drawable.story_a_day_of_work_in_flat_on_llc));
        shorts.add(new Short("I love Apple products", "12M", R.drawable.story_i_love_apple));
        shorts.add(new Short("For the first time, I tried VR in my life", "23K", R.drawable.story_vr_first_tried_i_have_ever));
        shorts.add(new Short("A day of work in FlatOn LLC", "310K", R.drawable.story_a_day_of_work_in_flat_on_llc));
        shorts.add(new Short("I love Apple products", "12M", R.drawable.story_i_love_apple));
        shorts.add(new Short("For the first time, I tried VR in my life", "23K", R.drawable.story_vr_first_tried_i_have_ever));
        shorts.add(new Short("A day of work in FlatOn LLC", "310K", R.drawable.story_a_day_of_work_in_flat_on_llc));
        shorts.add(new Short("I love Apple products", "12M", R.drawable.story_i_love_apple));
        shorts.add(new Short("For the first time, I tried VR in my life", "23K", R.drawable.story_vr_first_tried_i_have_ever));
        shorts.add(new Short("A day of work in FlatOn LLC", "310K", R.drawable.story_a_day_of_work_in_flat_on_llc));
        shorts.add(new Short("I love Apple products", "12M", R.drawable.story_i_love_apple));
        shorts.add(new Short("For the first time, I tried VR in my life", "23K", R.drawable.story_vr_first_tried_i_have_ever));

        feeds.add(new Feed(R.drawable.i, R.drawable.video_img, "45:54", getString(R.string.android_guruhi_talabalari_mobile_ilova_loyihasi_taqdimoti_unicorn_by_pdp_academy), getString(R.string.ogabekdev_73_views_2_weeks_ago)));
        feeds.add(new Feed(R.drawable.i, R.drawable.video_coding_in_one_full_day, "23:56", "Coding in 24 hours | A coding Day", "OgabekDev • 21K views • 1 year ago"));
        feeds.add(new Feed(R.drawable.i, R.drawable.video_hazorasp_in_2222, "07:55", "Hozarasp looks like in 2222 | Khorezm, Uzbekistan", "OgabekDev • 1M views • 2 year ago"));
        feeds.add(new Feed(R.drawable.i, R.drawable.video_img, "45:54", getString(R.string.android_guruhi_talabalari_mobile_ilova_loyihasi_taqdimoti_unicorn_by_pdp_academy), getString(R.string.ogabekdev_73_views_2_weeks_ago)));
        feeds.add(new Feed(R.drawable.i, R.drawable.video_coding_in_one_full_day, "23:56", "Coding in 24 hours | A coding Day", "OgabekDev • 21K views • 1 year ago"));

        feeds.add(new Feed(shorts));

        feeds.add(new Feed(R.drawable.i, R.drawable.video_hazorasp_in_2222, "07:55", "Hozarasp looks like in 2222 | Khorezm, Uzbekistan", "OgabekDev • 1M views • 2 year ago"));
        feeds.add(new Feed(R.drawable.i, R.drawable.video_img, "45:54", getString(R.string.android_guruhi_talabalari_mobile_ilova_loyihasi_taqdimoti_unicorn_by_pdp_academy), getString(R.string.ogabekdev_73_views_2_weeks_ago)));
        feeds.add(new Feed(R.drawable.i, R.drawable.video_coding_in_one_full_day, "23:56", "Coding in 24 hours | A coding Day", "OgabekDev • 21K views • 1 year ago"));
        feeds.add(new Feed(R.drawable.i, R.drawable.video_hazorasp_in_2222, "07:55", "Hozarasp looks like in 2222 | Khorezm, Uzbekistan", "OgabekDev • 1M views • 2 year ago"));
        feeds.add(new Feed(R.drawable.i, R.drawable.video_img, "45:54", getString(R.string.android_guruhi_talabalari_mobile_ilova_loyihasi_taqdimoti_unicorn_by_pdp_academy), getString(R.string.ogabekdev_73_views_2_weeks_ago)));
        feeds.add(new Feed(R.drawable.i, R.drawable.video_coding_in_one_full_day, "23:56", "Coding in 24 hours | A coding Day", "OgabekDev • 21K views • 1 year ago"));
        feeds.add(new Feed(R.drawable.i, R.drawable.video_hazorasp_in_2222, "07:55", "Hozarasp looks like in 2222 | Khorezm, Uzbekistan", "OgabekDev • 1M views • 2 year ago"));
        feeds.add(new Feed(R.drawable.i, R.drawable.video_img, "45:54", getString(R.string.android_guruhi_talabalari_mobile_ilova_loyihasi_taqdimoti_unicorn_by_pdp_academy), getString(R.string.ogabekdev_73_views_2_weeks_ago)));
        feeds.add(new Feed(R.drawable.i, R.drawable.video_coding_in_one_full_day, "23:56", "Coding in 24 hours | A coding Day", "OgabekDev • 21K views • 1 year ago"));
        feeds.add(new Feed(R.drawable.i, R.drawable.video_hazorasp_in_2222, "07:55", "Hozarasp looks like in 2222 | Khorezm, Uzbekistan", "OgabekDev • 1M views • 2 year ago"));
        feeds.add(new Feed(R.drawable.i, R.drawable.video_img, "45:54", getString(R.string.android_guruhi_talabalari_mobile_ilova_loyihasi_taqdimoti_unicorn_by_pdp_academy), getString(R.string.ogabekdev_73_views_2_weeks_ago)));
        feeds.add(new Feed(R.drawable.i, R.drawable.video_coding_in_one_full_day, "23:56", "Coding in 24 hours | A coding Day", "OgabekDev • 21K views • 1 year ago"));
        feeds.add(new Feed(R.drawable.i, R.drawable.video_hazorasp_in_2222, "07:55", "Hozarasp looks like in 2222 | Khorezm, Uzbekistan", "OgabekDev • 1M views • 2 year ago"));


        return feeds;
    }

    private void refreshFilterAdapter(List<Filter> filter) {
        recyclerFilter.setAdapter(new FilterAdapter(filter));
    }

    private List<Filter> getAllFilters() {
        List<Filter> filters = new ArrayList<>();

        filters.add(new Filter(true, false));

        filters.add(new Filter("All", true));
        filters.add(new Filter("OgabekDev", false));
        filters.add(new Filter("PDP", false));
        filters.add(new Filter("Android", false));
        filters.add(new Filter("Events", false));
        filters.add(new Filter("Android", false));
        filters.add(new Filter("Mobile", false));

        return filters;
    }
}