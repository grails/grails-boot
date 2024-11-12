grails-boot
===========

Grails integrations with Spring Boot

GORM Spring Boot plugins have been moved to https://github.com/grails/grails-data-mapping/tree/master/boot-plugins

To run Spring Boot App
```shell
 sdk env
 ./gradlew :gsp-example:bootRun
```

To run Spring Boot Groovy Script
```shell
 cd sample-apps/gsp/script
 sdk env
 groovy -Dgroovy.grape.report.downloads=true app.groovy
```
