package com.nullpointer.newsapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nullpointer.newsapp.R
import com.nullpointer.newsapp.viewmodel.NewsViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.nullpointer.newsapp.datasource.Article
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var viewModel = NewsViewModel()
    private var newsRecyclerViewAdapter = NewsRecyclerViewAdapter(arrayListOf())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerViewList()
        val artical = Article("Jerard Fagerberg on The Takeout, shared by Joel Cunningham to Lifehacker",
            "Clean everything coffee touches with Cafiza",
            "On March 8, 2020, I stepped inside a mountainside coffee shop in Jay Peak, Vermont. That hastily made 16 oz of steamin’ gas station-quality sludge was the last stranger-made cup of coffee I’d drink for over a year.Read more...",
            "https://thetakeout.com/how-to-clean-your-coffee-maker-with-urnex-cafiza-powder-1846476047",
            "https://i.kinja-img.com/gawker-media/image/upload/c_fill,f_auto,fl_progressive,g_center,h_675,pg_1,q_80,w_1200/kdcjx1qoywbik0o3xxb7.jpg",
            "2021-03-17T14:16:00Z",
            "On March 8, 2020, I stepped inside a mountainside coffee shop in Jay Peak, Vermont. That hastily made 16 oz of steamin gas station-quality sludge was the last stranger-made cup of coffee Id drink for… [+4143 chars]")
        val list = arrayListOf(artical)
        newsRecyclerViewAdapter.updateList(list)

//        viewModel = ViewModelProvider(this).get(NewsViewModel::class.java)
//        observeViewModel(viewModel)
    }

    private fun setViewModel(lat: Double, lon: Double){

    }

    private fun initRecyclerViewList(){
        newsRecyclerView.apply {
            layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
            adapter = newsRecyclerViewAdapter
        }
    }

    private fun observeViewModel(viewModel: NewsViewModel) {
//        viewModel.getWeatherInfo().observe(this, Observer { setData(it) })
//        viewModel.getLoading().observe(this, Observer { showLoading(it) })
//        viewModel.getError().observe(this, Observer { showError(it) })
    }
}