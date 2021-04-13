# Java 16 Record performance benchmark 

Purpose: Grasp the characteristic of dynamically generated methods in record classes like `equals(Object)` in the performance perspective.

## How to run the benchmark

```shell
$ mvn clean verify
$ java -jar target/benchmarks.jar
```

## Benchmark result in local

```
$ mvn -v
Java version: 16, vendor: Oracle Corporation, runtime: /Users/kengo/Library/Java/JavaVirtualMachines/openjdk-16/Contents/Home
```
```
# Run complete. Total time: 00:52:40

REMEMBER: The numbers below are just data. To gain reusable insights, you need to follow up on
why the numbers are the way they are. Use profilers (see -prof, -lprof), design factorial
experiments, perform baseline and negative tests that provide experimental control, make sure
the benchmarking environment is safe on JVM/OS/HW level, ask for reviews from the domain experts.
Do not assume the numbers tell you what you want them to tell.

Benchmark                                                   Mode  Cnt           Score           Error  Units
RecordHashcodeBenchmark.run1intDynamic                     thrpt   25  6547078032.946 ± 456359512.619  ops/s
RecordHashcodeBenchmark.run1intHardcode                    thrpt   25  4276048982.340 ±  68721669.619  ops/s
RecordHashcodeBenchmark.run254intDynamic                   thrpt   25     1099419.633 ±     17741.063  ops/s
RecordHashcodeBenchmark.run254intHardcode                  thrpt   25     1072711.597 ±     18971.773  ops/s
RecordHashcodeBenchmark.run254BigIntDynamic                thrpt   25      817134.904 ±     21710.458  ops/s
RecordHashcodeBenchmark.run254BigIntDynamicWithoutInline   thrpt   25      759613.044 ±     11972.392  ops/s
RecordHashcodeBenchmark.run254BigIntDynamicExclude         thrpt   25      752918.595 ±      7413.942  ops/s
RecordHashcodeBenchmark.run254BigIntHardcode               thrpt   25     2831884.684 ±     31135.930  ops/s
RecordHashcodeBenchmark.run254BigIntHardcodeWithoutInline  thrpt   25     2786571.890 ±     40666.025  ops/s
RecordHashcodeBenchmark.run254BigIntHardcodeExclude        thrpt   25     2408280.899 ±     61117.450  ops/s
```
