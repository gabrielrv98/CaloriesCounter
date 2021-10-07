package com.esei.grvidal.caloriescounter.dataBaseEntities

import androidx.room.Embedded
import androidx.room.Relation


// Fetch all the meals with one specific food
class FoodInMeal (
    @Embedded val food: FoodType,
    @Relation(
        parentColumn = "id",
        entityColumn = "FOOD_ID"
    )
    val meal: List<Meal>

)