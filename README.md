Steps to connect github credentials to client application using Oauth 


1> Create Account in GIthub
2> Go to Developer Settings in Github and create OAuth applicaticon with Application Url and Callback Url.
(Profile -> Settings -> Developer Settings -> Oauth Apps)
3> After application got created it will provide Client Id and Client Secret. Note down client id and client secret.
4> Create SpringBoot web application with below dependencies
  1) Spring-boot-starter-web
  2) spring-cloud-starter-oauth2
  3) spring-cloud-starter-security

5> use @EnableOAuth2sso annotation at SpringBoot start class
6> Use RestController annotation at SpringBoot start class to represent that class as a distribiuted component and write one distributed method.

7> Write below Oauth configureation in application.yml file
Security:
 oauth2:
   client:
     clientId:h32432dedk23423sak3
     clientSecret: 324320koddf324r32jlk2l34j32423l4k32423
     accessTokenUri:https://github.com/login/oauth/access_token
     userAuthorizationUri:https://github.com/login/oauth/authorize
     clientAuthenticationScheme: form
   resource:user-info-uri: https://api.github.com/user

8> change Embedded Container port number in application.yml file 
    server:
      port:2222
9> start SpringBoot application and send request to rest api method.
