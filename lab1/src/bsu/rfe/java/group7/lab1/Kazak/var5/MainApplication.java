package bsu.rfe.java.group7.lab1.Kazak.var5;

public class MainApplication {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        Food[] breakfast = new Food[args.length];
        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
                breakfast[itemsSoFar] = new Cheese();
            } else
                if (parts[0].equals("Butter")) {
                    breakfast[itemsSoFar]= new Butter();
                }
                else
            if (parts[0].equals("Apple") ) {
                if(parts.length>1)
                    breakfast[itemsSoFar] = new Apple(parts[1]);
                else
                    breakfast[itemsSoFar] = new Apple();
            } else
                if (parts[0].equals("Burger")) {
                    if(parts.length>1)
                        breakfast[itemsSoFar] = new Burger(parts[1]);
                    else
                        breakfast[itemsSoFar] = new Burger();
                }
            itemsSoFar++;
        }
        for (Food item: breakfast)
            if (item!=null)
                item.consume();
            else
                break;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < breakfast.length; i++) {
            if(breakfast[i].equals("Burger") )
            {
                count0++;
                continue;
            }
            if(breakfast[i].equals("Apple"))
            {
                count2++;
                continue;
            }
            if(breakfast[i].equals("Cheese"))
            {
                count1++;
            }
        }
        System.out.println("Количество съеденных бургеров: " + count0);
        System.out.println("Количество съеденных яблок: " + count2);
        System.out.println("Количество съеденного сыра: " + count1);
        System.out.println("Всего хорошего!");
    }
}
