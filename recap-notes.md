# Assembly Assay Kata — Recap Notes

## 1. Nature of the Kata

- A deliberately and deceptively simple task: "print the characters of a line of text in order" — solved four ways in sequence:
  1. Prompt AI directly (natural language)
  2. Have AI write it in a high-level language
  3. Write it yourself in a high-level language
  4. Attempt to write it in a low-level language (C / Assembly)

- The ordering of phases was intentional: starting with natural language means ambiguity surfaces *organically*. If you started with assembly, you'd codify the solution immediately and never have the chance to notice how vague your original mental model was.

- Each phase exposed a different layer:
  - **Natural language**: hid specification gaps — the vagueness of the prompt went unnoticed until the AI produced inconsistent or unhelpful results
  - **High-level code**: forced precision about things like ordering mechanism (ASCII? alphabetical? does whitespace count? what about commas?), and other questions that feel obvious in English but must be decided in code
  - **Low-level code (C/Assembly)**: introduced accidental complexity unrelated to the domain (e.g., byte size of array elements for qsort, register management) — technical concerns that only exist because of the particulars of computing, not the problem itself

- The AI sometimes produced a plausible result, sometimes just echoed the input back — technically a valid interpretation of "print the characters in order." This produced a key insight: the AI wasn't wrong, the *prompt* was imprecise.

- Nondeterminism in AI output (everyone in the group got different results) made the ambiguity problem visceral, not theoretical.

---

## 2. Goals

- To explore whether the evolution from low-level to high-level language is *like* the evolution from high-level language to natural language — and what the answer means for how we should think about AI.

- There is genuine excitement: AI lowers the barrier to entry. Programmers have always been middlemen standing between a client and a product. If natural language can close that gap, that's worth celebrating.

- But there is also genuine fear: that this evolution is unlike the previous one in a damaging way. That people will misunderstand AI, abuse it, and treat it as a reliable and consistent source of truth when it isn't.

- The Dijkstra reference reframes the issue: his 1978 skepticism of natural language programming shows this isn't a new debate. The modern excitement around AI shouldn't be mistaken for something only now made possible by unprecedented brilliance — natural language programming was an avenue of research that wise engineers chose not to prioritize for decades. That frames using AI as an *engineering choice* with tradeoffs, not an obvious inevitability.

- My hoped-for "inescapable conclusion": AI is not inherently good or bad — nothing is, for an engineer. Everything has tradeoffs. AI is an *amplifier*. It amplifies good engineering and bad engineering equally. You can reach a working solution 10x faster, or make a turd mountain 10x faster.

- The goal was for participants to think critically and arrive at: **AI is a powerful tool for those with an engineering mindset, and a dangerous one without it.**

---

## 3. How the Kata Went

- *(To my delight)* almost everyone was familiar with the references in the README — Muratori, Dijkstra, HTMX/Carson Gross. The group arrived with context and quickly bought into the validity of the question.

- **Phase 1 (Natural language prompting)**: Went exactly as planned. Inconsistent, sometimes nonsensical results across the board. Mission accomplished.

- **Phase 2 (AI-written high-level code)**: AI still produced different programs from identical prompts, but participants found they could rapidly improve the output just by saying "please improve this." Key insight emerged: AI produces *inconsistent* output, but can produce an *artifact* (the code) that itself produces *consistent* output. Best of both worlds. Some groups let curiosity take over — comparing results across AI models and languages. Claude's Golang output impressed some people.

- **Phase 3 (Human-written C)**: Immediately lost the concept of "String" — just char[]. Reaction was both "I never thought about what a String actually *is*" and "this is annoying, I just want to solve the problem." Most people reached for qsort, which was the most straightforward path, but even that surfaced unexpected complexity (e.g., having to supply byte size of each element).

- **Phase 4 (Assembly)**: Most people compiled C to assembly using the provided tools rather than writing it by hand — including Chris Branch, who had assembly experience and was content to review the compiled output. Chris explained the String termination problem: in assembly, you need a delimiter to mark the end of a string, and the C family landed on null-termination — though other approaches exist. **Energy dipped here.** Assembly felt archaic, nebulous, and not worth taking on. *(I was hoping that Casey Muratori's claim that assembly is theoretically simpler than CSS may be true for a specific flavor — but I didn't do enough pre-work to make this work well in the kata).*

- **Discussion phase**: The group came together and surfaced several threads:
  - **Brandon Schenz** asked whether writing code may someday be like driving a manual transmission — something that maybe makes you "better," but that most people won't need to do.
  - **Charlie Retzler** raised the knowledge loss question: significant knowledge was already lost moving from low-level to high-level language. Is that dangerous or fine? Will the same happen moving from high-level to natural language? The counter-question: is it truly *lost*, or just retrievable when needed?
  - As the facilitator, the experience reminded me of Jurassic Park: awe, impressiveness, a sense of real power — followed by the Ian Malcolm observation: *"The scientists were so preoccupied wondering if they could, they never stopped to ask if they should."* (This is my reflection, not something the group explicitly said.)

---

## 4. What We Learned

- **Natural language has always been vague.** The group drew a parallel between prompting AI in natural language and receiving specs from clients in natural language. The imprecision problem isn't new to AI — stakeholders have always communicated vaguely, and programmers have always had to translate that into precision.

- **Accidental complexity is everywhere, and high-level languages are hiding it.** The group gained a greater appreciation for how much work languages are doing silently. This was primarily an intellectual appreciation — the practical edge (i.e., *you should know what your language is actually doing, because it can be silently expensive*) didn't fully surface in the time available, but it's worth naming. A good illustration (**not from the kata itself, but illustrative of the principle**): Python is slow due to interpreter overhead and dynamic typing, but NumPy sidesteps that by dropping into optimized C/Fortran — so a developer gets near-C performance without writing C. The programmer benefits from the abstraction but may not realize what's underneath, or what it's costing them when they don't have it.

- **High-level languages have measurable performance costs.** One group explicitly compared Golang output to equivalent assembly and observed a measurable performance difference. This is consistent with what the C-to-assembly compilation step revealed: the code you write in a high-level language isn't the whole story — the compiler and runtime are doing significant work that has real costs.

---

## 5. Real-World Application

- **AI is a tool, not a magic box.** It doesn't produce truth or correctness. It isn't something to fear either. Like any tool, it has strengths, weaknesses, and tradeoffs. The engineer's job is to understand those and use it accordingly.

- **Use AI's creativity, then codify the solution.** AI is good at filling in the gaps of your imagination — generating ideas, approaches, and starting points. But there's no need to have AI repeatedly re-derive the same solution. Do it once, understand it, codify it, and reuse it. Own the artifact.

- **Engineers have a responsibility to not let their skills atrophy.** The kata demonstrated that there are layers beneath the abstractions we rely on every day. The world may need engineers who can go "under the hood" — when the AI needs help, when something breaks at a low level, when the abstraction fails. That capability needs to be maintained.

- **AI democratizes prototyping.** Problems that were previously out of reach for non-programmers are now accessible. Anyone can prototype a solution. Engineers can then be brought in to build production-grade versions when the stakes require it. This is a net positive — it removes programmers as unnecessary middlemen for early-stage exploration, while preserving their role where engineering judgment truly matters.
