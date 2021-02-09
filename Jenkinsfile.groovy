pipeline {
	agent any
	stages {
		
		stage('install gradle and upgrade gradlew'){
			steps {
					gradle{
						 useWrapper true
				         sh 'gradle wrapper --gradle-version 6.8.2'
					}
			}
		}
	  stage('Build project') {
              steps {
			      gradle{
			          useWrapper true
				      sh './gradlew build'		  
			      }
		
              }
         }
    }
}
