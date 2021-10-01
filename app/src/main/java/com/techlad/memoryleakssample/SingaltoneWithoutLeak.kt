package com.techlad.memoryleakssample

import android.content.Context
import java.lang.ref.WeakReference

/**
 * Created by umair.khalid on 01,October,2021
 **/

class SingaltoneWithoutLeak private constructor(private val context: WeakReference<Context>) {

    companion object {
        private var ourInstance: SingaltoneWithoutLeak? = null

        fun getInstance(context: Context): SingaltoneWithoutLeak? {
            if (ourInstance == null) {
                ourInstance = SingaltoneWithoutLeak(WeakReference(context))
            }
            return ourInstance
        }
    }
}