public class Logic {
    // 更新map数据
    public void update(Map map){
        for (int i = 0; i < map.getLen(); i++) {
            for (int j = 0; j < map.getLen(); j++) {

                map.set(i,j,0);
            }
        }
    }
}