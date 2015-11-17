job('seed-job') {
    scm {
         remote {
              url 'https://github.com/michaelarichard/jenkins_dsl.git'
         }
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        dsl {
//            text(readFileFromWorkspace('job.groovy'))
	      external('job.groovy')
//            removeAction('DELETE')
//            removeViewAction('DELETE')
        }
    }
}
