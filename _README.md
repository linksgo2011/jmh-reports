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
