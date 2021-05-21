# Micronaut Microservice

## Dependencies
- MacOS
   ```
   brew tap adoptopenjdk/openjdk
   brew install adoptopenjdk11 micronaut kafka
   ```
- Ubuntu
   ```
   sudo apt install kafkacat
   ```

## Running

1. Start the kafka broker and zookeeper
    ```
    docker compose up
    ```

2. Start the kafka consumer
   ```
   ./consumer.sh
   # or with kafkacat
   kafkacat -b localhost:29092 -t message-topic
   ```

3. Start the message producer
   ```
   ./gradlew run
   ```

4. Send at post request to `http://localhost:8080/` containing:
    ```
    {
	    "name": "Minh",
	    "message": "Hello World"
    }
    ```