## jmh-reports

A collection for java method performance testing report.

### why this repo?

When people are talking about Java code optimization, there is no explicit evidence for which optimize approach is better.

Now, it is.

###  What's the JMH?

> JMH is a Java harness for building, running, and analysing nano/micro/milli/macro benchmarks written in Java and other languages targetting the JVM.

Please refer to http://openjdk.java.net/projects/code-tools/jmh/ 

## explain

**Test**
 
A benchmark test e.g.

```java

    @Benchmark
    public void testSimpleString() {
        String s = "Hello world!";
        for (int i = 0; i < 10; i++) {
            s += s;
        }
    }
    
```

**Mode**

The measurement of result.

- thrpt, operations per unit of time.
- avgt, average time per per operation.
- sample, samples the time for each operation.
- ss, Single shot invocation time, use for cold-start.

**OPS**

The testing result.

**Unit**

TimeUnit, we are using SECONDS, jmh also supports nano/micro/milli/macro.

## reports

| Test |  Mode | OPS  |  Unit |
|---|---|---|---|
|"cn.printf.jmhreports.AutoBoxBenchmark.boxDataType"|"thrpt"|355604417.805517| ops/s |
|"cn.printf.jmhreports.AutoBoxBenchmark.primaryDataType"|"thrpt"|9761063096.208640| ops/s |
|"cn.printf.jmhreports.CacheValueBenchmark.getListSizeInLoopEveryTime"|"thrpt"|459046033.596957| ops/s |
|"cn.printf.jmhreports.CacheValueBenchmark.getListSizeInLoopOnlyOnce"|"thrpt"|401148897.059666| ops/s |
|"cn.printf.jmhreports.CollectionBenchmark.giveCertainInitialCapacityForCollection"|"thrpt"|12052785.967521| ops/s |
|"cn.printf.jmhreports.CollectionBenchmark.noCertainInitialCapacityForCollection"|"thrpt"|7711896.917781| ops/s |
|"cn.printf.jmhreports.LoopBenchmark.createObjectInLoop"|"thrpt"|8959981523.322378| ops/s |
|"cn.printf.jmhreports.LoopBenchmark.reuseObjectInLoop"|"thrpt"|9423782212.994150| ops/s |
|"cn.printf.jmhreports.PrimaryTypeToStringBenchmark.primaryTypeToStringByPlusOperator"|"thrpt"|17943203761.900680| ops/s |
|"cn.printf.jmhreports.PrimaryTypeToStringBenchmark.primaryTypeToStringByToStringMethod"|"thrpt"|400927115.576240| ops/s |
|"cn.printf.jmhreports.PrimaryTypeToStringBenchmark.primaryTypeToStringByValueOf"|"thrpt"|378502720.973468| ops/s |
|"cn.printf.jmhreports.StringBenchmark.constructStringByAssignment"|"thrpt"|231612.501336| ops/s |
|"cn.printf.jmhreports.StringBenchmark.constructStringByConstructor"|"thrpt"|225375.508034| ops/s |
|"cn.printf.jmhreports.StringBenchmark.constructStringByStringBuffer"|"thrpt"|67189869.040028| ops/s |
|"cn.printf.jmhreports.StringBenchmark.constructStringByStringBuilder"|"thrpt"|86735904.080835| ops/s |
