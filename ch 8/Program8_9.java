
class Super
{
    public void method ()
    {
        System.out.println("Method super");
    }
}
class sub extends Super
{
    public void method()
    {
        System.out.println("Method sub");
    }
}
class Program8_9{
public static void main(String[] args) {
    Super A = new sub();
    A.method();

    
}
}