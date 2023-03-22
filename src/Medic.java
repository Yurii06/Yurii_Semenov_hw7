public class Medic extends Hero {
    int healPoints;
    public  void increaseExperience(){
      healPoints += (healPoints * 0.1);
    }
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность HEAL");
        increaseExperience();
    }
}
