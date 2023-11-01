@echo off

cls
cd .\univ_mgmt
del *.class
javac -Xlint *.java
cd ..
java univ_mgmt.RunFile
