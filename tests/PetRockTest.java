import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PetRockTest {

    PetRock animal1 = new PetRock("dumbname", "dog");

    @Test
    void givePetFavFoodTest() {
        animal1.givePetFavFood();
        assertTrue(animal1.isHappy());
    }

    @Test
    void animalTypeTest() {
        assertEquals(animal1.getAnimalType(), "dog");
    }
}
