#!/usr/bin/env bash

mvn clean package
java -jar ./target/benchmarks.jar -rf CSV

CSV_FILE="./jmh-result.csv"
OUTPUT_MD="./README.md"

echo "| Test |  Mode | OPS  |  Unit |" > $OUTPUT_MD
echo "|---|---|---|---|" | tee -a $OUTPUT_MD

cat $CSV_FILE| sed -ne '2,$p' | awk -F',' '{print "|" $1 "|"  $2 "|" $5 "|" $7 "|" }' | tee -a $OUTPUT_MD
