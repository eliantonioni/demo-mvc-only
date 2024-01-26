### Docker 
#### that will build image and deploy (using jib) to a image registry
mvn clean package


### Helm
helm create demo-mvc-only-chart
helm install demo-mvc-only demo-mvc-only-chart/ --values demo-mvc-only-chart/values.yaml
helm uninstall demo-mvc-only