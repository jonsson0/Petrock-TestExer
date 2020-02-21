public class PetRock {

    private String petName;
    private String animalType;

    private boolean happy = false;

    public PetRock(String petName, String animalType) {
        this.petName = petName;
        this.animalType = animalType;
    }

    public void givePetFavFood() {
        this.happy = true;

    }


    public boolean isHappy() {
        return happy;
    }

    public void setHappy(boolean happy) {
        this.happy = happy;
    }

    public String getPetName() {
        return petName;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }


}
