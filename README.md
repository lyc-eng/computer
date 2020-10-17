# computer
# JAVA-1
## 1.实验内容
+ 1.基本要求是完成教材P110页的第四题关于pc、cpu及其他模拟的程序。
+ 2.附加要求；类中定义不少于两个构造方法；每个类定义不少于两个属性，且属性的类型应该多样化；根据课堂中关于访问权限的内容，尝试定义属性的修饰符多样化，类中定义方法操作属性，避免直接通过类对象.属性的形式访问属性值；且定义的方法内应该有符合常理的逻辑判断尝试把本次实验的多个类放置在不同的包中，体会修饰符privare的用法。
## 2.硬盘设置
1. 设置硬盘对象，给硬盘对象设置amount，speed方法。
```
public class HardDisk {
	protected int amount;

	protected int speed;
```
## 3.实验方法

```
 public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setName(String name) {
       this.name = name;
   }
```
## 4.实例化对象
```
 cpu cpu = new cpu();
 HardDisk hd = new HardDisk();
 pc pc = new pc();

```
## 4.实验结果
```
cpu 品牌 AMD
cpu 速度 2200转
HardDisk 内存 200GB
HardDisk 转数 5400转
```
## 5.实验感想
1. 通过本次实验是我初步了解public、protected的使用方法。
2. 通过本次实验学会了Markdown的基本语法。
3. 学会了如何使用构造方法。

