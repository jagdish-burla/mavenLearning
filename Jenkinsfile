pipeline{
  agent any
  stages{
    stage('Build'){
      steps{
        "mvn clean"
      }
    }
  stage('Test'){
      steps{
        "mvn test"
      }
    }
  stage('Deploy'){
      steps{
        sh "mvn install"
      }
    }
  }
}
