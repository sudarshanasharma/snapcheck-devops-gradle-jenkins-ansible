pipeline {
 	agent any
	stages {
		
		
	  stage('Build project') {
              steps {
		      script {
			      withGradle{
				      sh './gradlew build'		  
			      }
		          }
              }
         }
    }
}
