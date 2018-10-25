package Aula05;

public enum TrueOrFalse
{
    FALSE(0, "FALSE "), TRUE(1, "TRUE");

    private int index;
    private String desc;

    private TrueOrFalse(int index, String desc)
    {
        this.desc = desc;
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public String getDesc() {
        return desc;
    }


}
