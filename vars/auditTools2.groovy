def call(Map config){
    node{
        sh """
            echo "Config message is : ${config.message}"
            git version
            java -version
            mvn -version
        """
    }
}