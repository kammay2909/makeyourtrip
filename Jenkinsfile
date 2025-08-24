//Jenkinsfile for declarative pipelin

pipeline {

options {
        buildDiscarder(logRotator(numToKeepStr: '3', artifactNumToKeepStr: '3'))
    }

    agent any

    stages {
        stage ('compile stage') {
            steps {
                 echo "Compile the package"
                 sh "mvn clean compile"

            }
        }
    stage ('build stage') {
            steps {
                echo "now build the package"
                sh "mvn clean package"
        }
        }

    stage ('Call API') {
        steps {
            sh 'curl -X GET http://localhost:8080/bus'

            }
    }


    }
    }
}