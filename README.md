# Formal_Systems_Modeling - Project information and citation guide. 
A. Mohsin, N. K. Janjua, S. M. S. Islam and M. A. Babar, "SAM-SoS: A Stochastic Software Architecture Modeling and Verification Approach for Complex System-of-Systems," in IEEE Access, vol. 8, pp. 177580-177603, 2020, doi: 10.1109/ACCESS.2020.3025934.

This repository is a part of our ongoing efforts to design a Hybrid stochastic modeling description for SoS Architectures. It contains some initial prototypes of the formal syntax, terminal rules based on Hybrid Stochastic process algebra originating from SPA and classes of Process Algebraic formalism.

The terminal rules have been defined considering underlying syntax and semantics. These are initial versions of the formal description. Further updates will be provided. Terminal rules have been defined using existing formal modeling representations, mainly Communicating Sequential Processes (CSP) from Compass Modeling Language (CML) pi-calculus (Pi- ADL), Calculus of Communicating Systems (CCS) & CCP (Sosadl). These further have been integrated into Stochastic Process Algebraic existing operators (SPA). The Architectural core concepts are inspired by class formal Architecture descriptions aimed for single systems modeling. The resulting modelng enriched with Stochastic concurrent compositional semantics are capabable to manage non-deterministic behaviors. Moreover are treated as modes Markovian Models with existing specialization of CTMC. In the future, we intend to extend with other Markov representations such as DTMC and MDP.

Note: This is an initial version of the formal modeling for SoS using Hybrid Stochastic Process Algebra. The HSF- generated DSL based models validation, scoping and automated code generation are also part of the ongoing research using EMF existing infrastructures. 

*** Future Research Directions from current state ****

We welcome all researchers who are interested in the following areas for formal modeling, model checking and simulations. 

- HSF Models Transformation to a custom built model checker (Instead of using PRISM or SPIN) we intend to develop its custom model checker with enhanced capabilities for performing stochastic model checking. 
           -    More specifically, we are interested in designing interfaces for describing temporal logic properties including (Functional and non-functional) for SoS architectural models. For this Plasma Lab or PAT model check, infrastructures could be utilized for custom-built model checkers design to perform Stocochastic SoS Architecture models verifications with the freedom to perform various analysis. 
           
-  HSF model transformations to DEVS formalism to perform Dynamis stochastic behavior analysis and Dynamic structural changes Analysis using a range of programming languages, especially Python built-in libraries for performing dynamic stochastic analysis. 

Various Statisitcal Analysis on the top of the stochastic model verifications and stohcastic Simulations can be considered for further validation of the software architecture analysis. For this following set of methods could be considered. 

-Statistical inference 
-Bayesian Statistics
- Data-Driven Analysis on the top of mechanistic modeling or the integration of the both.
