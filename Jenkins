pipeline{
  agents any
  stages{
    stage('Build'){
      steps{
        mvn clean
      }
    }
  stage('Test'){
      steps{
        mvn test
      }
    }
  stage('deploy'){
      steps{
        mvn package
      }
    }
  }
}
