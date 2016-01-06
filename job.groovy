def gitURL = 'https://github.com/michaelarichard/jenkins_dsl.git'
job('seed-job') {
    scm {
      git{
           remote {
              url(gitURL)
           }
	 }
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        dsl {
//            text(readFileFromWorkspace('job.groovy'))
	    external('**/job.groovy','**/view.groovy','**/**/job.groovy')

// PURGE OPTIONS, FALSE by DEFAULT	    
//            removeAction('DELETE')
//            removeViewAction('DELETE')
        }
    }
}
