package com.raywenderlich.notekeeper.models

class DataManager {

    private val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android programming with intents")
        courses[course.courseID] = course

        course = CourseInfo("android_async", "Android async programming and services")
        courses[course.courseID] = course

        course = CourseInfo("java_lang", "Java Fundamental: The Java Language")
        courses[course.courseID] = course

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses[course.courseID] = course
    }
}
