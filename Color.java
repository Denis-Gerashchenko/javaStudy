/** Это комментарий для javadoc
 * Я пишу его чтобы посмотреть в задаче
 * Хз че получится, посмотрим                                                                     */
public class Color{
        String name;
        int id;
        int hue;

        Color(String name, int id, int hue){
            this.name = name;
            this.id = id;
            this.hue = hue;
        }

    public static void changeHueOfTheColor(Color color, int newHue){
        color.hue = newHue;
    }
    public static void main(String[] args) {
        Color red = new Color("red", 1, 0);
        Color orange = new Color("orange", 2, 0);
        Color yellow = new Color("yellow", 3, 0);
        Color green = new Color("green", 4, 0);
        Color lightBlue = new Color("lightBlue", 5, 0);
        Color blue = new Color("blue", 6, 0);
        Color violet = new Color("violet", 7, 0);
        violet.changeHueOfTheColor(red, 100);
        System.out.println(red.hue);
    }
}
