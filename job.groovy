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
	    external('**/job.groovy','**/view.groovy','**/**/job.groovy')

// PURGE OPTIONS, FALSE by DEFAULT	    
//            removeAction('DELETE')
//            removeViewAction('DELETE')
        }
    }
}
