# Assembly Assay

Assembly Language Contrived Academic Exercises 

# Task:  

To use assembly language to accept user input and perform some calculations and String manipulation. 

# Goals 

- To re-familiarize us with the language on which our high-level languages are built. 
- Hopefully get some insight into what makes code performant (or not!). 
- To appreciate what we do not have to manually do by hand anymore. 

# Tools 

- [Tutorialispoint online compiler](https://www.tutorialspoint.com/compilers/online-assembly-compiler.htm). 
- Your favorite AI tool. (Or the built-in AI assistant.) 

# Inspiration: 

## (Blog post) [98% of developers can’t program a computer](https://hal2020.com/2026/01/01/98-of-developers-cant-program-a-computer/). 

In this blog post by [Hal Berenson](https://hal2020.com/about/) (whom I don’t know from Adam), the author points out that most developers cannot read or write low level code, such as that for a device driver. He doesn’t necessarily think that’s a bad thing. He points out that programming for it’s own sake is not the goal; getting things working is the goal. 

## (YouTube clip) [If you can learn CSS, you can learn Assembly](https://youtu.be/qqUgl6pFx8Q?si=PNg38Wgsu5t2_LWR&t=2225).

In this interview with [Casey Muratori](https://caseymuratori.com/about) (who I first heard of on the [Standup Podcast](https://open.spotify.com/show/01A062kejnXFkJE01bjN5J), but is also famous for his word in Rad Game Tools), Casey says that professional web developers have rightly followed a philosophy of JIT (just-in-time) learning. JIT because they have SO MUCH that they need to know all of which is constantly changing. However, web developers also skew away from having truly deep knowledge about computing in general, which prevents them from truly understanding performance. 

## Interesting Reading: 

- [On the foolishness of "natural language programming”](https://www.cs.utexas.edu/~EWD/transcriptions/EWD06xx/EWD667.html) (Edsger W.Dijkstra)  
- [Is coding, prompting like assembly, high level coding?](https://htmx.org/essays/yes-and/#is-coding-prompting-like-assembly-high-level-coding) (Carson Gross) 

# Task: 

1. Write *The Name Program* in assembly [here](https://www.tutorialspoint.com/compilers/online-assembly-compiler.htm) **(~45 MINUTES)**
2. Write *The Name Program* (only whatever you were able to do in assembly) in your favorite language. **(~5 MINUTES)**
3. Have *AI translate the assembly code into your favorite language. **(~5 MINUTES)**
4. Use a profiler to compare the performance of how the AI translated your assembly code with how you wrote it normally. (Might need to do 1_000x iterations to see a meaningful duration...) **(~15 MINUTES)**
5. Have the *AI translate it *back* into assembly code. Does it resemble what you originally came up with? **(~15 MINUTES)**
6. Use the remaining time to discuss as a group.

## *The Name Program* (Just get as far as you can in 45 minutes, don't spend too long on this).

Accept input from the user; their first and last name separated with a space. 

- Print it out. 
- Print out the first 5 characters. 
- Print out just the first name. 
- Print out just the last name. 
- Print out the length. 
- Print which is longer (their first name or their last name). 
- Print out their name uppercased. 
- Print out their name lowercased. 
- Print out their name reversed. 
- Print out their name where each letter is converted to its index in the alphabet (ex: a to zero, b to one, c to two). 
- Print out the letter that occurs earliest in the alphabet. 
- Print out their name shifted each letter forward in the alphabet by one letter (ex: a to b, b to c, wrap z to a).


* Disclaimer: Having AI translate back-and-forth between assembly and <your favorite programming language> won't be a perfect 1:1 *mapping* per se. But I don't know a better way.
