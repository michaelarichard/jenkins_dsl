def gitURL = 'https://github.com/michaelarichard/jenkins_dsl.git'
job('seed-job') {
    scm {
      git{
           remote {
              url(gitUrl)
           }
	 }
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        dsl {
            text(readFileFromWorkspace('job.groovy'))
//	      external('job.groovy')
//            removeAction('DELETE')
//            removeViewAction('DELETE')
        }
    }
}
