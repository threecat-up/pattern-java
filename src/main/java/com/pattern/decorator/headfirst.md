装饰者模式：动态地将责任附加到对象上。若要扩展功能，装饰者提供了比继承更有弹性的替代方案。

![decorator.png](..%2F..%2F..%2F..%2Fresources%2Fstatic%2Fheadfirst_img%2Fdecorator.png)

![decorator1.png](..%2F..%2F..%2F..%2Fresources%2Fstatic%2Fheadfirst_img%2Fdecorator1.png)

> 需要找到组件，组件和装饰者同一类型，可以利用继承，具体组件实现抽象组件。具体的
> 装饰者实现抽象的装饰者，里面需要记录组件的状态。例如javaIo