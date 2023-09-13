public class kind {
    public String nameDog;
    public int ageDog;
    public String kindDog;
    public String isSick;
    public   kind (String nameDog, int ageDog, String kindDog, String isSick){
        this.nameDog = nameDog;
        this.ageDog = ageDog;
        this.kindDog = kindDog;
        this.isSick = isSick;
    }
}

class RunDog{
    public static void main(String[] args) {
        kind Kind = new kind("pull", 2, "pustin", "true" );
    }

}
