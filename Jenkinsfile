node{
	
        stage('Clean Workspace'){
                    deleteDir()
                    echo 'Cleaning Workspace SUCCESS'
          }
          
          stage('Maven Build'){
          def mavenCmd = tool name: 'Maven_3.6.0', type: 'maven'
          	sh "${mavenCmd}/bin/mvn clean install"
          }
}
