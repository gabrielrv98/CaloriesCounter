package com.esei.grvidal.caloriescounter.dataBaseEntities

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.time.LocalTime

@Entity
data class Meal (
    @PrimaryKey val id: Long,

    @NonNull @ColumnInfo(name = "FOOD_ID") val foodId: Long,
    @NonNull val date: LocalDate,
    @NonNull val time: LocalTime,
    @NonNull @ColumnInfo(defaultValue = "1") val quantity: Int
)

