package com.turquoise.hotelbookrecomendation.Activities

import com.google.common.truth.Truth

import org.junit.Test

class LoginTest {

    @Test
    fun UsernameEmpty() {
        val result = Login.validateUsername(
                username = ""

                )
        Truth.assertThat(result).isFalse()
    }

    @Test
    fun UsernameOneChar() {
        val result = Login.validateUsername(
                username = "a"

                )
        Truth.assertThat(result).isTrue()
    }

    @Test
    fun UsernameTwoChar() {
        val result = Login.validateUsername(
                username = "ab"

                )
        Truth.assertThat(result).isTrue()
    }

    @Test
    fun UsernameThreeChar() {
        val result = Login.validateUsername(
                username = "abc"

                )
        Truth.assertThat(result).isTrue()
    }

    @Test
    fun UsernameFourChar() {
        val result = Login.validateUsername(
                username = "abcd"

                )
        Truth.assertThat(result).isTrue()
    }

    @Test
    fun UsernameFiveChar() {
        val result = Login.validateUsername(
                username = "abcde"

                )
        Truth.assertThat(result).isTrue()
    }

    @Test
    fun UsernameSixChar() {
        val result = Login.validateUsername(
                username = "abcdef"

                )
        Truth.assertThat(result).isFalse()
    }



}