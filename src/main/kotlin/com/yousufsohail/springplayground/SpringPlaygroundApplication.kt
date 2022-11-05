package com.yousufsohail.springplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@SpringBootApplication
@RestController
class SpringPlaygroundApplication {

    @GetMapping("/greet")
    fun hello(@RequestParam(value = "name", defaultValue = "World") name: String?): String? {
        return String.format("Hello %s!", name)
    }

    @GetMapping("/sum")
    fun sum(@RequestParam(value = "num1") firstNumber: Int, @RequestParam(value = "num2") secondNumber: Int): Int {
        return firstNumber + secondNumber
    }
}

fun main(args: Array<String>) {
    runApplication<SpringPlaygroundApplication>(*args)
}
