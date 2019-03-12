class Player {
    private String name;
    private int number;

    Player(String name) {
        this.name = name;
        this.number = -1;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
