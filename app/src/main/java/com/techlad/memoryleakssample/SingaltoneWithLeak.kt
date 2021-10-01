package com.techlad.memoryleakssample
import android.content.Context

/**
 * Created by umair.khalid on 01,October,2021
 **/

class SingaltoneWithLeak private constructor(private val context: Context) {

    companion object {

        private var ourInstance: SingaltoneWithLeak? = null

        fun getInstance(context: Context): SingaltoneWithLeak? {
            if (ourInstance == null) {
                ourInstance = SingaltoneWithLeak(context)
            }
            return ourInstance
        }
    }
}