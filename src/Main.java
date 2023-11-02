public class Main {
    public static void main(String[] args) {

    }
    Boss boss = new Boss();{
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Орда варваров");

        System.out.println("Boss inf0 :");
        System.out.println("Boss healh : " + boss.setHealth(1000));
        System.out.println("Boss damage: " + boss.setDamage(50));
        System.out.println("Boss defence:" + boss.setDefenseType("Орда варваров"));
    }

    
}
