
public class Story {
    private Situation start_story;
    public Situation current_situation;
    Story(){
        start_story = new Situation("Возле дороги вы увидели старый полуразвалившийся дом, из которого выглянул человек " +
                "с ножом, и начал кричать чтобы вы быстрее проходили мимо.\n" + "(1)Разрядить обстановку\n" +
                "(2)Застрелить бомжа\n", 0, 0, 2);
        current_situation = start_story;
        start_story.direction[0] = new Situation("Пока вы пытались объяснить, что вы не желаете никому зла, сзади " +
                "подкрались 2 друга бомжа и пырнули вас, забрав все ваши крышки(или какая там валюта в постапоке).\n"
                + "Вы лежите на земле, скорчившись от боли, но вы еще видите того бомжа,  и можете его убить. либо" +
                " оставить пулю себе. чтобы избежать медленной мучительной смерти в пасти огромного постапокалиптичного" +
                " волка.\n" + "(1) Выстрелить в бомжа\n" + "(2) Застрелиться самим\n", 1, -940, 2);
        start_story.direction[1] = new Situation("Вы выстрелили 5 раз в голову бомжу. Из дома, скуля, выбегает его" +
                " собака, и теперь он может её прокормить только своим безжизненным телом.\n" + "(1) Убить собаку\n"
                + "(2) Уйти\n" + "(3) Взять собаку с собой\n", -1, 0, 3);
        start_story.direction[0].direction[0] = new Situation("Вы не попали в бомжа, зато выстрел привлек голодного" +
                " медведя.\n", 0, -60, 0);
        start_story.direction[0].direction[1] = new Situation("Этого не стоило делать, суицид - не выход, даже в" +
                " жестокой пустоши.", 0, -60, 0);
        start_story.direction[1].direction[0] = new Situation("Вы поступили жестоко, но справедливо, ведь собаке" +
                " теперь" + " не придется" + " есть труп своего хозяина.", 0, 0, 0);
        start_story.direction[1].direction[1] = new Situation("Вы ушли , и теперь собаке чтобы выжить придется съесть" +
                " труп своего хозяина.", -1, 0, 0);
        start_story.direction[1].direction[2] = new Situation("Когда в подошли к собаке, она рванула к вам и прогрызла вам горло.", 1, -1000, 0);
    }

    public void go(int num) {
        if (num <= current_situation.direction.length){
            current_situation = current_situation.direction[num - 1];
        }
    }
    public boolean isEnd() {
        return current_situation.direction.length == 0;
    }
}
