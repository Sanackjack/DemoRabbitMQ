# TESTRabbitMQ

1.install docker and run

docker pull rabbitmq

docker run -d --rm -p 15672:15672 -p 5672:5672 -v rabbit-data:/data --hostname rabbit-service --name awesome-rabbit rabbitmq:3-management

accout rabbitMQ user:quest , pwd:quest

2. create exchange and queue  
   - teste (queue name )
   - teste-exchange (exhange name) type direct and map to -> queue (teste)

