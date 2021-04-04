# Dockerfile
FROM jenkins/jenkins:lts-jdk11
# copy the list of plugins we want to install
#COPY plugins.txt /usr/share/jenkins/plugins.txt
# run the install-plugins script to install the plugins
RUN install-plugins.sh  \
  configuration-as-code  \
  job-dsl \
  matrix-auth \
  gradle:latest \
  github:latest \
  github-api:latest \
  github-branch-source:latest \
  workflow-aggregator:2.6
# disable the setup wizard as we will set up jenkins as code :)
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false
# copy the seedjob file into the image
COPY seedjob.groovy /usr/local/seedjob.groovy
# copy the config-as-code yaml file into the image
COPY jenkins-casc.yaml /usr/local/jenkins-casc.yaml
# tell the jenkins config-as-code plugin where to find the yaml file
ENV CASC_JENKINS_CONFIG /usr/local/jenkins-casc.yaml
# copy the config-as-code yaml file into the image
#COPY jenkins-casc.yaml /usr/local/jenkins-casc.yaml
# tell the jenkins config-as-code plugin where to find the yaml file
ENV CASC_JENKINS_CONFIG /usr/local/jenkins-casc.yaml
