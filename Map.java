
public class Map {
    private static int len = 10;
    private int data[][]; // 细胞地图信息，0为死细胞，1为活细胞

    public Map() {
        init();
    }

    // 初始化地图数据
    public void init() {
        data = new int[len][len];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                data[i][j]= Math.random()>(double)0.5?1:0;
            }
        }
    }

    // 返回地图大小
    public int getLen(){
        return len; 
    }

    // 修改某个点的值
    public void set(int i, int j, int t) {
        data[i][j] = t;
    }

    // 得到某个点的值
    public int get(int i, int j) {
        return data[i][j];
    }
}