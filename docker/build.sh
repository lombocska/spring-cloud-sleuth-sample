#!/bin/bash

cd ../edge-service; mvn clean package
cd ../platform-service-producer; mvn clean package
cd ../platform-service-consumer; mvn clean package

