public class StockGame extends Thread{
    private static double stockPrice;
    private static int availableShares;
    private static int tradeCount;
    private String name;
    private int numShares;
    private String fileName;

    public StockGame(String name, String fileName){
        this.name = name;
        this.fileName = fileName;
        numShares = 0;
    }

    public void run() {

    }
}
