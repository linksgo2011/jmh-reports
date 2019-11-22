#!/usr/bin/env bash

mvn clean package
java -jar ./target/benchmarks.jar -rf CSV

CSV_FILE="./jmh-result.csv"
OUTPUT_MD="./README.md"
_README="./_README.md"

cat $_README > $OUTPUT_MD;

cat $CSV_FILE | sed -ne '2,$p' | awk -F',' '{print "|" $1 "|"  $2 "|" $5 "| ops/s |"}' | tee -a $OUTPUT_MD
