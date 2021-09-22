package tranvannguyen1202.com.habittracker.ui.fragments.habitlist

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.fragment.app.Fragment
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import tranvannguyen1202.com.habittracker.R
import tranvannguyen1202.com.habittracker.data.models.Habit
//mport tranvannguyen1202.com.habittracker.ui.fragments.habitlist.adapters.HabitListAdapter
import tranvannguyen1202.com.habittracker.ui.viewmodels.HabitViewModel
import kotlinx.android.synthetic.main.fragment_habit_list.*
import tranvannguyen1202.com.habittracker.R

class HabitList : Fragment(R.layout.fragment_habit_list) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        var fab_add =
        fab_add.setOnClickListener {
            findNavController().navigate(R.id.action_habitList_to_createHabitItem)
        }

    }
}