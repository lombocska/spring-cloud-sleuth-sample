#!/bin/bash

NETWORK_ID=`docker network ls --filter name=sleuth-example -q`

# test NETWORK_ID for emptiness and create network is not available
[[ -z "${NETWORK_ID// }" ]] && docker network create sleuth-example

docker-compose up --build
