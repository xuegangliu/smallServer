# 依赖安装

## 在公网库没有找到,需要打包的本地库

`mvn install:install-file -Dfile=jar包的位置 -DgroupId=jar包的groupId -DartifactId=jar包的artifactId -Dversion=jar包的version -Dpackaging=jar`