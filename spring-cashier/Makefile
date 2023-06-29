all: clean

clean:
	mvn clean

compile:
	mvn compile

run: compile
	mvn spring-boot:run

network-create:
	docker network create --driver bridge starbucks

rabbit-shell:
	docker exec -it rabbitmq bash 

rabbit:
	docker run --name rabbitmq \
	           --network starbucks \
			   -p 9090:15672 -p 4369:4369 -p 5672:5672 \
			   -d rabbitmq:3-management

run-jar: build
	java -jar target/spring-starbucks-worker-1.0.jar 