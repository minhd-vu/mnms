# Micronaut Microservice

## Dependencies
```
brew tap adoptopenjdk/openjdk
brew install adoptopenjdk11 micronaut kafka
```

## Running

1. Start the kafka broker and zookeeper
    ```
    docker compose up
    ```

2. Start the kafka consumer
   ```
   ./consumer.sh
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