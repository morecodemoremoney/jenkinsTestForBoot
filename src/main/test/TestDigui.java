/**
 * <p>
 * Description:
 * </p>
 *
 * @author bh.xia
 * @date 2020/6/9 11:34
 */
public class TestDigui {
    public static void main(String[] args) {
        int end=10;
        int start=0;
        Dugui(start,end);
    }
    static int q=0;
    private static void Dugui(int start,int end) {

        if (start < end) {
            Dugui(++start,end);
            System.out.println("q:"+q++);
            System.out.println("start:"+start);
        }
    }
}
