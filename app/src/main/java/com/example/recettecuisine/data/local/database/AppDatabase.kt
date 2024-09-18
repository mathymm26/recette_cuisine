package com.example.recettecuisine.data.local.database
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import android.content.Context
import androidx.room.TypeConverters
import com.example.recettecuisine.data.local.dao.Converter
import com.example.recettecuisine.data.local.dao.RecipeDao
import com.example.recettecuisine.data.model.Recipe

@Database(entities = [Recipe::class], version = 1)
@TypeConverters(Converter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun recipeDao(): RecipeDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}