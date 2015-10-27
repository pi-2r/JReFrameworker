---
layout: default
---

<center><img src="https://ben-holland.com/JReFrameworker/images/Java-Evil-Edition-Horizontal.jpg" alt="Java Evil Edition" style="max-width:100%;"></center>

## Background
This project aims to extend the work done by Erez Metula in his book [Managed Code Rootkits: Hooking into Runtime Environments](http://amzn.to/1LuFMaF). The work outlines a tool [ReFrameworker](https://appsec-labs.com/managed_code_rootkits) that claims to be a framework modification tool capable of performing *any* modification task, however the tool falls short in usability. Developing new attack modules is difficult as most users are not familiar with working in the intermediate representations (IR) required by the tool.  Worse yet, the ["write once, run anywhere"](https://en.wikipedia.org/wiki/Write_once,_run_anywhere) motto of managed languages is violated when dealing with runtime libraries, forcing the attacker to write new exploits for each target platform. The current version of ReFrameworker (version 1.1) does not have the ability to manipulate Java bytecode, although Erez Metula points out that the same techniques of using IRs such as [Soot's Jimple](https://sable.github.io/soot/) or the [Jasmin](http://jasmin.sourceforge.net/) assembler can be used to create Java MCRs.

## JReFrameworker
Since ReFrameworker is no longer maintained, this project aims to extend previous works by introducing JReFrameworker, a tool to produce MCR capabilities aimed at the Java Runtime Environment in a user-friendly way. 

JReFrameworker is an Eclipse plugin for creating and building projects that allow the user to write annotated Java source that is automatically merged or inserted into the runtime.  The framework supports developing and debugging attack modules directly in the Eclipse IDE. Working at the intended abstraction level of source code allows the attacker to "write once, exploit anywhere".

## Getting Started

Ready to get started?

1. First [install](/JReFrameworker/install) the JReFrameworker plugin.
2. Then check out the provided [tutorials](/JReFrameworker/tutorials) to get started hacking your first attack module.

## Source Code

Need additional resources?  Checkout the [Javadocs](/JReFrameworker/javadoc/index.html) or grab a copy of the [source](https://github.com/benjholla/JReFrameworker).