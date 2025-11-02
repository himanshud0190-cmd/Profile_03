pipeline 
{
    agent any

    stages 
    {
        stage('Getting Code from GitHub') 
        {
            steps 
            {
                git 'https://github.com/himanshud0190-cmd/Profile_03.git'
            }
        }
        stage('Executing Maven Project on Edge Browser')
        {
            steps
            {
                bat 'mvn test'
            }
        }

    }

}