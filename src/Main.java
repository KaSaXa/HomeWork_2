public class Main {
    public static void main(String[] args) {
        var allTime = 640;
        var oneEmpl = 8;
        var allEmpl = allTime / oneEmpl;
        System.out.println("Всего работников в компании - " + allEmpl + " человек");
        var plusEmpl = allEmpl + 94;
        var lastHours = allTime / plusEmpl;
        System.out.println("Если в компании работает " + plusEmpl + " человек, то всего " + lastHours + " часов работы может быть поделено между сотрудниками");
}
    }