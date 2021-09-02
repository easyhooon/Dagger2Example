package com.kenshi.didemo1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private lateinit var smartPhone: SmartPhone

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerSmartPhoneComponent.create()
            .getSmartPhone()
            .makeACallWithRecording()

        /*
        val smartPhone = SmartPhone(
            Battery(),
            SIMCard(ServiceProvider()),
            MemoryCard()
        )

            .makeACallWithRecording()
         */

        //we just constructed a SmartPhone object injecting Battery,
        //MemoryCard and SIMCard objects as dependencies

        //This is dependency injection
        //we injected dependencies to the constructor of the class
        //This type of dependency injection is called Constructor


        /*
        //Apply Method Injection

        val smartPhone = SmartPhone(
            Battery(),
            SIMCard(),
            MemoryCard()
        )
            .makeACallWithRecording()
         */
    }
}