# SbtBuiltError
Simple project to show how the GenBCode option breaks sbt rebuilds

To reproduce follow these simple steps:

```
sbt
compile
clean
compile
```

You can find detailed debug logs on my machine [this debug file](./debug_errors.md).

Here is an example of the normal error output I see:

```
[info] Loading global plugins from ~/configs/.sbt/0.13/plugins/project
[info] Loading global plugins from ~/configs/.sbt/0.13/plugins
[info] Loading project definition from ~/devel/sbtError/project
[info] Set current project to root (in build file:~/devel/sbtError/)
> compile
[info] Updating {file:~/devel/sbtError/}root...
[info] Updating {file:~/devel/sbtError/}util...
[info] Resolving jline#jline;2.12.1 ...
[info] Done updating.
[info] Resolving org.scala-lang#scala-library;2.11.7 ...
[info] Updating {file:~/devel/sbtError/}core...
[info] Resolving org.scala-lang#scala-compiler;2.11.7 ...
[info] Compiling 1 Scala source to ~/devel/sbtError/util/target/scala-2.11/classes...
[info] Resolving jline#jline;2.12.1 ...
[info] Done updating.
[info] Resolving jline#jline;2.12.1 ...
[info] Done updating.
[info] Compiling 1 Scala source to ~/devel/sbtError/core/target/scala-2.11/classes...
[success] Total time: 3 s, completed Oct 2, 2015 9:56:35 AM
> clean
[success] Total time: 0 s, completed Oct 2, 2015 9:56:36 AM
> compile
[info] Updating {file:~/devel/sbtError/}util...
[info] Updating {file:~/devel/sbtError/}root...
[info] Resolving jline#jline;2.12.1 ...
[info] Done updating.
[info] Resolving jline#jline;2.12.1 ...
[info] Done updating.
[info] Updating {file:~/devel/sbtError/}core...
[info] Resolving jline#jline;2.12.1 ...
[info] Done updating.
[info] Compiling 1 Scala source to ~/devel/sbtError/core/target/scala-2.11/classes...
[error] ~/devel/sbtError/core/src/main/scala/run/Main.scala:3: not found: object quick
[error] import quick.Globals
[error]        ^
[error] ~/devel/sbtError/core/src/main/scala/run/Main.scala:6: not found: value Globals
[error]  println(Globals.Name)
[error]          ^
[error] two errors found
[error] (core/compile:compileIncremental) Compilation failed
[error] Total time: 0 s, completed Oct 2, 2015 9:56:39 AM
```
