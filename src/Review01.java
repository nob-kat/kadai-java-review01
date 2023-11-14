
public class Review01 {

    public static void main(String[] args) {
        //商品価格をpriceに代入
        int price = 1500;
        //消費税額をtaxとして計算
        int tax = tax(price);
        //消費税込の商品価格をresult2として求める
        int price_include_tax = price + tax;
        System.out.println(price + "円の商品の税込価格は" + price_include_tax + "円(消費税は" + tax + "円)です。");
    }

    //消費税額の計算メソッド
    public static int tax(int price) {
        //消費税率の設定
        double tax_rate = 0.1;
        //消費税の計算
        double tax = price * tax_rate;
        return (int) tax;
    }
}

//memo　メソッド名と変数名が同じものを使ってよいのか要確認。(今回はメソッド名にtaxを、変数名にtax1を用いた)
//ローカルスコープ