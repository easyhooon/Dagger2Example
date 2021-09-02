package com.kenshi.didemo1

import dagger.Component

@Component
interface SmartPhoneComponent {

    //dagger will only consider this return type.
    fun getSmartPhone() : SmartPhone
}

//annotation Processor -> kapt 'com.google.dagger:dagger-compiler:2.28.3' 변경해야 generate 된다.