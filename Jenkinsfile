pipeline
{
    agent any
    stages
    {

        stage('Git')
        {
            steps
            {
                echo 'Pulling the Maven Git Repo'
                git "https://github.com/devans90382/Calculator.git"
            }
        }

        stage("Cleaning Maven Project")
        {
            steps
            {
                echo "Cleaning the project"
                sh " mvn clean"
            }
        }

        stage("Installation")
        {
            steps
            {
                echo "Installing the project"
                sh "mvn install"
            }
        }

        stage("Running Calculator file")
        {
            steps
            {
                echo "Running Calculator"
                sh "java -cp target/mini_project-0.0.1-SNAPSHOT.jar mini_project/App_Calculator 5+5*7"
            }
        }

    }
}