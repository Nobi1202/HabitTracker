package tranvannguyen1202.com.habittracker.logic.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import tranvannguyen1202.com.habittracker.data.models.Habit


@Dao
interface HabitDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addHabit(habit: Habit)

    @Update
    suspend fun updateHabit(habit: Habit)

    @Delete
    suspend fun deleteHabit(habit: Habit)

    @Query ("SELECT * FROM habit_table ORDER BY id DESC")
    fun getAllHabits(): LiveData<List<Habit>>

    @Query ("DELETE FROM habit_table")
    suspend fun deleteAll()
}