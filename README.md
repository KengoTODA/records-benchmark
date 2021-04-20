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

Benchmark                                               Mode  Cnt           Score           Error  Units
RecordHashcodeBenchmark.run1intDynamic                 thrpt   25  7004288283.354 ± 296325291.238  ops/s
RecordHashcodeBenchmark.run1intHardcode                thrpt   25  7292129398.772 ±  15306165.441  ops/s
RecordHashcodeBenchmark.run254BigIntDynamic            thrpt   25      730667.288 ±     83301.429  ops/s
RecordHashcodeBenchmark.run254BigIntHardcode           thrpt   25     2837140.423 ±     30602.767  ops/s
RecordHashcodeBenchmark.run254intDynamic               thrpt   25     1053994.855 ±     26220.822  ops/s
RecordHashcodeBenchmark.run254intHardcode              thrpt   25    33426301.613 ±   1369534.791  ops/s
RecordHashcodeBenchmark.run254intHardcodeMethodAccess  thrpt   25    32188961.540 ±   1684152.801  ops/s
```

### Windows 10 (adoptopenjdk 16+36)

```
Benchmark                                               Mode  Cnt           Score           Error  Units
RecordHashcodeBenchmark.run1intDynamic                 thrpt   25  1743843753.226 ±  51586692.872  ops/s
RecordHashcodeBenchmark.run1intHardcode                thrpt   25  1772637842.250 ± 110599755.291  ops/s
RecordHashcodeBenchmark.run254BigIntDynamic            thrpt   25      178008.001 ±     26359.409  ops/s
RecordHashcodeBenchmark.run254BigIntHardcode           thrpt   25      689576.898 ±     30282.948  ops/s
RecordHashcodeBenchmark.run254intDynamic               thrpt   25      272436.073 ±     15712.528  ops/s
RecordHashcodeBenchmark.run254intHardcode              thrpt   25     4603760.043 ±    283529.753  ops/s
RecordHashcodeBenchmark.run254intHardcodeMethodAccess  thrpt   25     4142983.273 ±    433618.323  ops/s
```
