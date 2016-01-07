job('flush_memcache') {
    triggers {
    }
    steps {
        dsl {
            text(readFileFromWorkspace('jobs/ops/flush_memcache/job.sh'))
        }
    }
}

// example of how to include
//evaluate(new File("../jobs/job1.groovy"))

