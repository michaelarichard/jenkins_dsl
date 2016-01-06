def gitURL = 'https://gitlab.amer.gettywan.com/ts_playground/jenkins_dsl.git'
job('job1') {
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
            text(readFileFromWorkspace('jobs/job1/job.sh'))
//	      external('job.groovy')
//            removeAction('DELETE')
//            removeViewAction('DELETE')
        }
    }
}


