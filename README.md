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

Benchmark                                      Mode  Cnt           Score           Error  Units
RecordHashcodeBenchmark.run1intDynamic        thrpt   25  6879034315.055 ± 239851792.364  ops/s
RecordHashcodeBenchmark.run1intHardcode       thrpt   25  7054310189.771 ±  37903529.406  ops/s
RecordHashcodeBenchmark.run254BigIntDynamic   thrpt   25      798558.163 ±     18404.920  ops/s
RecordHashcodeBenchmark.run254BigIntHardcode  thrpt   25     2900873.565 ±     20482.536  ops/s
RecordHashcodeBenchmark.run254intDynamic      thrpt   25     1091044.748 ±     16836.073  ops/s
RecordHashcodeBenchmark.run254intHardcode     thrpt   25     1073427.437 ±     15358.230  ops/s
```
