public class D52ensyu {
    public static void main(String[] args) {
        Animal tama = new Cat();
        Animal ao =  new Horse();
        Animal a = new Animal();

        tama.brak();
        ao.brak();
        a.brak();
    }

}
class Animal{
    public void brak(){
     System.out.println("動物の鳴き声");
    }
}
class Cat extends Animal{
    public void brak(){
        System.out.println("ニャー");
    }
}
class Horse extends Animal{
    public void brak(){
     System.out.println("ヒヒーン");
    }

}

