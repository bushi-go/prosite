#! /bin/bash
NETWORK=$(docker network ls --format \"{{.Name}}\"  | grep pro-site-net)

if [ -z $NETWORK ]
    then
        echo "Network does not exist"
        echo "Creating network for development"
        docker network create pro-site-net
else
    echo "Network $NETWORK exists "
fi

docker-compose -f $(pwd)/environment/docker-compose-dev.yml up --build --force-recreate
