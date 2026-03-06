# Assembly Assay

Assembly Language Contrived Academic Exercises 

# Task:  

Given a spec for a single simple program:

1. Write it in assembly.
2. Write it in C.
   - Translate it from C to assembly.
3. Write it in your language of choice.
4. Prompt AI to do it (not to write it in code, just to do it).

# Goals 

- To re-familiarize us with the language on which our high-level languages are built. 
- Hopefully get some insight into what makes code performant (or not!). 
- To appreciate what we do not have to manually do by hand anymore.
- To answer the question: *Is the evolution from assembly language into high level language similar to the evolution of high level language into natural language?*

# Tools 

- [Assembly compiler](https://www.tutorialspoint.com/compilers/online-assembly-compiler.htm).
- [C compiler](https://www.tutorialspoint.com/compilers/online-c-compiler.htm).
- [C to Assembly converter](https://godbolt.org/).
- Your IDE of choice
- Perhaps a subscription to an AI coding tool or access to a free online tool.

# Inspiration: 

## (Blog post) [98% of developers can’t program a computer](https://hal2020.com/2026/01/01/98-of-developers-cant-program-a-computer/). 

In this blog post by [Hal Berenson](https://hal2020.com/about/) (whom I don’t know from Adam), the author points out that most developers cannot read or write low level code, such as that for a device driver. He doesn’t necessarily think that’s a bad thing. He points out that programming for it’s own sake is not the goal; getting things working is the goal. 

## (YouTube clip) [If you can learn CSS, you can learn Assembly](https://youtu.be/qqUgl6pFx8Q?si=PNg38Wgsu5t2_LWR&t=2225).

In this interview with [Casey Muratori](https://caseymuratori.com/about) (who I first heard of on the [Standup Podcast](https://open.spotify.com/show/01A062kejnXFkJE01bjN5J), but is also famous for his word in Rad Game Tools), Casey says that professional web developers have rightly followed a philosophy of JIT (just-in-time) learning. JIT because they have SO MUCH that they need to know all of which is constantly changing. However, web developers also skew away from having truly deep knowledge about computing in general, which prevents them from truly understanding performance. 

## Interesting Reading: 

- [On the foolishness of "natural language programming”](https://www.cs.utexas.edu/~EWD/transcriptions/EWD06xx/EWD667.html) (Edsger W.Dijkstra)  
- [Is coding, prompting like assembly, high level coding?](https://htmx.org/essays/yes-and/#is-coding-prompting-like-assembly-high-level-coding) (Carson Gross) 

# Task: 

1. Write *The Alpbahetizing Program* in [Assembly](https://www.tutorialspoint.com/compilers/online-assembly-compiler.htm) **(~45 MINUTES)**
2. Write *The Alpbahetizing Program* in [C](https://www.tutorialspoint.com/compilers/online-c-compiler.htm). **(~15 MINUTES)**
3. Use the web tool to [translate the C into Assembly](https://godbolt.org/). **(~5 MINUTES)**
4. Write *The Alpbahetizing Program* in your favorite language. **(~15 MINUTES)**
5. Prompt AI to do the *Alphabetizing Program*. (Not to write the code for it; just to do it).

## *The Alpbahetizing Program*

Accept input from the user; their first and last name separated with a space. 

- Print the characters in alphabetical order.
