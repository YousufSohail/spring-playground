package com.yousufsohail.springplayground

import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

internal class SpringPlaygroundApplicationTest {

    private lateinit var app: SpringPlaygroundApplication

    @BeforeEach
    fun setUp() {
        app = SpringPlaygroundApplication()
    }

    @AfterEach
    fun tearDown() {
    }

}
