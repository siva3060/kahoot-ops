pipeline {

	agent any

		stages {
			stage('Clone') {
				steps {
					// Get some code from a GitHub repository
					git branch: 'develop', url: 'https://github.com/siva3060/kahoot-clone.git'
				}

			}

			stage('Compile') {
				steps {
					//Compile application source code 
					sh 'mvn clean compile'
				}

			}

			stage('Build') {
				steps {
					//Build application source code 
					sh 'mvn -Dskiptest=true package'
				}
				post {
					success {
						archiveArtifacts artifacts: 'target/*.jar', followSymlinks: false
					}
										     }

										     }


										     }


										     } 
