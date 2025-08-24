//Jenkinsfile for declarative pipelin

pipeline {

agent any

options {
        buildDiscarder(logRotator(numToKeepStr: '3', artifactNumToKeepStr: '3'))
    }

tools {
  maven 'maven_3.9.11'
}

    stages {
        stage ('compile stage') {
            steps {
                 echo "Compile the package"
                 sh "mvn clean compile"
                 echo "Compilation completed"
            }
        }
    stage ('build stage') {
            steps {
                echo "now build the package"
                sh "mvn clean package"
                echo "build completed"
        }
        }

    stage ('Call API') {
        steps {
        echo "call the url"
            sh 'curl -X GET http://localhost:8080/bus'

            }
    }


    }
    }
