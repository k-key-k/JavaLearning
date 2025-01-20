package Tasks.Components_Pattern;

public class ArmyStructure {
    public static void main(String[] args){
        Soldier private1 = new Private("Prapor");
        Soldier private2 = new Private("Kowalski");

        Sergeant sergeant1 = new Sergeant("Rico");
        sergeant1.addSubordinate(private1);
        sergeant1.addSubordinate(private2);

        Captain captain = new Captain("Shkiper");
        captain.addSubordinate(sergeant1);

        private1.performDuty();
        sergeant1.performDuty();
        captain.performDuty();
    }
}
