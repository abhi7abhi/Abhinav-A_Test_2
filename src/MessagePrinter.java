public class MessagePrinter
{
    public void printMessage(String name) {
        System.out.println("hello" + name);
    }
    public static void main(String[] args)
    {
        MessagePrinter printer = new MessagePrinter();
        printer.printMessage("Abhinav Abhilash");
    }
}
