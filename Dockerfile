FROM openjdk:17-jre-slim
EXPOSE 8080
ADD target/common-util-new.jar common-util-new.jar
ENTRYPOINT ["java","-jar","/common-util-new"]