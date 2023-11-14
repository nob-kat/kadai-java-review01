
public class Review01 {

    public static void main(String[] args) {
        //商品価格をnum1に代入
        int num1 = 1500;
        //消費税額をresult1として計算
        int result1;
        result1 = tax(num1);
        //消費税込の商品価格をresult2として求める
        int result2 = num1 + result1;
        System.out.println(num1 + "円の商品の税込み価格は" + result2 + "円(消費税は" + result1 + "円)です。");
    }

    //消費税額の計算メソッド
    public static int tax(int num1) {
        //消費税率の設定
        double tax1 = 0.1;
        //消費税の計算
        double result1 = num1 * tax1;
        return (int)result1;
    }
}

//memo　メソッド名と変数名が同じものを使ってよいのか要確認。(今回はメソッド名にtaxを、変数名にtax1を用いた)