node("main") {
	stages {
		
		stage('install gradle and upgrade gradlew'){
			steps {
				script {
					withGradle{
				sh 'gradle wrapper --gradle-version 6.6.1'
					}

			      }
			}
		}
		
		
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
