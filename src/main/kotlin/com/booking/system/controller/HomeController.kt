package com.booking.system.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/api/status")
    fun getStatus(): Map<String, Any> {
        return mapOf(
            "status" to "UP",
            "message" to "Booking system is running successfully!",
            "application" to "Kotlin + Spring Boot Booking API"
        )
    }
}