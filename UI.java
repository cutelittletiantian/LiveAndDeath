public class UI {
    Map map;

    public void show(Map m) throws InterruptedException {
        map=m;
        clear();
        int len = map.getLen();
        for (int i = 0; i < len + 4; i++) {
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < len; i++) {
            System.out.print("||");
            for (int j = 0; j < len; j++) {
                System.out.print(map.get(i, j));
            }
            System.out.println("||");
        }
        for (int i = 0; i < len + 4; i++) {
            System.out.print("-");
        }
        System.out.println();
        Thread.sleep(500);
    }

    private void clear() {
        Map map = new Map();
        for (int i = 0; i <map.getLen() ; i++) {
            System.out.println();
        }
    }
}