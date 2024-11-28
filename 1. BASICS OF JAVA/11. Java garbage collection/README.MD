# Garbage Collection in Java

**Automated Cleanup:** Java automatically frees up memory used by unnecessary objects.

**Prevents Leaks:** Keeps the program running smoothly by preventing memory leaks.

**Developer-Friendly:** No manual memory management, making Java code cleaner and safer.

## Java Garbage Collector:

The Java garbage collector (GC) is an automatic memory management system that frees up memory by reclaiming space occupied by objects that are no longer in use by a program. In Java, obj. are dynamically allocated on the heap and over time, some obj. may no longer be reachable or needed by the application.

The garbage collector identifies these `garbage` obj. and deletes them to make room for new obj, thus preventing memeory leaks and ensuring efficient use of memory. 

The process is largely transparent to the programmer, although it can be influenced through various `GC` algorithms and parameters to optimize performance for specific use cases.