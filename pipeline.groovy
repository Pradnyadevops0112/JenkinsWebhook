pipeline {
    agent any
    stages {
        stage('pull stage') {
            steps {
                echo 'Hello World you are amazing'
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again so please be patient!'
        }
    }
}
