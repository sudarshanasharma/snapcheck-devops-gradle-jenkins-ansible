// 'pipelineJob' creates a new pipeline Job
// which uses a Groovy script to execute
pipelineJob("gradlepipe") {

  // Define the pipeline script which is located in Git
  definition {
    cpsScm {
      scm {
        git {
          branch("main")
          remote {
            url("https://github.com/sudarshanasharma/snapcheck-devops-gradle-jenkins-ansible")
          }
        }
      }
      // The path within source control to the pipeline jobs Jenkins file
      scriptPath("Jenkinsfile.groovy")
    }
  }
}