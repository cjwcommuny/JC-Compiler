# Compiler

## Goals

* Compile to jvm
* 

## Plan

- [ ] 单文件
- [ ] 调用 Java 函数
- [ ] 支持命名空间（对应为Java的类）



## 代码生成

### 预备

* 符号表：每个作用域的符号（包括函数）以及对应的类型和值
  * 作用域包括各种block（namespace，struct，function，loop-block，logic-block，pure-block）
* 每个函数、struct，namespace 的 JVM 汇编代码