# Steps to connect github credentials to client application using Oauth 


#### 1> Create Account in GIthub
#### 2> Go to Developer Settings in Github and create OAuth applicaticon with Application Url and Callback Url.
(Profile -> Settings -> Developer Settings -> Oauth Apps)
#### 3> After application got created it will provide Client Id and Client Secret. Note down client id and client secret.
#### 4> Create SpringBoot web application with below dependencies
 ##### 1) Spring-boot-starter-web
 ##### 2) spring-cloud-starter-oauth2
  ##### 3) spring-cloud-starter-security

#### 5> use @EnableOAuth2Sso annotation at SpringBoot start class Note: In Sprig Boot 3.0 onword no need to add this annotation
#### 6> Use RestController annotation at SpringBoot start class to represent that class as a distribiuted component and write one distributed method.

#### 7> Write below Oauth configureation in application.yml file
spring:
  security:
    oauth2:
      client:
        registration:
          github:
            clientId: 56467678hjhikjoi7868
            clientSecret: 28879b6bbf54f9a10dc01jjj28bf13061278a21eb0095
  resource:
        user-info-uri: https://api.github.com/user

#### 8> change Embedded Container port number in application.yml file 
    server:
      port:2222
#### 9> start SpringBoot application and send request to rest api method.
