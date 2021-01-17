pipeline {
 	agent any
	stages {
		stage('install gradle and upgrade gradlew'){
			steps {
				script {
				sh 'sudo -n snap install gradle --classic'
				sh './gradlew wrapper --gradle-version 6.6.1'
			      
			      }
			}
		}
		
		
	  stage('Build project') {
              steps {
		      script {
				      sh './gradlew build'
				      sh ''
			      }
              }
         }
    }
}
