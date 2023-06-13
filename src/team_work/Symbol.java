package team_work;

public enum Symbol {
    X("|X|"),O("|O|"),EMPTY("|_|");

    private String text;

    Symbol(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
