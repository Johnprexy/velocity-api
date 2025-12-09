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

        stage('Package') {
            steps {
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            echo 'Build Successful - Artifact Archived!'
        }
    }
}

