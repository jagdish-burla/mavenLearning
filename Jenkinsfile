pipeline{
  agent any
  tools{
        maven 'M2_HOME'
    }
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
