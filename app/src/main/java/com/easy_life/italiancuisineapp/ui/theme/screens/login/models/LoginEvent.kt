package com.easy_life.italiancuisineapp.ui.theme.screens.login.models

sealed class LoginEvent {
    object LoginActionInvoked: LoginEvent()
    object ActionClicked : LoginEvent()
    object ForgetClicked: LoginEvent()
    object LoginClicked: LoginEvent()
    data class CheckboxClicked(val value: Boolean): LoginEvent()
    data class EmailChanged(val value: String) : LoginEvent()
    data class PasswordChanged(val value: String): LoginEvent()
}