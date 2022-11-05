package com.yousufsohail.springplayground

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class GreetingControllerTest {

    private lateinit var greetController: GreetingController

    @BeforeEach
    fun setUp() {
        greetController = GreetingController()
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun hello() {
        val greeting = greetController.hi("Yousuf")
        assertEquals(greeting, "Hi Yousuf!")
    }

    @Test
    fun sum() {
        val sum = greetController.sum(2, 2)
        assertEquals(sum, 4)
    }
}