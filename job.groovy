def gitUrl = 'https://github.com/michaelarichard/jenkins_dsl.git'

job('seed-job') {
    scm {
        git(gitUrl){
	    createTag('false')
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
