package com.example.wearos.base

import androidx.appcompat.app.AppCompatActivity
import androidx.wear.ambient.AmbientModeSupport

open class BaseActivity:  AppCompatActivity(){

    lateinit var ambientController: AmbientModeSupport.AmbientController

}