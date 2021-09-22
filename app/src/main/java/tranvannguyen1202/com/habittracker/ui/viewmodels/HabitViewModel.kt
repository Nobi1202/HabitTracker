package tranvannguyen1202.com.habittracker.ui.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import tranvannguyen1202.com.habittracker.data.database.HabitDatabase
import tranvannguyen1202.com.habittracker.data.models.Habit
import tranvannguyen1202.com.habittracker.logic.dao.HabitDao
import tranvannguyen1202.com.habittracker.logic.repository.HabitRepository
import java.lang.Appendable

class HabitViewModel(appendable: Appendable) : AndroidViewModel(application) {

    private val repository: HabitRepository
    val getAllHabits: LiveData<List<Habit>>
    
    init {
        val habitDao = HabitDatabase.getDatabase(application).habitDao()
        repository = HabitRepository(habitDao)
        
        getAllHabits = repository.getAllHabits
    }

    fun addHabit(habit: Habit)
    {
        viewModelScope.launch(Dispatchers.IO) {
            repository.addHabit(habit)
        }
    }
    fun deleteHabit(habit: Habit)
    {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteHabit(habit)
        }
    }
    fun updateHabit(habit: Habit)
    {
        viewModelScope.launch(Dispatchers.IO) {
            repository.updateHabit(habit)
        }
    }
    fun deleteAllHabits(habit: Habit)
    {
        viewModelScope.launch(Dispatchers.IO) {
            repository.deleteAllHabits()
        }
    }

}

object application : Application() {

}
