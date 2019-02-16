# Generics

- Nagsugod ni sa JDK 5 (hastang dugaya na September 2004 pa)
- Pwede gamiton ang *types* (classes and interfaces - walay labot Primitive types), as parameters kung mag buhat og classes, interfaces, and methods.
- **Type Parameters** ang tawag; katong normal na parameter ang tawag kay **Formal Parameters**
- **Type Parameters** -> Ang input kay *Types*; pero ang **Formal Parameters** ang inputs kay *Values*

## Unsay 'blema?
- Mas kusog nga type-checking at compile-time. Mas ok ni na ma detect ang compile-time errors kaysa ig run na (Runtime errors)
- Wa nay cast cast (kay possible mag run time error ig cast cast). Example nag set kag String sa class, unya ig kuha balik sa value, imong gi cast ang String into Integer (Dili ni compile time error pero ma detect ig runtime).
- Pede na mobuhat og generic algorithms

## References

[Why Use Generics?](https://docs.oracle.com/javase/tutorial/java/generics/why.html)