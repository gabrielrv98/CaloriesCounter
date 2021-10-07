package com.esei.grvidal.caloriescounter.daos

import androidx.room.Dao
import androidx.room.Query
import com.esei.grvidal.caloriescounter.dataBaseEntities.FoodType

@Dao
interface FoodTypeDAO{

    @Query("SELECT * FROM FOOD ORDER BY id ASC")
    fun getAllFoods() : List<FoodType>
}