#!/bin/sh
COMMAND=$1
PROCESS_PARM="springboot-demo-0.0.1-SNAPSHOT"

if [ "$COMMAND" = "stop" ] ;
then
 ps -ef|grep "DappName=${PROCESS_PARM}" | grep java | grep -v grep | awk '{print $2}' |while read pid
 do
   kill -9 ${pid} 2>&1 >/dev/null
   echo "stopped ${PROCESS_PARM} success PID:${pid} "
 done

elif [ "$COMMAND" = "start" ] ;

then


 if [ ! -x logs ];then
  mkdir logs
 fi
 export EXEC=${PROCESS_PARM}.jar
 export CLASSPATH=.:./config/:${EXEC}
 export JAVA_OPS="-Djasypt.encryptor.password=${JASYPT_PASSWORD} -server -XX:PermSize=128m -XX:MaxPermSize=256m -Xms1g -Xmx1g -DappName=${PROCESS_PARM}"
 echo ${CLASSPATH}
 nohup java ${JAVA_OPS} -cp ${CLASSPATH} org.springframework.boot.loader.JarLauncher >logs/stdout 2>logs/err.log &


elif [ "$COMMAND" = "restart" ] ;

then

 ps -ef|grep "DappName=${PROCESS_PARM}" | grep java | grep -v grep | awk '{print $2}' |while read pid
 do
   kill -9 ${pid} 2>&1 >/dev/null
   echo "stopped ${PROCESS_PARM} success PID:${pid} "
 done

 if [ ! -x logs ];then
  mkdir logs
 fi
 export EXEC=${PROCESS_PARM}.jar
 export CLASSPATH=.:./config/:${EXEC}
 export JAVA_OPS="-Djasypt.encryptor.password=${JASYPT_PASSWORD} -server -XX:PermSize=128m -XX:MaxPermSize=256m -Xms1g -Xmx1g -DappName=${PROCESS_PARM}"
 echo ${CLASSPATH}
 nohup java ${JAVA_OPS} -cp ${CLASSPATH} org.springframework.boot.loader.JarLauncher >logs/stdout 2>logs/err.log &

else
 echo "please send the param  start/stop/restart"
fi