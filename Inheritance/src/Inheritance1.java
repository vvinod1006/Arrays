class Parent{
    void sleep()
    {
        System.out.println("sleep early");
    }
    void eat()
    {
        System.out.println("eats early");
    }
}
    class Child extends Parent{
        void swim()
        {
            System.out.println("he is sleeping");
        }

    }
    class Inheritance1
    {
        public static void main(String[] args)
        {
        Child c = new Child();
        c.swim();
        c.sleep();
        c.eat();
        }

    }
