node{
	
        stage('Clean Workspace'){
                    deleteDir()
                    echo 'Cleaning Workspace SUCCESS'
          }
          
          stage('Maven Build'){
          	sh 'mvn clean install'
          }
}
