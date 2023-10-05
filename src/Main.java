public class Main {
    public static void main(String[] args) {
      String[] commands = {"сидеть","лежать"};
      Shelter shelter = new Shelter("romashka","Lenina 1");
      Dog dog = new Dog("Rex","Ovcharka", commands,shelter,ColorEnum.BLACK);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("гув гув");
        dog.makeVoice("гив гив");
        System.out.println("---------------");
        Dog dog1 = new Dog("Bobik","доберман",shelter,ColorEnum.BROWN);
        System.out.println(dog.getInfo());
        dog.makeVoice();
        dog.makeVoice("ppp ppp");
        dog.makeVoice("гив гив");
    }
}