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
        shell(readFileFromWorkspace('jobs/job1/job.sh'))
    }
}
