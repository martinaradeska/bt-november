package enumarations;

public enum Level {
    LEVEL1(10),
    LEVEL2(20),
    LEVEL3(30),
    LEVEL4(100),
    LEVEL5(1000);

    private final int value;

    Level(final int levelValue) {
        value = levelValue;
    }

    public int getValue() {
        return value;
    }
}