package dev.pgm.practicealten322

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.utils.widget.MockView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import dev.pgm.practicealten322.databinding.ActivityStudentListBinding
import dev.pgm.practicealten322.utils.StudentAdapter


class StudentListActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityStudentListBinding





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStudentListBinding.inflate(layoutInflater)

        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        val navController = findNavController(R.id.nav_host_fragment_content_student_list)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
        val myRecyclerView:RecyclerView=findViewById(R.id.recycler_view_Students)
        myRecyclerView.layoutManager=LinearLayoutManager(this)
        val studentList=MockUtils.generateStudentList()
        myRecyclerView.adapter=StudentAdapter(studentList)
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_student_list)
        return navController.navigateUp(appBarConfiguration)
                || super.onSupportNavigateUp()
    }
}