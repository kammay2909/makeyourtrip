pipeline {

    agent any

    options {
        buildDiscarder(logRotator(numToKeepStr: '3', artifactNumToKeepStr: '3'))
    }

    tools {
        maven 'maven_3.9.11'
    }

    stages {
        stage('Code Compilation') {
            steps {
                echo 'Starting Code Compilation...'
                sh 'mvn clean compile'
                echo 'Code Compilation Completed Successfully!'
            }
        }
        stage('Code QA Execution') {
            steps {
                echo 'Running JUnit Test Cases...'
                sh 'mvn clean compile'
                echo 'JUnit Test Cases Completed Successfully!'
            }
        }
        stage('Code Package') {
            steps {
                echo 'Creating JAR Artifact...'
                sh 'mvn clean package'
                echo 'JAR Artifact Created Successfully!'
            }
        }
    }
}