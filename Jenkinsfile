pipeline {
    agent any
    stages {
        stage('Clone') {
            steps {
                git branch: 'main', url: 'https://github.com/vovantung/app1.git'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t app1:3.0 .'
            }
        }
        stage('Deploy to Minikube') {
            steps {
                sh '''
                kubectl apply -f deployment.yaml
                '''
            }
        }
    }
}