# README #

### hosting-broker ###
Broker Service in Rest to calculate total price of hosting in required city.

### Solution ###
* Spring Boot. I chose Spring Boot because it is very simple to work and fits well for this requirements.

### System requirements ###
* Java7, Maven 3, some REST client or curl app

### Set up ###
* Dependencies
  Declared inside the pom.xml
* Maven configuration
  - Download Maven 3 here:https://maven.apache.org/download.cgi
  - Install and configure following this instrucions: https://maven.apache.org/install.html and https://maven.apache.org/configure.html
* Unit tests
  To run tests: mvn clean install
* Deployment instructions - 
  mvn spring-boot:run

### Running ###

* I used curl in Linux terminal

### TESTE 1 - Get, Json ###
curl http://[domain]/calculateTotalHosting/{cityCode}/{checkin}/{Checkout}/{qtdAdultos}/{qtdCriancas}

[domain].....: Para execução local, utilizar "localhost:8080"
{cityCode}...: ID da cidade
{checkin}....: Dia do checkin no formato ddMMyyyy
{Checkout}...: Dia do checkout no formato ddMMyyyy
{qtdAdultos}.: Total de adultos
{qtdCriancas}: Total de crianças

Ex:
curl http://localhost:8080/calculateTotalHosting/1032/10062019/12062019/2/1

### TESTE 2 - Get, Json ###
curl http://[domain]/hotelDetail/{hotelID}

Ex:
curl http://localhost:8080/hotelDetail/1

