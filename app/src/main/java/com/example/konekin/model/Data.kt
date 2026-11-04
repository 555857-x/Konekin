package com.example.konekin.model

import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("id")
    val id: Int,
    @SerializedName("employee_name")
    val employeeName: String,
    @SerializedName("employee_salary")
    val employeeName: Int,
    @SerializedName("employee_age")
    val employeeName: Int,
    @SerializedName("employee_image")
    val employeeName: String

)
