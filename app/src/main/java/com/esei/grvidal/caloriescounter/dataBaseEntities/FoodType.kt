package com.esei.grvidal.caloriescounter.dataBaseEntities

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "FOOD")
data class FoodType (
    @PrimaryKey val id: Long,

    @NonNull @ColumnInfo(name = "NAME") val name: String,
    @NonNull @ColumnInfo(name = "CALORIES") val calories: Int
)