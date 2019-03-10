node{
	
        stage('Clean Workspace'){
                    deleteDir()
                    echo 'Cleaning Workspace SUCCESS'
          }
          
          stage('Maven Build'){
          def mavenCmd = tool name: 'Maven', type: 'maven'
          	sh "mvn clean install"
          }
}
