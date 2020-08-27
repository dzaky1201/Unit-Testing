package com.dzakyhdr.unittesting


import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest{

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validetRegistrationInput(
            "",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }


    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validetRegistrationInput(
            "Mufti",
            "123",
            "123"
        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exits returns false`(){
        val result = RegistrationUtil.validetRegistrationInput(
            "Dzaky",
            "123",
            "123"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `incorrectly confirmed password return false`(){
        val result = RegistrationUtil.validetRegistrationInput(
            "Mufti",
            "123456",
            "abcdefg"
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validetRegistrationInput(
            "Mufti",
            "",
            ""
        )
        assertThat(result).isFalse()
    }

    @Test
    fun `less than 2 digit password returns false`(){
        val result = RegistrationUtil.validetRegistrationInput(
            "Mufti",
            "abcdefg5",
            "abcdefg5"
        )
        assertThat(result).isFalse()
    }

}