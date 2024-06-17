pipeline{
  agent any
  tools{
        maven 'M2_HOME'
    }
  stages{
    stage('Build'){
      steps{
        sh "mvn clean"
      }
    }
  stage('Test'){
      steps{
        sh "mvn test"
      }
    }
  stage('Deploy'){
      steps{
        sh "mvn install"
      }
    }
  }
}
