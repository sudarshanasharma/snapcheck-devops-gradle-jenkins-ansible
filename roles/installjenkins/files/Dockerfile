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
  github-issues:latest \
  github-oauth:latest \
  github-organization-folder:latest \
  github-pullrequest:latest \
  github-pr-coverage-status:latest \
  pipeline-build-step:latest \
  pipeline-graph-analysis:latest \
  pipeline-input-step:latest \
  pipeline-milestone-step:latest \
  pipeline-model-api:1.0.2 \
  pipeline-model-declarative-agent:1.0.2 \
  pipeline-model-definition:1.0.2 \
  pipeline-githubnotify-step:latest \
  pipeline-github-lib:latest \
  pipeline-rest-api:latest \
  pipeline-stage-step:latest \
  pipeline-stage-tags-metadata:latest \
  pipeline-stage-view:latest \
  pipeline-utility-steps:latest
# disable the setup wizard as we will set up jenkins as code :)
ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false
# copy the seedjob file into the image
COPY seedjob.groovy /usr/local/seedjob.groovy
# copy the config-as-code yaml file into the image
COPY jenkins-casc.yaml /usr/local/jenkins-casc.yaml
# tell the jenkins config-as-code plugin where to find the yaml file
ENV CASC_JENKINS_CONFIG /usr/local/jenkins-casc.yaml