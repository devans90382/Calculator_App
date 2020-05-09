pipeline
{
    environment
    {
        registry = "devans90382/docker-test"
        registryCredential = 'dockerhub'
        dockerImage = ''
        //dockerImageLatest = ''
    }
    agent any
    stages
    {
        stage('Cloning Git')
        {
            steps
            {
                echo 'Pulling the Maven Git repo'
                git "https://github.com/devans90382/Calculator_App.git"
            }
        }

        stage("Clean")
        {
            steps
            {
                echo "Cleaning the project"
                sh " mvn clean"
            }
        }
        stage("Package")
        {
            steps
            {
                echo "Packaging the project"
                sh "mvn package"
            }
        }
        stage("Install")
        {
            steps
            {
                echo "Installing the project"
                sh "mvn install"
            }
        }
        stage('Build Image')
        {
            steps
            {
                script
                {
                  dockerImage = docker.build registry + ":$BUILD_NUMBER"
                  //dockerImageLatest = docker.build registry + ":latest"
                }
            }
        }
        stage('Deploy Image to DockerHub')
        {
            steps
            {
                script
                {
                    docker.withRegistry( '', registryCredential )
                    {
                        dockerImage.push()
                        //dockerImageLatest.push()
                    }
                }
            }
        }
        /*stage('Remove Unused Docker image')
        {
            steps
            {
                sh "docker rmi $registry:$BUILD_NUMBER"
            }
        }*/
        stage("Running Calculator")
        {
            steps
            {
                echo "Run the Calculator"
                sh "java -cp target/mini_project-0.0.1-SNAPSHOT.jar mini_project/App_Calculator 5+5*7"
            }
        }
    }
}
