package com.example.borutoapp.data.local

import androidx.room.TypeConverter
import java.lang.StringBuilder

class DatabaseConverter {

    private val separator = ","

    @TypeConverter
    fun convertListToString(list: List<String>): String {
        val stringBuilder = StringBuilder()
        for( item in list) {
            stringBuilder.append(item).append(separator)
        }
        // delete last separator
        stringBuilder.setLength(stringBuilder.length - separator.length)
        return stringBuilder.toString()
    }

    @TypeConverter
    fun convertStringTolist(string: String): List<String> {
        return string.split(separator)
    }
}