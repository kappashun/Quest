import java.util.Scanner;

public class Game {
    public static Character man;
    public static Story story;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("На просторах современной России жил одинокий странник, потерявший всякую надежду на светлое будущее, и звали его: ");
        man = new Character(in.next());
        story = new Story();
        while (true) {
            man.hp += story.current_situation.dh;
            man.karma += story.current_situation.dk;
            System.out.println("=====\nКарма:" + man.karma + "\tЗдоровье:" + man.hp + "\n=====");
            System.out.println("==============");
            System.out.println(story.current_situation.text);
            if (story.isEnd()) {
                System.out.println("Пустошь поглотила вас.\n");
                if(man.karma < 0){
                    System.out.println("Вы были мразью и попадёте в ад.");
                    return;
                }
                if(man.karma == 0){
                    System.out.println("Вы прожили хоть и недолгую, но достойную жизнь.");
                    return;
                }
                else{
                    System.out.println("После вашей смерти вас провозгласили самым добрым человеком в пустоши, жаль, что это качество там никем не ценится");
                    return;
                }
            }
            story.go(in.nextInt());
        }

    }
}
