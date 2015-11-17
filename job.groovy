def gitUrl = 'https://github.com/michaelarichard/jenkins_dsl.git'

job('any_change') {
    scm {
        git(gitUrl)
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        shell('echo "a change occurred."')
    }
}
