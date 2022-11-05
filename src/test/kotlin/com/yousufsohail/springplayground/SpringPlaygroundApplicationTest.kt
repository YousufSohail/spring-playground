package com.yousufsohail.springplayground

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SpringPlaygroundApplicationTest {

    private lateinit var app: SpringPlaygroundApplication

    @BeforeEach
    fun setUp() {
        app = SpringPlaygroundApplication()
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun hello() {
        val greeting = app.hello("Taha")
        assertEquals(greeting, "Hello Taha!")
    }


    @Test
    fun testSum() {
        val sum = app.sum(2, 2)
        assertEquals(sum, 4)
    }
}
