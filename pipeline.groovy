pipeline {
    agent any
    stages {
        stage('pull stage') {
            steps {
                echo 'Hello World'
            }
        }
    }
    post { 
        always { 
            echo 'I will always say Hello again so please be patient!'
        }
    }
}
