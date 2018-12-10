node {
   def mvnHome = '/usr/local/maven/apache-maven-3.5.2'
   env.PATH = "${mvnHome}/bin:${env.PATH}"
   def workspace = pwd()
   def war_dir = 'ehouse_ui'
   stage('Preparation') { // for display purposes
      echo "Checkout"
      checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '9a1d0eb6-8b39-475a-95b8-9032e3f1a67a', url: 'git@github.com:sherlock-huang/ehouse.git']]])
   }
   stage('Build') {
      withMaven(jdk: 'jdk8', maven: 'Maven-3.5.2', mavenOpts: '-Dmaven.test.skip=true') {
        // some block
        sh "mvn clean install"
      }
   }
   stage('Results') {
      echo 'Results'
   }
}