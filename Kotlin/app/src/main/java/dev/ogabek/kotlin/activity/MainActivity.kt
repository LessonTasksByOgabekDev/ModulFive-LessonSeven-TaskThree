package dev.ogabek.kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.adapter.FeedAdapter
import dev.ogabek.kotlin.adapter.FilterAdapter
import dev.ogabek.kotlin.model.Feed
import dev.ogabek.kotlin.model.Filter
import dev.ogabek.kotlin.model.Short

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerFeed: RecyclerView
    private lateinit var recyclerFilter: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerFeed = findViewById(R.id.recyclerFeed)
        recyclerFilter = findViewById(R.id.recyclerFilter)
        recyclerFeed.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerFilter.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        refreshFeedAdapter(allFeeds())
        refreshFilterAdapter(allFilters())
    }

    private fun refreshFeedAdapter(feeds: List<Feed>) {
        recyclerFeed.adapter = FeedAdapter(this, feeds)
    }

    private fun allFeeds(): List<Feed> {
        val feeds: ArrayList<Feed> = ArrayList()

        val shorts: ArrayList<Short> = ArrayList()

        shorts.add(Short("A day of work in FlatOn LLC", "310K", R.drawable.story_a_day_of_work_in_flat_on_llc))
        shorts.add(Short("I love Apple products", "12M", R.drawable.story_i_love_apple))
        shorts.add(Short("For the first time, I tried VR in my life", "23K", R.drawable.story_vr_first_tried_i_have_ever))
        shorts.add(Short("A day of work in FlatOn LLC", "310K", R.drawable.story_a_day_of_work_in_flat_on_llc))
        shorts.add(Short("I love Apple products", "12M", R.drawable.story_i_love_apple))
        shorts.add(Short("For the first time, I tried VR in my life", "23K", R.drawable.story_vr_first_tried_i_have_ever))
        shorts.add(Short("A day of work in FlatOn LLC", "310K", R.drawable.story_a_day_of_work_in_flat_on_llc))
        shorts.add(Short("I love Apple products", "12M", R.drawable.story_i_love_apple))
        shorts.add(Short("For the first time, I tried VR in my life", "23K", R.drawable.story_vr_first_tried_i_have_ever))
        shorts.add(Short("A day of work in FlatOn LLC", "310K", R.drawable.story_a_day_of_work_in_flat_on_llc))
        shorts.add(Short("I love Apple products", "12M", R.drawable.story_i_love_apple))
        shorts.add(Short("For the first time, I tried VR in my life", "23K", R.drawable.story_vr_first_tried_i_have_ever))


        feeds.add(Feed(R.drawable.i, R.drawable.video_img, "45:54", getString(R.string.android_guruhi_talabalari_mobile_ilova_loyihasi_taqdimoti_unicorn_by_pdp_academy), getString(R.string.ogabekdev_73_views_2_weeks_ago)))
        feeds.add(Feed(R.drawable.i, R.drawable.video_coding_in_one_full_day, "23:56", "Coding in 24 hours | A coding Day", "OgabekDev • 21K views • 1 year ago"))
        feeds.add(Feed(R.drawable.i, R.drawable.video_hazorasp_in_2222, "07:55", "Hozarasp looks like in 2222 | Khorezm, Uzbekistan", "OgabekDev • 1M views • 2 year ago"))
        feeds.add(Feed(R.drawable.i, R.drawable.video_img, "45:54", getString(R.string.android_guruhi_talabalari_mobile_ilova_loyihasi_taqdimoti_unicorn_by_pdp_academy), getString(R.string.ogabekdev_73_views_2_weeks_ago)))
        feeds.add(Feed(R.drawable.i, R.drawable.video_coding_in_one_full_day, "23:56", "Coding in 24 hours | A coding Day", "OgabekDev • 21K views • 1 year ago"))

        feeds.add(Feed(shorts))

        feeds.add(Feed(R.drawable.i, R.drawable.video_hazorasp_in_2222, "07:55", "Hozarasp looks like in 2222 | Khorezm, Uzbekistan", "OgabekDev • 1M views • 2 year ago"))
        feeds.add(Feed(R.drawable.i, R.drawable.video_img, "45:54", getString(R.string.android_guruhi_talabalari_mobile_ilova_loyihasi_taqdimoti_unicorn_by_pdp_academy), getString(R.string.ogabekdev_73_views_2_weeks_ago)))
        feeds.add(Feed(R.drawable.i, R.drawable.video_coding_in_one_full_day, "23:56", "Coding in 24 hours | A coding Day", "OgabekDev • 21K views • 1 year ago"))
        feeds.add(Feed(R.drawable.i, R.drawable.video_hazorasp_in_2222, "07:55", "Hozarasp looks like in 2222 | Khorezm, Uzbekistan", "OgabekDev • 1M views • 2 year ago"))
        feeds.add(Feed(R.drawable.i, R.drawable.video_img, "45:54", getString(R.string.android_guruhi_talabalari_mobile_ilova_loyihasi_taqdimoti_unicorn_by_pdp_academy), getString(R.string.ogabekdev_73_views_2_weeks_ago)))
        feeds.add(Feed(R.drawable.i, R.drawable.video_coding_in_one_full_day, "23:56", "Coding in 24 hours | A coding Day", "OgabekDev • 21K views • 1 year ago"))
        feeds.add(Feed(R.drawable.i, R.drawable.video_hazorasp_in_2222, "07:55", "Hozarasp looks like in 2222 | Khorezm, Uzbekistan", "OgabekDev • 1M views • 2 year ago"))
        feeds.add(Feed(R.drawable.i, R.drawable.video_img, "45:54", getString(R.string.android_guruhi_talabalari_mobile_ilova_loyihasi_taqdimoti_unicorn_by_pdp_academy), getString(R.string.ogabekdev_73_views_2_weeks_ago)))
        feeds.add(Feed(R.drawable.i, R.drawable.video_coding_in_one_full_day, "23:56", "Coding in 24 hours | A coding Day", "OgabekDev • 21K views • 1 year ago"))
        feeds.add(Feed(R.drawable.i, R.drawable.video_hazorasp_in_2222, "07:55", "Hozarasp looks like in 2222 | Khorezm, Uzbekistan", "OgabekDev • 1M views • 2 year ago"))
        feeds.add(Feed(R.drawable.i, R.drawable.video_img, "45:54", getString(R.string.android_guruhi_talabalari_mobile_ilova_loyihasi_taqdimoti_unicorn_by_pdp_academy), getString(R.string.ogabekdev_73_views_2_weeks_ago)))
        feeds.add(Feed(R.drawable.i, R.drawable.video_coding_in_one_full_day, "23:56", "Coding in 24 hours | A coding Day", "OgabekDev • 21K views • 1 year ago"))
        feeds.add(Feed(R.drawable.i, R.drawable.video_hazorasp_in_2222, "07:55", "Hozarasp looks like in 2222 | Khorezm, Uzbekistan", "OgabekDev • 1M views • 2 year ago"))
        return feeds
    }

    private fun refreshFilterAdapter(filter: List<Filter>) {
        recyclerFilter.adapter = FilterAdapter(filter)
    }

    private fun allFilters(): List<Filter> {
        val filters: MutableList<Filter> = ArrayList()
        filters.add(Filter(true, false))
        filters.add(Filter("All", true))
        filters.add(Filter("OgabekDev", false))
        filters.add(Filter("PDP", false))
        filters.add(Filter("Android", false))
        filters.add(Filter("Events", false))
        filters.add(Filter("Android", false))
        filters.add(Filter("Mobile", false))
        return filters
    }
}