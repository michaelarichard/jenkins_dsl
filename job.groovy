def gitUrl = 'https://github.com/michaelarichard/jenkins_dsl.git'

job('seed-job') {
    scm {
        git(gitUrl)
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        dsl {
            text(readFileFromWorkspace('job.groovy'))
            removeAction('DELETE')
            removeViewAction('DELETE')
        }
    }
}
