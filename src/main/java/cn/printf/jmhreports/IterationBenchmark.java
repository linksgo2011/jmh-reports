package cn.printf.jmhreports;


import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.Throughput)
@Warmup(iterations = 3, time = 3)
@Measurement(iterations = 5, time = 5)
@Threads(8)
@Fork(1)
@OutputTimeUnit(TimeUnit.SECONDS)
public class IterationBenchmark {

    @Benchmark
    public void loopByFor() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        for (int i = 0; i < list.size(); i++) {
        }
    }

    @Benchmark
    public void loopByIterator() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Iterator<Integer> integerIterator = list.iterator();
        while (integerIterator.hasNext()) {
            integerIterator.next();
        }
    }

    @Benchmark
    public void loopByForeach() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        list.forEach((i) -> {

        });
    }
}
