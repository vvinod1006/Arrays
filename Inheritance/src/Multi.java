class A{
    void print_A()
    {
        System.out.println("A");
    }

}
class B extends A{
    void print_B()
    {
        System.out.println("B");
    }
}
class C extends B{
    void print_C()
    {
        System.out.println("C");
    } 
}
class Multi{
    public static void main(String[] args)
    {
        C c = new C();
        c.print_C();
        c.print_B();
        c.print_A();
    }
}