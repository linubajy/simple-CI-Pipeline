pipeline{
  agent any
  tools
  {
    maven 'maven'
    jdk 'JDK'
  }
       
  stages {
    
          stage('Fetch')
          {
            steps 
            {
               
               git branch: 'master', url: 'https://github.com/linubajy/simple-CI-Pipeline.git'
            }
          }
          stage("Test")
          { 
            steps
            {
              bat 'mvn test'
            } 
          }
          stage("Build")
          {
             steps
            {
               bat 'mvn package'
            } 
              
          } 
    
          stage("SonarQube analysis") 
          {
            steps
            {
              withSonarQubeEnv('sonar-server') 
              {
                withMaven(maven:'maven')
                {
                  bat 'java -version'
                  bat 'mvn sonar:sonar'
                }
              }
            }  
          }
          stage("Quality Gate")
          {
              timeout(time: 1, unit: 'HOURS')
              {
                  def qg = waitForQualityGate()
                  if (qg.status != 'OK')
                  {
                    error "Pipeline aborted due to quality gate failure: ${qg.status}"
                  }
              } 
          }
          stage('collect artifact')
          {
                steps{
                    archiveArtifacts artifacts: 'target/*.jar', followSymlinks: false
                 }
            }      
         stage('deploy to artifactory')
         {
            steps{
     
                rtUpload (
                    serverId: 'jfrog',
                    spec: '''{
                    "files": [
                         {
                             "pattern": "target/*.jar",
                             "target": "art-doc-dev-loc/sample/"
                        }
                     ]
                }''',
 
  
    buildName: 'Build1',
    buildNumber: '1'
    )
     }}
      
    
   
    
    
    }
}
