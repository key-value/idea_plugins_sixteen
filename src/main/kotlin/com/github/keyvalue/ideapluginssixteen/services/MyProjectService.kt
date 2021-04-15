package com.github.keyvalue.ideapluginssixteen.services

import com.github.keyvalue.ideapluginssixteen.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
