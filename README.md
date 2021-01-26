# snapcheck-devops-gradle-jenkins-ansible
Please clone this code to your machine.I have tested it on  Ubuntu 18.04 platform for Linux.

Commands to install the dependencies:

sudo apt-get update

sudo apt-get install docker-ce docker-ce-cli containerd.io

sudo apt install gradle

sudo apt install ansible

In roles/installjenkins/files/jenkinscasc.yml provide the SSH public key from ~/.SSH/id_rsa.pub

To build the project, please execute the followwing command:

ansible-playbook -i inventory jenkins.yml
