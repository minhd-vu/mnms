#!/bin/bash
kafka-console-consumer --topic message-topic \
    --bootstrap-server localhost:29092 \
    --from-beginning \
    --property print.key=true \
    --property key.separator=" : "