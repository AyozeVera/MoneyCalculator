
package Model;

public class Currency {
    String code;
    String name;
    String symbol;

    public Currency(String code, String name, String symbol) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }

    public Currency(String code, String name) {
        this.code = code;
        this.name = name;
    }
}
