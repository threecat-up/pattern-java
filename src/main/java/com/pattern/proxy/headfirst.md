代理模式：
&emsp;为另一个对象提供一个替身或占位符以控制对这个对象的访问。


![proxy.png](..%2F..%2F..%2F..%2Fresources%2Fstatic%2Fheadfirst_img%2Fproxy.png)

![proxy1.png](..%2F..%2F..%2F..%2Fresources%2Fstatic%2Fheadfirst_img%2Fproxy1.png)

![proxy2.png](..%2F..%2F..%2F..%2Fresources%2Fstatic%2Fheadfirst_img%2Fproxy2.png)

> 远程代理：
> 远程代理可以作为另一个JVM上对象的本地代表。调用代理的方法，会被代理利用网络转发到远程执行，并且
> 结果会通过网络返回给代理，再由代理将结果转给客户。
> 
> 虚拟代理：
> 虚拟代理作为创建开销大的对象的代表。虚拟代理经常直到我们真正需要一个对象的时候才创建它。
> 当对象在创建前和创建中时，由虚拟代理来扮演对象的替身。对象创建后，代理就会将请求直接委托给
> 对象。
> 

> 使用Java API的代理，创建一个保护代理
> 防火墙代理
> 只能引用代理
> 缓存代理
> 同步代理
> 复杂隐藏代理
> 写入时复制代理

