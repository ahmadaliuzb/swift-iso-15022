package uz.akh.swiftiso

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class SwiftIso15022Application

fun main(args: Array<String>) {
    runApplication<SwiftIso15022Application>(*args)
}

@RestController
class Controller() {
    @GetMapping
    fun get(): String {
        return "heya"
    }
}