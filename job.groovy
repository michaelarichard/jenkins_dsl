def gitURL = 'file:///repos/michaelarichard/jenkins_dsl'
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
	    external('**/*.groovy')

// PURGE OPTIONS, FALSE by DEFAULT	    
//            removeAction('DELETE')
//            removeViewAction('DELETE')
        }
    }
}
