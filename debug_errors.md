```
[info] Loading global plugins from ~/configs/.sbt/0.13/plugins/project
[info] Loading global plugins from ~/configs/.sbt/0.13/plugins
[info] Loading project definition from ~/devel/sbtError/project
[info] Set current project to root (in build file:~/devel/sbtError/)
> debug
[debug] > shell
> compile
[debug] > compile
[debug] Evaluating tasks: util/compile:compile, core/compile:compile, root/compile:compile
[debug] Running task... Cancel: Null, check cycles: false, forcegc: true
[debug] Other repositories:
[debug] Default repositories:
[info] Updating {file:~/devel/sbtError/}util...
[info] Updating {file:~/devel/sbtError/}root...
[debug] Using inline dependencies specified in Scala.
[debug] no default cache defined: set to ~/.ivy2/cache
[debug] Other repositories:
[debug] Default repositories:
[info] :: resolving dependencies :: sbt.error#util_2.11;0.1.0
[info] 	confs: [compile, runtime, test, provided, optional, compile-internal, runtime-internal, test-internal, plugin, sources, docs, pom, scala-tool]
[debug] 	validate = true
[debug] 	refresh = false
[debug] resolving dependencies for configuration 'compile'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[info] Resolving org.scala-lang#scala-library;2.11.7 ...
[debug] sbt-chain: Checking cache for: sbt.ivyint.MergedDescriptors@4b370b58
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-library;2.11.7
[info] 	found org.scala-lang#scala-library;2.11.7 in sbt-chain
[info] 	[2.11.7] org.scala-lang#scala-library;2.11.7
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] resolving dependencies for configuration 'runtime'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] resolving dependencies for configuration 'test'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [test]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] resolving dependencies for configuration 'provided'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'optional'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [optional]
[debug] resolving dependencies for configuration 'compile-internal'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [compile-internal]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [optional]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'runtime-internal'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [runtime-internal]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [optional]
[debug] resolving dependencies for configuration 'test-internal'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [test-internal]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [test]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [optional]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'plugin'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [plugin]
[debug] resolving dependencies for configuration 'sources'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [sources]
[debug] resolving dependencies for configuration 'docs'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [docs]
[debug] resolving dependencies for configuration 'pom'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [pom]
[debug] resolving dependencies for configuration 'scala-tool'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [scala-tool]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->default]
[info] Resolving org.scala-lang#scala-compiler;2.11.7 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang#scala-compiler;2.11.7 {scala-tool=[default, optional(default)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-compiler;2.11.7
[info] 	found org.scala-lang#scala-compiler;2.11.7 in sbt-chain
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->default]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->optional(default)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->master(compile)]
[info] Resolving org.scala-lang#scala-reflect;2.11.7 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang#scala-reflect;2.11.7 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-reflect;2.11.7
[info] 	found org.scala-lang#scala-reflect;2.11.7 in sbt-chain
[info] 	[2.11.7] org.scala-lang#scala-reflect;2.11.7
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->master(compile)]
[info] Resolving org.scala-lang.modules#scala-xml_2.11;1.0.4 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang.modules#scala-xml_2.11;1.0.4 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang.modules#scala-xml_2.11;1.0.4
[info] 	found org.scala-lang.modules#scala-xml_2.11;1.0.4 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->compile]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->master(compile)]
[info] Resolving org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4
[info] 	found org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->compile]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [runtime->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->master]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->optional(default)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->jline#jline;2.12.1 [optional->master(compile)]
[info] Resolving jline#jline;2.12.1 ...
[debug] sbt-chain: Checking cache for: dependency: jline#jline;2.12.1 {optional=[compile(*), master(compile)]}
[debug] sbt-chain: module revision found in cache: jline#jline;2.12.1
[info] 	found jline#jline;2.12.1 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->jline#jline;2.12.1 [optional->compile(*)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->default]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->master]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->optional(default)]
[debug] 	resolved ivy file produced in cache
[debug] :: downloading artifacts ::
[debug] 	[NOT REQUIRED] org.scala-lang#scala-library;2.11.7!scala-library.jar
[debug] 	[NOT REQUIRED] org.scala-lang#scala-compiler;2.11.7!scala-compiler.jar
[debug] 	[NOT REQUIRED] org.scala-lang#scala-reflect;2.11.7!scala-reflect.jar
[debug] 	[NOT REQUIRED] org.scala-lang.modules#scala-xml_2.11;1.0.4!scala-xml_2.11.jar(bundle)
[debug] 	[NOT REQUIRED] org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4!scala-parser-combinators_2.11.jar(bundle)
[debug] 	[NOT REQUIRED] jline#jline;2.12.1!jline.jar
[info] :: resolution report :: resolve 201ms :: artifacts dl 7ms
[info] 	:: modules in use:
[info] 	jline#jline;2.12.1 from sbt-chain in [scala-tool]
[info] 	org.scala-lang#scala-compiler;2.11.7 from sbt-chain in [scala-tool]
[info] 	org.scala-lang#scala-library;2.11.7 from sbt-chain in [compile, runtime, test, compile-internal, runtime-internal, test-internal, scala-tool]
[info] 	org.scala-lang#scala-reflect;2.11.7 from sbt-chain in [scala-tool]
[info] 	org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 from sbt-chain in [scala-tool]
[info] 	org.scala-lang.modules#scala-xml_2.11;1.0.4 from sbt-chain in [scala-tool]
[info] 	:: evicted modules:
[info] 	org.scala-lang#scala-library;2.11.4 by [org.scala-lang#scala-library;2.11.7] in [scala-tool]
[debug] 	  in org.scala-lang.modules#scala-xml_2.11;1.0.4 with latest-revision
[info] 	org.scala-lang#scala-library;2.11.6 by [org.scala-lang#scala-library;2.11.7] in [scala-tool]
[debug] 	  in org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 with latest-revision
[info] 	---------------------------------------------------------------------
[info] 	|                  |            modules            ||   artifacts   |
[info] 	|       conf       | number| search|dwnlded|evicted|| number|dwnlded|
[info] 	---------------------------------------------------------------------
[info] 	|      compile     |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|      runtime     |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|       test       |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|     provided     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|     optional     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	| compile-internal |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	| runtime-internal |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|   test-internal  |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|      plugin      |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|      sources     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|       docs       |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|        pom       |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|    scala-tool    |   8   |   0   |   0   |   2   ||   6   |   0   |
[info] 	---------------------------------------------------------------------
[debug] 	report for sbt.error#util_2.11;0.1.0 compile produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-compile.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 runtime produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-runtime.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 test produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-test.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 provided produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-provided.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 optional produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-optional.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 compile-internal produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-compile-internal.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 runtime-internal produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-runtime-internal.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 test-internal produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-test-internal.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 plugin produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-plugin.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 sources produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-sources.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 docs produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-docs.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 pom produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-pom.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 scala-tool produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-scala-tool.xml
[debug] 	resolve done (201ms resolve - 7ms download)
[info] Done updating.
[debug] Using inline dependencies specified in Scala.
[info] :: resolving dependencies :: sbt.error#root_2.11;0.1.0
[info] 	confs: [compile, runtime, test, provided, optional, compile-internal, runtime-internal, test-internal, plugin, sources, docs, pom, scala-tool]
[debug] 	validate = true
[debug] 	refresh = false
[debug] resolving dependencies for configuration 'compile'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[info] Resolving org.scala-lang#scala-library;2.11.7 ...
[debug] sbt-chain: Checking cache for: sbt.ivyint.MergedDescriptors@4fccd154
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-library;2.11.7
[info] 	found org.scala-lang#scala-library;2.11.7 in sbt-chain
[info] 	[2.11.7] org.scala-lang#scala-library;2.11.7
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] resolving dependencies for configuration 'runtime'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[info] Updating {file:~/devel/sbtError/}core...
[debug] resolving dependencies for configuration 'test'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [test]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] no default cache defined: set to ~/.ivy2/cache
[debug] Other repositories:
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] Default repositories:
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] resolving dependencies for configuration 'provided'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'optional'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [optional]
[debug] resolving dependencies for configuration 'compile-internal'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [compile-internal]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [optional]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'runtime-internal'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [runtime-internal]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug]
[debug] Initial source changes:
[debug] 	removed:Set()
[debug] 	added: Set(~/devel/sbtError/util/src/main/scala/quick/Globals.scala)
[debug] 	modified: Set()
[debug] Invalidated products: Set()
[debug] External API changes: API Changes: Set()
[debug] Modified binary dependencies: Set()
[debug] Initial directly invalidated sources: Set(~/devel/sbtError/util/src/main/scala/quick/Globals.scala)
[debug]
[debug] Sources indirectly invalidated by:
[debug] 	product: Set()
[debug] 	binary dep: Set()
[debug] 	external source: Set()
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [optional]
[debug] resolving dependencies for configuration 'test-internal'
[debug] All initially invalidated sources: Set(~/devel/sbtError/util/src/main/scala/quick/Globals.scala)
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [test-internal]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [test]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [optional]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'plugin'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [plugin]
[debug] resolving dependencies for configuration 'sources'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [sources]
[debug] resolving dependencies for configuration 'docs'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [docs]
[debug] resolving dependencies for configuration 'pom'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [pom]
[debug] resolving dependencies for configuration 'scala-tool'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [scala-tool]
[debug] Recompiling all 1 sources: invalidated sources (1) exceeded 50.0% of all sources
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->default]
[info] Resolving org.scala-lang#scala-compiler;2.11.7 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang#scala-compiler;2.11.7 {scala-tool=[default, optional(default)]}
[info] Compiling 1 Scala source to ~/devel/sbtError/util/target/scala-2.11/classes...
[debug] Getting compiler-interface from component compiler for Scala 2.11.7
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-compiler;2.11.7
[info] 	found org.scala-lang#scala-compiler;2.11.7 in sbt-chain
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->runtime]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->default]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->optional(default)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->master(compile)]
[info] Resolving org.scala-lang#scala-reflect;2.11.7 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang#scala-reflect;2.11.7 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] no default cache defined: set to ~/.ivy2/cache
[debug] Other repositories:
[debug] Default repositories:
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-reflect;2.11.7
[info] 	found org.scala-lang#scala-reflect;2.11.7 in sbt-chain
[info] 	[2.11.7] org.scala-lang#scala-reflect;2.11.7
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->master(compile)]
[info] Resolving org.scala-lang.modules#scala-xml_2.11;1.0.4 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang.modules#scala-xml_2.11;1.0.4 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang.modules#scala-xml_2.11;1.0.4
[info] 	found org.scala-lang.modules#scala-xml_2.11;1.0.4 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->compile]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->master(compile)]
[info] Resolving org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4
[info] 	found org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->compile]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [runtime->compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->master]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->optional(default)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->jline#jline;2.12.1 [optional->master(compile)]
[info] Resolving jline#jline;2.12.1 ...
[debug] sbt-chain: Checking cache for: dependency: jline#jline;2.12.1 {optional=[compile(*), master(compile)]}
[debug] sbt-chain: module revision found in cache: jline#jline;2.12.1
[info] 	found jline#jline;2.12.1 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->jline#jline;2.12.1 [optional->compile(*)]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->default]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->runtime]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->master]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->optional(default)]
[debug] 	resolved ivy file produced in cache
[debug] :: downloading artifacts ::
[debug] 	[NOT REQUIRED] org.scala-lang#scala-library;2.11.7!scala-library.jar
[debug] 	[NOT REQUIRED] org.scala-lang#scala-compiler;2.11.7!scala-compiler.jar
[debug] 	[NOT REQUIRED] org.scala-lang#scala-reflect;2.11.7!scala-reflect.jar
[debug] 	[NOT REQUIRED] org.scala-lang.modules#scala-xml_2.11;1.0.4!scala-xml_2.11.jar(bundle)
[debug] 	[NOT REQUIRED] org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4!scala-parser-combinators_2.11.jar(bundle)
[debug] 	[NOT REQUIRED] jline#jline;2.12.1!jline.jar
[info] :: resolution report :: resolve 111ms :: artifacts dl 5ms
[info] 	:: modules in use:
[info] 	jline#jline;2.12.1 from sbt-chain in [scala-tool]
[info] 	org.scala-lang#scala-compiler;2.11.7 from sbt-chain in [scala-tool]
[info] 	org.scala-lang#scala-library;2.11.7 from sbt-chain in [compile, runtime, test, compile-internal, runtime-internal, test-internal, scala-tool]
[info] 	org.scala-lang#scala-reflect;2.11.7 from sbt-chain in [scala-tool]
[info] 	org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 from sbt-chain in [scala-tool]
[info] 	org.scala-lang.modules#scala-xml_2.11;1.0.4 from sbt-chain in [scala-tool]
[info] 	:: evicted modules:
[info] 	org.scala-lang#scala-library;2.11.4 by [org.scala-lang#scala-library;2.11.7] in [scala-tool]
[debug] 	  in org.scala-lang.modules#scala-xml_2.11;1.0.4 with latest-revision
[info] 	org.scala-lang#scala-library;2.11.6 by [org.scala-lang#scala-library;2.11.7] in [scala-tool]
[debug] 	  in org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 with latest-revision
[info] 	---------------------------------------------------------------------
[info] 	|                  |            modules            ||   artifacts   |
[info] 	|       conf       | number| search|dwnlded|evicted|| number|dwnlded|
[info] 	---------------------------------------------------------------------
[info] 	|      compile     |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|      runtime     |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|       test       |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|     provided     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|     optional     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	| compile-internal |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	| runtime-internal |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|   test-internal  |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|      plugin      |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|      sources     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|       docs       |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|        pom       |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|    scala-tool    |   8   |   0   |   0   |   2   ||   6   |   0   |
[info] 	---------------------------------------------------------------------
[debug] 	report for sbt.error#root_2.11;0.1.0 compile produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-compile.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 runtime produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-runtime.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 test produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-test.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 provided produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-provided.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 optional produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-optional.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 compile-internal produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-compile-internal.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 runtime-internal produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-runtime-internal.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 test-internal produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-test-internal.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 plugin produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-plugin.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 sources produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-sources.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 docs produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-docs.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 pom produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-pom.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 scala-tool produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-scala-tool.xml
[debug] 	resolve done (111ms resolve - 5ms download)
[info] Done updating.
[debug] Using inline dependencies specified in Scala.
[info] :: resolving dependencies :: sbt.error#core_2.11;0.1.0
[info] 	confs: [compile, runtime, test, provided, optional, compile-internal, runtime-internal, test-internal, plugin, sources, docs, pom, scala-tool]
[debug] 	validate = true
[debug] 	refresh = false
[debug] resolving dependencies for configuration 'compile'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[info] Resolving org.scala-lang#scala-library;2.11.7 ...
[debug] sbt-chain: Checking cache for: sbt.ivyint.MergedDescriptors@6e5847fa
[debug]
[debug] Initial source changes:
[debug] 	removed:Set()
[debug] 	added: Set()
[debug] 	modified: Set()
[debug] Invalidated products: Set()
[debug] External API changes: API Changes: Set()
[debug] Modified binary dependencies: Set()
[debug] Initial directly invalidated sources: Set()
[debug]
[debug] Sources indirectly invalidated by:
[debug] 	product: Set()
[debug] 	binary dep: Set()
[debug] 	external source: Set()
[debug] All initially invalidated sources: Set()
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-library;2.11.7
[info] 	found org.scala-lang#scala-library;2.11.7 in sbt-chain
[info] 	[2.11.7] org.scala-lang#scala-library;2.11.7
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->sbt.error#util_2.11;0.1.0 [compile->default(compile)]
[info] Resolving sbt.error#util_2.11;0.1.0 ...
[debug] sbt-chain: Checking cache for: dependency: sbt.error#util_2.11;0.1.0 {compile=[default(compile)]}
[info] 	found sbt.error#util_2.11;0.1.0 in inter-project
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] resolving dependencies for configuration 'runtime'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->sbt.error#util_2.11;0.1.0 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] resolving dependencies for configuration 'test'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [test]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->sbt.error#util_2.11;0.1.0 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] resolving dependencies for configuration 'provided'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'optional'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [optional]
[debug] resolving dependencies for configuration 'compile-internal'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [compile-internal]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->sbt.error#util_2.11;0.1.0 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [optional]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'runtime-internal'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [runtime-internal]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->sbt.error#util_2.11;0.1.0 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [optional]
[debug] resolving dependencies for configuration 'test-internal'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [test-internal]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [test]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->sbt.error#util_2.11;0.1.0 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [optional]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'plugin'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [plugin]
[debug] resolving dependencies for configuration 'sources'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [sources]
[debug] resolving dependencies for configuration 'docs'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [docs]
[debug] resolving dependencies for configuration 'pom'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [pom]
[debug] resolving dependencies for configuration 'scala-tool'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [scala-tool]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->default]
[info] Resolving org.scala-lang#scala-compiler;2.11.7 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang#scala-compiler;2.11.7 {scala-tool=[default, optional(default)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-compiler;2.11.7
[info] 	found org.scala-lang#scala-compiler;2.11.7 in sbt-chain
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->runtime]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->default]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->optional(default)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->master(compile)]
[info] Resolving org.scala-lang#scala-reflect;2.11.7 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang#scala-reflect;2.11.7 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-reflect;2.11.7
[info] 	found org.scala-lang#scala-reflect;2.11.7 in sbt-chain
[info] 	[2.11.7] org.scala-lang#scala-reflect;2.11.7
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->master(compile)]
[info] Resolving org.scala-lang.modules#scala-xml_2.11;1.0.4 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang.modules#scala-xml_2.11;1.0.4 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang.modules#scala-xml_2.11;1.0.4
[info] 	found org.scala-lang.modules#scala-xml_2.11;1.0.4 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->compile]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->master(compile)]
[info] Resolving org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4
[info] 	found org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->compile]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [runtime->compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->master]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->optional(default)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->jline#jline;2.12.1 [optional->master(compile)]
[info] Resolving jline#jline;2.12.1 ...
[debug] sbt-chain: Checking cache for: dependency: jline#jline;2.12.1 {optional=[compile(*), master(compile)]}
[debug] sbt-chain: module revision found in cache: jline#jline;2.12.1
[info] 	found jline#jline;2.12.1 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->jline#jline;2.12.1 [optional->compile(*)]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->default]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->runtime]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->master]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->optional(default)]
[debug] 	resolved ivy file produced in cache
[debug] :: downloading artifacts ::
[debug] 	[NOT REQUIRED] org.scala-lang#scala-library;2.11.7!scala-library.jar
[debug] 	[NOT REQUIRED] org.scala-lang#scala-compiler;2.11.7!scala-compiler.jar
[debug] 	[NOT REQUIRED] org.scala-lang#scala-reflect;2.11.7!scala-reflect.jar
[debug] 	[NOT REQUIRED] org.scala-lang.modules#scala-xml_2.11;1.0.4!scala-xml_2.11.jar(bundle)
[debug] 	[NOT REQUIRED] org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4!scala-parser-combinators_2.11.jar(bundle)
[debug] 	[NOT REQUIRED] jline#jline;2.12.1!jline.jar
[info] :: resolution report :: resolve 118ms :: artifacts dl 4ms
[info] 	:: modules in use:
[info] 	jline#jline;2.12.1 from sbt-chain in [scala-tool]
[info] 	org.scala-lang#scala-compiler;2.11.7 from sbt-chain in [scala-tool]
[info] 	org.scala-lang#scala-library;2.11.7 from sbt-chain in [compile, runtime, test, compile-internal, runtime-internal, test-internal, scala-tool]
[info] 	org.scala-lang#scala-reflect;2.11.7 from sbt-chain in [scala-tool]
[info] 	org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 from sbt-chain in [scala-tool]
[info] 	org.scala-lang.modules#scala-xml_2.11;1.0.4 from sbt-chain in [scala-tool]
[info] 	sbt.error#util_2.11;0.1.0 from inter-project in [compile, runtime, test, compile-internal, runtime-internal, test-internal]
[info] 	:: evicted modules:
[info] 	org.scala-lang#scala-library;2.11.4 by [org.scala-lang#scala-library;2.11.7] in [scala-tool]
[debug] 	  in org.scala-lang.modules#scala-xml_2.11;1.0.4 with latest-revision
[info] 	org.scala-lang#scala-library;2.11.6 by [org.scala-lang#scala-library;2.11.7] in [scala-tool]
[debug] 	  in org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 with latest-revision
[info] 	---------------------------------------------------------------------
[info] 	|                  |            modules            ||   artifacts   |
[info] 	|       conf       | number| search|dwnlded|evicted|| number|dwnlded|
[info] 	---------------------------------------------------------------------
[info] 	|      compile     |   2   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|      runtime     |   2   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|       test       |   2   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|     provided     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|     optional     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	| compile-internal |   2   |   0   |   0   |   0   ||   1   |   0   |
[info] 	| runtime-internal |   2   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|   test-internal  |   2   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|      plugin      |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|      sources     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|       docs       |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|        pom       |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|    scala-tool    |   8   |   0   |   0   |   2   ||   6   |   0   |
[info] 	---------------------------------------------------------------------
[debug] 	report for sbt.error#core_2.11;0.1.0 compile produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-compile.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 runtime produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-runtime.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 test produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-test.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 provided produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-provided.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 optional produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-optional.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 compile-internal produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-compile-internal.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 runtime-internal produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-runtime-internal.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 test-internal produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-test-internal.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 plugin produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-plugin.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 sources produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-sources.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 docs produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-docs.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 pom produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-pom.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 scala-tool produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-scala-tool.xml
[debug] 	resolve done (118ms resolve - 4ms download)
[info] Done updating.
[debug] Getting compiler-interface from component compiler for Scala 2.11.7
[debug] Other repositories:
[debug] Default repositories:
[debug] Running cached compiler 7c38a040, interfacing (CompilerInterface) with Scala compiler version 2.11.7
[debug] Calling Scala compiler with arguments  (CompilerInterface):
[debug] 	-Ybackend:GenBCode
[debug] 	-bootclasspath
[debug] 	/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/classes:~/.ivy2/cache/org.scala-lang/scala-library/jars/scala-library-2.11.7.jar
[debug] 	-classpath
[debug] 	~/devel/sbtError/util/target/scala-2.11/classes
[debug] Scala compilation took 1.67405172 s
[debug] Invalidating ~/devel/sbtError/util/src/main/scala/quick/Globals.scala...
[debug] Invalidating (transitively) by inheritance from ~/devel/sbtError/util/src/main/scala/quick/Globals.scala...
[debug] Initial set of included nodes: Set(~/devel/sbtError/util/src/main/scala/quick/Globals.scala)
[debug] Invalidated by transitive inheritance dependency: Set(~/devel/sbtError/util/src/main/scala/quick/Globals.scala)
[debug] The ~/devel/sbtError/util/src/main/scala/quick/Globals.scala source file has the following regular definitions changed:
[debug] 	notify, wait, Name, $asInstanceOf, equals, asInstanceOf, Globals, synchronized, $isInstanceOf, notifyAll, isInstanceOf, ==, clone, toString, !=, getClass, ne, eq, ##, finalize, hashCode.
[debug] All member reference dependencies will be considered within this context.
[debug] New invalidations:
[debug] 	Set()
[debug] Initial set of included nodes: Set()
[debug] Previously invalidated, but (transitively) depend on new invalidations:
[debug] 	Set()
[debug] All newly invalidated sources after taking into account (previously) recompiled sources:Set()
[debug] Copy resource mappings:
[debug]
[debug]
[debug] Initial source changes:
[debug] 	removed:Set()
[debug] 	added: Set(~/devel/sbtError/core/src/main/scala/run/Main.scala)
[debug] 	modified: Set()
[debug] Invalidated products: Set()
[debug] External API changes: API Changes: Set()
[debug] Modified binary dependencies: Set()
[debug] Initial directly invalidated sources: Set(~/devel/sbtError/core/src/main/scala/run/Main.scala)
[debug]
[debug] Sources indirectly invalidated by:
[debug] 	product: Set()
[debug] 	binary dep: Set()
[debug] 	external source: Set()
[debug] All initially invalidated sources: Set(~/devel/sbtError/core/src/main/scala/run/Main.scala)
[debug] Recompiling all 1 sources: invalidated sources (1) exceeded 50.0% of all sources
[info] Compiling 1 Scala source to ~/devel/sbtError/core/target/scala-2.11/classes...
[debug] Getting compiler-interface from component compiler for Scala 2.11.7
[debug] Other repositories:
[debug] Default repositories:
[debug] Getting compiler-interface from component compiler for Scala 2.11.7
[debug] Other repositories:
[debug] Default repositories:
[debug] Running cached compiler 2d4bbe36, interfacing (CompilerInterface) with Scala compiler version 2.11.7
[debug] Calling Scala compiler with arguments  (CompilerInterface):
[debug] 	-Ybackend:GenBCode
[debug] 	-bootclasspath
[debug] 	/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/classes:~/.ivy2/cache/org.scala-lang/scala-library/jars/scala-library-2.11.7.jar
[debug] 	-classpath
[debug] 	~/devel/sbtError/core/target/scala-2.11/classes:~/devel/sbtError/util/target/scala-2.11/classes
[debug] Scala compilation took 0.808994393 s
[debug] Invalidating ~/devel/sbtError/core/src/main/scala/run/Main.scala...
[debug] Invalidating (transitively) by inheritance from ~/devel/sbtError/core/src/main/scala/run/Main.scala...
[debug] Initial set of included nodes: Set(~/devel/sbtError/core/src/main/scala/run/Main.scala)
[debug] Invalidated by transitive inheritance dependency: Set(~/devel/sbtError/core/src/main/scala/run/Main.scala)
[debug] The ~/devel/sbtError/core/src/main/scala/run/Main.scala source file has the following regular definitions changed:
[debug] 	notify, wait, $asInstanceOf, equals, asInstanceOf, executionStart, synchronized, $isInstanceOf, main, notifyAll, isInstanceOf, ==, clone, Main, toString, args, !=, getClass, ne, eq, delayedInit, ##, finalize, hashCode.
[debug] All member reference dependencies will be considered within this context.
[debug] New invalidations:
[debug] 	Set()
[debug] Initial set of included nodes: Set()
[debug] Previously invalidated, but (transitively) depend on new invalidations:
[debug] 	Set()
[debug] All newly invalidated sources after taking into account (previously) recompiled sources:Set()
[success] Total time: 3 s, completed Oct 2, 2015 9:44:08 AM
[debug] > shell
> clean
[debug] > clean
[debug] Evaluating tasks: util/*:clean, core/*:clean, root/*:clean
[debug] Running task... Cancel: Null, check cycles: false, forcegc: true
[debug] Other repositories:
[debug] Default repositories:
[debug] Using inline dependencies specified in Scala.
[debug] no default cache defined: set to ~/.ivy2/cache
[debug] no default cache defined: set to ~/.ivy2/cache
[debug] Other repositories:
[debug] Other repositories:
[debug] Default repositories:
[debug] Using inline dependencies specified in Scala.
[debug] Default repositories:
[debug] Using inline dependencies specified in Scala.
[success] Total time: 0 s, completed Oct 2, 2015 9:44:09 AM
[debug] > shell
> compile
[debug] > compile
[debug] Evaluating tasks: util/compile:compile, core/compile:compile, root/compile:compile
[debug] Running task... Cancel: Null, check cycles: false, forcegc: true
[debug] Other repositories:
[info] Updating {file:~/devel/sbtError/}util...
[info] Updating {file:~/devel/sbtError/}root...
[debug] Default repositories:
[debug] no default cache defined: set to ~/.ivy2/cache
[debug] Using inline dependencies specified in Scala.
[debug] Other repositories:
[debug] Default repositories:
[debug] Using inline dependencies specified in Scala.
[info] :: resolving dependencies :: sbt.error#root_2.11;0.1.0
[info] 	confs: [compile, runtime, test, provided, optional, compile-internal, runtime-internal, test-internal, plugin, sources, docs, pom, scala-tool]
[debug] 	validate = true
[debug] 	refresh = false
[debug] resolving dependencies for configuration 'compile'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[info] Resolving org.scala-lang#scala-library;2.11.7 ...
[debug] sbt-chain: Checking cache for: sbt.ivyint.MergedDescriptors@334c2e28
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-library;2.11.7
[info] 	found org.scala-lang#scala-library;2.11.7 in sbt-chain
[info] 	[2.11.7] org.scala-lang#scala-library;2.11.7
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] resolving dependencies for configuration 'runtime'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] resolving dependencies for configuration 'test'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [test]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] resolving dependencies for configuration 'provided'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'optional'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [optional]
[debug] resolving dependencies for configuration 'compile-internal'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [compile-internal]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [optional]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'runtime-internal'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [runtime-internal]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [optional]
[debug] resolving dependencies for configuration 'test-internal'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [test-internal]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [test]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [optional]
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'plugin'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [plugin]
[debug] resolving dependencies for configuration 'sources'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [sources]
[debug] resolving dependencies for configuration 'docs'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [docs]
[debug] resolving dependencies for configuration 'pom'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [pom]
[debug] resolving dependencies for configuration 'scala-tool'
[debug] == resolving dependencies for sbt.error#root_2.11;0.1.0 [scala-tool]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->default]
[info] Resolving org.scala-lang#scala-compiler;2.11.7 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang#scala-compiler;2.11.7 {scala-tool=[default, optional(default)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-compiler;2.11.7
[info] 	found org.scala-lang#scala-compiler;2.11.7 in sbt-chain
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->runtime]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->default]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->optional(default)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->master(compile)]
[info] Resolving org.scala-lang#scala-reflect;2.11.7 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang#scala-reflect;2.11.7 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-reflect;2.11.7
[info] 	found org.scala-lang#scala-reflect;2.11.7 in sbt-chain
[info] 	[2.11.7] org.scala-lang#scala-reflect;2.11.7
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->master(compile)]
[info] Resolving org.scala-lang.modules#scala-xml_2.11;1.0.4 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang.modules#scala-xml_2.11;1.0.4 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang.modules#scala-xml_2.11;1.0.4
[info] 	found org.scala-lang.modules#scala-xml_2.11;1.0.4 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->compile]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->master(compile)]
[info] Resolving org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4
[info] 	found org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->compile]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [runtime->compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->master]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->optional(default)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->jline#jline;2.12.1 [optional->master(compile)]
[info] Resolving jline#jline;2.12.1 ...
[debug] sbt-chain: Checking cache for: dependency: jline#jline;2.12.1 {optional=[compile(*), master(compile)]}
[debug] sbt-chain: module revision found in cache: jline#jline;2.12.1
[info] 	found jline#jline;2.12.1 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->jline#jline;2.12.1 [optional->compile(*)]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->default]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->runtime]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->compile]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->master]
[debug] == resolving dependencies sbt.error#root_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->optional(default)]
[debug] 	resolved ivy file produced in cache
[debug] :: downloading artifacts ::
[debug] 	[NOT REQUIRED] org.scala-lang#scala-library;2.11.7!scala-library.jar
[debug] 	[NOT REQUIRED] org.scala-lang#scala-compiler;2.11.7!scala-compiler.jar
[debug] 	[NOT REQUIRED] org.scala-lang#scala-reflect;2.11.7!scala-reflect.jar
[debug] 	[NOT REQUIRED] org.scala-lang.modules#scala-xml_2.11;1.0.4!scala-xml_2.11.jar(bundle)
[debug] 	[NOT REQUIRED] org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4!scala-parser-combinators_2.11.jar(bundle)
[debug] 	[NOT REQUIRED] jline#jline;2.12.1!jline.jar
[info] :: resolution report :: resolve 93ms :: artifacts dl 4ms
[info] 	:: modules in use:
[info] 	jline#jline;2.12.1 from sbt-chain in [scala-tool]
[info] 	org.scala-lang#scala-compiler;2.11.7 from sbt-chain in [scala-tool]
[info] 	org.scala-lang#scala-library;2.11.7 from sbt-chain in [compile, runtime, test, compile-internal, runtime-internal, test-internal, scala-tool]
[info] 	org.scala-lang#scala-reflect;2.11.7 from sbt-chain in [scala-tool]
[info] 	org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 from sbt-chain in [scala-tool]
[info] 	org.scala-lang.modules#scala-xml_2.11;1.0.4 from sbt-chain in [scala-tool]
[info] 	:: evicted modules:
[info] 	org.scala-lang#scala-library;2.11.4 by [org.scala-lang#scala-library;2.11.7] in [scala-tool]
[debug] 	  in org.scala-lang.modules#scala-xml_2.11;1.0.4 with latest-revision
[info] 	org.scala-lang#scala-library;2.11.6 by [org.scala-lang#scala-library;2.11.7] in [scala-tool]
[debug] 	  in org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 with latest-revision
[info] 	---------------------------------------------------------------------
[info] 	|                  |            modules            ||   artifacts   |
[info] 	|       conf       | number| search|dwnlded|evicted|| number|dwnlded|
[info] 	---------------------------------------------------------------------
[info] 	|      compile     |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|      runtime     |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|       test       |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|     provided     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|     optional     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	| compile-internal |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	| runtime-internal |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|   test-internal  |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|      plugin      |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|      sources     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|       docs       |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|        pom       |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|    scala-tool    |   8   |   0   |   0   |   2   ||   6   |   0   |
[info] 	---------------------------------------------------------------------
[debug] 	report for sbt.error#root_2.11;0.1.0 compile produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-compile.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 runtime produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-runtime.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 test produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-test.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 provided produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-provided.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 optional produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-optional.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 compile-internal produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-compile-internal.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 runtime-internal produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-runtime-internal.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 test-internal produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-test-internal.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 plugin produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-plugin.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 sources produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-sources.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 docs produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-docs.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 pom produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-pom.xml
[debug] 	report for sbt.error#root_2.11;0.1.0 scala-tool produced in ~/devel/sbtError/target/resolution-cache/reports/sbt.error-root_2.11-scala-tool.xml
[debug] 	resolve done (93ms resolve - 4ms download)
[info] Done updating.
[info] :: resolving dependencies :: sbt.error#util_2.11;0.1.0
[info] 	confs: [compile, runtime, test, provided, optional, compile-internal, runtime-internal, test-internal, plugin, sources, docs, pom, scala-tool]
[debug] 	validate = true
[debug] 	refresh = false
[debug] resolving dependencies for configuration 'compile'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[info] Resolving org.scala-lang#scala-library;2.11.7 ...
[debug] sbt-chain: Checking cache for: sbt.ivyint.MergedDescriptors@3c79192e
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-library;2.11.7
[info] 	found org.scala-lang#scala-library;2.11.7 in sbt-chain
[info] 	[2.11.7] org.scala-lang#scala-library;2.11.7
[debug]
[debug] Initial source changes:
[debug] 	removed:Set()
[debug] 	added: Set()
[debug] 	modified: Set()
[debug] Invalidated products: Set()
[debug] External API changes: API Changes: Set()
[debug] Modified binary dependencies: Set()
[debug] Initial directly invalidated sources: Set()
[debug]
[debug] Sources indirectly invalidated by:
[debug] 	product: Set()
[debug] 	binary dep: Set()
[debug] 	external source: Set()
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] All initially invalidated sources: Set()
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] resolving dependencies for configuration 'runtime'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] resolving dependencies for configuration 'test'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [test]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] resolving dependencies for configuration 'provided'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'optional'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [optional]
[debug] resolving dependencies for configuration 'compile-internal'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [compile-internal]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [optional]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'runtime-internal'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [runtime-internal]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [optional]
[debug] resolving dependencies for configuration 'test-internal'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [test-internal]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [test]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [optional]
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'plugin'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [plugin]
[debug] resolving dependencies for configuration 'sources'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [sources]
[debug] resolving dependencies for configuration 'docs'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [docs]
[debug] resolving dependencies for configuration 'pom'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [pom]
[debug] resolving dependencies for configuration 'scala-tool'
[debug] == resolving dependencies for sbt.error#util_2.11;0.1.0 [scala-tool]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->default]
[info] Resolving org.scala-lang#scala-compiler;2.11.7 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang#scala-compiler;2.11.7 {scala-tool=[default, optional(default)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-compiler;2.11.7
[info] 	found org.scala-lang#scala-compiler;2.11.7 in sbt-chain
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->default]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->optional(default)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->master(compile)]
[info] Resolving org.scala-lang#scala-reflect;2.11.7 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang#scala-reflect;2.11.7 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-reflect;2.11.7
[info] 	found org.scala-lang#scala-reflect;2.11.7 in sbt-chain
[info] 	[2.11.7] org.scala-lang#scala-reflect;2.11.7
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->master(compile)]
[info] Resolving org.scala-lang.modules#scala-xml_2.11;1.0.4 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang.modules#scala-xml_2.11;1.0.4 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang.modules#scala-xml_2.11;1.0.4
[info] 	found org.scala-lang.modules#scala-xml_2.11;1.0.4 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->compile]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->master(compile)]
[info] Resolving org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4
[info] 	found org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->compile]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [runtime->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->master]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->optional(default)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->jline#jline;2.12.1 [optional->master(compile)]
[info] Resolving jline#jline;2.12.1 ...
[debug] sbt-chain: Checking cache for: dependency: jline#jline;2.12.1 {optional=[compile(*), master(compile)]}
[debug] sbt-chain: module revision found in cache: jline#jline;2.12.1
[info] 	found jline#jline;2.12.1 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->jline#jline;2.12.1 [optional->compile(*)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->default]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->master]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->optional(default)]
[debug] 	resolved ivy file produced in cache
[debug] :: downloading artifacts ::
[debug] 	[NOT REQUIRED] org.scala-lang#scala-library;2.11.7!scala-library.jar
[debug] 	[NOT REQUIRED] org.scala-lang#scala-compiler;2.11.7!scala-compiler.jar
[debug] 	[NOT REQUIRED] org.scala-lang#scala-reflect;2.11.7!scala-reflect.jar
[debug] 	[NOT REQUIRED] org.scala-lang.modules#scala-xml_2.11;1.0.4!scala-xml_2.11.jar(bundle)
[debug] 	[NOT REQUIRED] org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4!scala-parser-combinators_2.11.jar(bundle)
[debug] 	[NOT REQUIRED] jline#jline;2.12.1!jline.jar
[info] :: resolution report :: resolve 82ms :: artifacts dl 3ms
[info] 	:: modules in use:
[info] 	jline#jline;2.12.1 from sbt-chain in [scala-tool]
[info] 	org.scala-lang#scala-compiler;2.11.7 from sbt-chain in [scala-tool]
[info] 	org.scala-lang#scala-library;2.11.7 from sbt-chain in [compile, runtime, test, compile-internal, runtime-internal, test-internal, scala-tool]
[info] 	org.scala-lang#scala-reflect;2.11.7 from sbt-chain in [scala-tool]
[info] 	org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 from sbt-chain in [scala-tool]
[info] 	org.scala-lang.modules#scala-xml_2.11;1.0.4 from sbt-chain in [scala-tool]
[info] 	:: evicted modules:
[info] 	org.scala-lang#scala-library;2.11.4 by [org.scala-lang#scala-library;2.11.7] in [scala-tool]
[debug] 	  in org.scala-lang.modules#scala-xml_2.11;1.0.4 with latest-revision
[info] 	org.scala-lang#scala-library;2.11.6 by [org.scala-lang#scala-library;2.11.7] in [scala-tool]
[debug] 	  in org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 with latest-revision
[info] 	---------------------------------------------------------------------
[info] 	|                  |            modules            ||   artifacts   |
[info] 	|       conf       | number| search|dwnlded|evicted|| number|dwnlded|
[info] 	---------------------------------------------------------------------
[info] 	|      compile     |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|      runtime     |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|       test       |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|     provided     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|     optional     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	| compile-internal |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	| runtime-internal |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|   test-internal  |   1   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|      plugin      |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|      sources     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|       docs       |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|        pom       |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|    scala-tool    |   8   |   0   |   0   |   2   ||   6   |   0   |
[info] 	---------------------------------------------------------------------
[debug] 	report for sbt.error#util_2.11;0.1.0 compile produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-compile.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 runtime produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-runtime.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 test produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-test.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 provided produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-provided.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 optional produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-optional.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 compile-internal produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-compile-internal.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 runtime-internal produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-runtime-internal.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 test-internal produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-test-internal.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 plugin produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-plugin.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 sources produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-sources.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 docs produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-docs.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 pom produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-pom.xml
[debug] 	report for sbt.error#util_2.11;0.1.0 scala-tool produced in ~/devel/sbtError/util/target/resolution-cache/reports/sbt.error-util_2.11-scala-tool.xml
[debug] 	resolve done (82ms resolve - 3ms download)
[info] Done updating.
[info] Updating {file:~/devel/sbtError/}core...
[debug] Other repositories:
[debug] Default repositories:
[debug] Using inline dependencies specified in Scala.
[info] :: resolving dependencies :: sbt.error#core_2.11;0.1.0
[info] 	confs: [compile, runtime, test, provided, optional, compile-internal, runtime-internal, test-internal, plugin, sources, docs, pom, scala-tool]
[debug] 	validate = true
[debug] 	refresh = false
[debug] resolving dependencies for configuration 'compile'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[info] Resolving org.scala-lang#scala-library;2.11.7 ...
[debug] sbt-chain: Checking cache for: sbt.ivyint.MergedDescriptors@3c26f58b
[debug]
[debug] Initial source changes:
[debug] 	removed:Set()
[debug] 	added: Set()
[debug] 	modified: Set()
[debug] Invalidated products: Set()
[debug] External API changes: API Changes: Set()
[debug] Modified binary dependencies: Set()
[debug] Initial directly invalidated sources: Set()
[debug]
[debug] Sources indirectly invalidated by:
[debug] 	product: Set()
[debug] 	binary dep: Set()
[debug] 	external source: Set()
[debug] All initially invalidated sources: Set()
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-library;2.11.7
[info] 	found org.scala-lang#scala-library;2.11.7 in sbt-chain
[info] 	[2.11.7] org.scala-lang#scala-library;2.11.7
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->sbt.error#util_2.11;0.1.0 [compile->default(compile)]
[info] Resolving sbt.error#util_2.11;0.1.0 ...
[debug] sbt-chain: Checking cache for: dependency: sbt.error#util_2.11;0.1.0 {compile=[default(compile)]}
[info] 	found sbt.error#util_2.11;0.1.0 in inter-project
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] resolving dependencies for configuration 'runtime'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->sbt.error#util_2.11;0.1.0 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] resolving dependencies for configuration 'test'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [test]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->sbt.error#util_2.11;0.1.0 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] resolving dependencies for configuration 'provided'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'optional'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [optional]
[debug] resolving dependencies for configuration 'compile-internal'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [compile-internal]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->sbt.error#util_2.11;0.1.0 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [optional]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'runtime-internal'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [runtime-internal]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->sbt.error#util_2.11;0.1.0 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [optional]
[debug] resolving dependencies for configuration 'test-internal'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [test-internal]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [test]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [runtime]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->sbt.error#util_2.11;0.1.0 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->default(compile)]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies sbt.error#util_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [optional]
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [provided]
[debug] resolving dependencies for configuration 'plugin'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [plugin]
[debug] resolving dependencies for configuration 'sources'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [sources]
[debug] resolving dependencies for configuration 'docs'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [docs]
[debug] resolving dependencies for configuration 'pom'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [pom]
[debug] resolving dependencies for configuration 'scala-tool'
[debug] == resolving dependencies for sbt.error#core_2.11;0.1.0 [scala-tool]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->default]
[info] Resolving org.scala-lang#scala-compiler;2.11.7 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang#scala-compiler;2.11.7 {scala-tool=[default, optional(default)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-compiler;2.11.7
[info] 	found org.scala-lang#scala-compiler;2.11.7 in sbt-chain
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->runtime]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->default]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->runtime]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->optional(default)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->master(compile)]
[info] Resolving org.scala-lang#scala-reflect;2.11.7 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang#scala-reflect;2.11.7 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang#scala-reflect;2.11.7
[info] 	found org.scala-lang#scala-reflect;2.11.7 in sbt-chain
[info] 	[2.11.7] org.scala-lang#scala-reflect;2.11.7
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [compile->compile]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-reflect;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->master(compile)]
[info] Resolving org.scala-lang.modules#scala-xml_2.11;1.0.4 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang.modules#scala-xml_2.11;1.0.4 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang.modules#scala-xml_2.11;1.0.4
[info] 	found org.scala-lang.modules#scala-xml_2.11;1.0.4 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [compile->compile]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-xml_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->master(compile)]
[info] Resolving org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 ...
[debug] sbt-chain: Checking cache for: dependency: org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 {compile=[compile(*), master(compile)], runtime=[runtime(*)]}
[debug] sbt-chain: module revision found in cache: org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4
[info] 	found org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->master(compile)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [compile->compile(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [compile->compile]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.6 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-library;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang#scala-reflect;2.11.7 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-xml_2.11;1.0.4 [runtime->compile]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [runtime->runtime(*)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 [runtime->compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->master]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-compiler;2.11.7 [scala-tool->optional(default)]
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->jline#jline;2.12.1 [optional->master(compile)]
[info] Resolving jline#jline;2.12.1 ...
[debug] sbt-chain: Checking cache for: dependency: jline#jline;2.12.1 {optional=[compile(*), master(compile)]}
[debug] sbt-chain: module revision found in cache: jline#jline;2.12.1
[info] 	found jline#jline;2.12.1 in sbt-chain
[debug] == resolving dependencies org.scala-lang#scala-compiler;2.11.7->jline#jline;2.12.1 [optional->compile(*)]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->default]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->runtime]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->compile]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->master]
[debug] == resolving dependencies sbt.error#core_2.11;0.1.0->org.scala-lang#scala-library;2.11.7 [scala-tool->optional(default)]
[debug] 	resolved ivy file produced in cache
[debug] :: downloading artifacts ::
[debug] 	[NOT REQUIRED] org.scala-lang#scala-library;2.11.7!scala-library.jar
[debug] 	[NOT REQUIRED] org.scala-lang#scala-compiler;2.11.7!scala-compiler.jar
[debug] 	[NOT REQUIRED] org.scala-lang#scala-reflect;2.11.7!scala-reflect.jar
[debug] 	[NOT REQUIRED] org.scala-lang.modules#scala-xml_2.11;1.0.4!scala-xml_2.11.jar(bundle)
[debug] 	[NOT REQUIRED] org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4!scala-parser-combinators_2.11.jar(bundle)
[debug] 	[NOT REQUIRED] jline#jline;2.12.1!jline.jar
[info] :: resolution report :: resolve 65ms :: artifacts dl 2ms
[info] 	:: modules in use:
[info] 	jline#jline;2.12.1 from sbt-chain in [scala-tool]
[info] 	org.scala-lang#scala-compiler;2.11.7 from sbt-chain in [scala-tool]
[info] 	org.scala-lang#scala-library;2.11.7 from sbt-chain in [compile, runtime, test, compile-internal, runtime-internal, test-internal, scala-tool]
[info] 	org.scala-lang#scala-reflect;2.11.7 from sbt-chain in [scala-tool]
[info] 	org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 from sbt-chain in [scala-tool]
[info] 	org.scala-lang.modules#scala-xml_2.11;1.0.4 from sbt-chain in [scala-tool]
[info] 	sbt.error#util_2.11;0.1.0 from inter-project in [compile, runtime, test, compile-internal, runtime-internal, test-internal]
[info] 	:: evicted modules:
[info] 	org.scala-lang#scala-library;2.11.4 by [org.scala-lang#scala-library;2.11.7] in [scala-tool]
[debug] 	  in org.scala-lang.modules#scala-xml_2.11;1.0.4 with latest-revision
[info] 	org.scala-lang#scala-library;2.11.6 by [org.scala-lang#scala-library;2.11.7] in [scala-tool]
[debug] 	  in org.scala-lang.modules#scala-parser-combinators_2.11;1.0.4 with latest-revision
[info] 	---------------------------------------------------------------------
[info] 	|                  |            modules            ||   artifacts   |
[info] 	|       conf       | number| search|dwnlded|evicted|| number|dwnlded|
[info] 	---------------------------------------------------------------------
[info] 	|      compile     |   2   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|      runtime     |   2   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|       test       |   2   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|     provided     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|     optional     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	| compile-internal |   2   |   0   |   0   |   0   ||   1   |   0   |
[info] 	| runtime-internal |   2   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|   test-internal  |   2   |   0   |   0   |   0   ||   1   |   0   |
[info] 	|      plugin      |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|      sources     |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|       docs       |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|        pom       |   0   |   0   |   0   |   0   ||   0   |   0   |
[info] 	|    scala-tool    |   8   |   0   |   0   |   2   ||   6   |   0   |
[info] 	---------------------------------------------------------------------
[debug] 	report for sbt.error#core_2.11;0.1.0 compile produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-compile.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 runtime produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-runtime.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 test produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-test.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 provided produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-provided.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 optional produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-optional.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 compile-internal produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-compile-internal.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 runtime-internal produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-runtime-internal.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 test-internal produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-test-internal.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 plugin produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-plugin.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 sources produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-sources.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 docs produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-docs.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 pom produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-pom.xml
[debug] 	report for sbt.error#core_2.11;0.1.0 scala-tool produced in ~/devel/sbtError/core/target/resolution-cache/reports/sbt.error-core_2.11-scala-tool.xml
[debug] 	resolve done (65ms resolve - 2ms download)
[info] Done updating.
[debug] Copy resource mappings:
[debug]
[debug] Invalidating ~/devel/sbtError/util/target/scala-2.11/classes/quick/Globals$.class: could not find class quick.Globals$ on the classpath.
[debug] Invalidating ~/devel/sbtError/util/target/scala-2.11/classes/quick/Globals.class: could not find class quick.Globals on the classpath.
[debug]
[debug] Initial source changes:
[debug] 	removed:Set()
[debug] 	added: Set()
[debug] 	modified: Set()
[debug] Invalidated products: Set()
[debug] External API changes: API Changes: Set()
[debug] Modified binary dependencies: Set(~/devel/sbtError/util/target/scala-2.11/classes/quick/Globals$.class, ~/devel/sbtError/util/target/scala-2.11/classes/quick/Globals.class)
[debug] Initial directly invalidated sources: Set()
[debug]
[debug] Sources indirectly invalidated by:
[debug] 	product: Set()
[debug] 	binary dep: Set(~/devel/sbtError/core/src/main/scala/run/Main.scala)
[debug] 	external source: Set()
[debug] All initially invalidated sources: Set(~/devel/sbtError/core/src/main/scala/run/Main.scala)
[debug] Recompiling all 1 sources: invalidated sources (1) exceeded 50.0% of all sources
[info] Compiling 1 Scala source to ~/devel/sbtError/core/target/scala-2.11/classes...
[debug] Getting compiler-interface from component compiler for Scala 2.11.7
[debug] Other repositories:
[debug] Default repositories:
[debug] Getting compiler-interface from component compiler for Scala 2.11.7
[debug] Other repositories:
[debug] Default repositories:
[debug] Running cached compiler 2ebad80d, interfacing (CompilerInterface) with Scala compiler version 2.11.7
[debug] Calling Scala compiler with arguments  (CompilerInterface):
[debug] 	-Ybackend:GenBCode
[debug] 	-bootclasspath
[debug] 	/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/sunrsasign.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_45.jdk/Contents/Home/jre/classes:~/.ivy2/cache/org.scala-lang/scala-library/jars/scala-library-2.11.7.jar
[debug] 	-classpath
[debug] 	~/devel/sbtError/core/target/scala-2.11/classes:~/devel/sbtError/util/target/scala-2.11/classes
[error] ~/devel/sbtError/core/src/main/scala/run/Main.scala:3: not found: object quick
[error] import quick.Globals
[error]        ^
[error] ~/devel/sbtError/core/src/main/scala/run/Main.scala:6: not found: value Globals
[error]  println(Globals.Name)
[error]          ^
[error] two errors found
[debug] Compilation failed (CompilerInterface)
[error] (core/compile:compileIncremental) Compilation failed
[error] Total time: 1 s, completed Oct 2, 2015 9:44:12 AM
[debug] > shell
>
```
