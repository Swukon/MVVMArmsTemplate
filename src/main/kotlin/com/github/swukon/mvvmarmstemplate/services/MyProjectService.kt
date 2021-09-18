package com.github.swukon.mvvmarmstemplate.services

import com.intellij.openapi.project.Project
import com.github.swukon.mvvmarmstemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
