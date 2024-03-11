### Docker 
#### that will build image and deploy (using jib) to a image registry
mvn clean package


### Helm
helm create demo-mvc-only-chart
helm install demo-mvc-only demo-mvc-only-chart/ --values demo-mvc-only-chart/values.yaml
helm uninstall demo-mvc-only


### Maven - to generate aws serverless springboot3 app by archetype
mvn archetype:generate -DgroupId=com.example -DartifactId=demo-mvc-only -Dversion=0.0.1-SNAPSHOT \
-DarchetypeGroupId=com.amazonaws.serverless.archetypes \
-DarchetypeArtifactId=aws-serverless-springboot3-archetype \
-DarchetypeVersion=2.0.0

### build using SAM (serverless app model) CLI
sam build

### to build in container
sam build --use-container
### here if using RancherDesktop - may experience 'Error: Docker is unreachable. Docker needs to be running to build inside a container.'
### to overcome - prior that do
export DOCKER_HOST="unix://$HOME/.rd/docker.sock"