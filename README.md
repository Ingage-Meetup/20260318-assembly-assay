# Assembly Assay

## Goal

To answer the question: *Is the evolution from assembly language into high level language similar to the evolution of high level language into natural language?*

## Task:  

Given input from the user in a given format; print the input characters in order.

**Format**: Their first and last name separated with a space, followed by their birthday (MM/dd/yyyy), and punctuation representing the mood that they are in today.  
**Example Input**:  
`Matt Kuhn, 03/18/1993, ???`  
OR  
`Edsger Dijkstra, 05/11/1930, !!`  
ETC...  

### 1. **Natural Language**

1. Prompt the AI to do it and observe the results. **(~2mins)**
2. Clear the AI's context. Prompt the AI to do it again and observe the results. **(~2mins)**
3. Clear the AI's context. Prompt the AI to do it again and observe the results. **(~2mins)**

#### Questions for your consideration:

- Did the AI ask you any questions before executing the prompt?
- Has the AI's output been consistent?
- Did you tweak your prompt at each iteration? (You didn't have to, but you might have anyway). Why did you tweak your prompt? Did you get different output?
- What are the pros and cons of collaborating with the AI like this?

### 2. ** High Level Language **

1. Write it in your high level programming language of choice (Java, C#, JavaScript...). Run it and observe the results. **(~10mins)**
2. Have the AI write it in your high level programming language of choice (Java, C#, JavaScript...). Run it and observe the results. **(~3mins)**
3. Clear the AI's context. Have the AI write it again. Run it and observe the results. **(~3mins)**
4. Clear the AI's context. Have the AI write it again. Run it and observe the results. **(~3mins)**

#### Questions for your consideration:

- Did any new questions about the exact specifications of the program come up when you had to write it in a high level language?
- Did the AI ask you any questions before it wrote any code?
- The AI write the same code each time?

### 2. **High Level Language (C) to Low Level Language (Assembly)**

**Tools**
- [C and Assembly compilers](https://godbolt.org/)
- [Assembly examples](https://www.tutorialspoint.com/compilers/online-assembly-compiler.htm)
- [C examples](https://www.tutorialspoint.com/compilers/online-c-compiler.htm)

1. [Write it in C](https://godbolt.org/). **(~15mins)**
2. [Write it in assembly](https://godbolt.org/). **(~45mins)**
3. [Compile it from C to assembly](https://godbolt.org/). **(~2mins)**

#### Questions for your consideration:

- Did any new questions about the exact specifications of the program come up when you had to write it in a low level language?
- Did any new questions come up about how to write the program (not necessarily about specs)?
- When you write it in C, does it compile down to same assembly code each time you compile it? *(Obviously it does)*.

## Discuss

Is the evolution from low level language into high level language similar to the evolution of high level language into natural language?

- How is it similar?
- How is it different?
- What are the pros and cons of low level language, high level language, and natural language?

## Interesting Supplemental Material: 

- [98% of developers can’t program a computer](https://hal2020.com/2026/01/01/98-of-developers-cant-program-a-computer/) (2026, Hal Berenson)
- [If you can learn CSS, you can learn Assembly](https://youtu.be/qqUgl6pFx8Q?si=PNg38Wgsu5t2_LWR&t=2225). (2025, Casey Muratori)
- [On the foolishness of "natural language programming”](https://www.cs.utexas.edu/~EWD/transcriptions/EWD06xx/EWD667.html) (1978, Edsger W.Dijkstra)  
- [Is coding, prompting like assembly, high level coding?](https://htmx.org/essays/yes-and/#is-coding-prompting-like-assembly-high-level-coding) (2026, Carson Gross) 
