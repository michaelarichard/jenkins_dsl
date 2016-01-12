job('flush_memcache') {
    triggers {
    }
    steps {
    shell readFileFromWorkspace('jobs/ops/flush_memcache/job.sh')
    }
}

