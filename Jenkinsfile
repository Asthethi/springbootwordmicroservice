node{
	
        stage('Clean Workspace'){
                    deleteDir()
                    echo 'Cleaning Workspace SUCCESS'
          }
          
          stage('Maven Build'){
          	sh label: '', script: 'mvn clean install'
          }
}
