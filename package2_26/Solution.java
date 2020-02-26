package package2_26;
//抽象类
//abstract class People{
//    //抽象方法
//    public abstract void work();
//}
//class Doctor extends People{
//    private String work;
//    public Doctor(String work) {
//        this.work=work;
//    }
//    //重写方法
//    @Override
//    public void work() {
//        System.out.println("我的职业是"+this.work);
//    }
//}
//
//class Lawyer extends People {
//    private String work;
//
//    public Lawyer(String work) {
//        this.work = work;
//    }
//
//    @Override
//    public void work() {
//        System.out.println("我的职业是" + this.work);
//    }
//}
//public class Solution {
//    public static void main(String[] args) {
//        Doctor doctor = new Doctor("医生")；
//        doctor.work();
//        Lawyer lawyer = new Lawyer("律师");
//        lawyer.work();
//    }
//}




class Animal {
    protected String name;
    public Animal(String name) {
        this.name = name;
    }
}
interface IFlying {
    void fly();
}
interface IRunning {
    void run();
}
interface ISwimming {
    void swim();
}
class Cat extends Animal implements IRunning {
    public Cat(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用四条腿跑");
    }
}
class Fish extends Animal implements ISwimming {
    public Fish(String name) {
        super(name);
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在用尾巴游泳");
    }
}
class Frog extends Animal implements IRunning, ISwimming {
    public Frog(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在往前跳");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在蹬腿游泳");
    }
}
class Duck extends Animal implements IRunning, ISwimming, IFlying {
    public Duck(String name) {
        super(name);
    }
    @Override
    public void fly() {
        System.out.println(this.name + "正在用翅膀飞");
    }
    @Override
    public void run() {
        System.out.println(this.name + "正在用两条腿跑");
    }
    @Override
    public void swim() {
        System.out.println(this.name + "正在漂在水上");
    }

}

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat("小猫");
        cat.run();
        Fish fish = new Fish("小鱼");
        fish.swim();
        Frog frog = new Frog("青蛙");
        frog.run();
        frog.swim();
        Duck duck = new Duck("鸭子");
        duck.run();
        duck.swim();
        duck.fly();
    }
}
