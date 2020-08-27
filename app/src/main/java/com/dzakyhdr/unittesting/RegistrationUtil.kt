package com.dzakyhdr.unittesting

object RegistrationUtil {
    private val exitingUsers = listOf("Dzaky", "Haidar")

    /**
     * the input is not valid if...
     * ...the username/password is empty
     * ...the username is already taken
     * ...the same password contains is not the same as  the real password
     * ...the password contains less 2 digits
     */
    fun validetRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean{
        if (username.isEmpty() || password.isEmpty()){
            return false
        }

        if (username in exitingUsers){
            return false
        }

        if (password != confirmedPassword){
            return false
        }
        if(password.count { it.isDigit()} < 2){
            return false
        }

        return true
    }
}