pipeline {
    agent any

    tools {
        maven 'maven' // Ensures Jenkins manages the Maven version
    }

    stages {
        stage('Initialize') {
            steps {
                echo 'Starting Velocity API Build...'
                sh 'mvn --version'
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling Java Code...'
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                echo 'Running Unit Tests...'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Packaging Application...'
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            echo 'Build Successful - Artifact Archived!'
        }

        failure {
            echo 'Build Failed. Check logs for details.'
        }
    }
}

