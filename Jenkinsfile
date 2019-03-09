pipeline{

    stages{
        stage('Clean Workspace'){
            
            steps{
                withMaven(maven : 'maven_3.6.0'){
                    deleteDir()
                    echo 'Cleaning Workspace SUCCESS'
                }
            }
        
        }
    }

}