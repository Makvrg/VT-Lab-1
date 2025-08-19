#!/bin/bash

mkdir -p bin
javac -d bin src/com/example/laba/*.java
jar cvef com.example.laba.Lab1 Laba1.jar -C bin .

echo ".jar-файл успешно создан"