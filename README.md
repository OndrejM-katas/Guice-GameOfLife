Guice-GameOfLife
==================
Research on Guice - Implement game of life in Java using Guice, potentially using other DI frameworks to compare

Steps to setup and run Guice
----------------------
1. Add Guice jar to the class path (as gradle dependency)
2. Create a Guice module by extending AbstractModule
3. Use Guice.createInjector to initiate Guice engine
4. Use Injector.getInstance of the initiated engine to retrieve instances with injected dependencies

See also [Guice getting started guide](https://github.com/google/guice/wiki/GettingStarted)