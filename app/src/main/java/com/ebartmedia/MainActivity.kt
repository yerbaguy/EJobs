package com.ebartmedia

import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.support.v4.view.GravityCompat
import android.support.v7.app.ActionBarDrawerToggle
import android.view.MenuItem
import android.support.v4.widget.DrawerLayout
import android.support.design.widget.NavigationView
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.Toolbar
import android.view.Menu
import com.ebartmedia.Adapter.RecyclerViewAdapter
import com.ebartmedia.Model.Categories
import io.reactivex.disposables.CompositeDisposable
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


  //  var adapter:RecyclerViewAdapter?=null
  //  val compositeDisposable:CompositeDisposable?=null

  //  var categories: MutableList<Categories> = ArrayList<Categories>()

  //  val categories: ArrayList<String> = ArrayList()
    val categories: ArrayList<Categories> = ArrayList<Categories>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)



        val fab: FloatingActionButton = findViewById(R.id.fab)
        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        val navView: NavigationView = findViewById(R.id.nav_view)
        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()



        navView.setNavigationItemSelectedListener(this)


        addCategories()

        recycler_categories.setHasFixedSize(true)
        recycler_categories.layoutManager = LinearLayoutManager(this)


//        var cat = Categories()
//        cat.categoryName = "lkajsdf"
//
//        categories.addAll(listOf(cat))

        recycler_categories.adapter = RecyclerViewAdapter(this, categories)

//        adapter = RecyclerViewAdapter(this, categories as ArrayList<Categories>)

 //       recycler_categories.adapter = adapter

    }

    override fun onBackPressed() {
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        when (item.itemId) {
            R.id.nav_home -> {
                // Handle the camera action
            }
            R.id.nav_gallery -> {

            }
            R.id.nav_slideshow -> {

            }
            R.id.nav_tools -> {

            }
            R.id.nav_share -> {

            }
            R.id.nav_send -> {

            }
        }
        val drawerLayout: DrawerLayout = findViewById(R.id.drawer_layout)
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    private fun addCategories() {

        categories.clear()
        categories.addAll(listOf(Categories(1,"lkjasdflkj")))
        categories.addAll(listOf(Categories(2,"lkjasdflkj")))
        categories.addAll(listOf(Categories(3,"lkjasdflkj")))
        categories.addAll(listOf(Categories(4,"lkjasdflkj")))
        categories.addAll(listOf(Categories(5,"lkjasdflkj")))
        categories.addAll(listOf(Categories(6,"lkjasdflkj")))
        categories.addAll(listOf(Categories(7,"lkjasdflkj")))
        categories.addAll(listOf(Categories(8,"lkjasdflkj")))





//        var cat = Categories()
//        cat.categoryName = "lkajsdf"
//        cat.categoryName = "lkajsdf"
//        cat.categoryName = "lkajsdf"
//        cat.categoryName = "lkajsdf"
//        cat.categoryName = "lkajsdf"
//        cat.categoryName = "lkajsdf"
//        cat.categoryName = "lkajsdf"
//        cat.categoryName = "lkajsdf"


       // categories.addAll(listOf(cat))





//        categories.add("ljksdf")
//        categories.add("lkajsdf")
//        categories.add("lajsdf")
//        categories.add("lkajsdf")
//        categories.add("lajsdf")
//        categories.add("lkajsdf")
//        categories.add("lajsdf")
//        categories.add("lkajsdf")
//        categories.add("lajsdf")
//        categories.add("lkajsdf")
    }
}
