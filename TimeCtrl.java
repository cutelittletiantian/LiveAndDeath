public class TimeCtrl {
    UI ui = new UI();
    Map map = new Map();
    Logic logic = new Logic();

    public void run() {
        ui.init(map);
        try {
            while(true){
                ui.show(map);
                logic.update(map);
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("运行结束");
        }
    }
}