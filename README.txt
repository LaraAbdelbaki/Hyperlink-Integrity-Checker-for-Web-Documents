Hyperlink integrity checker is a program that only takes two inputs, the main URL link, and the
depth desired. The main URL of the document is the link at which the check starts, and the
depth is to determine to which level we want to check our links, to prevent an indefinite
execution and to be as efficient as possible.
2Our program is multithreaded where the same resources may be accessed concurrently by
several flows of control, in order to provide an efficient program with the fastest execution
possible using the optimal number of threads.
The program takes input from the user the number of threads he desires to work concurrently,
this is a static way of getting the optimal number of threads for the best performance, as the
time is printed to the user after the execution.
Using the ExecutorService, it creates a reusable pool of threads that execute submitted tasks.
The service also manages a queue, which is used when there are more tasks than the number
of threads in the pool and there is a need to queue up tasks until there is a free thread available
to execute the task. Thread pools provide improved performance when working with a very
large number of tasks. Fixed thread pool executor creates a thread pool that reuses a
fixed number of threads to execute any number of tasks, the number of threads to
provide maximum efficiency changes from a device to another.

Credits:
Lara Abdelbaki
Nour Hesham 
