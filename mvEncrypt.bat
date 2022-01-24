set JAVA_HOME=C:\Program Files\Java\jdk1.8.0_201
set M2_HOME=C:\Program Files\apache-maven-3.6.0-bin\apache-maven-3.6.0
 
set PATH=%JAVA_HOME%\bin;%M2_HOME%\bin;C:\windows\system32;C:\windows
mvn jasypt:encrypt-value -Djasypt.encryptor.password=javatechie -Djasypt.plugin.value=drgmgrdba01
cmd / k