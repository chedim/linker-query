# linker-query
Implementation of XPath-like Linker-parser AST query language


#Example 

```
CoreFile//contextSection
```
Selects ContextSection field value from any Rule under root CoreFile Rule

```
//RuleInvocation[rule.name="fn!forEach"]/preceding-sibling
```
Selects all RuleInvocation Rules with rule name "fn!forEach"
