问题:
当涉及 维护 时, 为了复用(reuse)而使用继承是不合适的.

例: 鸭子(基类)有 quack()和fly()方法, 但rubberDuck(子类)不该有fly()方法.woodDuck(子类)不该有fly()和quack()方法.


解决方案1: 使用接口flyable()及接口quackable().
优点: 解决了子类不该拥有基类的方法的问题.
缺点: 无法做到代码复用. 每个子类都要实现fly()方法, 而很多子类的fly()方法实现都是相同的.

设计原则:
把"变化"的部分封装起来, 让不变的部分不受影响.

设计原则2:
针对接口编程, 而不是针对实现.

设计原则3:
多用组合(composition), 少用继承(extend)

策略模式(Strategy Pattern)的正式定义:
策略模式定义了算法族, 让它们之间可以互相替换.
此模式让算法的变化独立于使用算法的客户.