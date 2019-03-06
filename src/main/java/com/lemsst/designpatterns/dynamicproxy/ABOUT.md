# Dynamic proxies
Gigamit ni sa Selenium

Kung naa kay existing class, kung gusto ka mo-add or mo mo-usab sa functionality, kani moy gamiton. 
Ang proxy moy gamiton, imbes na ang original. Kasagaran, ang proxy na Object pareho ra og methods sa original na object.
Sa Java na proxy, kasagaran mo extend sa original class. And proxy naa syay *handle* sa original na object dayon pwede niya tawagon ang mga methods gamit tong handle.

In this way, pede maka implement ani, maski di na usbon ang implementation sa class.
- Logging pagsugod og paghuman sa method call
- Pede extra checking sa arguments
- Mock ang behavior sa original class
- Implement *lazy-access*, (ulahi na iload) sa mga costly na resources

In practical applications, para ma sunod ang **Single responsibility princple**, ang **ANG PROXY CLASS DILI MO IMPLEMENT SA FUNCTIONALITY DIRECTLY.**
Ang proxy class, proxying ray buhaton, dayon ang actual na behavior kay gi implement sa mga **HANDLERS**.
Kung i-invoke ang proxy object imbes na ang original object, mo decide ang proxy kung i-execute niya ang original na method, or ang handler.
The handler may do its task and may also call the original method.

> The proxy class is generated during runtime, but the handler invoked during run-time can be coded in the normal
source code and compiled along with the whole program (compile time)

## Unsaon man pag code ani

1. Gamit ta og `java.lang.reflect.Proxy`
    - Can create a proxy class, or directly an instance of it
2. Implement `java.lang.InvocationHandler;` para ang proxy object ma invoke niya. 
    - Single method interface ni: `invoke(<Original object>, <Method invoked>, <Original arguments>)`

## Resources
- [Java Dynamic Proxy: What is a Proxy and How can We Use It](https://dzone.com/articles/java-dynamic-proxy)
- [Java Dynamic Proxy | Java Deep](https://javax0.wordpress.com/2016/01/20/java-dynamic-proxy/)