public class Main {
    public static void main(String[] args) {
        Dog f = new Dog();
        f.setAge(4);
        f.setName("reks");
        System.out.println(f.getName());
        System.out.println(f.getAge() + "  jash");

        Cat a = new Cat();
        a.setAge(3);
        a.setName("koshka:    ");
        a.setVoice("unu:     ");
        System.out.println(a.getName());
        System.out.println(a.getAge());
        System.out.println(a.getVoice());


        Popugai s = new Popugai();
        s.setName("grisha:     ");
        s.setVoice("suikoit:    ");
        s.setAge(10);
        System.out.println(s.getVoice());
        System.out.println(s.getAge());
        System.out.println(s.getName());


        Ryif d = new Ryif();
        d.setAge(7);
        d.setSuzot("suzot:   ");
        d.setUiu("okean:    ");
        System.out.println(d.getUiu());
        System.out.println(d.getSuzot());
        System.out.println(d.getAge());
    }
}