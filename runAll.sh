#!/usr/bin/env bash

. ./env.sh
printf "\ec"

cp -r conf $DEMO_HOME
cd "$DEMO_HOME"
echo `pwd`
java -D$LOG4J -D$IPV4 -jar ReceiveEMF-0.0.1-SNAPSHOT.jar $CONFIG_FILE
echo $RTI_FILE






