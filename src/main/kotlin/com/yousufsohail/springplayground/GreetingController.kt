package com.yousufsohail.springplayground

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    private val template = "Hello, %s!"
    private val counter = AtomicLong()

    @GetMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String): Greeting {
        return Greeting(counter.incrementAndGet(), String.format(template, name))
    }

    @GetMapping("/hi")
    fun hi(@RequestParam(value = "name", defaultValue = "World") name: String?): String? {
        return String.format("Hi %s!", name)
    }

    @GetMapping("/sum")
    fun sum(@RequestParam(value = "num1") firstNumber: Int, @RequestParam(value = "num2") secondNumber: Int): Int {
        return firstNumber + secondNumber
    }

}