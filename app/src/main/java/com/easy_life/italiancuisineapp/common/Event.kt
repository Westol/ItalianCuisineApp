package com.easy_life.italiancuisineapp.common

interface EventHandler<E> {

    fun obtainEvent(event: E)
}