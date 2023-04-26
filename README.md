# pattern-java
>&emsp;More important than code is the design philosophy

---
# 设计模式的六大原则
1. 开闭原则：对扩展开放，对修改关闭
2. 里氏代换原则：任何基类可以出现的地方，子类一定可以出现
3. 依赖倒置原则：针对接口编程，依赖抽象而不依赖于具体
4. 接口隔离原则：使用多个隔离的接口，比使用单个接口好。
5. 迪米特法则：一个实体应当尽量少地与其他实体之间发生作用，使得系统功能模块相对独立。
6. 合成复用原则：尽量使用合成/聚合的方式，而不是使用继承。


---

# schedule Note

## 创建型模式

- [x] 工厂模式（Factory Pattern）
- [x] 抽象工厂模式（Abstract Factory Pattern）
- [x] 单例模式（Singleton Pattern）
- [x] 建造者模式（Builder Pattern）
- [x] 原型模式（Prototype Pattern）

## 结构型模式

- [x] 适配器模式（Adapter Pattern）
- [x] 桥接模式（Bridge Pattern）
- [x] 过滤器模式（Filter、Criteria Pattern）
- [x] 组合模式（Composite Pattern）
- [x] 装饰器模式（Decorator Pattern）
- [x] 外观模式（Facade Pattern）
- [x] 享元模式（Flyweight Pattern）
- [x] 代理模式（Proxy Pattern）

## 行为型模式

- [x] 责任链模式（Chain of Responsibility Pattern）
- [x] 命令模式（Command Pattern）
- [x] 解释器模式（Interpreter Pattern）
- [x] 迭代器模式（Iterator Pattern）
- [x] 中介者模式（Mediator Pattern）
- [x] 备忘录模式（Memento Pattern）
- [x] 观察者模式（Observer Pattern）
- [x] 状态模式（State Pattern）
- [x] 空对象模式（Null Object Pattern）
- [x] 策略模式（Strategy Pattern）
- [x] 模板模式（Template Pattern）
- [x] 访问者模式（Visitor Pattern）


---
## 设计原则
- 找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起。
- 针对接口编程(接口/抽象类，利用多态)，而不是针对实现编程
- 多用组合，少用继承
- 为了交互对象之间的松耦合而努力
- 类应该对扩展开放，对修改关闭
- 要依赖抽象，不要依赖具体类
- 最少知道原则要减少对象之间的交互，只和你的密友谈话
- 好莱坞原则：别调用我们，我们会调用你
- 一个类应该只有一个引起变化的原因

> 模式是在某种情境下，针对某问题的某种解决方案。


update 2023.4.26