package com.yangpeiyong.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

/**
 * Created by yangpeiyong on 2017/2/22.
 */
class DemoPlugin implements Plugin<Project>{

    @Override
    void apply(Project project) {

        project.task("hello") << {
            println 'Hello, Plugin'
        }

    }
}
