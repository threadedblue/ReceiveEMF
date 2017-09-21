#!/usr/bin/env bash

export CURR_DIR=`pwd`
export SRC_DIR="$CURR_DIR/src/main/java"
export DEMO_HOME="$CURR_DIR/target"
export RTI_FILE="conf/RTI.rid"
export LOG4J="log4j.configurationFile=conf/log4j2.xml"
export IPV4="java.net.preferIPv4Stack=true"
export CONFIG_FILE="$DEMO_HOME/conf/config.json"
